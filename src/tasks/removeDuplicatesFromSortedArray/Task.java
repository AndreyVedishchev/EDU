/*
Цель задачи проверить данный массив на повторы и найти длину массива с вычетом повторов.
*/
package tasks.removeDuplicatesFromSortedArray;

public class Task {
    public static void main(String[] args) {
    Task task = new Task();
        System.out.println(task.foo1(array));
    }

    static int [] array = {5, 2, 5, -564, 98, 23, 81, 34, 68, 98};

    public int foo1(int [] array) {
        int cntCopy = 0;
        int cnt;
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] > array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
                if (array[i] == array[k]) {
                    cntCopy++;
                    break;
                }
            }
        }
        cnt = array.length - cntCopy;
        return cnt;
    }
}
