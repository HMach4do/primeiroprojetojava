import java.util.Arrays;

public class VogaisConsoantes {
    
    // Função que verifica se um caractere é uma vogal
    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        // Vetor de nomes
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};

        // Itera sobre cada nome no vetor
        for (String nome : nomes) {
            StringBuilder vogais = new StringBuilder();
            StringBuilder consoantes = new StringBuilder();

            // Itera sobre cada caractere do nome
            for (char c : nome.toCharArray()) {
                if (isVogal(c)) {
                    vogais.append(c).append(' ');
                } else if (Character.isLetter(c)) {
                    consoantes.append(c).append(' ');
                }
            }

            // Exibe o resultado para o nome atual
            System.out.println("Nome: " + nome);
            System.out.println("Vogais: " + vogais.toString());
            System.out.println("Consoantes: " + consoantes.toString());
            System.out.println();
        }
    }
}