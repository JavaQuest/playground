package studyJava.sangwook.designpattern.builder.after;

public class Hamburger3 {

    //필수
    private int bun;
    private int patty;

    //선택
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public Hamburger3(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        return "Hamburger3{" +
                "bun=" + bun +
                ", patty=" + patty +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}
