package ru.danka.intersection;


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
}
