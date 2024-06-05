import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {

    final private Gerenciadordeproduto gerenciador;

    public JanelaPrincipal(Gerenciadordeproduto gerenciador){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.gerenciador = gerenciador;
        initUI();
        this.setVisible(true);
    }

    private void initUI(){

        this.setTitle("Gerenciador de Roupas");
        this.setSize(700,450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8,1));

        JButton addButton = new JButton("Adicionar Produto ");
        JButton listarButton = new JButton("Listar Produto ");
        JButton buscarButton = new JButton("Buscar Produto ");
        JButton removerButton = new JButton("Remover Produto ");
        JButton alterarButton = new JButton("Alterar Produto");
        JButton sairButton = new JButton("Sair ");

        panel.add(addButton);
        panel.add(listarButton);
        panel.add(buscarButton);
        panel.add(removerButton);
        panel.add(alterarButton);
        panel.add(sairButton);
       
        add(panel);

        addButton.addActionListener(new ActionListener(){ 

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(gerenciador);
                new AdicionarProdutobtn(gerenciador).setVisible(true);
            }

        });


        listarButton.addActionListener( new ActionListener() {

            @Override
          public void actionPerformed(ActionEvent e){
                new ListarProdutobtn(gerenciador).setVisible(true);
          }  

        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new BuscarProdutobtn(gerenciador).setVisible(true);
            }
        });

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new AlterarProdutobtn(gerenciador).setVisible(true);
            }
        });

        removerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new RemoverProdutobtn(gerenciador).setVisible(true);
            }
        });

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new AlterarProdutobtn(gerenciador).setVisible(true);
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    
         }
        
         

















    }

    
