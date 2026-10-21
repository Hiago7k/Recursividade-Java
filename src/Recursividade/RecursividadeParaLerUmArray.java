package Recursividade;

public class RecursividadeParaLerUmArray {
    static void main() {
        int[] numeros = {2, 12, 3, 8, 2};
        System.out.println(percorrerArray(numeros, 0));

    }

    // criar uma função recurssiva para iterar sobre o array
    // e retornar o numero de elementos dele

    public static int percorrerArray(int[] numeros, int i) {

        if (i >= numeros.length) {
            return i;
        }
        return  percorrerArray(numeros, i + 1);
    }

}
