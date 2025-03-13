package com.pbo2;

public class Main {
    public static void main(String[] args) {
        EagerUser user = EagerUser.getInstance();
        System.out.println("user.getUserNameById(1) = " + user.getUserNameById(1));
        System.out.println("user.getUserById(2) = " + user.getUserById(1));
        System.out.println(user == EagerUser.getInstance());
    }
}