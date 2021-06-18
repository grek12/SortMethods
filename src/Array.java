public class Array {
    int size = 10;
    int[] array = new int[size];
    int[] ar1 = null;
    int[] ar2 = null;
    int[] ar3 = null;

    public void arr(int num) {
        num = size;
        for (int i = 0; i <= num - 1; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

    public int[] getAr1() {
        ar1 = array.clone();
        return ar1;
    }

    public int[] getAr2() {
        ar2 = array.clone();
        return ar2;
    }

    public int[] getAr3() {
        ar3 = array.clone();
        return ar3;
    }

    public void printArr() {
        System.out.print("Исходный массив:  ");
        for (int i : array)

            System.out.print(i + " ");
    }
}
