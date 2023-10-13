package main.java.by.bsuir.alekseeva.Task9;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Ball[] balls = {new Ball(Color.BLUE, 5),
                        new Ball(Color.RED, 2),
                        new Ball(Color.BLUE, 4)};

        Basket basket = new Basket(balls);
        double weightOfBalls = basket.getBallsWeight();
        int countOfBlueBalls = basket.getSpecificBallsCount(Color.BLUE);
        System.out.printf("Count of blue balls = %d, weight of all balls in the basket = %.2f", countOfBlueBalls, weightOfBalls);
    }
}
