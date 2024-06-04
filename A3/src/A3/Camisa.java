
import java.util.Scanner;

public class Camisa extends Roupas {
    public Camisa(String nome, double preco, String id, String cor, String tamanho, String tipo, String material, String estilo) {
        super(nome, preco, id, cor, tamanho, tipo, material, estilo);
    }

    public static Camisa lerCamisa(Scanner scan){
        System.out.println("Digite o nome da camisa: ");
        String nome = scan.nextLine();
        System.out.println("Digite o preco da camisa: ");
        Double preco = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite o ID da camisa: ");
        String id = scan.nextLine();
        System.out.println("Digite a cor da camisa: ");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho da camisa: ");
        String tamanho = scan.nextLine();
        System.out.println("Digite o material da camisa: ");
        String material = scan.nextLine();
        
        return new Camisa(nome, preco, id, cor, tamanho, tipo, material, estilo);
    }
}