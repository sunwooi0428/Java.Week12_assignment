package innerClassTest.java;

public class InnerClassTest{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(); // Accessing: Outer Field
    }
}
