public abstract class Roupas extends Produto {
    protected String tipo;
    protected String material;
    protected String estilo;
    protected String nome;
    protected double preco;
    protected String id;
    protected String cor;
    protected String tamanho;
    protected double total;

    public Roupas(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo, double total) {
        super(nome , preco , id, cor , tamanho , tipo , material , estilo, total);
        this.tipo = tipo;
        this.material = material;
        this.estilo = estilo;
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.total = total;
    }

    
 }