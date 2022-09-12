class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(fact(3));

    }

    public static int fact(int x) {
        return (x != 0) ? x * (x - 1) : 1;
    }
}