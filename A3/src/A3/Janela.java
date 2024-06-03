package A3;

import javax.swing.*;


public class Janela extends JFrame {
    private JButton adicionarCalca;
    private JButton adicionarCamisa;
    private JButton adicionarVestido;
    private JButton listarProdutos;
    private JButton removerProduto;
    private JButton buscarProduto;
    private JButton sair;

    public Janela() {
        tela();
        botoes();
        setVisible(true);
    }

    private void tela() {
        setTitle("LOJA DE ROUPA");
        setSize(800, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void botoes() {
        adicionarCalca = new JButton("Adicionar Calça");
        adicionarCalca.setBounds(50, 50, 200, 50);
        add(adicionarCalca);

        adicionarCamisa = new JButton("Adicionar Camisa");
        adicionarCamisa.setBounds(300, 50, 200, 50);
        add(adicionarCamisa);

        adicionarVestido = new JButton("Adicionar Vestido");
        adicionarVestido.setBounds(550, 50, 200, 50);
        add(adicionarVestido);

        listarProdutos = new JButton("Listar Produtos");
        listarProdutos.setBounds(50, 150, 200, 50);
        add(listarProdutos);

        removerProduto = new JButton("Remover Produto");
        removerProduto.setBounds(300, 150, 200, 50);
        add(removerProduto);

        buscarProduto = new JButton("Buscar Produto");
        buscarProduto.setBounds(550, 150, 200, 50);
        add(buscarProduto);

        sair = new JButton("Sair");
        sair.setBounds(150, 250, 500, 50);
        add(sair);
    }
}
