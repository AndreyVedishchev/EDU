package tasks.testRosgosstrakh;

import java.util.*;

public class DuplicateSearch {

    /**
     * поиск повторяющихся значений в массиве
     * @param arr - входящий массив
     * @return набор повторяющихся элементов
     */
    public Set searchInArr(int[] arr) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    res.add(arr[j]);
                }
            }
        }
        return res;
    }

    /**
     * поиск повторяющихся значений в отсортированном массиве
     * @param arr - входящий массив
     * @return набор повторяющихся элементов
     */
    public Set searchInSortArr(int[] arr) {
        Set<Integer> res = new HashSet<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        final int ARR_LENGTH = 101;
        int val = 1;
        int[] value = new int[ARR_LENGTH];
        int[] valueSort = new int[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) { //заполнение массивов
            value[i] = (int) (Math.random() * 100) + 1;
            valueSort[i] = val++;
        }
        valueSort[100] = 100; //добавление дублей в отсортированный массив
        valueSort[1] = 1;

        DuplicateSearch ds = new DuplicateSearch();
        System.out.println(ds.searchInSortArr(valueSort));
        System.out.println(ds.searchInArr(value));
    }
}
