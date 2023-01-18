public class Main4 {
    String name = "Betty";

    public static void main(String[] args) {
        new Main4();
    }

    Main4() {
        String name = "Barry";
        new YetAnotherClass(this);
    }
}

class YetAnotherClass {
    YetAnotherClass(Main4 whoCreatedMe) {
        String name = "Leonard";
        System.out.println(name);
        // System.out.println(Main4.name); Illegal
        System.out.println(whoCreatedMe.name);
    }

}
