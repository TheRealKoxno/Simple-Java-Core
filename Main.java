import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] matrix = new int[2][size];
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < size; j++)
                matrix[i][j] = scan.nextInt();
        int[] result = finder(matrix, size);
        System.out.printf("%d %d", result[0], result[1]);
    }

    static int[] finder(int[][] matrix, int size)
    {
        int[] maximum = new int[size];
        int indexMax = size - 1;
        int[] result = {0,0};
        for(int i = size - 1; i > -1; i--)
        {
            if(matrix[1][i] >= matrix[1][indexMax])
                indexMax = i;
            maximum[i] = indexMax;
        }
        int max = matrix[0][0] + matrix[1][0];
        int Sum;
        int Key;
        for(int i = 0; i < size; i++)
        {
            Key = maximum[i];
            Sum = matrix[0][i] + matrix[1][Key];
            if (Sum > max)
            {
                max = Sum;
                result[0] = i;
                result[1] = Key;
            }
        }
        return result;
    }
}