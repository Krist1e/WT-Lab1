package test.java.by.bsuir.alekseeva.Task2;

import main.java.by.bsuir.alekseeva.Task2.RectangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleAreaTest {
    private final RectangleArea area = new RectangleArea(1.0, 1.0, 3.0, 3.0);

    @Test
    public void Should_ThrowIllegalArgumentException_When_x1MoreThanx2() {
        assertThrows(IllegalArgumentException.class, () -> new RectangleArea(2.0, 1.0, 1.0, 2.0));
    }

    @Test
    public void Should_ThrowIllegalArgumentException_When_y1MoreThany2() {
        assertThrows(IllegalArgumentException.class, () -> new RectangleArea(1.0, 2.0, 2.0, 1.0));
    }

    @Test
    public void Should_ReturnTrue_When_PointIsInsideArea() {
        assertTrue(area.isPointInsideArea(2.0, 2.0));
    }

    @Test
    public void Should_ReturnFalse_When_PointIsOutsideArea() {
        assertFalse(area.isPointInsideArea(4.0, 4.0));
    }

    @Test
    public void Should_ReturnTrue_When_PointIsOnBoundary() {
        assertTrue(area.isPointInsideArea(1.0, 2.0));
    }
}
