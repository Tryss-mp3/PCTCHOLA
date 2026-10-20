package builder;

public class Main {

    public static void main(String[] args) {

        ComputadorGamer pcGamer = new ComputadorGamer();
        ComputadorVanilla pcVanilla = new ComputadorVanilla();

        Computador gamer = pcGamer.criar();
        Computador vanilla = pcVanilla.criar();

        System.out.println("=== PCZÃO GAMER ===");
        gamer.exibirInformacoes();

        System.out.println();

        System.out.println("=== PCZIN NORMAL ===");
        vanilla.exibirInformacoes();
    }
}
