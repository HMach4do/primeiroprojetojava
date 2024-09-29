import java.util.Scanner;

public class VotacaoFuncionarioDoMes {

    // Função para encontrar o funcionário com o maior número de votos
    public static String encontrarVencedor(int[] votos, String[] funcionarios) {
        int maxVotos = -1;
        String vencedor = "";
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                vencedor = funcionarios[i];
            }
        }
        return vencedor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes dos funcionários
        System.out.println("Digite o número de funcionários que podem ser votados:");
        int numFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        String[] funcionarios = new String[numFuncionarios];
        System.out.println("Digite os nomes dos funcionários:");
        for (int i = 0; i < numFuncionarios; i++) {
            funcionarios[i] = scanner.nextLine();
        }

        // Leitura do número de votos
        System.out.println("Digite o número de votos:");
        int numVotos = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        int[] votos = new int[numFuncionarios];

        // Leitura dos votos
        System.out.println("Digite o número correspondente ao funcionário em quem deseja votar:");
        for (int i = 0; i < numVotos; i++) {
            int voto = scanner.nextInt();
            if (voto >= 1 && voto <= numFuncionarios) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
                i--; // Permitir que o usuário vote novamente
            }
        }

        // Encontrar o vencedor
        String vencedor = encontrarVencedor(votos, funcionarios);
        int votosVencedor = votos;
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].equals(vencedor)) {
                votosVencedor = votos[i];
                break;
            }
        }

        // Exibir o resultado
        System.out.println("Funcionário vencedor: " + vencedor);
        System.out.println("Total de votos: " + votosVencedor);
    }
}