public class Vestido extends Roupas implements CalcImposto {
    private static final double TAXA_IMPOSTO_VESTIDO = 0.05;
    public Vestido(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo);
    }

    @Override
    public double CalcularImpostos() {
       return getPreco() * TAXA_IMPOSTO_VESTIDO;
    
        
    }

   
}
