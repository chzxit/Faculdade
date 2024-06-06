public class Calca extends Roupas implements CalcImposto {
    private static final double TAXA_IMPOSTO_CALCA = 0.07;
    public Calca(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo);
    }

    @Override
    public double CalcularImpostos () {
        return getPreco() * TAXA_IMPOSTO_CALCA; 
    }


}