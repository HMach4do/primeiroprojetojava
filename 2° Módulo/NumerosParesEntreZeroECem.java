public class NumerosParesEntreZeroECem {
    public static void main(String[] args) {
        System.out.println("e) Todos os números pares entre 0 e 100:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}