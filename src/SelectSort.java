import java.util.Random;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        fillArr(arr);
        print(arr);
        sortArr(arr);
        print();
        print(arr);
    }

    static void sortArr(int arr[]) {
        int indexOfMin, tempElement = 0;
        for (int i = 0; i < arr.length; i++) {
            indexOfMin = searchIndexOfMin(arr, i);
            tempElement = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = tempElement;
        }
    }

    static int searchIndexOfMin(int arr[], int start) {
        int indexOfMin = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    static void fillArr(int arr[]) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void print() {
        System.out.println("\nAfter sorting \n");
    }
}