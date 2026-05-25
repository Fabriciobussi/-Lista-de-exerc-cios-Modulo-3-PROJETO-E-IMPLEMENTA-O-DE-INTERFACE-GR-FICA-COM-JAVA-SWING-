import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class atividade1 {

    public static void main(String[] args) {
        //Professor, coloquei um Frame principal com abas (JTabbedPane) para fazilitar a visualização de todos os exercícios em um único programa.
        
        JFrame framePrincipal = new JFrame("Atividade Módulo 3 - Consolidada");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(800, 600);
        
        JTabbedPane abas = new JTabbedPane();

        //A
        JPanel painelA = new JPanel();
        painelA.add(new JLabel("Interface gráfica com Java Swing"));
        abas.addTab("Exercicio A", painelA);

        //B
        JPanel painelB = new JPanel();
        painelB.add(new JLabel("Nome:"));
        painelB.add(new JTextField(20));
        abas.addTab("Exercicio B", painelB);

        //C
        JPanel painelC = new JPanel(new BorderLayout());
        painelC.add(new JLabel("Faça um resumo de suas atividades profissionais:"), BorderLayout.NORTH);
        JTextArea areaTexto = new JTextArea(10, 40);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        painelC.add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        abas.addTab("Exercicio C", painelC);

        //D
        JPanel painelD = new JPanel();
        painelD.add(new JLabel("Cores preferidas:"));
        painelD.add(new JCheckBox("Azul"));
        painelD.add(new JCheckBox("Preto"));
        painelD.add(new JCheckBox("Amarelo"));
        painelD.add(new JCheckBox("Verde"));
        abas.addTab("Exercicio D", painelD);

        //E
        JPanel painelE = new JPanel();
        painelE.add(new JLabel("Sexo:"));
        JRadioButton masc = new JRadioButton("Masculino");
        JRadioButton fem = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(masc);
        grupoSexo.add(fem);
        painelE.add(masc);
        painelE.add(fem);
        abas.addTab("Exercicio E", painelE);

        //F
        JPanel painelF = new JPanel();
        painelF.add(new JButton("Cancelar"));
        painelF.add(new JButton("Salvar"));
        painelF.add(new JButton("Enviar"));
        abas.addTab("Exercicio F", painelF);

        //G
        JPanel painelG = new JPanel();
        painelG.add(new JLabel("Nome:"));
        painelG.add(new JTextField(10));
        painelG.add(new JLabel("Sexo:"));
        JRadioButton mG = new JRadioButton("Masculino");
        JRadioButton fG = new JRadioButton("Feminino");
        ButtonGroup gG = new ButtonGroup();
        gG.add(mG); gG.add(fG);
        painelG.add(mG); painelG.add(fG);
        painelG.add(new JButton("Enviar"));
        abas.addTab("Exercicio G", painelG);

        //H
        JPanel painelH = new JPanel(new BorderLayout());
        String[] colunas = {"Código", "Produto", "Descrição"};
        Object[][] dados = {
            {"1123", "Pendrive", "Pendrive 32GB"},
            {"2323", "HD SSD", "256 GB"},
            {"3333", "Memória RAM", "16GB"},
            {"2344", "CPU", "i7"}
        };
        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        painelH.add(new JScrollPane(tabela), BorderLayout.CENTER);
        abas.addTab("Exercicio H", painelH);

        //I
        JPanel painelI = new JPanel();
        String[] itens = {"one", "two", "three", "four", "five"};
        painelI.add(new JComboBox<>(itens));
        abas.addTab("Exercicio I", painelI);

        //J
        JPanel painelJ = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; gbc.gridy = 0;
        painelJ.add(new JLabel("Running a Long Task"), gbc);
        
        gbc.gridy = 1;
        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(43);
        barra.setStringPainted(true);
        painelJ.add(barra, gbc);
        
        gbc.gridy = 2;
        painelJ.add(new JLabel("Completed 43%"), gbc);
        
        gbc.gridy = 3;
        painelJ.add(new JButton("Cancel"), gbc);
        abas.addTab("Exercicio J", painelJ);

        //L
        JPanel painelL = new JPanel(new BorderLayout());
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("The Java Series");
        DefaultMutableTreeNode cat1 = new DefaultMutableTreeNode("Books for Java I");
        cat1.add(new DefaultMutableTreeNode("The Java Virtual Machine"));
        cat1.add(new DefaultMutableTreeNode("The Java Language Spec"));
        raiz.add(cat1);
        raiz.add(new DefaultMutableTreeNode("Books for Java II"));
        
        JTree arvore = new JTree(raiz);
        painelL.add(new JScrollPane(arvore), BorderLayout.CENTER);
        abas.addTab("Exercicio L", painelL);

        //Abre as abas do frame e mostra todos
        framePrincipal.add(abas);
        framePrincipal.setVisible(true);
    }
}
