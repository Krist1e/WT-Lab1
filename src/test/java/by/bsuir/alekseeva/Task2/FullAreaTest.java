package test.java.by.bsuir.alekseeva.Task2;

import main.java.by.bsuir.alekseeva.Task2.FullArea;
import main.java.by.bsuir.alekseeva.Task2.RectangleArea;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FullAreaTest {
    private static FullArea fullArea;

    @BeforeAll
    public static void init() {
        RectangleArea area1 = new RectangleArea(1.0, 1.0, 3.0, 3.0);
        RectangleArea area2 = new RectangleArea(4.0, 4.0, 6.0, 6.0);
        RectangleArea area3 = new RectangleArea(7.0, 7.0, 9.0, 9.0);

        fullArea = new FullArea(new RectangleArea[]{area1, area2, area3});
    }

    @Test
    public void Should_ReturnTrue_When_PointIsInsideAnyRectangleArea() {
        assertTrue(fullArea.IsPointInsideArea(5.0, 5.0));
    }

    @Test
    public void Should_ReturnFalse_When_PointIsOutsideAllRectangleAreas() {
        assertFalse(fullArea.IsPointInsideArea(10.0, 10.0));
    }

    @Test
    public void Should_ReturnTrue_When_PointIsOnBorderOfAnyRectangleArea() {
        assertTrue(fullArea.IsPointInsideArea(3.0, 1.0));
    }
}