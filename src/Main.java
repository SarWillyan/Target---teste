import QUEST_1.Fibonacci;
import QUEST_2.StringCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Questão 1:");
        System.out.println("Insira o número que deseja verifcar se pertence a sequencia de fibonacci: ");
        System.out.print("num: ");
        int n = sc.nextInt();
        if (Fibonacci.isFibonacciValid(n))
            System.out.println("O valor " + n + " existe na sequencia de fibonacci");
        else
            System.out.println("O valor " + n + " não existe na sequencia de fibonacci");
        System.out.println("----------------------------");

        System.out.println("Questão 2:");
        sc.nextLine();//limpar buffer
        System.out.println("Insira uma frase e verifique a existencia de 'a':");
        System.out.print("frase: ");
        String frase = sc.nextLine();
        System.out.println(StringCount.contA(frase));
    }
}