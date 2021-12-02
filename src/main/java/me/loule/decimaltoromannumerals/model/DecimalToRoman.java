package me.loule.decimaltoromannumerals.model;

public class DecimalToRoman {
    private static final String[] romanNumerals = {"I", "V", "X", "L", "C", "D", "M"};
    private static final int[] decimalNumerals = {1, 5, 10, 50, 100, 500, 1000};
    private int decimal;

    public DecimalToRoman(int decimal) {
        this.decimal = decimal;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String result() {
        String roman = "";

        for (int i = decimalNumerals.length - 1; i >= 0; i--) {
            while (this.decimal >= decimalNumerals[i]) {
                roman += romanNumerals[i];
                this.decimal -= decimalNumerals[i];
            }
        }

        return roman;
    }
}
