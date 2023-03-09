import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();

        int fib1 = 0, fib2 = 1, fib3 = 0;

        while (fib3 < num) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }

        if (fib3 == num) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}
