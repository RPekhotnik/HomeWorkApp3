/*Java 1. Homework3

@author Rumiia Pekhotnik
@version 31.03.2022
 */

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] mass = {1, 0, 1, 0, 0, 1};
        int[] mass1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] mass2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        inverseArray(mass);
        fillArray();
        array3(mass1);
        fillDiagonalInArray(mass2);
        makeArray(5, 2);

    }

    static void inverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    static void array3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void fillDiagonalInArray(int[][] arr) {
        for (int i = 0, y = 0; i < arr.length; i++, y++) {
            arr[i][y] = 1;
        }
        for (int i = 0, y = arr.length - 1; i < arr.length; i++, y--) {
            arr[i][y] = 1;
        }
        for (int y = 0; y < arr.length; y++) {
            System.out.println("\n");
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[y][x] + " ");
            }
        }
    }

    static int[] makeArray(int len, int initialValue) {
        int[] mass3 = new int[len];
        for (int i = 0; i < len; i++) {
            mass3[i] = initialValue;
            System.out.println(mass3[i]);
        }
        return mass3;

    }


}
