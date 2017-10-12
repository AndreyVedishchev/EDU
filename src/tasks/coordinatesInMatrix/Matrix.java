package tasks.coordinatesInMatrix;

public class Matrix {

    int[][] arrInt;
    int maxNumber;
    int PARAM1;
    int PARAM2;

    public Matrix() {

        this.PARAM1 = 5;
        this.PARAM2 = 7;
        this.arrInt = new int[PARAM1][PARAM2];

        for(int i = arrInt.length - 1; i >= 0; i--){
            for(int j = arrInt[i].length - 1; j >= 0; j--){
                arrInt[i][j] = i + j;
            }
        }

        maxNumber = arrInt[PARAM1 - 1][PARAM2 - 1];

        for (int i = arrInt.length - 1; i >= 0; i--) {
            for (int j = arrInt[i].length - 1; j >= 0; j--) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    void foo (int index) {
        int vert = 0, hor = 0;

        if (index > maxNumber | index < 0) System.out.println("the number is not found");
        else {
            for (int i = arrInt.length - 1; i >= 0; i--) { vert++;
                for (int j = arrInt[i].length-1; j >= 0; j--) { hor++;
                    if (index == arrInt[i][j]) {
                        if (hor % PARAM2 != 0) System.out.println("x = " + hor % PARAM2 + "  y = " + vert);
                        else System.out.println("x = " + hor / vert + "  y = " + vert);
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.foo(10);
    }
}