import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        String x1y1Str = in.nextLine();
        String[] x1y1 = x1y1Str.split(" ");
        float x1 = Float.parseFloat(x1y1[0]);
        float y1 = Float.parseFloat(x1y1[1]);
        float x0 = x1, y0 = y1, sumSq = 0;

        for(int i = 0; i < n-1; i++) {
            String xiyiStr = in.nextLine();
            String[] xiyi = xiyiStr.split(" ");
            float xi = Float.parseFloat(xiyi[0]);
            float yi = Float.parseFloat(xiyi[1]);
            sumSq += 0.5*(y1 + yi)*(xi-x1);
            x1 = xi;
            y1 = yi;
        }
        sumSq += 0.5*(y1 + y0)*(x0-x1);
        System.out.print(sumSq);
    }
}