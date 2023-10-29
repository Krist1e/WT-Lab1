package test.java.by.bsuir.alekseeva.Task9;

import main.java.by.bsuir.alekseeva.Task9.Ball;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    public void Should_GetColor() {
        Ball ball = new Ball(Color.RED, 0.5);

        Color color = ball.getColor();

        assertEquals(Color.RED, color);
    }

    @Test
    public void Should_SetColor() {
        Ball ball = new Ball(Color.GREEN, 0.7);

        ball.setColor(Color.BLUE);

        assertEquals(Color.BLUE, ball.getColor());
    }

    @Test
    public void Should_GetWeight() {
        Ball ball = new Ball(Color.YELLOW, 1.2);

        double weight = ball.getWeight();

        assertEquals(1.2, weight, 0.01);
    }

    @Test
    public void Should_SetWeight() {
        Ball ball = new Ball(Color.BLUE, 1.0);

        ball.setWeight(2.5);

        assertEquals(2.5, ball.getWeight(), 0.01);
    }
}