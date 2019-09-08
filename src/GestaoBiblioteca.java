
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestaoBiblioteca extends javax.swing.JFrame {

    private final String path = "C:/Users/mathe/Desktop/GestaoBiliotecas/livros.txt";

    public GestaoBiblioteca() {
        initComponents();

        box2.removeAllItems();
        box4.removeAllItems();
        box6.removeAllItems();
        box1.removeAllItems();
        box3.removeAllItems();
        box5.removeAllItems();

        box2.addItem("Empty");
        box2.addItem("Ascendente");
        box2.addItem("Descendente");

        box4.addItem("Empty");
        box4.addItem("Ascendente");
        box4.addItem("Descendente");

        box6.addItem("Empty");
        box6.addItem("Ascendente");
        box6.addItem("Descendente");

        box1.addItem("Empty");
        box1.addItem("Title");
        box1.addItem("Author");
        box1.addItem("Year");

        box3.addItem("Empty");
        box3.addItem("Title");
        box3.addItem("Author");
        box3.addItem("Year");

        box5.addItem("Empty");
        box5.addItem("Title");
        box5.addItem("Author");
        box5.addItem("Year");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btmCancel = new javax.swing.JButton();
        btmOrder = new javax.swing.JButton();
        box2 = new javax.swing.JComboBox();
        box4 = new javax.swing.JComboBox();
        box6 = new javax.swing.JComboBox();
        box1 = new javax.swing.JComboBox<>();
        box3 = new javax.swing.JComboBox<>();
        box5 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btmCancel.setText("Cancel");
        btmCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelActionPerformed(evt);
            }
        });

        btmOrder.setText("Order");
        btmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmOrderActionPerformed(evt);
            }
        });

        box2.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        box4.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        box6.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        box5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btmCancel)
                                        .addComponent(btmOrder))
                                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>                        

    private ArrayList readFile() throws FileNotFoundException {
        String conteudo = "";
        ArrayList<Livro> list = new ArrayList<>();
        try {
            File pathFile = new File(path);
            FileReader readPathText = new FileReader(pathFile);
            BufferedReader readText = new BufferedReader(readPathText);
            String linha = "";

            Livro livro = new Livro();
            Livro livro2 = new Livro();
            Livro livro3 = new Livro();
            Livro livro4 = new Livro();
            try {
                linha = readText.readLine();
                while (linha != null) {
                    conteudo += linha;
                    linha = readText.readLine();
                }

                readPathText.close();

            } catch (IOException e) {
                System.out.println("Não foi possível ler o arquivo");
            }
            String[] atributos = conteudo.split(";");

            livro.setTitle(atributos[0]);
            livro.setAuthor(atributos[1]);
            livro.setYear(Integer.parseInt(atributos[2]));

            livro2.setTitle(atributos[3]);
            livro2.setAuthor(atributos[4]);
            livro2.setYear(Integer.parseInt(atributos[5]));

            livro3.setTitle(atributos[6]);
            livro3.setAuthor(atributos[7]);
            livro3.setYear(Integer.parseInt(atributos[8]));

            livro4.setTitle(atributos[9]);
            livro4.setAuthor(atributos[10]);
            livro4.setYear(Integer.parseInt(atributos[11]));
            list.add(livro);
            list.add(livro2);
            list.add(livro3);
            list.add(livro4);

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o arquivo para leitura");

        }
        return list;
    }

    private Livro orderBook(Livro livros, ArrayList<Livro> list, String atributo, String order) {
        boolean setOrdem = "Ascendente".equals(order);
        livros.orderAttribute(setOrdem, atributo);

        if ("Title".equals(atributo)) {
            livros.orderTitle(list);
        } else if ("Author".equals(atributo)) {
            livros.orderAuthor(list);
        } else if ("Year".equals(atributo)) {
            livros.orderYear(list);
        }
        return livros;
    }

    private Livro orderBook(Livro livros, ArrayList<Livro> list, String atributo1, String atributo2, String order1, String order2) {
        boolean setOrdem1 = "Ascendente".equals(order1);
        boolean setOrdem2 = "Ascendente".equals(order2);
        livros.orderAttribute(setOrdem1, atributo1);
        livros.orderAttribute(setOrdem2, atributo2);

        if (("Title".equals(atributo1) && "Author".equals(atributo2)) || ("Author".equals(atributo1) && "Title".equals(atributo2))){
            livros.doubleOrder(list);
        } else if (("Author".equals(atributo1) && "Year".equals(atributo2)) || ("Year".equals(atributo1) && "Author".equals(atributo2))){
            livros.doubleOrder(list);
        } else if (("Titulo".equals(atributo1) && "Year".equals(atributo2)) || ("Year".equals(atributo1) && "Titulo".equals(atributo2))){
            livros.doubleOrder(list);
        }
        return livros;
    }

    private Livro orderBook(Livro livros, ArrayList<Livro> list, String atributo1, String atributo2, String atributo3, String order1, String order2, String order3) {
        boolean setOrdem1 = "Ascendente".equals(order1);
        boolean setOrdem2 = "Ascendente".equals(order2);
        boolean setOrdem3 = "Ascendente".equals(order3);
        livros.orderAttribute(setOrdem1, atributo1);
        livros.orderAttribute(setOrdem2, atributo2);
        livros.orderAttribute(setOrdem3, atributo3);

        if (!"Empty".equals(atributo1) && !"Empty".equals(atributo2) && !"Empty".equals(atributo3)) {
            livros.tripleOrder(list);
        }

        return livros;
    }

    private void btmOrderActionPerformed(java.awt.event.ActionEvent evt) {
        String exibe = "";
        ArrayList<Livro> list = new ArrayList<>();
        Livro livros = new Livro();

        String atrib1 = box1.getSelectedItem().toString();
        String atrib2 = box3.getSelectedItem().toString();
        String atrib3 = box5.getSelectedItem().toString();

        String ord_atrib_1 = box2.getSelectedItem().toString();
        String ord_atrib_2 = box4.getSelectedItem().toString();
        String ord_atrib_3 = box6.getSelectedItem().toString();

        try {
            list = readFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestaoBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        if (!"Empty".equals(atrib1)){
           orderBook(livros, list, atrib1, ord_atrib_1);
        }
        
        if (!"Empty".equals(atrib2)){
           orderBook(livros, list, atrib2, ord_atrib_2);
        }
        
        if (!"Empty".equals(atrib3)){
           orderBook(livros, list, atrib3, ord_atrib_3);
        }
        
        if (!"Empty".equals(atrib1) && !"Empty".equals(atrib2)){
            orderBook(livros, list, atrib1, atrib2, ord_atrib_1, ord_atrib_2);
        }
        if (!"Empty".equals(atrib1) && !"Empty".equals(atrib2) && !"Empty".equals(atrib3)) {
            orderBook(livros, list, atrib1, atrib2, atrib3, ord_atrib_1, ord_atrib_2, ord_atrib_3);
        }
        
        if("Empty".equals(atrib1) && "Empty".equals(atrib2) && "Empty".equals(atrib3)){
            JOptionPane.showMessageDialog(null, "Nenhum campo selecionado!");
        }else{
        exibe = livros.showValues(list);
        JOptionPane.showMessageDialog(null, exibe);
    }
    }

    private void btmCancelActionPerformed(java.awt.event.ActionEvent evt) {
        btmCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox box2;
    private javax.swing.JComboBox<String> box3;
    private javax.swing.JComboBox box4;
    private javax.swing.JComboBox<String> box5;
    private javax.swing.JComboBox box6;
    private javax.swing.JButton btmCancel;
    private javax.swing.JButton btmOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}
