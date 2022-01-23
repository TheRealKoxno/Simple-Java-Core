import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int step = scan.nextInt();
        System.out.printf("%d", otherVariant(size, step));
    }

    static public int otherVariant(int size, int step)
    {
        int cur_size = size;
        int next = step - 1;
        int prev = step - 2;
        int cur;
        int counter = step - 1;
        int buf;
        int[] substitution = new int[size];
        for (int i=0; i< size - 1 ;i++)
            substitution[i] = i + 1;

        substitution[size-1] = 0;
        while(cur_size > 1)
        {
            cur = next;
            if (counter < step-1)
            {
                counter++;
                while(substitution[next] < 0)
                    next = (next+1)% size;
                if (next != cur)
                    substitution[prev] = next;
                next = substitution[next];
            }
            else
            {
                cur_size--;
                counter=0;
                buf = substitution[next];
                while(substitution[buf] < 0)
                    buf = (buf+1)% size;
                substitution[next] = -1;
                next = buf;
                substitution[prev] = next;
            }
            prev=cur;
        }
        return next +1;
    }
}