class Test {
    Test() {
        System.out.println("Default");
    }

    Test(String name) {
        System.out.println("Hello " + name);
    }

    Test(int x) {
        System.out.println("Number " + x);
    }

    public static void main(String[] args) {
        new Test();
        new Test("Java");
        new Test(10);
    }
}
