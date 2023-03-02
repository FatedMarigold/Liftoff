package com.example.MVP.models;

public enum Type {

    CONTACT("Contact"),
    FILE_UPLOAD("File upload"),
    TEXT("Text");

    private String displayName;

    Type(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
