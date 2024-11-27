package sortowania;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};

        System.out.println("Tablica przed sortowaniem: ");
        printArray(array);

        SelectionSort(array);

        System.out.println("\nTablica po sortowaniem: ");
        printArray(array);
    }

    public static void SelectionSort(int[] array) {
        for (int i=0;i<array.length-1;i++)  {
            int min = i;
            for (int j=i+1;j<array.length;j++) {
                if (array[j]<array[min]) {
                    min = j;
                }
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
