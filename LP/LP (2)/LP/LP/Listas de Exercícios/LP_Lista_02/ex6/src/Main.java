import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double Ms, KmH;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s: ");
        Ms = in.nextDouble();

        KmH = Ms * 3.6;
        System.out.println("A velocidade em Km/h é: " + KmH);
    }
}
