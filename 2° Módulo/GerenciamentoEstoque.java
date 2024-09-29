import java.util.Scanner;

    public class GerenciamentoEstoque {
    
        // Função para cadastrar novos produtos
        public static void cadastrarProduto(String[] produtos, int[] quantidades, int index, String nome, int quantidade) {
            produtos[index] = nome;
            quantidades[index] = quantidade;
        }
    
        // Função para consultar a quantidade de um produto específico
        public static int consultarQuantidade(String[] produtos, int[] quantidades, String nome) {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].equals(nome)) {
                    return quantidades[i];
                }
            }
            return -1; // Produto não encontrado
        }
    
        // Função para atualizar o estoque de um produto
        public static void atualizarEstoque(String[] produtos, int[] quantidades, String nome, int quantidade) {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].equals(nome)) {
                    quantidades[i] += quantidade;
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Arrays para armazenar os nomes dos produtos e suas quantidades
            String[] produtos = new String;
            int[] quantidades = new int;
            int numProdutos = 0;
    
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Cadastrar produto");
                System.out.println("2. Consultar quantidade de um produto");
                System.out.println("3. Atualizar estoque de um produto");
                System.out.println("4. Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
    
                if (opcao == 1) {
                    // Cadastrar produto
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade inicial:");
                    int quantidade = scanner.nextInt();
                    cadastrarProduto(produtos, quantidades, numProdutos, nome, quantidade);
                    numProdutos++;
                    System.out.println("Produto cadastrado com sucesso!");
    
                } else if (opcao == 2) {
                    // Consultar quantidade de um produto
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    int quantidade = consultarQuantidade(produtos, quantidades, nome);
                    if (quantidade != -1) {
                        System.out.println("Quantidade em estoque de " + nome + ": " + quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
    
                } else if (opcao == 3) {
                    // Atualizar estoque de um produto
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade a ser adicionada (use valor negativo para diminuir):");
                    int quantidade = scanner.nextInt();
                    atualizarEstoque(produtos, quantidades, nome, quantidade);
                    System.out.println("Estoque atualizado com sucesso!");
    
                } else if (opcao == 4) {
                    // Sair
                    System.out.println("Saindo...");
                    break;
    
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
    
            scanner.close();
        }
    }