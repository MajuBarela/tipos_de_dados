import java.util.Scanner;

public class OperadorCalc {
    //Colete dois números do teclado
    //Faça as 5 operações matemáticas
    //Declare também as variáveis soma, mult, divisão, resto, subtração

    public static void main (String[] barela){
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        int soma;
        int mult;
        double divisao;
        double resto;
        int subtracao;

        System.out.println("Digite um número");
        numero1 = entrada.nextInt();

        System.out.println("Digite um número");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;
        mult = numero1 * numero2;
        divisao = numero1 / numero2;
        resto = numero1 % numero2;
        subtracao = numero1 - numero2; 

        System.out.println("A soma dos dois números são: " + soma);
        System.out.println("A multiplicação dos dois números são: " + mult);
        System.out.println("A divisão dos dois números são: " + divisao);
        System.out.println("O resto dos dois números são: " + resto);
        System.out.println("A subtração dos dois números são: " + subtracao);

    }
}