import java.util.Scanner;

public class Exercise1{
    public static void main(String[]args){ 
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int vetorNotas[] = new int[5];
        String vetorNomes[] = new String[5];

        for(int i = 0; i < vetorNotas.length; i++){
            System.out.println("digite seu nome");
            vetorNomes[i] = input.nextLine();
            System.out.println("digite sua nota");
            vetorNotas[i] = Integer.parseInt(input.nextLine());
            soma = soma + vetorNotas[i];
        }

        int media = (soma / 5);
        System.out.println("a nota de " + vetorNomes[0] + "é: " +vetorNotas[0]);
        System.out.println("a nota de " + vetorNomes[1] + " " +vetorNotas[1]);
        System.out.println("a nota de " + vetorNomes[2] + " " +vetorNotas[2]);
        System.out.println("a nota de: " + vetorNomes[3] + " " +vetorNotas[3]);
        System.out.println("a nota de: " + vetorNomes[4] + " " +vetorNotas[4]);
        System.out.println("A média da turma é: " + media);

        input.close();
    }
}
  