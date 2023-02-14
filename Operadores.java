import java.util.Scanner;

public class Operadores {
    public static void main (String[] barela){
        Scanner entrada = new Scanner(System.in);
        int idade=0;
        int numero1;
        int numero2;
        int soma;
        System.out.println("Digite sua idade");
        idade = entrada.nextInt();
        System.out.println(idade);

        System.out.println("Digite um número");
        numero1 = entrada.nextInt();

        System.out.println("Digite um número");
        numero2 = entrada.nextInt();
        soma = numero1 + numero2;

        System.out.println("A soma dos dois números são: " + soma);


    }

}