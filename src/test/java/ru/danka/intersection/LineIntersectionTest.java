package ru.danka.intersection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class LineIntersectionTest {
    @Test
    public void resultTest(){
        Line line = new Line(1,2);
        Line line2 = new Line(2,1);
        Assert.assertEquals(1, line.getIntersection(line2).getX());
    }

    @Test
    public void divideByZeroTest(){
        Line line = new Line(0,0);
        Line line2 = new Line(0,0);
        Assert.assertEquals(null, line.getIntersection(line2));
    }
}
