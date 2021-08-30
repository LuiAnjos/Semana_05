import java.util.Scanner;

public class Exercicio3 {
    public void exec() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        System.out.println("");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
