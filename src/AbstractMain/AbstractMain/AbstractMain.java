package AbstractMain.AbstractMain;

public class AbstractMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // 출력: 멍멍
        dog.eat();   // 출력: 먹이를 먹습니다.

        Animal cat = new Cat();
        cat.sound(); // 출력: 미야용
        cat.eat();   // 출력: 먹이를 먹습니다.
    }
}