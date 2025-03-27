package com.pbo2.p4;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Quiz {
    private static ArrayList<Product> products = new ArrayList<>();
    private static DefaultTableModel tableModel;
    private static boolean isTyping = false;

    private static void UpdateEditState(JTable table, JTextField nameField, JTextField priceField, JButton editButton) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            editButton.setEnabled(false);
            return;
        }

        String name = tableModel.getValueAt(selectedRow, 0).toString();
        String price = tableModel.getValueAt(selectedRow, 1).toString();

        String nameFieldText = nameField.getText();
        String priceFieldText = priceField.getText();

        boolean isModified = !nameFieldText.equals(name) || !priceFieldText.equals(price);
        editButton.setEnabled(isModified);
    }

    public static void _main(String[] args) {
        JFrame frame = new JFrame("Daftar Produk");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = { "Nama Produk", "Harga" };
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);

        JTextField nameField = new JTextField(10);
        JTextField priceField = new JTextField(10);
        JButton addButton = new JButton("Tambah");
        JButton deleteButton = new JButton("Hapus");
        JButton editButton = new JButton("Ubah"); // Add edit button from Latihan14.java
        editButton.setEnabled(false);

        addButton.addActionListener(e -> {
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            Product product = new Product(name, price);
            products.add(product);
            tableModel.addRow(new Object[] { name, price });
            nameField.setText("");
            priceField.setText("");
        });

        // Add delete button listener from Latihan13.java
        deleteButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                products.remove(selectedRow);
                tableModel.removeRow(selectedRow);
                nameField.setText("");
                priceField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Tidak ada yang dipilih");
            }
        });

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && !isTyping) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        nameField.setText(tableModel.getValueAt(selectedRow, 0).toString());
                        priceField.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    }
                    UpdateEditState(table, nameField, priceField, editButton);
                }
            }
        });

        KeyAdapter keyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                isTyping = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                UpdateEditState(table, nameField, priceField, editButton);
                isTyping = false;
            }
        };

        nameField.addKeyListener(keyListener);
        priceField.addKeyListener(keyListener);

        editButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());

                nameField.setText(name);
                priceField.setText(String.valueOf(price));

                Product product = products.get(selectedRow);
                product.name = name;
                product.price = price;

                tableModel.setValueAt(name, selectedRow, 0);
                tableModel.setValueAt(price, selectedRow, 1);

                nameField.setText("");
                priceField.setText("");
                table.clearSelection();
            } else {
                JOptionPane.showMessageDialog(frame, "Tidak ada yang dipilih");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nama:"));
        panel.add(nameField);
        panel.add(new JLabel("Harga:"));
        panel.add(priceField);
        panel.add(addButton);
        // Add delete button to panel from Latihan13.java
        panel.add(deleteButton);
        panel.add(editButton);

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

}
