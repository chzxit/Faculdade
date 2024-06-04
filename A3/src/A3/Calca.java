
import java.util.Scanner;

public class Calca extends Roupas {
    public Calca(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome, preco, id, cor, tamanho, tipo, material, estilo);
    }

    public static Calca lerCalca(Scanner scan){
        System.out.println("Digite o nome da Calça: ");
        String nome = scan.nextLine();
        System.out.println("Digite o preco da Calça: ");
        Double preco = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o ID da Calça: ");
        String id = scan.nextLine();
        System.out.println("Digite a cor da Calça: ");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho da Calça: ");
        String tamanho = scan.nextLine();
        System.out.println("Digite o tipo da Calça: ");
        String tipo = scan.nextLine();
        
        return new Calca(nome, preco, id, cor, tamanho, tipo, material, estilo);
    }
}