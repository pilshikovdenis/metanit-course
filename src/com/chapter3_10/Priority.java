package com.chapter3_10;

public enum Priority {
    LOW,
    MIDDLE,
    HIGH,
    VERY_HIGH;

    public String getTextValue() {
        switch (this) {
            case LOW:
                return "LOW";
            case MIDDLE:
                return "MIDDLE";
            case HIGH:
                return "HIGH";
            case VERY_HIGH:
                return "VERY HIGH";
        };

//        newer will return "", but method need it;
        return "";
    }
}