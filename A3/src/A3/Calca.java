public class Calca extends Roupas{

    public Calca(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo);
    }

    @Override
    public double CalcImpost() {
        
        return getPreco() * 0.12; 
    }


}