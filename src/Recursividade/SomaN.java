package Recursividade;

public class SomaN {
    static void main() {
        int n = 10;

        System.out.println(somarAteN(n));
    }

    public static int somarAteN(int n){
        int soma = 0;

        if (n <= 0){
            return soma; // valor que vou enviar pra ultima camada, quando bater no caso base
        }

        // enquanto não bater meu caso base,
        // eu vou fazer uma chamada de recursividade
        // enviando o valor atual de n após uma determinada ação
        // no caso n -1
        // com isso crio uma váriavel também auxiliar soma
        // que o resultado dela, vai ser o retorno e desempilhamento
        // então o resultado dela vai altera a cada camada
        // e no final vai ter concatenado tudo

        return soma += n + somarAteN(n -1);

    }
}
