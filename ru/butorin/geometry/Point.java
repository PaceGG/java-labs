package ru.butorin.geometry;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Integer.compare(point.x, x) == 0 && Integer.compare(point.y, y) == 0;
    }

    public int hashCode() {
        return x * 31 + y;
    }
}
