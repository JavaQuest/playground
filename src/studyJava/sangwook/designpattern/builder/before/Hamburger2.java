package studyJava.sangwook.designpattern.builder.before;

public class Hamburger2 {

    //필수
    private int bun;
    private int patty;

    //선택
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    //java beans 패턴으로 유연하게 햄버거를 만들 수 있지만
    //데이터의 일관성 문제 발생 가능, setter를 아무나 사용할 수 있게 되어 불변성에서도 문제 발생
}
