package gr.aueb.cf.OOPProjects.exercises.ch16_shape_interfaces.ex2;

import java.util.Random;

/**
 * AbstractShape is a base class implementing the {@link IShape} interface.
 * It provides basic functionality for shapes including generating a unique ID.
 */
public abstract class AbstractShape implements IShape{
    private long id;
    private static final Random random = new Random(System.currentTimeMillis());

    /**
     * Generates a unique ID for the shape using a random number generator.
     */
    public void setId(){
        this.id = Math.abs(random.nextLong());
    }

    @Override
    public long getId() {
        return id;
    }

}
