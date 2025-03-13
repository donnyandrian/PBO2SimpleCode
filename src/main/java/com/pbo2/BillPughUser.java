package com.pbo2;

/// Memanfaatkan inner static class sebagai holder untuk menampung singleton object. 
public class BillPughUser {
    static class UserHolder {
        private static final BillPughUser INSTANCE = new BillPughUser();
    }

    private BillPughUser() {
    }

    public static BillPughUser getInstance() {
        return UserHolder.INSTANCE;
    }

    public String getUserNameById(int id) {
        return "";
    }

    public BillPughUser getUserById(int id) {
        return new BillPughUser();
    }
}
