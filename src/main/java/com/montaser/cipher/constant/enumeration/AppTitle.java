package com.montaser.cipher.constant.enumeration;

public enum AppTitle {

    MAIN_TITLE("Cipher Application");

    private String title;

    AppTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
