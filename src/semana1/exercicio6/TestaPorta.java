package semana1.exercicio6;

public class TestaPorta {
    public static void main(String[] args) {

        Porta porta = new Porta();
        // verifica as propriedades de uma nova porta padrão
        System.out.println("Cor padrão: " + porta.cor);
        System.out.println("Altura padrão: " + porta.altura);
        System.out.println("Lagura padrão: " + porta.largura);
        System.out.println("Profundidade padrão: " + porta.profundidade);

        // Verifica se a porta está aberta
        System.out.println("\nQual a situação da porta?");
        porta.estaAberta();

        // Abre, fecha, verifica se está aberta ou fechada;
        System.out.println("\nBrincando de abrir e fechar a porta:");
        porta.abre();
        porta.estaAberta();
        porta.fecha();
        porta.estaAberta();

        // altera cor
        System.out.println("\nBrincando com as cores da porta:");
        porta.pinta("azul");
        System.out.println("Cor da porta: " + porta.cor);
        porta.pinta("verde");
        System.out.println("Cor da porta: " + porta.cor);

        // altera outras propriedades
        System.out.println("\nBrincando com as propriedades da porta:");
        porta.largura = 0.72;
        System.out.println("Lagura: " + porta.largura);
        porta.altura = 3.25;
        System.out.println("Altura: " + porta.altura);
        porta.profundidade = 0.50;
        System.out.println("Profundidade: " + porta.profundidade);


    }
}
