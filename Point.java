public class Point implements Comparable<Point> {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public int compare(Point other){
        return Double.compare(this.distance(), other.distance());
    }
}
