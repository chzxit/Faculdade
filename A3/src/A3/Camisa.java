public class Camisa extends Roupas implements CalcImposto {
    private static final double TAXA_IMPOSTO_CAMISA = 0.06;
    public Camisa(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo);
    }

    @Override
    public double CalcularImpostos () {
        return getPreco() * TAXA_IMPOSTO_CAMISA;
    }


}