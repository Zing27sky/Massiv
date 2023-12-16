import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        searchForDuplicates();
    }

    private static void searchForDuplicates() {
        String[] arr = {"1", "2", "3", "2", "3", "4", "5"};
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i].equals(arr[i1])) {
                    arr[i1] = ("");
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));
    }
}