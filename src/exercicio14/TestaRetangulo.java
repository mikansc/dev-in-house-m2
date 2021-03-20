package exercicio14;

public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo ret = new Retangulo();

        System.out.println("Retangulo padrão:");
        System.out.println("Comprimento:" + ret.getComprimento());
        System.out.println("Largura:" + ret.getLargura());

        System.out.println("----------------------------------------------");
        // modifica o retângulo - valores válidos
        System.out.println("Retangulo com 2.00 x 3.00 ---");
        boolean definiuComprimento = ret.setComprimento(2.00);
        boolean definiulargura = ret.setLargura(3.00);
        imprimeDadosRetangulo(ret, definiuComprimento, definiulargura);

        System.out.println("----------------------------------------------");

        // modifica o retângulo - valores inválidos
        System.out.println("Retangulo com 21.00 x -3.00 ---");
        definiuComprimento = ret.setComprimento(21.00);
        definiulargura = ret.setLargura(-3.00);
        imprimeDadosRetangulo(ret, definiuComprimento, definiulargura);

    }

    private static void imprimeDadosRetangulo(Retangulo ret, boolean definiuComprimento, boolean definiulargura) {
        if(definiuComprimento && definiulargura) {
            System.out.println("Área: " + ret.getArea());
            System.out.println("Perímetro: " + ret.getPerimetro());
        } else {
            System.out.println("Os valores informados para largura e comprimento estão fora do limite de 0.00 e 20.00.");
        }
    }
}
