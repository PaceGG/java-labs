package ru.butorin.fraction;

public class Fraction implements IFraction {
    private int numerator;
    private int denominator;
    private Double cache = null;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        cache = null;
    }
    public void setDenominator(int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        if (denominator < 0) {
            this.numerator *= -1;
            denominator *= -1;
        }
        this.denominator = denominator;
        cache = null;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public double getDoubleValue() {
        if (cache == null) {
            cache = (double) numerator / denominator;
        }
        return cache;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Fraction fraction = (Fraction) object;

        return this.numerator == fraction.getNumerator()  && this.denominator  == fraction.getDenominator();
    }
}
