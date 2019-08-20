package tasks.searchLargestSequence;

public class LargestSequence {
    public static void main(String[] args) {

        int[] arr = {1, 2, -5, 3, 2, 3, 1, 5, 10, 13, 22, 3, 0, -9};

        int count = 1;
        int max = 0;
        int end = 0;
        int i;

        for(i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1]) {
                count++;
            } else {
                if(count >= max) {
                    end = i;
                    max = count;
                    count = 1;
                }
            }
        }

        if(count > max) {
            max = count;
            end = i;
        }

        for(int j = end - max; j < end; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
