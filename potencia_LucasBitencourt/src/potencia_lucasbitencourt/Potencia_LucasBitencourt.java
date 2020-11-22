package potencia_lucasbitencourt;
import java.util.Scanner;
public class Potencia_LucasBitencourt
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        int num = leitor.nextInt();
        int potencia;
        
        System.out.println("Potênca de 0 à 15 do número inserido: ");
        for(int i=0; i<=15; i++)
        {
             potencia = (int)Math.pow(num,i);
             System.out.println(num +"x"+i+ " = " +potencia);
        }
    }
    
}
