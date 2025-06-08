package studyJava.sangwook.designpattern.builder.after;

public class HamburgerBuilder {

    //필수
    private int bun;
    private int patty;

    //선택
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    //bun과 patty는 필수 항목이므로 생성자에 추가
//    public HamburgerBuilder bun(int bun) {
//        this.bun = bun;
//        return this;
//    }
//
//    public HamburgerBuilder patty(int patty) {
//        this.patty = patty;
//        return this;
//    }


    public HamburgerBuilder(int bun, int patty) {
        this.bun = bun;
        this.patty = patty;
    }

    public HamburgerBuilder cheese(int cheese) {
        this.cheese = cheese;
        return this;
    }

    public HamburgerBuilder lettuce(int lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public HamburgerBuilder tomato(int tomato) {
        this.tomato = tomato;
        return this;
    }

    public HamburgerBuilder bacon(int bacon) {
        this.bacon = bacon;
        return this;
    }

    public Hamburger3 build() {
        return new Hamburger3(bun, patty, cheese, lettuce, tomato, bacon);
    }
}
