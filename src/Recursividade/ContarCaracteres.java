package Recursividade;

public class ContarCaracteres {
    static void main() {
        String texto = "HiagoRian";
        System.out.println(contadorCaracteres(texto));
    }

    public static int contadorCaracteres(String texto) {

        if (texto.isEmpty()) {
            return 0;
        }
        int contador = 1;
        return contador += contadorCaracteres(texto.substring(contador));
    }
}
