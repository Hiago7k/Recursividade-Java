package Recursividade;

public class MaiorNumeroDeUmArrayRecursivo {
    static void main() {
        int[] numeros = {4, 2, 9, 1, 3};

        System.out.println(maiorNumeroDeUmArray(numeros, 0));
    }

    public static int maiorNumeroDeUmArray(int[] numeros, int indice) {


        if (indice == numeros.length - 1) {
            return numeros[indice];
        }

        // descobrir o maior numero restante do array
        int maiorRestante = maiorNumeroDeUmArray(numeros, indice + 1);

        if (numeros[indice] > maiorRestante) {
            maiorRestante = numeros[indice];
        }

        return  maiorRestante;
    }
}
