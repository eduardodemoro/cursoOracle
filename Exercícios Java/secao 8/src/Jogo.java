public class Jogo {
    private static int proximoNumeroJogo = 1;
    private int numeroJogo;
    private String temperatura;
    private String equipeVisitante;
    private int golsEquipeVisitante;
    private String equipeCasa;
    private int golsEquipeCasa;

    public Jogo(String temperatura, String equipeVisitante, int golsEquipeVisitante, String equipeCasa, int golsEquipeCasa) {
        this.numeroJogo = proximoNumeroJogo;
        proximoNumeroJogo++;
        this.temperatura = temperatura;
        this.equipeVisitante = equipeVisitante;
        this.golsEquipeVisitante = golsEquipeVisitante;
        this.equipeCasa = equipeCasa;
        this.golsEquipeCasa = golsEquipeCasa;
    }

    public int getNumeroJogo() {
        return numeroJogo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public String getEquipeVisitante() {
        return equipeVisitante;
    }

    public int getGolsEquipeVisitante() {
        return golsEquipeVisitante;
    }

    public String getEquipeCasa() {
        return equipeCasa;
    }

    public int getGolsEquipeCasa() {
        return golsEquipeCasa;
    }

    public String toString() {
        return "Jogo #" + numeroJogo + "\n" +
                "Temperatura: " + temperatura + "\n" +
                "Equipe Visitante: " + equipeVisitante + ", Gols: " + golsEquipeVisitante + "\n" +
                "Equipe Casa: " + equipeCasa + ", Gols: " + golsEquipeCasa;
    }
}