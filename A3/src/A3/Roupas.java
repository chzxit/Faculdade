import java.util.Scanner;

public abstract class Roupas extends Produto {
    protected static String tipo;
    protected static String material;
    protected static String estilo;

    public Roupas(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome, preco, id, cor, tamanho, tipo, material , estilo);
        this.tipo = tipo;
        this.material = material;
        this.estilo = estilo;
    }

    public static Roupas lerRoupas(Class<? extends Roupas> clazz, Scanner scan) {
        System.out.println("Digite o nome da roupa: ");
        String nome = scan.nextLine();
        System.out.println("Digite o preco da roupa: ");
        Double preco = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o ID da roupa: ");
        String id = scan.nextLine();
        System.out.println("Digite a cor da roupa: ");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho da roupa: ");
        String tamanho = scan.nextLine();
        System.out.println("Digite o tipo da roupa: ");
        String tipo = scan.nextLine();
        System.out.println("Digite material da roupa: ");
        String material = scan.nextLine();
        System.out.println("Digite estilo da roupa: ");
        String estilo = scan.nextLine();


        try {
            if (clazz == Calca.class) {
                return new Calca(nome, preco, id, cor, tamanho, tipo, material, estilo);
            } else if (clazz == Camisa.class) {
                return new Camisa(nome, preco, id, cor, tamanho, tipo, material , estilo);
            } else if (clazz == Vestido.class) {
                return new Vestido(nome, preco, id, cor, tamanho, tipo , material, estilo);
            } else {
                throw new IllegalArgumentException("Tipo de roupa desconhecido: " + clazz.getSimpleName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void ImprimirDetalhes(){
        super.ImprimirDetalhes();
        System.out.println("Tipo: " + tipo );
        System.out.println("Material: "  + material );
        System.out.println("Estilo: " + estilo);
    }
}