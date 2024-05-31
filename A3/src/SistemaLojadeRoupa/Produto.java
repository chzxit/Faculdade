public class Produto {

    private String nome;
    private double preco;
    private String id;
    private String cor;
    private String tamanho;

    public Produto(String nome, double preco, String id, String cor, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
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

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }   

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", id=" + id + ", cor=" + cor + ", tamanho=" + tamanho +  "]";
    }
}


















