public class NumerosDivisiveisPorQuatro {
    public static void main(String[] args) {
        System.out.println("f) Todos os números divisíveis por 4 entre 0 e 1000:");
        for (int i = 0; i <= 1000; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
