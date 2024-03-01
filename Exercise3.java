import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas a se verificar");
        int quantidade = input.nextInt();
        input.nextLine();

        String nomes[] = new String[quantidade];
        int notas[] = new int[quantidade];

        int maiorNota = notas[0];
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite seu nome");
            nomes[i] = input.nextLine();
            System.out.println("Digite sua nota");
            notas[i] = Integer.parseInt(input.nextLine());
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }       
        }      
        System.out.println("maior nota: " + maiorNota);         


        input.close();
    }
    
}