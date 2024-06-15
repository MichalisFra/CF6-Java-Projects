package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.model_exc1;

public class Circle extends AbstractShape implements ITwoDimensional{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double pie = 3.14;
        return pie*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle: " +
                " id= " + getId() +
                " ,radius= " + radius;
    }
}
