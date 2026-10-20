package builder;

public class ComputadorGamer {

    public Computador criar() {
        Computador gamer = new Computador.Builder()
                .processador("Intel Xeon E5-2666 v3")
                .memoriaRam(16)
                .armazenamento("SSD 1 TB")
                .placaVideo("NVIDIA RTX 3060")
                .fonte("750W")
                .build();

        return gamer;
    }
}
