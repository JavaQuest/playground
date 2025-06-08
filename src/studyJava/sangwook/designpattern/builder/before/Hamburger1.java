package studyJava.sangwook.designpattern.builder.before;

public class Hamburger1 {

    //필수
    private int bun;
    private int patty;

    //선택
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public Hamburger1(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    public Hamburger1(int bun, int patty, int cheese, int lettuce, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }

    public Hamburger1(int bun, int patty, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.tomato = tomato;
    }

    //생성자 오버로딩을 통해 햄버거를 만들 수 있지만 너무 많은 생성자 필요
    //가독성 down, 유지보수에 안좋음
}
