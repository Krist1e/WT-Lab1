package main.java.by.bsuir.alekseeva.Task9;

import java.awt.*;

public class Basket {
    private final Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public int getSpecificBallsCount(Color color) {
        int result = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color)
                ++result;
        }
        return result;
    }

    public double getBallsWeight() {
        double result = 0;
        for (Ball ball : balls) {
            result += ball.getWeight();
        }
        return result;
    }


}
