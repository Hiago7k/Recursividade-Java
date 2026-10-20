package Recursividade;

public class SomarDeUmAteN {
    static void main() {
        int n = 4;

        System.out.println(somar(n));
    }

    public static int somar(int n){
        if (n < 1){
            return 0;
        }
        return n + somar(n -1);
    }
}
