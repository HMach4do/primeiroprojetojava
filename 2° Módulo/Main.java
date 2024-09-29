import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de elementos no array
        System.out.print("Digite o número de elementos: ");
        int n = scanner.nextInt();

        // Inicializa um array para armazenar os elementos
        int[] arr = new int[n];

        // Lê os elementos do usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calcula a soma de todos os elementos
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Encontra o valor máximo e mínimo
        int maxVal = Arrays.stream(arr).max().getAsInt();
        int minVal = Arrays.stream(arr).min().getAsInt();

        // Calcula a média
        double average = (double) totalSum / n;

        // Calcula a mediana
        Arrays.sort(arr);
        double median;
        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            median = arr[n / 2];
        }

        // Calcula a moda
        // (Você pode implementar a lógica para encontrar a moda aqui)

        // Exibe os resultados
        System.out.println("Soma de todos os elementos: " + totalSum);
        System.out.println("Valor máximo: " + maxVal);
        System.out.println("Valor mínimo: " + minVal);
        System.out.println("Média: " + average);
        System.out.println("Mediana: " + median);
        // Exiba a moda aqui

        scanner.close();
    }
}