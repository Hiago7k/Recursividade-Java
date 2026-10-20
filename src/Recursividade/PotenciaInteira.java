package Recursividade;

public class PotenciaInteira {
    static void main() {
        int base = 3;
        int expoente = 4;
        // potencia = 3 x 3 x 3 x 3 = 81
        System.out.println(potencia(base, expoente));
    }

    public static int potencia(int base, int expoente) {
        if (expoente < 1) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }
}
