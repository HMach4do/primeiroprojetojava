import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a palavra
        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();

        // Remove espaços e converte a palavra para minúsculas para comparação
        word = word.replaceAll("\\s", "").toLowerCase();

        // Verifica se a palavra é um palíndromo
        boolean isPalindrome = checkPalindrome(word);

        if (isPalindrome) {
            System.out.println("A palavra \"" + word + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + word + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    // Função para verificar se uma palavra é um palíndromo
    public static boolean checkPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}