package Recursividade;

public class InverterUmaString {
    static void main() {
        String texto = "Java";

        System.out.println(inverterString(texto));
    }


    public static String inverterString(String texto){

        if (texto.isBlank()){
            return "";
        }

        return texto = inverterString(texto.substring(1)) + texto.charAt(0);
    }

}
