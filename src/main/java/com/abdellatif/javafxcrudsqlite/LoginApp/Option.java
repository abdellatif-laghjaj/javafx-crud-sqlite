package com.abdellatif.javafxcrudsqlite.LoginApp;

public enum Option {
    ADMIN, STUDENT;

    private Option() {
    }

    public String value() {
        return this.name();
    }

    public static Option fromValue(String v) {
        return valueOf(v);
    }
}
