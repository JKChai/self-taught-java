public class Main2 {
    static String name = "George";

    public static void main(String[] args) {
        new Main2();
    }

    Main2() {
        System.out.println(name);

        String name = "Barry";
        System.out.println(name);

        System.out.println(this.name);
    }
}
