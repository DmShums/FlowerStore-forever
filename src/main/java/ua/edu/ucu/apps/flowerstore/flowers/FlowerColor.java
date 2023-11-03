package ua.edu.ucu.apps.flowerstore.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    BLACK("#000000"),
    WHITE("#FFFFFF");

    private final String label;

    FlowerColor(String label) {
        this.label = label;
    }

    @Override
    public String toString() { 
        return this.label; 
    }

    @JsonValue
    public String getValue() {
        return this.label;
    }
}
