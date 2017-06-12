//Учитывая отсортированный массив, удалите дубликаты на месте, чтобы каждый элемент отображался только один раз и возвращал новую длину.
//        Не выделяйте дополнительное пространство для другого массива, вы должны сделать это на месте с постоянной памятью.
//        Например,
//        Учитывая входной массив nums = [1,1,2] ,
//        Ваша функция должна вернуть length = 2 , причем первые два элемента nums равны 1 и 2 соответственно. Неважно, что вы выходите за пределы новой длины.
package tasks.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
    Task task = new Task();
        System.out.println(task.foo1(array));
//            String[] names = {"Zoe", "Alison", "David"};
//            Arrays.sort(names);
//            System.out.println(Arrays.toString(names));
    }
    static int [] array = {54, 5, 2, 5, 11, -564, 89, 11, 23, 856, 11};

    public int foo1(int [] array) {
        int cntCopy = 0;
        int cnt = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] > array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    cntCopy++;
                    System.out.println(Arrays.toString(array));
                    System.out.println(array.length + "  " + cntCopy);

                }
            }
        }
        cnt = array.length - cntCopy;
        return cnt;
    }
}
