package services.impl;

import services.SubtractionService;

public class Subtraction implements SubtractionService {

    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
