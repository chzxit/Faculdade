import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class AdicionarProdutobtn extends JFrame {
    final private Gerenciadordeproduto gerenciador;

    public AdicionarProdutobtn(Gerenciadordeproduto gerenciador) {
        this.gerenciador = gerenciador;
        initUI();
    }

    private void initUI() {
        this.setTitle("Adicionar Produto ");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        JLabel nomeLabel = new JLabel("Nome: ");
        JTextField nomeField = new JTextField();
        JLabel precoLabel = new JLabel("Preço: ");
        JTextField precoField = new JTextField();
        JLabel idLabel = new JLabel("ID: ");
        JTextField idField = new JTextField();
        JLabel corLabel = new JLabel("Cor: ");
        JTextField corField = new JTextField();
        JLabel tamanhoLabel = new JLabel("Tamanho: ");
        JTextField tamanhoField = new JTextField();
        JLabel tipoLabel = new JLabel("Tipo: ");
        JComboBox<String> tipoComboBox = new JComboBox<>(new String[]{"Calça", "Camisa", "Vestido"});
        JLabel materialLabel = new JLabel("Material: ");
        JTextField materialField = new JTextField();
        JLabel estiloLabel = new JLabel("Estilo: ");
        JTextField estiloField = new JTextField();

        JButton addButton = new JButton("Adicionar");

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(corLabel);
        panel.add(corField);
        panel.add(tamanhoLabel);
        panel.add(tamanhoField);
        panel.add(tipoLabel);
        panel.add(tipoComboBox);
        panel.add(materialLabel);
        panel.add(materialField);
        panel.add(estiloLabel);
        panel.add(estiloField);
        panel.add(addButton);

        add(panel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("Produto adicionado!");
                    String nome = nomeField.getText();
                    String precoStr = precoField.getText().replace(",", ".");
                    double preco = Double.parseDouble(precoStr);
                    String id = idField.getText();
                    String cor = corField.getText();
                    String tamanho = tamanhoField.getText();
                    String material = materialField.getText();
                    String estilo = estiloField.getText();
                    String tipo = (String) tipoComboBox.getSelectedItem();
        
                    Roupas roupa = null;
                    switch (tipo) {
                        case "Calça":
                            roupa = new Calca(nome, preco, id, cor, tamanho, tipo, material, estilo);
                            break;
                        case "Camisa":
                            roupa = new Camisa(nome, preco, id, cor, tamanho, tipo, material, estilo);
                            break;
                        case "Vestido":
                            roupa = new Vestido(nome, preco, id, cor, tamanho, tipo, material, estilo);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Tipo de produto não reconhecido: ");
                            return;
                    }
        
                    
                  
                    if (roupa!= null) {
                        gerenciador.adicionarProduto(roupa);
                        JOptionPane.showMessageDialog(null, "Produto adicionado!" );
                    }
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Preço inválido. Por favor, insira um valor numérico.");
                }
            }
        });
    }
}