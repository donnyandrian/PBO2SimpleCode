package com.pbo2;

/// Objek dibuat menjadi constant, final, dan tread-safe,
/// sehingga objek yang dibuat sedari awal
/// bisa saja tidak dibutuhkan/tidak digunakan. 
public class EagerUser {
    private static final EagerUser INSTANCE = new EagerUser();

    private EagerUser() {
    }

    public static EagerUser getInstance() {
        return INSTANCE;
    }

    public String getUserNameById(int id) {
        return "";
    }

    public EagerUser getUserById(int id) {
        return new EagerUser();
    }
}
