
package myFrames;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
import myFrames.myPanels.Panel1;
import myFrames.myPanels.Panel2;
import myFrames.myPanels.Panel3;
import myFrames.myPanels.Panel4;
import myFrames.myPanels.Panel5;
import myFrames.myPanels.Panel6;
import myFrames.myPanels.Panel7;
import myFrames.myPanels.Panel8;
import myFrames.myPanels.Panel9;
import myFrames.myPanels.Panel10;
import myFrames.myPanels.Panel11;
import myFrames.myPanels.Panel12;
import myFrames.myPanels.Panel13;
import myFrames.myPanels.Panel14;
import myFrames.myPanels.Panel15;
import myFrames.myPanels.Panel16;

/**
 *
 * @author WILFRED KOECH
 */
public class Frame1 extends javax.swing.JInternalFrame {
GridBagLayout layout = new GridBagLayout();
Panel1 p1;
Panel2 p2;
Panel3 p3;
Panel4 p4;
Panel5 p5;
Panel6 p6;
Panel7 p7;
Panel8 p8;
Panel9 p9;
Panel10 p10;
Panel11 p11;
Panel12 p12;
Panel13 p13;
Panel14 p14;
Panel15 p15;
Panel16 p16;
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
         CurrenrDate();
        p1 = new Panel1();
        p2 = new Panel2();
        p3 = new Panel3();
        p4 = new Panel4();
        p5 = new Panel5();
        p6 = new Panel6();
        p7 = new Panel7();
        p8 = new Panel8();
        p9 = new Panel9();
        p10 = new Panel10();
        p11 = new Panel11();
        p12 = new Panel12();
        p13 = new Panel13();
        p14 = new Panel14();
        p15 = new Panel15();
        p16 =new Panel16();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints(); 
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p2,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p3,c);
         c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p4,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p5,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p6,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p7,c);
         c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p8,c);
         c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p9,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p10,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p11,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p12,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p13,c);
         c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p14,c);
         c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p15,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p16,c);
        p1.setVisible(true);
        p2 .setVisible(false);
        p3 .setVisible(false);
        p4 .setVisible(false);
        p5 .setVisible(false);
        p6 .setVisible(false);
        p7 .setVisible(false);
        p8 .setVisible(false);
        p9 .setVisible(false);
        p10 .setVisible(false);
         p11.setVisible(false);
         p12.setVisible(false); 
         p13.setVisible(false); 
         p14.setVisible(false);
         p15.setVisible(false);
         p16.setVisible(false);
    }
    
    
       public void CurrenrDate(){
          GregorianCalendar date=new GregorianCalendar(); 
          int year,month,day;
          int hour,minute,second;
          
          year=date.get(Calendar.YEAR);
          month=date.get(Calendar.MONTH);
          day=date.get(Calendar.DAY_OF_MONTH);
          date2.setText("  Date: "+day+"/"+(month+1)+"/"+year);
          
          hour = date.get(Calendar.HOUR);
          minute=date.get(Calendar.MINUTE);
          second=date.get(Calendar.SECOND);
          time2.setText("  Time: "+hour+":"+minute+":"+second);
          
        }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        Panelbutton = new javax.swing.JPanel();
        doctorsbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newpatient = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        discargebtn = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        date2 = new javax.swing.JMenu();
        time2 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("jMenu8");

        setClosable(true);
        setTitle("KESSES DISPENSARY HOSPITAL");

        Panelbutton.setBackground(new java.awt.Color(255, 204, 204));

        doctorsbtn.setBackground(new java.awt.Color(153, 255, 153));
        doctorsbtn.setText("Doctors details");
        doctorsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorsbtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setText("Outpatient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Doctor's Module");

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setText("Inpatient");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Patient's module");

        newpatient.setBackground(new java.awt.Color(153, 255, 153));
        newpatient.setText("Add new");
        newpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpatientActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setText("Inpatient");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 255, 153));
        jButton6.setText("Outpatient");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Room management");

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setText("Room enquiry");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 255, 153));
        jButton8.setText("Room category");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 255, 153));
        jButton9.setText("Billing");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nurse Module");

        jButton10.setBackground(new java.awt.Color(153, 255, 153));
        jButton10.setText("Intake records");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 255, 153));
        jButton11.setText("Patients Medication");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 255, 153));
        jButton12.setText("Patient's History");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        discargebtn.setBackground(new java.awt.Color(153, 255, 153));
        discargebtn.setText("Discharge summary");
        discargebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discargebtnActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 255, 153));
        jButton14.setText("Vital sign");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Billing");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelbuttonLayout = new javax.swing.GroupLayout(Panelbutton);
        Panelbutton.setLayout(PanelbuttonLayout);
        PanelbuttonLayout.setHorizontalGroup(
            PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbuttonLayout.createSequentialGroup()
                .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelbuttonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelbuttonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelbuttonLayout.createSequentialGroup()
                        .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelbuttonLayout.createSequentialGroup()
                                .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(doctorsbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(discargebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(newpatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createSequentialGroup()
                    .addContainerGap(77, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        PanelbuttonLayout.setVerticalGroup(
            PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbuttonLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doctorsbtn)
                .addGap(1, 1, 1)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newpatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(4, 4, 4)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discargebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
            .addGroup(PanelbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbuttonLayout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );

        getContentPane().add(Panelbutton, java.awt.BorderLayout.LINE_START);

        DynamicPanel.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1182, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        jMenu9.setText("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        jMenuBar1.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(153, 255, 153));
        jMenu10.setText("Administrator");

        jMenu13.setText("Medicine management");

        jMenuItem8.setText("Category");
        jMenu13.add(jMenuItem8);

        jMenuItem9.setText("Drug name");
        jMenu13.add(jMenuItem9);

        jMenu10.add(jMenu13);

        jMenuItem10.setText("Complains ");
        jMenu10.add(jMenuItem10);

        jMenuItem11.setText("Review Registers");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenuBar1.add(jMenu10);

        jMenu4.setText("xxxxxx");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("User management");

        jMenuItem6.setText("User roles");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Add new user");
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu11.setText("xxxxx");
        jMenuBar1.add(jMenu11);

        date2.setBackground(new java.awt.Color(102, 255, 255));
        date2.setForeground(new java.awt.Color(255, 102, 102));
        date2.setText("     Date");
        jMenuBar1.add(date2);

        time2.setBackground(new java.awt.Color(255, 153, 255));
        time2.setForeground(new java.awt.Color(0, 204, 51));
        time2.setText("            Time");
        jMenuBar1.add(time2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
           p13.setVisible(false); 
            p14.setVisible(false);
            p15.setVisible(false);
            p16.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void doctorsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorsbtnActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
           p13.setVisible(false);
            p14.setVisible(false);
            p15.setVisible(false);
            p16.setVisible(false);
    }//GEN-LAST:event_doctorsbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
            p13.setVisible(true); 
             p14.setVisible(false);
             p15.setVisible(false);
             p16.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpatientActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
            p13.setVisible(false); 
             p14.setVisible(false);
             p15.setVisible(false);
             p16.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_newpatientActionPerformed

    private void discargebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discargebtnActionPerformed
      p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false);
            p13.setVisible(false); 
             p14.setVisible(false);
             p15.setVisible(false);
             p16.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_discargebtnActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
           p13.setVisible(false); 
            p14.setVisible(false);
            p15.setVisible(false);
            p16.setVisible(false);
            
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
         p7.setVisible(true);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
           p13.setVisible(false); 
            p14.setVisible(false);
           p15.setVisible(false);
           p16.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
         p7.setVisible(false);
         p8.setVisible(true);
         p9.setVisible(false);
          p10.setVisible(false);
           p11.setVisible(false);
           p12.setVisible(false); 
           p13.setVisible(false); 
           p14.setVisible(false);
           p15.setVisible(false);
           p16.setVisible(false);
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
         p7.setVisible(false);
         p8.setVisible(false);
          p9.setVisible(true);
           p10.setVisible(false);
            p11.setVisible(false);
            p12.setVisible(false); 
            p13.setVisible(false); 
             p14.setVisible(false);
            p15.setVisible(false);
             p16.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
         p10.setVisible(false);
         p11.setVisible(false);
        p12.setVisible(false);
        p13.setVisible(false);
         p14.setVisible(false);
        p15.setVisible(false);
         p16.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
         p8.setVisible(false);
         p9.setVisible(false);
          p10.setVisible(true); 
          p11.setVisible(false); 
          p12.setVisible(false);
          p13.setVisible(false); 
           p14.setVisible(false);
           p15.setVisible(false);
            p16.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false); 
        p11.setVisible(true); 
        p12.setVisible(false); 
        p13.setVisible(false);
        p14.setVisible(false);
        p15.setVisible(false);
        p16.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false); 
        p11.setVisible(false);
        p12.setVisible(true); 
        p13.setVisible(false); 
        p14.setVisible(false);
        p15.setVisible(false);
        p16.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false); 
        p11.setVisible(false);
        p12.setVisible(false);
        p13.setVisible(false);
        p14.setVisible(true);
        p15.setVisible(false);  
        p16.setVisible(false);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false); 
        p11.setVisible(false);
        p12.setVisible(false);
        p13.setVisible(false);
        p14.setVisible(false);
        p15.setVisible(true);
        p16.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
        p9.setVisible(false);
        p10.setVisible(false); 
        p11.setVisible(false);
        p12.setVisible(false);
        p13.setVisible(false);
        p14.setVisible(false);
        p15.setVisible(false);
        p16.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel Panelbutton;
    private java.awt.Canvas canvas1;
    private javax.swing.JMenu date2;
    private javax.swing.JButton discargebtn;
    private javax.swing.JButton doctorsbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton newpatient;
    private javax.swing.JMenu time2;
    // End of variables declaration//GEN-END:variables
}
