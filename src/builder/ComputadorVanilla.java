package builder;

public class ComputadorVanilla {

    public Computador criar() {
        Computador vanillao = new Computador.Builder()
                .processador("Intel Core i3")
                .memoriaRam(8)
                .armazenamento("HD 256 GB")
                .placaVideo("Gráfico integrado")
                .fonte("400W")
                .build();

        return vanillao;
    }
}
