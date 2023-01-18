import java.util.Arrays;

public class DummyChp10 {
    public static void main(String[] args) {
        int[] guests = {1,4,2,0,2,1,4,3,0,2};
        System.out.println(guests); // Not very useful
        System.out.println(Arrays.toString(guests));
        Arrays.sort(guests);
        System.out.println(Arrays.toString(guests));
        Arrays.fill(guests,0);
        System.out.println(Arrays.toString(guests));
    }
}
