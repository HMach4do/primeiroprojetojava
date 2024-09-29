public class LetraA { public class Vetores {

    // Função para calcular a soma dos elementos de um vetor
    public static int soma(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return soma;
    }

    // Função para calcular o produto dos elementos de um vetor
    public static int produto(int[] vetor) {
        int produto = 1;
        for (int num : vetor) {
            produto *= num;
        }
        return produto;
    }

    // Função para calcular a média dos elementos de um vetor
    public static double media(int[] vetor) {
        return (double) soma(vetor) / vetor.length;
    }

    public static void main(String[] args) {
        // Vetores de exemplo
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int[] vetor3 = {7, 8, 9};

        // Calcula soma, produto e média para cada vetor
        int soma1 = soma(vetor1);
        int produto1 = produto(vetor1);
        double media1 = media(vetor1);

        int soma2 = soma(vetor2);
        int produto2 = produto(vetor2);
        double media2 = media(vetor2);

        int soma3 = soma(vetor3);
        int produto3 = produto(vetor3);
        double media3 = media(vetor3);

        // Exibe os resultados para cada vetor
        System.out.println("Vetor 1: Soma = " + soma1 + ", Produto = " + produto1 + ", Média = " + media1);
        System.out.println("Vetor 2: Soma = " + soma2 + ", Produto = " + produto2 + ", Média = " + media2);
        System.out.println("Vetor 3: Soma = " + soma3 + ", Produto = " + produto3 + ", Média = " + media3);

        // Vetores com as somas, produtos e médias computadas
        int[] somas = {soma1, soma2, soma3};
        int[] produtos = {produto1, produto2, produto3};
        double[] medias = {media1, media2, media3};

        // Calcula a soma do vetor de somas, a média do vetor de médias e o produto do vetor de produtos
        int somaTotal = soma(somas);
        double mediaTotal = media(new int[]{(int) medias, (int) medias, (int) medias});
        int produtoTotal = produto(produtos);

        // Exibe os resultados finais
        System.out.println("Soma total das somas: " + somaTotal);
        System.out.println("Média total das médias: " + mediaTotal);
        System.out.println("Produto total dos produtos: " + produtoTotal);
    }
} 
}
