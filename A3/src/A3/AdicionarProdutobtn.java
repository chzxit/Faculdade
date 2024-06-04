import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdicionarProdutobtn extends JFrame{
    private Gerenciadordeproduto gerenciador;

    public AdicionarProdutobtn(Gerenciadordeproduto gerenciador){
        this.gerenciador = gerenciador;
        initUI();

    }
    
    private void initUI() {
        this.setTitle("Adicionar Produto ");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8,2));

        JLabel nomeLabel = new JLabel("Nome: ");
        JTextField nomeField = new JTextField();
        JLabel preçoLabel = new JLabel("Preço: ");
        JTextField preçoField = new JTextField();
        JLabel idLabel = new JLabel("ID: ");
        JTextField idField = new JTextField();
        JLabel corLabel = new JLabel("Cor: ");
        JTextField corField = new JTextField();
        JLabel tamanhoLabel = new JLabel("Tamanho: ");
        JTextField tamanhoField = new JTextField();
        JLabel tipoLabel = new JLabel("Tipo: ");
        JTextField tipoField = new JTextField();
        JLabel materialLabel = new JLabel("Material: ");
        JTextField materialField = new JTextField();
        JLabel estiloLabel = new JLabel("Estilo: ");
        JTextField estiloField = new JTextField();

        JButton addButton = new JButton("Adicionar");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(preçoLabel);
        panel.add(preçoField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(corLabel);
        panel.add(corField);
        panel.add(tamanhoLabel);
        panel.add(tamanhoField);
        panel.add(tipoLabel);
        panel.add(tipoField);
        panel.add(materialLabel);
        panel.add(materialField);
        panel.add(estiloLabel);
        panel.add(estiloField);
        panel.add(addButton);
        
        add(panel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nome = nomeField.getText();
                double preço = Double.parseDouble(preçoField.getText());
                String id = idField.getText();
                String cor = corField.getText();
                String tamanho = tamanhoField.getText();
                String material = materialField.getText();
                String estilo = estiloField.getText();

                Calca calca = new Calca(nome, preço, id, cor, tamanho, tamanho, material, estilo);
                Camisa camisa = new Camisa(nome, preço, id, cor, tamanho, tamanho, material, estilo);
                Vestido vestido = new Vestido(nome, preço, id, cor, tamanho, tamanho, material, estilo);
                gerenciador.adicionarProduto(calca);
                gerenciador.adicionarProduto(camisa);
                gerenciador.adicionarProduto(vestido);

                JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso! ");
                dispose();
            }
        });

    }
    
}
