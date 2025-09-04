import java.util.Scanner;

public class ClassificacImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verifica = 0;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        while (verifica <=0) {

            System.out.print("Digite M para Masculino, F para Feminino ou N para nb ou não deseja informar:");
            char genero = sc.nextLine().charAt(0);

            switch (genero) {
                case 'M':
                    System.out.println("Masculino");
                    verifica++;
                    break;

                case 'F':
                    System.out.println("Feminino");
                    verifica++;
                    break;

                case 'N':
                    System.out.println("Não informado");
                    verifica++;
                    break;

                default:
                    System.out.println("Selecione um gênero válido");

            }
        }

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