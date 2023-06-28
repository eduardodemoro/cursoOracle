import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo do JavaLibs - História de Terror! Vamos criar uma história assustadora juntos.");

        System.out.print("Digite um nome de pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um adjetivo : ");
        String adjetivo = scanner.nextLine();

        System.out.print("Digite um verbo no infinitivo: ");
        String verbo = scanner.nextLine();

        System.out.print("Digite um objeto : ");
        String objeto = scanner.nextLine();

        System.out.print("Digite um número inteiro : ");
        int numeroInteiro = scanner.nextInt();


        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.print("Digite um local assustador: ");
        String local = scanner.nextLine();

        System.out.print("Digite uma criatura assustadora: ");
        String criatura = scanner.nextLine();

        System.out.print("Digite um verbo de ação assustador: ");
        String verboAcao = scanner.nextLine();

        System.out.print("Digite uma parte do corpo assustadora: ");
        String parteCorpo = scanner.nextLine();

        System.out.println("\nAqui está a história de terror que criamos juntos:");

        System.out.println("Era uma vez, em uma noite sombria, " + nome + " estava caminhando por uma rua deserta e " + adjetivo + ".");
        System.out.println("De repente, " + nome + " ouviu um barulho " + adjetivo + " vindo de um beco escuro.");
        System.out.println("Curioso e " + adjetivo + ", " + nome + " decidiu " + verbo + " em direção ao beco para investigar.");
        System.out.println("Lá, " + nome + " encontrou um(a) " + objeto + " " + adjetivo + " e ficou arrepiado(a) na hora.");
        System.out.println("Mas isso foi apenas o começo...");
        System.out.println("Sem que " + nome + " percebesse, " + numeroInteiro + " " + criatura + "s surgiram do(a) " + local + ".");
        System.out.println("Elas começaram a " + verboAcao + " " + nome + " com suas afiadas " + parteCorpo + "s.");
        System.out.println("Apavorado(a), " + nome + " correu o mais rápido que pôde e finalmente escapou.");
        System.out.println("No final, " + nome + " percebeu que nunca deveria ter mexido com o(a) " + objeto + " " + adjetivo + ".");
        System.out.println("A partir desse dia, " + nome + " nunca mais se aventurou em locais " + adjetivo + "s.");

        scanner.close();
    }
}


