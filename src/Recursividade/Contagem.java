package Recursividade;

public class Contagem {
    static void main() {
        int n = 4;

        contagemRegressiva(n);
    }

    public static void contagemRegressiva(int n) {
        System.out.println(n);

        if (n < 2) {
            System.out.println("Fim");
            return;
        }

        contagemRegressiva(n - 1);

    }
}
