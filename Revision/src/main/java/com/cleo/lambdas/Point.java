package com.cleo.lambdas;

public abstract class Point implements Comparable<Point>{
    int x;


    public abstract int compareTo (Point point);

    int y;

    public Point () {
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public abstract String toString ();
}
class SortedPointsByXAxis extends Point{
    @Override
    public int compareTo (Point point) {
        return this.x - point.x;
    }

    public SortedPointsByXAxis (int x, int y) {
        super(x, y);
    }

    @Override
    public String toString () {
           return "X Axis: ["+this.x +":"+this.y+"]";
    }
}

class SortedPointsByYAxis extends Point{
    @Override
    public int compareTo (Point point) {
        return this.y - point.y;
    }

    public SortedPointsByYAxis (int x, int y) {
        super(x, y);
    }

    @Override
    public String toString () {
        return "Y Axis: ["+this.x +":"+this.y+"]";
    }
}
class SortedPoints extends Point{
    @Override
    public int compareTo (Point point) {
        return this.y - point.x;
    }
    public SortedPoints(int x, int y){
        super(x,y);
    }
    @Override
    public String toString () {
        return "Sorted Axis: ["+this.x +":"+this.y+"]";
    }
}