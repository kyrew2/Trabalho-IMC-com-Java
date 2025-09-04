import java.util.Scanner;

public class ClassificacImc {

    public static void exibir(String nome1, char generoExibido, double calculaIMC, String cla) {
        System.out.println("Nome " + nome1);
        System.out.println("Gênero " + generoExibido);
        System.out.printf("IMC: %.1f\n", calculaIMC);
        System.out.println("Classificação: " + cla);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verifica = 0;

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();
        double calculaIMC = peso / (altura * altura);
        while (verifica <= 0) {
            sc.nextLine();
            System.out.print("Digite M para Masculino, F para Feminino ou N para nb ou não deseja informar:");

            char genero = sc.nextLine().charAt(0);

            switch (genero) {
                case 'M', 'm':
                    if (calculaIMC <= 20) {
                        exibir(nome, genero, calculaIMC, "IMC: abaixo do normal");
                    } else if (calculaIMC > 20 && calculaIMC <= 24.99) {
                        exibir(nome, genero, calculaIMC, "IMC: normal");
                    } else if (calculaIMC >= 25 && calculaIMC <= 29.99) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade leve");
                    } else if (calculaIMC >=30 && calculaIMC <=39.99) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade moderada");
                    } else if  (calculaIMC >= 40) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade mórbida");
                    }
                    System.out.println("Masculino");//tirar depois
                    verifica++;
                    break;

                case 'F', 'f', 'N', 'n':
                    if (calculaIMC <= 19) {
                        exibir(nome, genero, calculaIMC, "IMC: abaixo do normal");
                    } else if (calculaIMC > 19 && calculaIMC <= 23.99) {
                        exibir(nome, genero, calculaIMC, "IMC: normal");
                    } else if (calculaIMC >= 24 && calculaIMC <= 28.99) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade leve");
                    } else if (calculaIMC >=29 && calculaIMC <=38.99) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade moderada");
                    } else if  (calculaIMC >= 39) {
                        exibir(nome, genero, calculaIMC, "IMC: obesidade mórbida");
                    }
                    verifica++;
                    break;
                default:
                    System.out.println("Selecione um gênero válido");
            }
        }
    }
}
