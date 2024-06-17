package gr.aueb.cf.OOPProjects.course.chapter16.skeletal2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Square sq = new Square();

        sq.setHeight(10);
        sq.setWidth(10);

        System.out.println(sq.getDiagonal());

    }
}
