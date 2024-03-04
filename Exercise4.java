import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    

    double salarios[] = new double[3];
    System.out.println("digite os tres salários");
    int contador = 0;
    
    while(contador < 3){
        salarios[contador] = input.nextDouble();
        contador ++;
        }

        if((contador) == salarios.length){
            System.out.println("insira o valor de reajuste");    
            double reajuste = input.nextDouble();

            for(int j = 0; j < salarios.length; j++ ){
                System.out.println("o salario " + (j+1)+ " é: " + (salarios[j]+reajuste));
            }
        }else{
            System.out.println("faltam salarios");
        }
        input.close();
    }
   
}
