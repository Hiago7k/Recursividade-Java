package Recursividade;

public class Base {
    static void main() {
        int base = 2;
        int expoente = 3;
        // 2 x 2 x 2 // 6
        System.out.println(potencia(base, expoente));
    }

    public static int potencia(int base, int expoente){

        if (expoente < 1){
            return 1;
        }

        return base * potencia(base, expoente- 1);

    }
}
