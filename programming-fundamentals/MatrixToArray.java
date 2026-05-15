import java.util.Scanner;

public class MatrixToArray {
    
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();
       
        int[][] arr1 = new int[row][col];
       
        System.out.println("Enter array elements: ");        
        for (int i = 0; i < row; i++) {            
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        
        int[] arr2 = new int[row * col];
        for (int i = 0; i < row * col; i++) {
            arr2[i] = arr1[i / col][i % col];
        }
        
        System.out.println("1D array:");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }
}