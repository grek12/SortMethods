public class InsertSort {
    static private int Temp;
    static private int compare;
    static private int changes;

    static void insertSort(int[] array) {
        int k = array.length;
        for (int i = 1; i < k; i++) {
            Temp = array[i];
            int j = i - 1;
            while ((j > -1) && (Temp < array[j])) {
                array[j + 1] = array[j];
                j = j - 1;
                compare = compare + 1;
                changes = changes + 1;
            }
            array[j + 1] = Temp;
        }
        print(array);
    }

    static void print(int[] array) {
        System.out.println("--- Массив ПОСЛЕ вставочной сортировки ---");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n Сравнений: " + compare + " ; Замен: " + changes);
        compare = changes = 0;
    }
}
