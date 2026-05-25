package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void averageOfTwoPositiveNumbers() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), 1e-12);
    }

    @Test
    public void averageWithNegativeNumber() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.average(-2.0, 4.0), 1e-12);
    }

    @Test
    public void goodReturnsTrueForExactSquareRoot() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void goodReturnsFalseForBadGuess() {
        Sqrt sqrt = new Sqrt(9.0);
        assertFalse(sqrt.good(2.0, 9.0));
    }

    @Test
    public void improveReturnsBetterGuess() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(5.0, sqrt.improve(1.0, 9.0), 1e-12);
    }

    @Test
    public void improvePreservesCorrectGuess() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.improve(3.0, 9.0), 1e-12);
    }

    @Test
    public void iterStopsImmediatelyForGoodGuess() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.iter(4.0, 16.0), 1e-12);
    }

    @Test
    public void iterConvergesFromInitialGuess() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.iter(1.0, 16.0), 1e-7);
    }

    @Test
    public void calcForTwo() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 1e-7);
    }

    @Test
    public void calcForPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 1e-7);
    }

    @Test
    public void calcForFraction() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), 1e-7);
    }
}
