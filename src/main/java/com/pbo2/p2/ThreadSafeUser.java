package com.pbo2.p2;

/// Menambahkan synchronized block
/// sehingga setiap beberapa thread yang mengakses objek yang sama pertama kali
/// akan di-synchronized terlebih dahulu.
public class ThreadSafeUser {
    private static volatile ThreadSafeUser user;

    private ThreadSafeUser() {
    }

    public static ThreadSafeUser getInstance() {
        if (user == null) {
            synchronized (ThreadSafeUser.class) {
                if (user == null) {
                    user = new ThreadSafeUser();
                }
            }
        }
        return user;
    }

    public String getUserNameById(int id) {
        return "";
    }

    public ThreadSafeUser getUserById(int id) {
        return new ThreadSafeUser();
    }
}
