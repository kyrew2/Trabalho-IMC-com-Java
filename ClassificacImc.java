import java.util.Scanner;

public class ClassificacImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite: M para Masculino ou F para");
        char genero = sc.nextLine().charAt(0);

        System.out.println("Sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("agora seu peso em KGs: ");
        double peso =sc.nextDouble();

        System.out.println(calculaIMC(altura, peso));
    }
    static double calculaIMC (double altura,double peso){
        double imc =  peso/(altura *= altura);
        return imc;
    }
}