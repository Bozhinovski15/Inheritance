public class B {
    int x = 2;

    void triple() {
        x = x * 3;
    }

    int returnIt() {
        return x;
    }
}

class C extends B {
    void triple() {
        x = x + 3;
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.x: " + b.returnIt());
        C c = new C();
        System.out.println("c.x: " + c.returnIt());
        b.triple();
        c.triple();
        System.out.println("b.x posle b.triple(): " + b.returnIt());
        System.out.println("c.x posle c.triple(): " + c.returnIt());
    }
}
