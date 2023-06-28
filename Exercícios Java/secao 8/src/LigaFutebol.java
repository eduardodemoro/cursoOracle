import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LigaFutebol {
    private static final int MAX_GOLS = 10;
    private static final int TEMPERATURA_MINIMA_JOGO = 18;
    private static final int SEMANAS_CONSECUTIVAS_INVERNO = 3;

    private List<Equipe> equipes;
    private List<Jogo> jogos;
    private int semanasInverno;

    public LigaFutebol() {
        equipes = new ArrayList<>();
        jogos = new ArrayList<>();
        semanasInverno = 0;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void jogarTemporada() {
        Random random = new Random();
        int temperatura;
        int semana = 1;

        while (semanasInverno < SEMANAS_CONSECUTIVAS_INVERNO) {
            temperatura = obterTemperatura();

            System.out.println("Temperatura da semana " + semana + ": " + temperatura);

            if (temperatura >= TEMPERATURA_MINIMA_JOGO) {
                jogarRodada(temperatura);

            } else {
                System.out.println("Muito frio para jogar.");

                semanasInverno++;
            }

            semana++;
        }

        System.out.println("Temporada encerrada.");

        imprimirEstatisticasEquipes();
        imprimirEstatisticasJogos();
    }

    private int obterTemperatura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura da semana: ");

        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.print("Temperatura inválida. Informe novamente: ");
        }

        return scanner.nextInt();
    }

    private void jogarRodada(int temperatura) {
        Random random = new Random();

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < equipes.size(); i++) {
            indices.add(i);
        }

        while (indices.size() > 1) {
            int indiceCasa = random.nextInt(indices.size());
            int equipeCasaIndex = indices.get(indiceCasa);
            indices.remove(indiceCasa);

            int indiceVisitante = random.nextInt(indices.size());
            int equipeVisitanteIndex = indices.get(indiceVisitante);
            indices.remove(indiceVisitante);

            int golsEquipeCasa = random.nextInt(MAX_GOLS + 1);
            int golsEquipeVisitante = random.nextInt(MAX_GOLS + 1);

            Equipe equipeCasa = equipes.get(equipeCasaIndex);
            Equipe equipeVisitante = equipes.get(equipeVisitanteIndex);

            equipeCasa.adicionarGolsMarcados(golsEquipeCasa);
            equipeCasa.adicionarGolsSofridos(golsEquipeVisitante);

            equipeVisitante.adicionarGolsMarcados(golsEquipeVisitante);
            equipeVisitante.adicionarGolsSofridos(golsEquipeCasa);

            jogos.add(new Jogo(Integer.toString(temperatura), equipeVisitante.getNome(), golsEquipeVisitante,equipeCasa.getNome(), golsEquipeCasa));
        }
    }

    private void imprimirEstatisticasEquipes() {
        System.out.println("\n***** ESTATÍSTICAS DAS EQUIPES *****");

        for (Equipe equipe : equipes) {
            System.out.println(equipe);
        }
    }

    private void imprimirEstatisticasJogos() {
        System.out.println("\n***** RESULTADOS DOS JOGOS *****");

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
    }

    public static void main(String[] args) {
        LigaFutebol liga = new LigaFutebol();

        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");
        Equipe equipe3 = new Equipe("Equipe 3");
        Equipe equipe4 = new Equipe("Equipe 4");

        liga.adicionarEquipe(equipe1);
        liga.adicionarEquipe(equipe2);
        liga.adicionarEquipe(equipe3);
        liga.adicionarEquipe(equipe4);

        liga.jogarTemporada();
    }
}