/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author awliy
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }
private double angka1 = 0; 
private double angka2 = 0;
private String operator = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Tiga = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        Titik = new javax.swing.JButton();
        Enam = new javax.swing.JButton();
        Lima = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        ece = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        Empat = new javax.swing.JButton();
        Dua = new javax.swing.JButton();
        Nol = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Bintang = new javax.swing.JButton();
        Be = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        Samadengan = new javax.swing.JButton();
        atau = new javax.swing.JButton();
        EE = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        persen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        output = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tiga.setText("3");
        Tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TigaActionPerformed(evt);
            }
        });

        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        Titik.setText(".");
        Titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitikActionPerformed(evt);
            }
        });

        Enam.setText("6");
        Enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnamActionPerformed(evt);
            }
        });

        Lima.setText("5");
        Lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimaActionPerformed(evt);
            }
        });

        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        ece.setText("C");
        ece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eceActionPerformed(evt);
            }
        });

        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        Empat.setText("4");
        Empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpatActionPerformed(evt);
            }
        });

        Dua.setText("2");
        Dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuaActionPerformed(evt);
            }
        });

        Nol.setText("0");
        Nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NolActionPerformed(evt);
            }
        });

        Bintang.setText("*");
        Bintang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BintangActionPerformed(evt);
            }
        });

        Be.setText("B");
        Be.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeActionPerformed(evt);
            }
        });

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        Samadengan.setText("=");
        Samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamadenganActionPerformed(evt);
            }
        });

        atau.setText("/");
        atau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atauActionPerformed(evt);
            }
        });

        EE.setText("E");
        EE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEActionPerformed(evt);
            }
        });

        Min.setText("-");
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        jButton20.setText("jButton17");

        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bintang, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Be, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(83, 83, 83)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bintang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atau, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Be, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Enam, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lima, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Empat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tiga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Dua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Nol, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ece, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Enam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lima, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Empat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ece, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nol, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimaActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "5");
    }//GEN-LAST:event_LimaActionPerformed

    private void TigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TigaActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "3");
    }//GEN-LAST:event_TigaActionPerformed

    private void EmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpatActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "4");
    }//GEN-LAST:event_EmpatActionPerformed

    private void TitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitikActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + ".");
    }//GEN-LAST:event_TitikActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "+");
    }//GEN-LAST:event_plusActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "-");
    }//GEN-LAST:event_MinActionPerformed

    private void SamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamadenganActionPerformed
        // TODO add your handling code here:
        String input = output.getText(); // Ambil teks dari output
    String[] parts;
    double hasilOperasi = 0;

    // Cek apakah input memiliki operator
    if (input.contains("+")) {
        parts = input.split("\\+");
        hasilOperasi = Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
    } else if (input.contains("-")) {
        parts = input.split("-");
        hasilOperasi = Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
    } else if (input.contains("*")) {
        parts = input.split("\\*");
        hasilOperasi = Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
    } else if (input.contains("/")) {
        parts = input.split("/");
        if (Double.parseDouble(parts[1]) != 0) {
            hasilOperasi = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        } else {
            output.setText("Error: Div by 0");
            return; // Menghentikan eksekusi lebih lanjut jika pembagian dengan nol
        }
    } else {
        output.setText("Error: Invalid Expression");
        return; // Jika tidak ada operator yang valid
    }

    // Tampilkan hasil
    output.setText(String.valueOf(hasilOperasi));
    }//GEN-LAST:event_SamadenganActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "7");
    }//GEN-LAST:event_tujuhActionPerformed

    private void EnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnamActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "6");
    }//GEN-LAST:event_EnamActionPerformed

    private void NolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NolActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "0");
    }//GEN-LAST:event_NolActionPerformed

    private void DuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuaActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "2");
    }//GEN-LAST:event_DuaActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "8");
    }//GEN-LAST:event_delapanActionPerformed

    private void eceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eceActionPerformed
        // TODO add your handling code here:
        output.setText("");
    }//GEN-LAST:event_eceActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        output.setText(output.getText() + "1");
    }//GEN-LAST:event_satuActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
                output.setText(output.getText() + "9");

    }//GEN-LAST:event_sembilanActionPerformed

    private void EEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EEActionPerformed

    private void BintangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BintangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BintangActionPerformed

    private void BeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeActionPerformed
        // TODO add your handling code here:
         String teks = output.getText(); // Ambil teks dari output
    if (teks.length() > 0) {
        output.setText(teks.substring(0, teks.length() - 1)); // Hapus karakter terakhir
    }     
    }//GEN-LAST:event_BeActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
        double nilai = Double.parseDouble(output.getText ());
        nilai = nilai / 100;
        output.setText (String.valueOf(nilai));
    }//GEN-LAST:event_persenActionPerformed

    private void atauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atauActionPerformed
        // TODO add your handling code here:
        angka2 = Double.parseDouble(output.getText());
    }//GEN-LAST:event_atauActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Be;
    private javax.swing.JButton Bintang;
    private javax.swing.JButton Dua;
    private javax.swing.JButton EE;
    private javax.swing.JButton Empat;
    private javax.swing.JButton Enam;
    private javax.swing.JButton Lima;
    private javax.swing.JButton Min;
    private javax.swing.JButton Nol;
    private javax.swing.JButton Samadengan;
    private javax.swing.JButton Tiga;
    private javax.swing.JButton Titik;
    private javax.swing.JButton atau;
    private javax.swing.JButton delapan;
    private javax.swing.JButton ece;
    private javax.swing.JButton jButton20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField output;
    private javax.swing.JButton persen;
    private javax.swing.JButton plus;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
