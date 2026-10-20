package Recursividade;

public class ContagemRegressiva {
    static void main() {
        int n = 4;
        contagemRegressiva(n);
    }

    public static void contagemRegressiva(int n) {
        System.out.println(n);
        if (n < 2) {
            return;
        }
        contagemRegressiva(n - 1);
    }
}
