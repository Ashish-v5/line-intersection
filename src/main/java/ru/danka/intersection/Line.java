package ru.danka.intersection;

public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getK() {
        return k;
    }

    public int getB() {
        return b;
    }

    public Point getIntersection(Line line2) {
        throw new UnsupportedOperationException();
    }


}
