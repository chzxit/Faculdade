import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BuscarProdutobtn extends JFrame{
    private Gerenciadordeproduto gerenciador;

    public BuscarProdutobtn(Gerenciadordeproduto gerenciador){
        this.gerenciador = gerenciador;
        initUI();

    }

    public void initUI(){
        this.setTitle("Buscar Produto ");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel idLabel = new JLabel("ID do Produto: ");
        JTextField idField = new JTextField();
        JButton BuscarButton = new JButton("Buscar ");
        panel.add(idLabel);
        panel.add(idField);
        panel.add(BuscarButton);

        add(panel);

        BuscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String id = idField.getText();
                Produto produto = gerenciador.buscarProduto(id);
                if (produto != null) {
                    JOptionPane.showMessageDialog(null, produto.toString());
                } else{
                    JOptionPane.showMessageDialog(null, "Produto não encontrado");
                 }
            }
        });
    }
}
