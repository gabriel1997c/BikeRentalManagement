package BicicletePackage;


import static BicicletePackage.Interogari.buildTableModel;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author Gabi
 */
public class ModifyBicicleta extends javax.swing.JFrame {
    
    /**
     * Creates new form ModifyAngajat
     */
    public ModifyBicicleta() {
        initComponents();
        this.setLocationRelativeTo(null);       //centrul ecranului
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel3 = new javax.swing.JPanel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BN95819;databaseName=CentruBicicletePU").createEntityManager();
        angajatiQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Angajati a");
        angajatiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : angajatiQuery.getResultList();
        bicicleteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Biciclete b");
        bicicleteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bicicleteQuery.getResultList();
        sediiQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Sedii s");
        sediiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : sediiQuery.getResultList();
        angajatiQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Angajati a");
        angajatiList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : angajatiQuery1.getResultList();
        sediiQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Sedii s");
        sediiList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : sediiQuery2.getResultList();
        bicicleteQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Biciclete b");
        bicicleteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bicicleteQuery1.getResultList();
        jPanel2 = new javax.swing.JPanel();
        producator = new javax.swing.JTextField();
        serie = new javax.swing.JTextField();
        materialCadru = new javax.swing.JTextField();
        pretInchirierePeOra = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        culoare = new javax.swing.JTextField();
        numarViteze = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        bicicletaID = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();
        sediuNume = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_home = new javax.swing.JButton();
        btn_showTable = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 600));

        jPanel2.setBackground(new java.awt.Color(1, 50, 67));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        producator.setBackground(new java.awt.Color(58, 65, 65));
        producator.setForeground(new java.awt.Color(255, 255, 255));

        serie.setBackground(new java.awt.Color(58, 65, 65));
        serie.setForeground(new java.awt.Color(255, 255, 255));

        materialCadru.setBackground(new java.awt.Color(58, 65, 65));
        materialCadru.setForeground(new java.awt.Color(255, 255, 255));

        pretInchirierePeOra.setBackground(new java.awt.Color(58, 65, 65));
        pretInchirierePeOra.setForeground(new java.awt.Color(255, 255, 255));

        btn_insert.setBackground(new java.awt.Color(1, 50, 67));
        btn_insert.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 51, 77));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Serie");

        jLabel10.setBackground(new java.awt.Color(51, 51, 77));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MaterialCadru");

        jLabel11.setBackground(new java.awt.Color(51, 51, 77));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PretInchirierePeOra");

        culoare.setBackground(new java.awt.Color(58, 65, 65));
        culoare.setForeground(new java.awt.Color(255, 255, 255));

        numarViteze.setBackground(new java.awt.Color(58, 65, 65));
        numarViteze.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(51, 51, 77));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Culoare");

        jLabel4.setBackground(new java.awt.Color(51, 51, 77));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NumarViteze");

        jLabel8.setBackground(new java.awt.Color(51, 51, 77));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Producator");

        jLabel15.setBackground(new java.awt.Color(51, 51, 77));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sediu");

        btn_update.setBackground(new java.awt.Color(1, 50, 67));
        btn_update.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(1, 50, 67));
        btn_delete.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(51, 51, 77));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("BicicletaID");

        bicicletaID.setBackground(new java.awt.Color(58, 65, 65));
        bicicletaID.setForeground(new java.awt.Color(255, 255, 255));

        btn_refresh.setBackground(new java.awt.Color(1, 50, 67));
        btn_refresh.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("REFRESH");
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }
        });
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        sediuNume.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BNBikes", "Relax", "MyBike", "Adventure" }));
        sediuNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sediuNumeActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bicicleteList1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bicicletaID}"));
        columnBinding.setColumnName("Bicicleta ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sediuID}"));
        columnBinding.setColumnName("Sediu ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${producator}"));
        columnBinding.setColumnName("Producator");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${serie}"));
        columnBinding.setColumnName("Serie");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${culoare}"));
        columnBinding.setColumnName("Culoare");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${materialCadru}"));
        columnBinding.setColumnName("Material Cadru");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numarViteze}"));
        columnBinding.setColumnName("Numar Viteze");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pretInchirierePeOra}"));
        columnBinding.setColumnName("Pret Inchiriere Pe Ora");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable1);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sediiList2, jTable3);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sediuID}"));
        columnBinding.setColumnName("Sediu ID");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nume}"));
        columnBinding.setColumnName("Nume");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane3.setViewportView(jTable3);

        btn_home.setBackground(new java.awt.Color(1, 50, 67));
        btn_home.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("HOME");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_showTable.setBackground(new java.awt.Color(1, 50, 67));
        btn_showTable.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        btn_showTable.setForeground(new java.awt.Color(255, 255, 255));
        btn_showTable.setText("SHOW TABLE");
        btn_showTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_showTableMouseClicked(evt);
            }
        });
        btn_showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_insert)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete)
                                .addGap(18, 18, 18)
                                .addComponent(btn_showTable)
                                .addGap(114, 114, 114)
                                .addComponent(btn_refresh)
                                .addGap(144, 144, 144))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(132, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numarViteze, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(culoare, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bicicletaID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sediuNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pretInchirierePeOra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(materialCadru, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serie, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(producator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(materialCadru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(pretInchirierePeOra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(bicicletaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(sediuNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(culoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(numarViteze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_refresh)
                    .addComponent(btn_home)
                    .addComponent(btn_showTable))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(210, 77, 87));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inserati/Modificati/Stergeti o bicicleta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        
        PreparedStatement pst;
        String sql="INSERT INTO Biciclete"
            +" (SediuID,Producator,Serie,Culoare,MaterialCadru,NumarViteze,PretInchirierePeOra)"
            +" VALUES(?,?,?,?,?,?,?)";
        
        try
        {
            pst=MyConnection.getConnection().prepareStatement(sql);
            
            int id=sediuNume.getSelectedIndex()+1;      //indexarea combobox-ului incepe la 0, deci adaug 1 (am sediile 1-4)
            pst.setString(1,Integer.toString(id)); 
            pst.setString(2,producator.getText());
            pst.setString(3,serie.getText());             //valorile stocate sunt folosite in interogarea de mai sus
            pst.setString(4,culoare.getText());
            pst.setString(5,materialCadru.getText());
            pst.setString(6,numarViteze.getText());
            pst.setString(7,pretInchirierePeOra.getText());
           

            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Bicicleta a fost adaugata.");
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModifyBicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst;
        String sql="UPDATE Biciclete "
            +"SET SediuID=?,Producator=?,Serie=?,Culoare=?,MaterialCadru=?,NumarViteze=?,PretInchirierePeOra=?"
            +" WHERE BicicletaID=?";
        
        try
        {
            pst=MyConnection.getConnection().prepareStatement(sql);
            
            int id=sediuNume.getSelectedIndex()+1;      //indexarea combobox-ului incepe la 0, deci adaug 1 (am sediile 1-4)
            pst.setString(1,Integer.toString(id));                                             
            pst.setString(2,producator.getText());
            pst.setString(3,serie.getText());             //valorile stocate sunt folosite in interogarea de mai sus
            pst.setString(4,culoare.getText());
            pst.setString(5,materialCadru.getText());
            pst.setString(6,numarViteze.getText());
            pst.setString(7,pretInchirierePeOra.getText());
            pst.setString(8,bicicletaID.getText());

            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Bicicleta a fost updatata.");
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModifyBicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst;
        String sql="DELETE FROM Biciclete WHERE BicicletaID=?"; //sterge bicicleta cu id-ul
        
        try
        {
            pst=MyConnection.getConnection().prepareStatement(sql);
            
            pst.setString(1,bicicletaID.getText());           //citit aici

            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Bicicleta a fost stearsa.");
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModifyBicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        
            new ModifyBicicleta().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refreshMouseClicked

    private void sediuNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sediuNumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sediuNumeActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
                HomeScreen hs = new HomeScreen();
                hs.setVisible(true);
                hs.pack();
                hs.setSize(633, 700);
                hs.setLocationRelativeTo(null);
                hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_showTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showTableMouseClicked

    private void btn_showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showTableActionPerformed
        // TODO add your handling code here:
         PreparedStatement pst;
        ResultSet rs;
        String sql="SELECT * FROM Biciclete";
        try {
            pst=MyConnection.getConnection().prepareStatement(sql);
            
            rs=pst.executeQuery();
            JTable table = new JTable(buildTableModel(rs));
            
            setLocationRelativeTo(null);
            // Closes the Connection
            
            JScrollPane scrollPane = new JScrollPane(table);
            Dimension d = table.getPreferredSize();
            scrollPane.setPreferredSize(new Dimension(d.width,d.height));
            
            
            JOptionPane.showMessageDialog(null, scrollPane);

        } catch (SQLException ex) {
            Logger.getLogger(ModifyBicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_showTableActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBicicleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<BicicletePackage.Angajati> angajatiList;
    private java.util.List<BicicletePackage.Angajati> angajatiList1;
    private javax.persistence.Query angajatiQuery;
    private javax.persistence.Query angajatiQuery1;
    private javax.swing.JTextField bicicletaID;
    private java.util.List<BicicletePackage.Biciclete> bicicleteList;
    private java.util.List<BicicletePackage.Biciclete> bicicleteList1;
    private javax.persistence.Query bicicleteQuery;
    private javax.persistence.Query bicicleteQuery1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_showTable;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField culoare;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField materialCadru;
    private javax.swing.JTextField numarViteze;
    private javax.swing.JTextField pretInchirierePeOra;
    private javax.swing.JTextField producator;
    private java.util.List<BicicletePackage.Sedii> sediiList;
    private java.util.List<BicicletePackage.Sedii> sediiList2;
    private javax.persistence.Query sediiQuery;
    private javax.persistence.Query sediiQuery2;
    private javax.swing.JComboBox<String> sediuNume;
    private javax.swing.JTextField serie;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
