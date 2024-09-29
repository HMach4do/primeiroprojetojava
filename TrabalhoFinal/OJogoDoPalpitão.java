import java.util.*;

class Time {
    String nome;
    int pontos;
    int saldoDeGols;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.saldoDeGols = 0;
    }
}

class Jogador {
    String nome;
    int fichas;
    int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.fichas = 50;
        this.pontuacao = 0;
    }
}

class Partida {
    Time time1;
    Time time2;
    int golsTime1;
    int golsTime2;

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public void jogar(int golsTime1, int golsTime2) {
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        if (golsTime1 > golsTime2) {
            time1.pontos += 3;
        } else if (golsTime2 > golsTime1) {
            time2.pontos += 3;
        } else {
            time1.pontos += 1;
            time2.pontos += 1;
        }
        time1.saldoDeGols += (golsTime1 - golsTime2);
        time2.saldoDeGols += (golsTime2 - golsTime1);
    }
}

public class Palpitao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização dos jogadores
        System.out.print("Informe o nome do Jogador 1: ");
        Jogador jogador1 = new Jogador(scanner.nextLine());
        System.out.print("Informe o nome do Jogador 2: ");
        Jogador jogador2 = new Jogador(scanner.nextLine());

        // Inicialização dos times
        System.out.print("Escolha o número de times para compor o campeonato (4 ou 8): ");
        int numeroDeTimes = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        List<Time> times = new ArrayList<>();
        for (int i = 1; i <= numeroDeTimes; i++) {
            System.out.print("Informe o nome do time " + i + ": ");
            times.add(new Time(scanner.nextLine()));
        }

        // Criação das partidas
        List<Partida> partidas = new ArrayList<>();
        for (int i = 0; i < times.size(); i++) {
            for (int j = i + 1; j < times.size(); j++) {
                partidas.add(new Partida(times.get(i), times.get(j)));
            }
        }

        // Realização dos palpites
        for (Partida partida : partidas) {
            System.out.println("Palpites para o jogador " + jogador1.nome + ":");
            System.out.println("1- " + partida.time1.nome + " X 2 - " + partida.time2.nome);
            System.out.print("Informe o palpite do time vencedor (1 ou 2): ");
            int palpite = scanner.nextInt();
            System.out.print("Informe o número de fichas: ");
            int fichas = scanner.nextInt();
            if (palpite == 1) {
                jogador1.pontuacao += fichas * (partida.golsTime1 - partida.golsTime2);
            } else {
                jogador1.pontuacao += fichas * (partida.golsTime2 - partida.golsTime1);
            }
            jogador1.fichas -= fichas;

            System.out.println("Palpites para o jogador " + jogador2.nome + ":");
            System.out.println("1- " + partida.time1.nome + " X 2 - " + partida.time2.nome);
            System.out.print("Informe o palpite do time vencedor (1 ou 2): ");
            palpite = scanner.nextInt();
            System.out.print("Informe o número de fichas: ");
            fichas = scanner.nextInt();
            if (palpite == 1) {
                jogador2.pontuacao += fichas * (partida.golsTime1 - partida.golsTime2);
            } else {
                jogador2.pontuacao += fichas * (partida.golsTime2 - partida.golsTime1);
            }
            jogador2.fichas -= fichas;
        }

        // Exibição dos resultados
        System.out.println("Número de partidas: " + partidas.size());
        System.out.println("Nome dos jogadores: " + jogador1.nome + " e " + jogador2.nome);
        System.out.println("Times que participaram na liga: ");
        for (Time time : times) {
            System.out.println(time.nome);
        }

        System.out.println("Pontuação final dos times:");
        for (Time time : times) {
            System.out.println(time.nome + ": " + time.pontos + " pontos, Saldo de gols: " + time.saldoDeGols);
        }

        System.out.println("Pontuação final dos jogadores:");
        System.out.println(jogador1.nome + ": " + jogador1.pontuacao + " pontos");
        System.out.println(jogador2.nome + ": " + jogador2.pontuacao + " pontos");

        // Classificação para Libertadores, Sul-americana e rebaixamento
        times.sort((t1, t2) -> t2.pontos - t1.pontos);
        System.out.println("Times classificados para a Libertadores: " + times.get(0).nome + ", " + times.get(1).nome);
        System.out.println("Times classificados para a Sul-americana: " + times.get(2).nome + ", " + times.get(3).nome);
        if (times.size() > 4) {
            System.out.println("Times rebaixados: " + times.get(4).nome + ", " + times.get(5).nome);
        }

        scanner.close();
    }
}
