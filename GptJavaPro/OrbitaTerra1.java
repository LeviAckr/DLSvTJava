public class OrbitaTerra1 {
    public static void main(String[] args) {
        // Definir constantes
        final double raioOrbita = 149_600_000; // km
        final double periodoOrbita = 365.25; // dias
        final double velocidadeAngular = 2 * Math.PI / (periodoOrbita * 24 * 60 * 60); // rad/s
        final double distanciaSol = 0; // km (distância inicial do Sol)

        // Definir tempo de simulação
        double tempoSimulacao = 0; // dias
        double tempoFinal = 365; // dias

        // Calcular posição da Terra em relação ao Sol
        while (tempoSimulacao <= tempoFinal) {
            // Calcular ângulo atual
            double anguloAtual = velocidadeAngular * tempoSimulacao;

            // Calcular posição atual
            double posX = raioOrbita * Math.cos(anguloAtual) + distanciaSol;
            double posY = raioOrbita * Math.sin(anguloAtual);

            // Imprimir posição atual
            System.out.printf("Posição da Terra em %d dias: (%.2f, %.2f) km%n", (int) tempoSimulacao, posX, posY);

            // Atualizar tempo de simulação
            tempoSimulacao++;
        }
    }
}
