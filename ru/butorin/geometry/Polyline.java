package ru.butorin.geometry;

import java.util.List;

public class Polyline {
    private List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    public String toString() {
        String s = "Линия [";
        
        for (int i = 0; i < points.size(); i++) {
            s += points.get(i) + ",";
        }
        s += "]";
        return s;
    }
}
