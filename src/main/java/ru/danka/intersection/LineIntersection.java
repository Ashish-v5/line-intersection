package ru.danka.intersection;

public class LineIntersection {
    private int defaultValue;

    public LineIntersection(int defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getIntersection(Line line1, Line line2) {
        if(line1.getK() == line2.getK() && line1.getB() != line2.getB()){
            return null;
        }
        if(line1.getK() == line2.getK() && line1.getB() == line2.getB()){
            return defaultValue;
        }
        return (((line2.getB() - line1.getB())/ (line1.getK()-line2.getK())));
    }

}
