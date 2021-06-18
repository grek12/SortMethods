public class BubbleSort {
    static private int Temp;
    static private int compare;
    static private int changes;


    static void bubleSort(int[] array) {
        int k = array.length;
        for (int i = 1; i < k; i++) {
            for (int j = k - 1; j >= i; j--) {
                compare = compare + 1;
                if (array[j - 1] > array[j]) {
                    changes = changes + 1;
                    Temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = Temp;
                }
            }
        }
        print(array);
    }

    static void print(int[] array) {
        System.out.println("--- Массив ПОСЛЕ пузырьковой сортировки ---");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n Сравнений: " + compare + " ; Замен: " + changes);
        compare = changes = 0;
    }
}
