package com.producto.a3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MatriculaFormularo extends JFrame {

    private Monto montoCalculado;
    private Alumno alumno;

    public MatriculaFormularo() {
        initComponents();
        this.alumno = new Alumno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellidoLabel = new javax.swing.JLabel();
        apellidoText = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        datosLabel = new javax.swing.JLabel();
        DatosSeparator = new javax.swing.JSeparator();
        MatriculaLabel = new javax.swing.JLabel();
        MatriculaSeparator = new javax.swing.JSeparator();
        cicloLabel = new javax.swing.JLabel();
        cursoLabel = new javax.swing.JLabel();
        creditosLabel = new javax.swing.JLabel();
        CostoCreditoLabel = new javax.swing.JLabel();
        cicloCombo = new javax.swing.JComboBox();
        cursoCombo = new javax.swing.JComboBox();
        creditosText = new javax.swing.JTextField();
        costoCreditoText = new javax.swing.JTextField();
        montoLabel = new javax.swing.JLabel();
        montoText = new javax.swing.JTextField();
        calcularButton = new javax.swing.JButton();
        resumenLabel = new javax.swing.JLabel();
        resumenSeparator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumenArea = new javax.swing.JTextArea();
        resumirButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcula Matricula");

        apellidoLabel.setText("Apellido : ");

        apellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre :");

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        datosLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        datosLabel.setText("Datos de alumno");

        MatriculaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MatriculaLabel.setText("Datos de matricula");

        cicloLabel.setText("Ciclo :");

        cursoLabel.setText("Curso :");

        creditosLabel.setText("Creditos :");

        CostoCreditoLabel.setText("Costo por credito :");

        cicloCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));
        cicloCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cicloComboActionPerformed(evt);
            }
        });

        cursoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));
        cursoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoComboActionPerformed(evt);
            }
        });

        creditosText.setEditable(false);
        creditosText.setBackground(new java.awt.Color(255, 255, 204));

        costoCreditoText.setEditable(false);
        costoCreditoText.setBackground(new java.awt.Color(255, 255, 204));

        montoLabel.setText("Monto a pagar :");

        montoText.setEditable(false);
        montoText.setBackground(new java.awt.Color(255, 255, 204));

        calcularButton.setText("Calcular");
        calcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularButtonActionPerformed(evt);
            }
        });

        resumenLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resumenLabel.setText("Resumen");

        resumenArea.setEditable(false);
        resumenArea.setBackground(new java.awt.Color(204, 255, 255));
        resumenArea.setColumns(20);
        resumenArea.setRows(5);
        jScrollPane1.setViewportView(resumenArea);

        resumirButton.setText("Resumir");
        resumirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resumirButtonActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumenLabel)
                    .addComponent(MatriculaSeparator)
                    .addComponent(MatriculaLabel)
                    .addComponent(datosLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoLabel)
                            .addComponent(nombreLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(apellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(nombreText)))
                    .addComponent(DatosSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cicloLabel)
                            .addComponent(cursoLabel))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cicloCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cursoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(montoLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(montoText)))
                    .addComponent(resumenSeparator)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CostoCreditoLabel)
                            .addComponent(creditosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditosText)
                            .addComponent(costoCreditoText)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resumirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DatosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLabel)
                    .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(MatriculaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MatriculaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cicloLabel)
                    .addComponent(cicloCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursoLabel)
                    .addComponent(cursoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditosLabel)
                    .addComponent(creditosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoCreditoLabel)
                    .addComponent(costoCreditoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoLabel)
                    .addComponent(montoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcularButton)
                .addGap(18, 18, 18)
                .addComponent(resumenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resumenSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumirButton)
                    .addComponent(salirButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTextActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void cicloComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cicloComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cicloComboActionPerformed

    private void cursoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoComboActionPerformed

    private void calcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularButtonActionPerformed
        String ciclo = this.cicloCombo.getSelectedItem().toString();
        String curso = this.cursoCombo.getSelectedItem().toString();
        MontoPagar monto = new MontoPagar();
        System.out.print("" + ciclo);
        System.out.print("" + curso);
        this.montoCalculado = monto.calcular(ciclo, curso);
        this.alumno.setApellido(this.apellidoText.getText().toString());
        this.alumno.setNombre(this.nombreText.getText().toString());
        String creditos = new Integer(this.montoCalculado.getCreditos()).toString();
        String costos = new Double(this.montoCalculado.getCosto()).toString();
        String montoTotal = new Double(this.montoCalculado.getTotal()).toString();
        this.creditosText.setText(creditos);
        this.costoCreditoText.setText(costos);
        this.montoText.setText(montoTotal);
    }//GEN-LAST:event_calcularButtonActionPerformed

    private void resumirButtonActionPerformed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumirButtonActionPerformed

        if (this.montoCalculado != null) {
            String resumen = MontoResumen.obtener(this.montoCalculado, this.alumno);
            this.resumenArea.setText(resumen);
        } else {
            JOptionPane.showMessageDialog(null, "No hay calculo previo");
        }

    }//GEN-LAST:event_resumirButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatriculaFormularo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaFormularo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaFormularo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaFormularo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaFormularo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CostoCreditoLabel;
    private javax.swing.JSeparator DatosSeparator;
    private javax.swing.JLabel MatriculaLabel;
    private javax.swing.JSeparator MatriculaSeparator;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton calcularButton;
    private javax.swing.JComboBox cicloCombo;
    private javax.swing.JLabel cicloLabel;
    private javax.swing.JTextField costoCreditoText;
    private javax.swing.JLabel creditosLabel;
    private javax.swing.JTextField creditosText;
    private javax.swing.JComboBox cursoCombo;
    private javax.swing.JLabel cursoLabel;
    private javax.swing.JLabel datosLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel montoLabel;
    private javax.swing.JTextField montoText;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextArea resumenArea;
    private javax.swing.JLabel resumenLabel;
    private javax.swing.JSeparator resumenSeparator;
    private javax.swing.JButton resumirButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
