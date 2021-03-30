package semana4.exercicio2;

public class TestaSemaforo {

    public static void main(String[] args) {

        Semaforo verde = Semaforo.VERDE;
        Semaforo amarelo = Semaforo.AMARELO;
        Semaforo vermelho = Semaforo.VERMELHO;

        Semaforo[] semaforos = new Semaforo[3];
        semaforos[0] = verde;
        semaforos[1] = amarelo;
        semaforos[2] = vermelho;

        for (Semaforo semaforo : semaforos) {
            System.out.printf("Sinal: %s | Duração: %d.%n", semaforo, semaforo.getTimer());
        }
    }
}
