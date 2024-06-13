package gr.aueb.cf.OOPProjects.course.chapter16.marker;

import gr.aueb.cf.OOPProjects.course.chapter16.Cat;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        CompactDisk cd = new CompactDisk();

        Cat cat = new Cat();

        deliver(book);
        deliver(cd);
//        deliver(cat);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        }else if (item instanceof CompactDisk) {
            System.out.printf("CD delivered");
        }else {
            throw new RuntimeException("Item cannot get delivered");
        }
    }
}
