package Recursividade;

public class SomaDosDigitos {
    static void main() {
        int n = 472;

        System.out.println(somaDigitos(n));
    }

    public static int somaDigitos(int n){
        if (n < 10){ // ultima chamada
            return n;
        }
        int ultimo = n % 10; // extração do ultimo digito

        return ultimo + somaDigitos(n / 10); // reducao do problema
    }
}
