package gr.aueb.cf.OOPProjects.exercises.ch16_shape_interfaces.ex2;

import gr.aueb.cf.OOPProjects.exercises.ch16_shape_interfaces.ex2.interfaces.ILine;

/**
 * Line represents a geometric line that has a length.
 * It extends {@link AbstractShape} and implements {@link ILine}
 */
public class Line extends AbstractShape implements  ILine{
    private final double length;

    public Line(double length) {
        this.length = length;
        setId();
    }

    @Override
    public String toString() {
        return "Line {" +
                "id = " + getId() +
                ", length = " + length +
                '}';
    }
}
