package gr.aueb.cf.OOPProjects.excersizes.ch16_shape_interfaces.exc2;

/**
 * Represents a circle, which is a {@link IShape} with a radius and also inherits properties
 * from {@link ITwoDimensional} interface.
 */
public interface ICircle extends IShape, ITwoDimensional{
     double getDiameter();
}
