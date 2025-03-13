package com.pbo2;

/// Objek tercipta saat pertama kali digunakan.
public class LazyUser {
    private static LazyUser user;

    private LazyUser() {
    }

    public static LazyUser getInstance() {
        if (user == null) {
            user = new LazyUser();
        }
        return user;
    }

    public String getUserNameById(int id) {
        return "";
    }

    public LazyUser getUserById(int id) {
        return new LazyUser();
    }
}
