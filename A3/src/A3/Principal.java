
public class Principal {

    public static void main(String[] args) {
       
        Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();

        JanelaPrincipal janelaPrincipal = new JanelaPrincipal(gerenciador);

        janelaPrincipal.setVisible(true);

    }

}