package main.java.by.bsuir.alekseeva.Task2;

public class Main {
    public static void main(String[] args) {
        RectangleArea area1 = new RectangleArea(-6, -3, 6, 0);
        RectangleArea area2 = new RectangleArea(-4, 0, 4, 5);
        FullArea fullArea = new FullArea(new RectangleArea[]{area1, area2});
        boolean result = fullArea.IsPointInsideArea(3, 2);
        System.out.println(result);
    }
}
