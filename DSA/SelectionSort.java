public class SelectionSort {
    static void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1, 2 };
        sort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}