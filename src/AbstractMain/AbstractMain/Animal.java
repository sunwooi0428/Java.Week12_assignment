package AbstractMain.AbstractMain;

abstract class Animal {
    // 추상 메서드 - 구현이 없다
    abstract void sound();

    // 일반 메서드 - 구현이 있다
    void eat() {
        System.out.println("먹이를 먹습니다.");
    }
}
