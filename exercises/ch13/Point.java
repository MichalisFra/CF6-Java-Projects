package gr.aueb.cf.OOPProjects.exercises.ch13;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {

    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
       return "(" + x + "," + y + "," + z +")";
    }

    //Public API

    public double getXYDistance() {
        return Math.sqrt(x*x + y*y);
    }

    public double getYZDistance() {
        return Math.sqrt(z*z + y*y);
    }

    public double getXZDistance() {
        return Math.sqrt(z*z + x*x);
    }

    public double getXYZDistance() {
        return Math.sqrt(z*z + x*x + y*y);
    }


}
