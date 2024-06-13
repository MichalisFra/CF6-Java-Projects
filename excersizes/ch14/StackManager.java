package gr.aueb.cf.OOPProjects.excersizes.ch14;

/**
 * A StackManager singleton
 * that provides the basic stack functionality
 * of push and pop (LIFO).
 */
public class StackManager {

    private static StackManager INSTANCE = null;
    private String[] stack;
    private int top;
    private int maxSize;



    private StackManager(int size){
        maxSize = size;
        stack = new String[maxSize];
        top = -1;
    }


    public static StackManager getInstance(int size) {
        if (INSTANCE == null) {
            INSTANCE = new StackManager(size);
        }

        return INSTANCE;
    }

    /**
     * Checks if the stack is full.
     * It's used in push
     * @return
     */
    private boolean isFull() {
        return top == maxSize -1;
    }

    /**
     * Checks if the stack is empty.
     * It's used in pop
     * @return
     */
    private boolean isEmpty() {
        return top == -1;
    }


    /**
     * Pushes the item into the stack, if the stack was not full.
     * Gives a message if the stack was full.
     * @param item
     */
    public void push(String item) {
        if (!isFull()) {
            stack[++top] = item;
        }
        else {
            System.out.printf("Stack is full, item %s cannot be pushed\n", item);
        }
    }

    /**
     * It removes the last item in the stack, by turning it into null
     * and returns it.
     * @return
     *          popped item
     */
    public String pop() {
        if (!isEmpty()) {
            String item = stack[top];
            stack[top] = null;
            top--;
            return item;
        }
        else {
            System.out.println("Stack was empty, there's no item to pop");
            return null;
        }
    }


    /**
     * Displays the stack
     * For testing purposes
     */
    public void displayStack() {
        if (!isEmpty()) {
            System.out.print("Stack: ");
            for (int i = 0; i <= maxSize - 1; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }




}
