package com.weather.model;

public enum UnitGroup {
    us("us"), uk("uk"), metric("metric");

    private final String type;

    public String getType() {
        return type;
    }

    UnitGroup(String type) {
        this.type = type;
    }
}
