import java.util.Scanner;

public class ClassificacImc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int verifica = 0;
        String generoInformado = "";

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        while (verifica <= 0) {

            System.out.print("Digite M para Masculino, F para Feminino ou N para nb ou não deseja informar:");
            char genero = sc.nextLine().charAt(0);

            switch (genero) {
                case 'M', 'm':
                    System.out.println("Masculino");//tirar depois
                    generoInformado = "M";
                    verifica++;
                    break;

                case 'F', 'f':
                    System.out.println("Feminino"); //tirar depois
                    generoInformado = "F";
                    verifica++;
                    break;

                case 'N', 'n':
                    System.out.println("Não informado"); //tirar depois
                    generoInformado = "F";
                    verifica++;
                    break;

                default:
                    System.out.println("Selecione um gênero válido");
            }
        }

        System.out.print("Sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("agora seu peso em KGs: ");
        double peso = sc.nextDouble();

        double calculaIMC = peso / (altura * altura);
        System.out.println(calculaIMC);

        if (generoInformado.equals("F")) {
            if (calculaIMC <= 19) {
                System.out.println("IMC: abaixo do normal");
            } else if (calculaIMC > 19 && calculaIMC <= 23.99) {
                System.out.println("IMC: normal");
            } else if (calculaIMC >= 24 && calculaIMC <= 28.99) {
                System.out.println("IMC: obesidade leve");
            } else if (calculaIMC >=29 && calculaIMC <=38.99) {
                System.out.println("IMC: obesidade moderada");
            } else if  (calculaIMC >= 39) {
                System.out.println("IMC: obesidade mórbida");
            }
        }

        if (generoInformado.equals("M")) {
            if (calculaIMC <= 20) {
                System.out.println("IMC: abaixo do normal");
            } else if (calculaIMC > 20 && calculaIMC <= 24.99) {
                System.out.println("IMC: normal");
            } else if (calculaIMC >= 25 && calculaIMC <= 29.99) {
                System.out.println("IMC: obesidade leve");
            } else if (calculaIMC >=30 && calculaIMC <=39.99) {
                System.out.println("IMC: obesidade moderada");
            } else if  (calculaIMC >= 40) {
                System.out.println("IMC: obesidade mórbida");
            }
        }
    }
}
