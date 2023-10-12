package main.java.by.bsuir.alekseeva.Task2;

public class RectangleArea {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public RectangleArea(double x1, double y1, double x2, double y2) {
        checkIfValid(x1, y1, x2, y2);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean isPointInsideArea(double x, double y) {
        return x >= this.x1 && x <= this.x2 && y >= this.y1 && y <= this.y2;
    }

    private void checkIfValid(double x1, double y1, double x2, double y2) {
        if (x1 > x2)
            throw new IllegalArgumentException("x1 can't be more than x2");
        if (y1 > y2)
            throw new IllegalArgumentException("y1 can't be more than y2");
    }
}
