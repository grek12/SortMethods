import java.util.Scanner;

public class Menu {                        //основное пользовательское меню
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name;

    public void mainMenu() {

        Array array = new Array();
        array.arr(10);
        while (!"5".equals(s)) {
            System.out.println("\n Действия \n");
            System.out.println("1. Вывод исходного массива");
            System.out.println("2. Метод пузырька");
            System.out.println("3. Метод вставки");
            System.out.println("4. Метод выборочный");
            System.out.println("5. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    array.printArr();
                    break;
                case 2:
                    BubbleSort.bubleSort(array.getAr1());
                    break;
                case 3:
                    InsertSort.insertSort(array.getAr2());
                    break;
                case 4:
                    SelectSort.selectSort(array.getAr3());
                    break;
            }
        }
    }
}