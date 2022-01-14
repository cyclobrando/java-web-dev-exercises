package exercises;

public class Arrays {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {
            if (i % 2 == 0) continue;
            else System.out.println(i);
        }
    }
}
