import java.util.Scanner;

public class Vestido extends Roupas {
    public Vestido(String nome, double preco, String id, String cor, String tamanho, String tipo , String material , String estilo) {
        super(nome, preco, id, cor, tamanho, tipo, material, estilo);
    }

    public static Vestido lerVestido(Scanner scan){
        System.out.println("Digite o nome do Vestido: ");
        String nome = scan.nextLine();
        System.out.println("Digite o preco do Vestido: ");
        Double preco = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o ID do Vestido: ");
        String id = scan.nextLine();
        System.out.println("Digite a cor do Vestido: ");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho do Vestido: ");
        String tamanho = scan.nextLine();
        System.out.println("Digite o estilo do Vestido: ");
        String estilo = scan.nextLine();
        
        return new Vestido(nome, preco, id, cor, tamanho, tipo, material, estilo );
    }
}