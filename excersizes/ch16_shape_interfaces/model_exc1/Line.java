package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.model_exc1;

public class Line extends AbstractShape{
    private final double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line: " +
                " id= " + getId() +
                ", length= " + length;
    }
}
