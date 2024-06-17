package gr.aueb.cf.OOPProjects.course.chapter17.builder_design_pattern;

public class Main {

    public static void main(String[] args) {
        Book networks = new Book.Builder(1, "1234").build();

        Book java = new Book.Builder(2,"2345")
                .author("Stallings")
                .title("Advanced Java")
                .build();

        System.out.println(networks.toString());
        System.out.println(java.toString());
    }
}
