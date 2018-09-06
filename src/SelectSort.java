import java.util.Random;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        fillArr(arr);
        printArr(arr);
        sortArr(arr);
        System.out.println("\nAfter sorting \n");
        printArr(arr);
    }
        public static void sortArr ( int arr[]){
            int j, tempElement = 0;
            for (int i=0;i < arr.length;i++){
                j = searchIndexOfMin(arr,i);
                tempElement = arr[i];
                arr[i] = arr[j];
                arr[j] = tempElement;
            }
        }
        public static int searchIndexOfMin(int arr[], int start){
            int indexOfMin = start;
            for (int i = start+1; i <arr.length; i++) {
                if (arr[i] < arr[indexOfMin]) {
                    indexOfMin = i;
                }
            }
            return indexOfMin;
        }
        public static void fillArr(int arr[]){
             Random random = new Random();
             for (int i = 0; i < arr.length ; i++) {
                 arr[i] = random.nextInt(100);
             }
        }
        public static void printArr ( int arr[]){
             for (int i = 0; i < arr.length; i++) {
                 System.out.println(arr[i]);
             }
        }
}