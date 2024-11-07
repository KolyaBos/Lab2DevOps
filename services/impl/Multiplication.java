package services.impl;

import services.MultiplicationService;

public class Multiplication implements MultiplicationService {

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
}
