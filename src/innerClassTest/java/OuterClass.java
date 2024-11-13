package innerClassTest.java;

class OuterClass {
    private String outerField = "Outer Field";

    // 인스턴스 내부 클래스
    class InnerClass {
        void display() {
            // 외부 클래스의 private 멤버에도 접근 가능
            System.out.println("Accessing: " + outerField);
        }
    }

    void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
