package gr.aueb.cf.OOPProjects.course.chapter16.shapes;

public class Shape {
    private enum Type {RECTANGLE, CIRCLE}

    // Tag field
    private final Type type;

    // fields for Rectangle
    private double height;
    private double width;

    // fields for Circle
    private double radius;


    // constructor for Rectangle
    public Shape(double height, double width) {
        type = Type.RECTANGLE;
        this.height = height;
        this.width = width;
    }
    // constructor for Circle
    public Shape(double radius) {
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public double getArea() {
        switch (type) {
            case CIRCLE:
                return   Math.PI * radius * radius;
            case RECTANGLE:
                return width*height;
            default:
                throw new RuntimeException();
        }
    }
}
