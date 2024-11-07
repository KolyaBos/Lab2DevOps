package services.impl;

import services.AdditionService;

public class Addition implements AdditionService {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }
}
