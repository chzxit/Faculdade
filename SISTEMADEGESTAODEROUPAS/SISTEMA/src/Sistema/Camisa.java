public class Camisa extends Roupas  {
    
    public Camisa(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo);
    }

    @Override
    public double calcImpost() {
        
        return preco *0.11;
      
    }


}