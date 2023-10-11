public class Main {

    public static void findPairs(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 9, 10};
        int targetSum = 14;
        System.out.println("Pairs of integers whose sum is equal to " + targetSum + ":");
        findPairs(arr, targetSum);
    }
}
