public class SelectSort {
    static private int Temp, b;
    static private int compare;
    static private int changes;

    static void selectSort(int[] array) {
        int k = array.length;
        for (int i = 0; i < k - 1; i++) {
            b = i;
            Temp = array[i];
            for (int j = i + 1; j < k; j++) {
                if (array[j] <= Temp) {
                    b = j;
                    Temp = array[j];

                }
                compare = compare + 1;

            }
            if (array[i] == array[b]) {
                changes = changes + 1;
            }
            array[b] = array[i];
            array[i] = Temp;

        }
        print(array);
    }

    static void print(int[] array) {
        System.out.println("--- Массив ПОСЛЕ выборочной сортировки ---");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n Сравнений: " + compare + " ; Замен: " + changes);
        compare = changes = 0;
    }
}
