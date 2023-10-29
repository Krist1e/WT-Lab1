package test.java.by.bsuir.alekseeva.Task9;

import main.java.by.bsuir.alekseeva.Task9.Ball;
import main.java.by.bsuir.alekseeva.Task9.Basket;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    public void Should_ReturnZeroBallsWeight_When_BasketIsEmpty() {
        Ball[] balls = {};
        Basket basket = new Basket(balls);

        assertEquals(0.0, basket.getBallsWeight(), 0.01);
    }

    @Test
    public void Should_ReturnZeroSpecificBallsCount_When_BasketIsEmpty() {
        Ball[] balls = {};
        Basket basket = new Basket(balls);
        int redBallsCount = basket.getSpecificBallsCount(Color.RED);

        assertEquals(0, redBallsCount);
    }

    @Test
    public void Should_GetBallsWeight() {
        Ball redBall = new Ball(Color.YELLOW, 0.5);
        Ball greenBall = new Ball(Color.PINK, 0.6);
        Ball blueBall = new Ball(Color.BLUE, 0.7);
        Ball[] balls = {redBall, greenBall, blueBall};

        Basket basket = new Basket(balls);

        double totalWeight = basket.getBallsWeight();

        assertEquals(1.8, totalWeight, 0.01);
    }

    @Test
    public void Should_GetSpecificBallsCount() {
        Ball redBall1 = new Ball(Color.RED, 0.4);
        Ball redBall2 = new Ball(Color.RED, 0.5);
        Ball greenBall = new Ball(Color.GREEN, 0.6);
        Ball blueBall = new Ball(Color.BLUE, 0.7);
        Ball[] balls = {redBall1, greenBall, redBall2, blueBall};

        Basket basket = new Basket(balls);

        int redBallsCount = basket.getSpecificBallsCount(Color.RED);
        int greenBallsCount = basket.getSpecificBallsCount(Color.GREEN);
        int blueBallsCount = basket.getSpecificBallsCount(Color.BLUE);

        assertEquals(2, redBallsCount);
        assertEquals(1, greenBallsCount);
        assertEquals(1, blueBallsCount);
    }

}