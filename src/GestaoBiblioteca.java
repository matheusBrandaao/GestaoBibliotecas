

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

    private final String path = "C://Users//mathe//Desktop//GestaoBiliotecas/livros.txt";
    private int checkT = 0;
    private int checkA = 0;
    private int checkY = 0;

    public GestaoBiblioteca() {
        initComponents();

        /*
        boxTitle.removeAllItems();
        boxAuthor.removeAllItems();
        boxYear.removeAllItems();
         */
        boxTitle.addItem("Ascendente");
        boxTitle.addItem("Descendente");
        boxTitle.addItem("null");
        boxTitle.addItem("Empty");

        boxAuthor.addItem("Ascendente");
        boxAuthor.addItem("Descendente");
        boxAuthor.addItem("null");
        boxAuthor.addItem("Empty");

        boxYear.addItem("Ascendente");
        boxYear.addItem("Descendente");
        boxYear.addItem("null");
        boxYear.addItem("Empty");

    }

    public int getCheckT() {
        return this.checkT;
    }

    public int getCheckA() {
        return this.checkA;
    }

    public int getCheckY() {
        return this.checkY;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        btmCancel = new javax.swing.JButton();
        btmOrder = new javax.swing.JButton();
        boxTitle = new javax.swing.JComboBox();
        boxAuthor = new javax.swing.JComboBox();
        boxYear = new javax.swing.JComboBox();
        checkTitle = new javax.swing.JCheckBox();
        checkAuthor = new javax.swing.JCheckBox();
        checkYear = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        boxTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxAuthor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkTitle.setText("TITLE");
        checkTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTitleActionPerformed(evt);
            }
        });

        checkAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAuthor.setText("AUTHOR");
        checkAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAuthorActionPerformed(evt);
            }
        });

        checkYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkYear.setText("EDITION YEAR");
        checkYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkTitle)
                            .addComponent(checkAuthor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btmCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkYear)
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAuthor))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkYear))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmCancel)
                    .addComponent(btmOrder))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList readFile() throws FileNotFoundException {
        String conteudo = "";
        ArrayList<Livro> a = new ArrayList<>();
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
            a.add(livro);
            a.add(livro2);
            a.add(livro3);
            a.add(livro4);

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o arquivo para leitura");

        }
        return a;
    }


    private void btmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmOrderActionPerformed

        GestaoBiblioteca read = new GestaoBiblioteca();
        ArrayList<Livro> aux = new ArrayList<>();
        Livro t = new Livro();
        
        String directionTitle = boxTitle.getSelectedItem().toString();
        String directionAuthor = boxAuthor.getSelectedItem().toString();
        String directionYear = boxYear.getSelectedItem().toString();

        try {
            aux = read.readFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestaoBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (directionTitle.equals("Ascendente")) {
            t.orderAscendente(aux);
        }
        if (directionTitle.equals("Descendente")) {
            t.orderDescendente(aux);
        }


        if (directionAuthor.equals("Ascendente")) {
            t.orderAscendente(aux);
        }
        if (directionAuthor.equals("Descendente")) {
            t.orderDescendente(aux);
        }


        if (directionYear.equals("Ascendente")) {
            t.orderAscendente(aux);
        }

        if (directionYear.equals("Descendente")) {
            t.orderDescendente(aux);
        }

        if(checkTitle.isEnabled() == true && checkAuthor.isEnabled() == true){
        if (directionTitle.equals("Ascendente") && directionAuthor.equals("Descendente")) {
            t.orderAscendente(aux);
            t.changeElements(aux);
        }
        if (directionTitle.equals("Descendente") && directionAuthor.equals("Ascendente")) {
            t.orderDescendente(aux);
            t.changeElements(aux);
        }
        }


        
        
        if (directionTitle.equals("null") || directionAuthor.equals("null") || directionYear.equals("null")) {

        }

        if (directionYear.equals("Empty")) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado uma forma de ordenação!");
        }
    }//GEN-LAST:event_btmOrderActionPerformed

    private void btmCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCancelActionPerformed
        btmCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }//GEN-LAST:event_btmCancelActionPerformed


    private void checkAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAuthorActionPerformed
        if (checkAuthor.isSelected() == true) {
            this.checkA = 1;
        } else {
            this.checkA = 0;
        }
    }//GEN-LAST:event_checkAuthorActionPerformed

    private void checkYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkYearActionPerformed
        if (checkYear.isSelected() == true) {
            this.checkY = 1;
        } else {
            this.checkY = 0;
        }
    }//GEN-LAST:event_checkYearActionPerformed

    private void checkTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTitleActionPerformed
        if (checkTitle.isSelected() == true) {
            this.checkT = 1;
        } else {
            this.checkT = 0;
        }
    }//GEN-LAST:event_checkTitleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxAuthor;
    private javax.swing.JComboBox boxTitle;
    private javax.swing.JComboBox boxYear;
    private javax.swing.JButton btmCancel;
    private javax.swing.JButton btmOrder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkAuthor;
    private javax.swing.JCheckBox checkTitle;
    private javax.swing.JCheckBox checkYear;
    // End of variables declaration//GEN-END:variables
}
