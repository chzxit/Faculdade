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

public class AlterarProdutobtn extends JFrame {
    final private Gerenciadordeproduto gerenciador;
    public AlterarProdutobtn(Gerenciadordeproduto gerenciador) {
        this.gerenciador = gerenciador;
        initUI();
    }

    private void initUI() {
        setTitle("Alterar Produto");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel idLabel = new JLabel("ID do Produto:");
        JTextField idField = new JTextField();
        JLabel nomeLabel = new JLabel("Novo Nome:");
        JTextField nomeField = new JTextField();
        JLabel precoLabel = new JLabel("Novo Preço:");
        JTextField precoField = new JTextField();
        JLabel corLabel = new JLabel("Nova Cor:");
        JTextField corField = new JTextField();
        JLabel tamanhoLabel = new JLabel("Novo Tamanho:");
        JTextField tamanhoField = new JTextField();
        JLabel tipoLabel = new JLabel("Novo Tipo:");
        JComboBox<String> tipoComboBox = new JComboBox<>(new String[]{"Calça", "Camisa", "Vestido"});
        JButton alterarButton = new JButton("Alterar");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(precoLabel);
        panel.add(precoField);
        panel.add(corLabel);
        panel.add(corField);
        panel.add(tamanhoLabel);
        panel.add(tamanhoField);
        panel.add(tipoLabel);
        panel.add(tipoComboBox);
        panel.add(alterarButton);

        add(panel);

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String nome = nomeField.getText();
                String precoStr = precoField.getText().replace(",", ".");
                double preco = Double.parseDouble(precoStr);
                String cor = corField.getText();
                String tamanho = tamanhoField.getText();
                String tipo = (String) tipoComboBox.getSelectedItem();
               
                boolean alterar = gerenciador.alterarProduto(id, nome, preco, cor, tamanho, tipo);
                if (alterar) {
                   
                    JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                }
            }
        });
    }
}