package conversaotemperatura_lucasbitencourt;
import java.util.Scanner;
public class ConversaoTemperatura_LucasBitencourt 
{
    public static void main(String[] args)
    {
       Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a temperatura desejada em Celsius: ");
        double C = leitor.nextDouble();
        double F, Subindo;
        
        F = C * 1.8 + 32; 
        
        System.out.println("Temperatura convertida em Fahrenheit: "+F);
        System.out.println("Temperatura em Fahrenheit subindo de 10º em 10º:");
        for(double i=10; i<=100;)
        {
             Subindo = F + i;
             i = i + 10;
             System.out.println(Subindo+"º");
        } 
    }
}
