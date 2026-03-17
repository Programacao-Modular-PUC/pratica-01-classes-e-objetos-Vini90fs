package pratica1completa;
import java.util.Scanner;

public class mainpessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];
        int cadastrados = 0;

        for (int i = 0; i < 10; i++) {

            pessoas[i] = new Pessoa();

            System.out.println("Cadastro " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.print("Dia de nascimento: ");
            int dia = sc.nextInt();

            System.out.print("Mes de nascimento: ");
            int mes = sc.nextInt();

            System.out.print("Ano de nascimento: ");
            int ano = sc.nextInt();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            Data d = new Data(dia, mes, ano);

            pessoas[i].setNome(nome);
            pessoas[i].setSobrenome(sobrenome);
            pessoas[i].setDataNascimento(d);
            pessoas[i].setPeso(peso);
            pessoas[i].setAltura(altura);
            pessoas[i].setIdade(pessoas[i].calcularIdade(d));
            pessoas[i].calcularImc();

            if (i > 0) {
                String atual = pessoas[i].getNome() + pessoas[i].getSobrenome();
                String anterior = pessoas[i - 1].getNome() + pessoas[i - 1].getSobrenome();

                if (atual.equalsIgnoreCase(anterior)) {
                    break;
                }
            }

            cadastrados++;
            System.out.println();
        }

        System.out.println("\n===== RESULTADO =====\n");

        for (int i = 0; i < cadastrados; i++) {
            System.out.println("Cadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + pessoas[i].nomeCompleto());
            System.out.println("Nome de referencia: " + pessoas[i].nomeRef());
            System.out.println("Idade: " + pessoas[i].getIdade());
            System.out.println("Peso: " + pessoas[i].getPeso());
            System.out.println("Altura: " + pessoas[i].getAltura());
            System.out.printf("IMC: %.2f%n", pessoas[i].getImc());
            System.out.println("Classificacao: " + pessoas[i].informarObs());
            System.out.println();
        }

	}

}
