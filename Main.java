import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int pair = 0;
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < n1; i++) {
            set1.add(n.nextInt());
        }
        int n2 = n.nextInt();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < n2; i++) {
            set2.add(n.nextInt());
        }
        int k = n.nextInt();
        Iterator<Integer> itr1 = set1.iterator();
        while (itr1.hasNext()) {
            int itr = itr1.next();
            int ki = k - itr;
            if(set2.contains(ki))
                pair += 1;
        }
        System.out.println(pair);
    }
}