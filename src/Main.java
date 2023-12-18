public class Main {
    public static void main(String[] args) {
        searchForDuplicates();
    }

    private static void searchForDuplicates() {
        String result = "";
        String[] arr = {"1", "2", "3", "2", "3", "4", "5"};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        arr[j] = null;
                    }
                }
                result += arr[i];
            }
        }
        System.out.println(result);
    }
}