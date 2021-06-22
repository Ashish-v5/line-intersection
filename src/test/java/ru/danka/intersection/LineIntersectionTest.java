package ru.danka.intersection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class LineIntersectionTest {
    private int defaultValue;

    @Before
    public void init(){
        defaultValue = ThreadLocalRandom.current().nextInt();
    }
    @Test
    public void resultTest(){
        Line line = new Line(1,2);
        Line line2 = new Line(2,1);
        Assert.assertEquals(Integer.valueOf(1), line.getIntersection(line2,defaultValue));
    }

    @Test
    public void divideByZeroTest(){
        Line line = new Line(0,0);
        Line line2 = new Line(0,0);
        Assert.assertEquals(Integer.valueOf(defaultValue), line.getIntersection(line2, defaultValue));
    }
}
