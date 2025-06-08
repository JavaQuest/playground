package studyJava.sangwook.designpattern.builder.after;

public class HamburgerMain {
    public static void main(String[] args) {
        Hamburger3 hamburger = new HamburgerBuilder(1, 2)
                .bacon(3)
                .cheese(1).build();

        System.out.println(hamburger);
    }
}
