package semana4.exercicio2;

public enum Semaforo {
    VERDE (15000),
    AMARELO (5000),
    VERMELHO (20000);

    private final int timer;

    Semaforo(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }
}
