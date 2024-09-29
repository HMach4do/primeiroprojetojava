public class MassaInicial { public class DecaimentoRadioativo {

    public static void main(String[] args) {
        double massaInicial = 10.0; // Massa inicial em gramas
        double massaFinal = massaInicial;
        int tempoSegundos = 0;

        // Calcula o tempo necessário para que a massa se torne menor que 0,5 grama
        while (massaFinal >= 0.5) {
            massaFinal /= 2;
            tempoSegundos += 50;
        }

        // Converte o tempo total de segundos para horas, minutos e segundos
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        // Exibe os resultados
        System.out.println("Massa inicial: " + massaInicial + " gramas");
        System.out.println("Massa final: " + massaFinal + " gramas");
        System.out.println("Tempo calculado: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
    }
} 
}
