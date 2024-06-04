import javax.swing.JFrame;
public class Principal {

    public static void main(String[] args) {
       
        Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();

        JanelaPrincipal janelaPrincipal = new JanelaPrincipal(gerenciador);

        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}