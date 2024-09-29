import java.util.Scanner;

public class BandeirasOlimpiadas {

    // Função para desenhar o caractere '*'
    public static void desenharAsterisco(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Função para desenhar o caractere '&'
    public static void desenharEComercial(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }
    }

    // Função para desenhar o caractere '%'
    public static void desenharPorcentagem(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("% ");
            }
            System.out.println();
        }
    }

    // Função para desenhar a bandeira do Brasil
    public static void desenharBrasil(int tamanho) {
        desenharAsterisco(tamanho);
    }

    // Função para desenhar a bandeira da Alemanha
    public static void desenharAlemanha(int tamanho) {
        desenharEComercial(tamanho);
    }

    // Função para desenhar a bandeira da Argentina
    public static void desenharArgentina(int tamanho) {
        desenharPorcentagem(tamanho);
    }

    // Função para desenhar a bandeira da Bélgica
    public static void desenharBelgica(int tamanho) {
        desenharAsterisco(tamanho);
    }

    // Função para desenhar a bandeira da Inglaterra
    public static void desenharInglaterra(int tamanho) {
        desenharEComercial(tamanho);
    }

    // Função para desenhar a bandeira da Coreia do Sul
    public static void desenharCoreiaDoSul(int tamanho) {
        desenharPorcentagem(tamanho);
    }

    // Função para desenhar a bandeira dos EUA
    public static void desenharUSA(int tamanho) {
        desenharAsterisco(tamanho);
    }

    // Função para desenhar a bandeira do Catar
    public static void desenharCatar(int tamanho) {
        desenharEComercial(tamanho);
    }

    // Função para desenhar a bandeira do Japão
    public static void desenharJapao(int tamanho) {
        desenharPorcentagem(tamanho);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a bandeira para desenhar:");
        System.out.println("a) Brasil");
        System.out.println("b) Alemanha");
        System.out.println("c) Argentina");
        System.out.println("d) Bélgica");
        System.out.println("e) Inglaterra");
        System.out.println("f) Coreia do Sul");
        System.out.println("g) USA");
        System.out.println("h) Catar");
        System.out.println("i) Japão");

        char escolha = scanner.next().charAt(0);
        System.out.println("Digite o tamanho (número de linhas e colunas):");
        int tamanho = scanner.nextInt();

        switch (escolha) {
            case 'a':
                desenharBrasil(tamanho);
                break;
            case 'b':
                desenharAlemanha(tamanho);
                break;
            case 'c':
                desenharArgentina(tamanho);
                break;
            case 'd':
                desenharBelgica(tamanho);
                break;
            case 'e':
                desenharInglaterra(tamanho);
                break;
            case 'f':
                desenharCoreiaDoSul(tamanho);
                break;
            case 'g':
                desenharUSA(tamanho);
                break;
            case 'h':
                desenharCatar(tamanho);
                break;
            case 'i':
                desenharJapao(tamanho);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}