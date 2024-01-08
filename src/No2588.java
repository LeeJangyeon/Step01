import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int in1 = in.nextInt();
        int in2 = in.nextInt();

        int q_in1 = in2 / 100;
        int q_in2 = (in2 / 10) % 10;
        int q_in3 = in2 % 10;

        System.out.println(in1 * q_in3);
        System.out.println(in1 * q_in2);
        System.out.println(in1 * q_in1);
        System.out.println(in1 * in2);
    }
}