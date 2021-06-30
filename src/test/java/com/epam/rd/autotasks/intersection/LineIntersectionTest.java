package com.epam.rd.autotasks.intersection;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineIntersectionTest {
    @Test
    public void resultTest(){
        Line line = new Line(1,2);
        Line line2 = new Line(2,1);
        Assertions.assertEquals(1, line.getIntersection(line2).getX());
    }

    @Test
    public void divideByZeroTest(){
        Line line = new Line(0,0);
        Line line2 = new Line(0,0);
        Assertions.assertEquals(null, line.getIntersection(line2));
    }

    @Test
    public void nullPointerTest() {
        Line line = new Line(0, 0);
        Assertions.assertNull(line.getIntersection(null));
    }

    @Test
    public void parallelLinesTest() {
        Line line1 = new Line(1, 2);
        Line line2 = new Line(1, 3);
        Assertions.assertEquals(null, line1.getIntersection(line2));
    }

    @Test
    public void inZeroInterSectionLinesTest() {
        Line line1 = new Line(1, 0);
        Line line2 = new Line(2, 0);
        Point point = line1.getIntersection(line2);
        Assertions.assertEquals(0, point.getY() );
    }

}
