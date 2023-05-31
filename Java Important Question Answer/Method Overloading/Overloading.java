public class Overloading {

    public static void main(String[] args) {
        A r = new A();
        r.add();

        r.add(10, 10);
        double returnVal = r.add(10, 10.3);
        System.out.println(returnVal);
    }
}

class A {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    double add(int i, double z) {
        double c;
        c = i + z;
        return c;
    }
}
