import java.util.Scanner;

public class ValidarPIN {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor crie um PIN:");
        Scanner input = new Scanner(System.in);
        int PIN = input.nextInt();

        System.out.println("Insira seu PIN para acessar o sistema:");
        int PINinserido = input.nextInt();

        while (PINinserido != PIN){
            System.out.println("ERRO, por favor tente novamente:");
            PINinserido = input.nextInt();
        }
        input.close();
        System.out.println("Você inseriu um PIN válido, seu acesso foi liberado!");
    }
}