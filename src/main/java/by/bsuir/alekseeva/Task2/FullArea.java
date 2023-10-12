package main.java.by.bsuir.alekseeva.Task2;

public class FullArea {
    private final RectangleArea[] rectangleAreas;

    public FullArea(RectangleArea[] rectangleAreas) {
        this.rectangleAreas = rectangleAreas;
    }

    public boolean IsPointInsideArea(double x, double y) {
        for (RectangleArea area : rectangleAreas) {
            if (area.isPointInsideArea(x, y))
                return true;
        }
        return false;
    }
}
