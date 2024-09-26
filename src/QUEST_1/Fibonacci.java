package QUEST_1;

public class Fibonacci {
    public static Boolean isFibonacciValid(int n) {
        if (n < 0) // não existe
            return false;

        int next , a=0, b=1; // variáveis para encontrar o fibonacci

        while ( a <= n) {
            if (a == n)  // valor encontrado
                return true;
            next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
