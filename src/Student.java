import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter ScoreStudent: ");
        int n = scanner.nextInt();
        if (n > 30) {
            System.out.print("Out Size");
        } else {
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = scanner.nextDouble();
            }
            for (double v : arr) {
                System.out.print(v + " ");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 5 && arr[i] <= 10) {
                    System.out.print("\n" + " Sinh vien" + i + " do");
                } else {
                    System.out.print("\n" +  " sinh vien " + i + " truot");
                }
            }

        }
    }
}
