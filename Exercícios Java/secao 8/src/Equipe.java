public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void incrementarVitorias() {
        vitorias++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void incrementarDerrotas() {
        derrotas++;
    }

    public int getEmpates() {
        return empates;
    }

    public void incrementarEmpates() {
        empates++;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void adicionarGolsMarcados(int gols) {
        golsMarcados += gols;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void adicionarGolsSofridos(int gols) {
        golsSofridos += gols;
    }

    public String toString() {
        return "Equipe: " + nome + "\n" +
                "Vitórias: " + vitorias + ", Derrotas: " + derrotas + ", Empates: " + empates + "\n" +
                "Gols Marcados: " + golsMarcados + ", Gols Sofridos: " + golsSofridos;
    }
}
