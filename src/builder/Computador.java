package builder;

import java.security.InvalidParameterException;

    public class Computador {

        private String processador;
        private int memoriaRam;
        private String armazenamento;
        private String placaVideo;
        private String fonte;

        public Computador(Builder builder) {
            this.processador = builder.processador;
            this.memoriaRam = builder.memoriaRam;
            this.armazenamento = builder.armazenamento;
            this.placaVideo = builder.placaVideo;
            this.fonte = builder.fonte;
        }

        public static class Builder {

            private String processador;
            private int memoriaRam;
            private String armazenamento;
            private String placaVideo;
            private String fonte;

            public Builder processador(String processador) {
                this.processador = processador;
                return this;
            }

            public Builder memoriaRam(int memoriaRam) {
                if (memoriaRam <= 0) {
                    throw new InvalidParameterException(
                            "A memória RAM deve ser maior que 0!"
                    );
                }

                this.memoriaRam = memoriaRam;
                return this;
            }

            public Builder armazenamento(String armazenamento) {
                this.armazenamento = armazenamento;
                return this;
            }

            public Builder placaVideo(String placaVideo) {
                this.placaVideo = placaVideo;
                return this;
            }

            public Builder fonte(String fonte) {
                this.fonte = fonte;
                return this;
            }

            public Computador build() {
                if (processador == null || processador.isEmpty()) {
                    throw new InvalidParameterException(
                            "O processador é obrigatório!!!"
                    );
                }

                if (memoriaRam <= 0) {
                    throw new InvalidParameterException(
                            "A memória RAM é obrigatória!!!!!"
                    );
                }

                return new Computador(this);
            }
        }

        public void exibirInformacoes() {
            System.out.println("Processador: " + processador);
            System.out.println("Memória RAM: " + memoriaRam + " GB");
            System.out.println("Armazenamento: " + armazenamento);
            System.out.println("Placa de vídeo: " + placaVideo);
            System.out.println("Fonte: " + fonte);
        }
    }