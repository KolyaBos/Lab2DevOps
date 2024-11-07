package services.impl;

import services.SquareService;

public class Square implements SquareService {

    @Override
    public double square(double a) {
        return a * a;
    }
}
