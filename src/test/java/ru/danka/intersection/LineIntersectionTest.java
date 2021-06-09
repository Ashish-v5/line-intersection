package ru.danka.intersection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class LineIntersectionTest {
    private LineIntersection lineIntersection;
    private int defaultValue;

    @Before
    public void init(){
        defaultValue = ThreadLocalRandom.current().nextInt();
        lineIntersection = new LineIntersection(defaultValue);
    }
    @Test
    public void resultTest(){
        Line line = new Line(1,2);
        Line line2 = new Line(2,1);
        Assert.assertEquals(Integer.valueOf(1), lineIntersection.getIntersection(line,line2));
    }

    @Test
    public void divideByZeroTest(){
        Line line = new Line(0,0);
        Line line2 = new Line(0,0);
        Assert.assertEquals(Integer.valueOf(defaultValue), lineIntersection.getIntersection(line,line2));
    }
}
