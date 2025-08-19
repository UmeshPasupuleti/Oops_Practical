package Oops_practical;

class A {
    void m1() {
        System.out.println("Inside A's m1");
    }
}

class B extends A {
    void m1() {
        System.out.println("Inside B's m1");
    }
}

class C extends A {
    void m1() {
        System.out.println("Inside C's m1");
    }
}

public class overridding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;   // Reference of type A

        ref = a;   // pointing to A
        ref.m1();  // prints "Inside A's m1"

        ref = b;   // pointing to B
        ref.m1();  // prints "Inside B's m1"

        ref = c;   // pointing to C
        ref.m1();  // prints "Inside C's m1"
    }
}
