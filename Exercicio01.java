import java.math.BigInteger;

public class Exercicio01 extends BigInteger{
     public Exercicio1() {
         super("1");
     }
    public void exec() {
        for(int i = 10; i <= 50; i += 10) {
            BigInteger fat = new BigInteger("1");
            for(int j = i; j >= 1; j--) {
                fat = fat.multiply(BigInteger.valueOf(j));
            }
            System.out.println("o fatorial de " + i + " é " + fat);
        }
    }
}