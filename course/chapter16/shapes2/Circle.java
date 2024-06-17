package gr.aueb.cf.OOPProjects.course.chapter16.shapes2;

public class Circle extends AbstractShape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
