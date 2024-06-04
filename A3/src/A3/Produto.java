

public class Produto {

    private String nome;
    private double preco;
    private String id;
    private String cor;
    private String tamanho;
    private String tipo;
    private String material;
    private String estilo;

    public Produto(String nome, double preco, String id, String cor, String tamanho, String tipo , String material, String estilo) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
   
    public void ImprimirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("ID: " + id);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getEstilo(){
        return estilo;
    }

    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

  
}