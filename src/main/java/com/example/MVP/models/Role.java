package com.example.MVP.models;

public enum Role {

    ADMIN ("Admin"),
    EDITOR ("Editor"),
    Viewer ("Viewer");

    private String displayName;

    Role (String displayName) {
        this.displayName = displayName;
    }

    public final String getDisplayName() {
        return displayName;
    }

}
