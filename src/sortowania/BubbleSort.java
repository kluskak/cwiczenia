package sortowania;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};

        System.out.println("Tablica przed sortowaniem: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nTablica po sortowaniem: ");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        //pętla zewnętrzna
        for (int i = 0; i < n - 1; i++){
            //pętla wewnętrzna
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
