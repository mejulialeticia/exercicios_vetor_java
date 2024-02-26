import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade, soma = 0;

        System.out.println("quantas notas você gostaria de verificar a média?");
        quantidade = input.nextInt();
        int notas[] = new int[quantidade];

        for(int i = 0; i < notas.length; i++){
            System.out.println("digite a nota: " + (i+1));
            notas[i] = input.nextInt();
            soma += notas[i];
        }

        int media = soma/quantidade;
        System.out.println("a média é: " + media);

        for(int i = 0; i < notas.length; i++){
            System.out.println("as notas são: " + notas[i]);
        }

        for(int j = 0; j < notas.length; j++){
            if(media > notas[j]){
                System.out.println("as notas menores que a média são: "+notas[j]);
            }
        
            if(media < notas[j]){
                System.out.println("as notas maiores que a média são: "+notas[j]);
            }
        }
        input.close();
    }
}