package Expression;

public class Frame extends javax.swing.JFrame {

  double y, x, a, b, numerator, denominator;

  double X, Y;
  boolean A, B, C, Z;

  String FirstName, SecondName, Surname, FullName;

  public Frame() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtx = new javax.swing.JTextField();
    txta = new javax.swing.JTextField();
    txtb = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    txty = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtX = new javax.swing.JTextField();
    txtY = new javax.swing.JTextField();
    txtA = new javax.swing.JTextField();
    txtB = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    txtZ = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    txtC = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtSecondName = new javax.swing.JTextField();
    txtSurname = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    txtFirstName = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtFullName = new javax.swing.JTextPane();
    btnCalc = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Experessions");

    jPanel1.setBackground(new java.awt.Color(204, 255, 204));
    jPanel1.setBorder(
      javax.swing.BorderFactory.createTitledBorder(
        null,
        "Arithmetic expressions",
        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        javax.swing.border.TitledBorder.DEFAULT_POSITION,
        new java.awt.Font("Segoe UI", 1, 12),
        new java.awt.Color(0, 0, 0)
      )
    ); // NOI18N
    jPanel1.setForeground(new java.awt.Color(0, 0, 0));

    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("x =");

    jLabel2.setForeground(new java.awt.Color(0, 0, 0));
    jLabel2.setText("a =");

    jLabel3.setForeground(new java.awt.Color(0, 0, 0));
    jLabel3.setText("b =");

    txtx.setBackground(new java.awt.Color(255, 255, 255));
    txtx.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txta.setBackground(new java.awt.Color(255, 255, 255));
    txta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    txta.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txtaActionPerformed(evt);
        }
      }
    );

    txtb.setBackground(new java.awt.Color(255, 255, 255));
    txtb.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel11.setForeground(new java.awt.Color(0, 0, 0));
    jLabel11.setText("y =");

    txty.setBackground(new java.awt.Color(255, 255, 255));
    txty.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(txta)
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(txtb)
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(txtx)
                )
            )
            .addGap(18, 18, 18)
            .addComponent(jLabel11)
            .addGap(3, 3, 3)
            .addComponent(
              txty,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              125,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap()
        )
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(
                  txta,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jLabel1)
                .addComponent(
                  txtx,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  txty,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  40,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(
                  txtb,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap()
        )
    );

    jPanel2.setBackground(new java.awt.Color(204, 255, 204));
    jPanel2.setBorder(
      javax.swing.BorderFactory.createTitledBorder(
        null,
        "Logic expressions",
        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        javax.swing.border.TitledBorder.DEFAULT_POSITION,
        new java.awt.Font("Segoe UI", 1, 12),
        new java.awt.Color(0, 0, 0)
      )
    ); // NOI18N
    jPanel2.setForeground(new java.awt.Color(255, 255, 255));

    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("X =");

    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Y =");

    jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    jLabel6.setText("A =");

    jLabel7.setForeground(new java.awt.Color(0, 0, 0));
    jLabel7.setText("B =");

    txtX.setBackground(new java.awt.Color(255, 255, 255));
    txtX.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txtY.setBackground(new java.awt.Color(255, 255, 255));
    txtY.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txtA.setBackground(new java.awt.Color(255, 255, 255));
    txtA.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txtB.setBackground(new java.awt.Color(255, 255, 255));
    txtB.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    txtB.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txtBActionPerformed(evt);
        }
      }
    );

    jLabel12.setForeground(new java.awt.Color(0, 0, 0));
    jLabel12.setText("Z =");

    txtZ.setBackground(new java.awt.Color(255, 255, 255));
    txtZ.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel14.setForeground(new java.awt.Color(0, 0, 0));
    jLabel14.setText("C =");

    txtC.setBackground(new java.awt.Color(255, 255, 255));
    txtC.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    txtC.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txtCActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
      jPanel2
    );
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addGroup(
                          jPanel2Layout
                            .createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(
                              txtX,
                              javax.swing.GroupLayout.PREFERRED_SIZE,
                              65,
                              javax.swing.GroupLayout.PREFERRED_SIZE
                            )
                            .addGap(58, 58, 58)
                        )
                        .addGroup(
                          jPanel2Layout
                            .createSequentialGroup()
                            .addGroup(
                              jPanel2Layout
                                .createParallelGroup(
                                  javax.swing.GroupLayout.Alignment.LEADING
                                )
                                .addGroup(
                                  jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtA)
                                )
                                .addGroup(
                                  jPanel2Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                      txtY,
                                      javax.swing.GroupLayout.PREFERRED_SIZE,
                                      63,
                                      javax.swing.GroupLayout.PREFERRED_SIZE
                                    )
                                )
                            )
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                              javax.swing.GroupLayout.DEFAULT_SIZE,
                              Short.MAX_VALUE
                            )
                            .addComponent(jLabel12)
                            .addPreferredGap(
                              javax.swing.LayoutStyle.ComponentPlacement.RELATED
                            )
                        )
                    )
                    .addComponent(txtZ)
                )
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(txtB)
                )
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(jLabel14)
                    .addGap(18, 18, 18)
                    .addComponent(
                      txtC,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      64,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap()
        )
    );

    jPanel2Layout.linkSize(
      javax.swing.SwingConstants.HORIZONTAL,
      new java.awt.Component[] { txtA, txtB, txtX, txtY }
    );

    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabel4)
                        .addComponent(
                          txtX,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabel5)
                        .addComponent(
                          txtY,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabel6)
                        .addComponent(
                          txtA,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabel7)
                        .addComponent(
                          txtB,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(jLabel14)
                        .addComponent(
                          txtC,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(
                      jPanel2Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.BASELINE
                        )
                        .addComponent(
                          txtZ,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          56,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                        .addComponent(jLabel12)
                    )
                )
            )
            .addGap(27, 27, 27)
        )
    );

    jPanel3.setBackground(new java.awt.Color(204, 255, 204));
    jPanel3.setBorder(
      javax.swing.BorderFactory.createTitledBorder(
        null,
        "String expression",
        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        javax.swing.border.TitledBorder.DEFAULT_POSITION,
        new java.awt.Font("Segoe UI", 1, 12),
        new java.awt.Color(0, 0, 0)
      )
    ); // NOI18N
    jPanel3.setForeground(new java.awt.Color(0, 0, 0));

    jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    jLabel9.setText("Father's name:");

    jLabel10.setForeground(new java.awt.Color(0, 0, 0));
    jLabel10.setText("Surname");

    txtSecondName.setBackground(new java.awt.Color(255, 255, 255));
    txtSecondName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txtSurname.setBackground(new java.awt.Color(255, 255, 255));
    txtSurname.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel8.setForeground(new java.awt.Color(0, 0, 0));
    jLabel8.setText("Name");

    txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
    txtFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    jLabel13.setForeground(new java.awt.Color(0, 0, 0));
    jLabel13.setText("Full name:");

    jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    txtFullName.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPane1.setViewportView(txtFullName);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
      jPanel3
    );
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel3Layout
                    .createSequentialGroup()
                    .addGroup(
                      jPanel3Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addGroup(
                      jPanel3Layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addComponent(
                          txtSecondName,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          93,
                          Short.MAX_VALUE
                        )
                        .addComponent(txtSurname)
                    )
                )
                .addGroup(
                  jPanel3Layout
                    .createSequentialGroup()
                    .addComponent(jLabel8)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      56,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      txtFirstName,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      93,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel3Layout
                    .createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel13)
                    .addContainerGap()
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  jPanel3Layout
                    .createSequentialGroup()
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      11,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      jScrollPane1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      112,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
        )
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(
                  txtFirstName,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(9, 9, 9)
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(
                  txtSecondName,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              jPanel3Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(
                  txtSurname,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap()
        )
        .addGroup(
          jPanel3Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1)
        )
    );

    btnCalc.setBackground(new java.awt.Color(0, 255, 51));
    btnCalc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnCalc.setForeground(new java.awt.Color(0, 0, 0));
    btnCalc.setText("Calculate");
    btnCalc.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnCalcActionPerformed(evt);
        }
      }
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  jPanel3,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
                .addComponent(
                  jPanel2,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
                .addComponent(
                  jPanel1,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCalc)
            .addContainerGap()
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(
                      btnCalc,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addContainerGap()
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(
                      jPanel1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      jPanel2,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED
                    )
                    .addComponent(
                      jPanel3,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addGap(13, 13, 13)
                )
            )
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btnCalcActionPerformed
    x = Double.valueOf(txtx.getText().trim());
    a = Double.valueOf(txta.getText().trim());
    b = Double.valueOf(txtb.getText().trim());
    X = Double.valueOf(txtX.getText().trim());
    Y = Double.valueOf(txtY.getText().trim());
    A = Boolean.valueOf(txtA.getText().trim());
    C = Boolean.valueOf(txtC.getText().trim());
    B = Boolean.valueOf(txtB.getText().trim());
    FirstName = txtFirstName.getText().trim();
    SecondName = txtSecondName.getText().trim();
    Surname = txtSurname.getText().trim();

    numerator =
      Math.pow(Math.log(x + 1), 2) +
      1.5 *
      Math.pow(x, 3) +
      Math.cbrt(x + 0.6 * Math.pow(10, 3));
    denominator =
      Math.pow(x, 5) +
      1.25 *
      Math.pow(10, -2) *
      Math.pow(Math.sin(b), 2) +
      Math.cbrt(0.6);

    y = numerator / denominator;

    Z = A && B || C || !(X <= Y || X > -0.5);

    FullName =
      FirstName.trim() + "\n" + SecondName.trim() + "\n" + Surname.trim();

    txty.setText(String.format("%9.6f", y));
    txtZ.setText(String.format("%6b", Z));
    txtFullName.setText(FullName);
  }

  private void txtBActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txtBActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txtBActionPerformed

  private void txtaActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txtaActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txtaActionPerformed

  private void txtCActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txtCActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txtCActionPerformed

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
      java.util.logging.Logger
        .getLogger(Frame.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger
        .getLogger(Frame.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger
        .getLogger(Frame.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger
        .getLogger(Frame.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new Frame().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCalc;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtA;
  private javax.swing.JTextField txtB;
  private javax.swing.JTextField txtC;
  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextPane txtFullName;
  private javax.swing.JTextField txtSecondName;
  private javax.swing.JTextField txtSurname;
  private javax.swing.JTextField txtX;
  private javax.swing.JTextField txtY;
  private javax.swing.JTextField txtZ;
  private javax.swing.JTextField txta;
  private javax.swing.JTextField txtb;
  private javax.swing.JTextField txtx;
  private javax.swing.JTextField txty;
  // End of variables declaration//GEN-END:variables
}
