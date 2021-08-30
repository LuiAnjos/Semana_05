import java.util.Scanner;

public class Exercicio02 {
    public void exec() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print(21 + " -> ");
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = x * 3 + 1;
            }
            if (x == 1) {
                System.out.print(x);
            } else {
                System.out.print(x + " -> ");
            }
        }
    }
}