
import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kucingscript
 */
public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txJumlah = new javax.swing.JTextField();
        txTotal = new javax.swing.JTextField();
        combo_kategori = new javax.swing.JComboBox<>();
        txHarga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        txAlamat = new javax.swing.JTextField();
        txHp = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnShow = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txSearch = new javax.swing.JTextField();
        combo_sort = new javax.swing.JComboBox<>();
        combo_merk = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(168, 218, 220));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 53, 87));
        jLabel1.setText("PET CARE");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 53, 87));
        jLabel2.setText("Kategori");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 53, 87));
        jLabel3.setText("Merk");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 53, 87));
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 53, 87));
        jLabel5.setText("Jumlah");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 53, 87));
        jLabel6.setText("Total");

        txJumlah.setBackground(new java.awt.Color(241, 250, 238));
        txJumlah.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txJumlah.setForeground(new java.awt.Color(29, 53, 87));
        txJumlah.setBorder(null);
        txJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txJumlahKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txJumlahKeyReleased(evt);
            }
        });

        txTotal.setEditable(false);
        txTotal.setBackground(new java.awt.Color(241, 250, 238));
        txTotal.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txTotal.setForeground(new java.awt.Color(29, 53, 87));
        txTotal.setBorder(null);
        txTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txTotalKeyReleased(evt);
            }
        });

        combo_kategori.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combo_kategori.setForeground(new java.awt.Color(202, 240, 248));
        combo_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan Kucing", "Makanan Anjing", "Makanan Kambing", "Makanan Sapi", "Makanan Burung" }));
        combo_kategori.setBorder(null);
        combo_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_kategoriActionPerformed(evt);
            }
        });

        txHarga.setEditable(false);
        txHarga.setBackground(new java.awt.Color(241, 250, 238));
        txHarga.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txHarga.setForeground(new java.awt.Color(29, 53, 87));
        txHarga.setToolTipText("");
        txHarga.setBorder(null);
        txHarga.setName(""); // NOI18N
        txHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHargaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(29, 53, 87));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 53, 87));
        jLabel7.setText("Nama");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(29, 53, 87));
        jLabel9.setText("Alamat");

        txNama.setBackground(new java.awt.Color(241, 250, 238));
        txNama.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txNama.setForeground(new java.awt.Color(29, 53, 87));
        txNama.setBorder(null);

        txAlamat.setBackground(new java.awt.Color(241, 250, 238));
        txAlamat.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txAlamat.setForeground(new java.awt.Color(29, 53, 87));
        txAlamat.setBorder(null);

        txHp.setBackground(new java.awt.Color(241, 250, 238));
        txHp.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txHp.setForeground(new java.awt.Color(29, 53, 87));
        txHp.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(29, 53, 87));

        jPanel4.setBackground(new java.awt.Color(168, 218, 220));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(230, 57, 70));
        jPanel5.setForeground(new java.awt.Color(0, 180, 216));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(69, 123, 157));
        jPanel6.setForeground(new java.awt.Color(202, 240, 248));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(168, 218, 220));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnSubmit.setBackground(new java.awt.Color(69, 123, 157));
        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(241, 250, 238));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCalculate.setBackground(new java.awt.Color(69, 123, 157));
        btnCalculate.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(241, 250, 238));
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(null);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kategori", "Merk", "Harga", "Jumlah", "Total", "Nama", "Alamat", "HP", "Timestamp"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        btnShow.setBackground(new java.awt.Color(69, 123, 157));
        btnShow.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnShow.setForeground(new java.awt.Color(241, 250, 238));
        btnShow.setText("Show");
        btnShow.setBorder(null);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(69, 123, 157));
        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(241, 250, 238));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(230, 57, 70));
        btnExit.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(241, 250, 238));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(230, 57, 70));
        btnDelete.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(241, 250, 238));
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(29, 53, 87));
        jLabel10.setText("Nomor HP");

        btnReset.setBackground(new java.awt.Color(230, 57, 70));
        btnReset.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnReset.setForeground(new java.awt.Color(241, 250, 238));
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(69, 123, 157));
        btnSearch.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(241, 250, 238));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txSearch.setBackground(new java.awt.Color(241, 250, 238));
        txSearch.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txSearch.setForeground(new java.awt.Color(29, 53, 87));
        txSearch.setBorder(null);

        combo_sort.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combo_sort.setForeground(new java.awt.Color(202, 240, 248));
        combo_sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        combo_sort.setBorder(null);
        combo_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_sortActionPerformed(evt);
            }
        });

        combo_merk.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combo_merk.setForeground(new java.awt.Color(202, 240, 248));
        combo_merk.setBorder(null);

        btnClear.setBackground(new java.awt.Color(230, 57, 70));
        btnClear.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(241, 250, 238));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(69, 123, 157));
        btnPrint.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(241, 250, 238));
        btnPrint.setText("Print");
        btnPrint.setBorder(null);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnPurchase.setBackground(new java.awt.Color(69, 123, 157));
        btnPurchase.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnPurchase.setForeground(new java.awt.Color(241, 250, 238));
        btnPurchase.setText("Purchase");
        btnPurchase.setBorder(null);
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(69, 123, 157));
        btnRefresh.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(241, 250, 238));
        btnRefresh.setText("↻");
        btnRefresh.setBorder(null);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txJumlah)
                                    .addComponent(txTotal)
                                    .addComponent(combo_kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_merk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txHarga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(58, 58, 58))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txHp, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txSearch))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(combo_sort, 0, 165, Short.MAX_VALUE)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)))
                        .addGap(44, 44, 44)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(combo_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txHp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_sort, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static final String USERNAME = "root";
    private static final String PASSWORD = "kucingmenangis";
    private static final String DATACONN = "jdbc:mysql://localhost:3306/finalSD";

    private int total(int a, int b) {
        return a * b;
    }

    private void clearText() {
        combo_kategori.setSelectedIndex(0);
        combo_merk.setSelectedIndex(-1);
        txHarga.setText("");
        txJumlah.setText("");
        txTotal.setText("");
        txNama.setText("");
        txAlamat.setText("");
        txHp.setText("");
    }
    
    private boolean comboKategoriCheck(String check) {
        return combo_kategori.getSelectedItem().equals(check);
    }
    
    private boolean comboMerkCheck(String check) {
        return combo_merk.getSelectedItem().equals(check);
    }

    private void updateDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATACONN, USERNAME, PASSWORD);

            String query = "select * from app";

            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet rs = statement.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            int q = stData.getColumnCount();

            DefaultTableModel recordTable = (DefaultTableModel) tableData.getModel();
            recordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("ID"));
                    columnData.add(rs.getString("kategori"));
                    columnData.add(rs.getString("merk"));
                    columnData.add(rs.getString("harga"));
                    columnData.add(rs.getString("jumlah"));
                    columnData.add(rs.getString("total"));
                    columnData.add(rs.getString("nama"));
                    columnData.add(rs.getString("alamat"));
                    columnData.add(rs.getString("hp"));
                    columnData.add(rs.getString("tanggal"));
                }
                recordTable.addRow(columnData);

            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearText();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATACONN, USERNAME, PASSWORD);

            String query = "insert into app(kategori, merk, harga, jumlah, total, nama, alamat, hp) values (?,?,?,?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, combo_kategori.getSelectedItem().toString());
            statement.setString(2, combo_merk.getSelectedItem().toString());
            statement.setString(3, txHarga.getText());
            statement.setString(4, txJumlah.getText());
            statement.setString(5, txTotal.getText());
            statement.setString(6, txNama.getText());
            statement.setString(7, txAlamat.getText());
            statement.setString(8, txHp.getText());

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Added");
            updateDB();

            clearText();

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
      
    private void combo_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_kategoriActionPerformed
        String[] makananKucing = {"Bold", "Me-O", "Royal Canin", "Pro Plan", "Whiskas"};
        String[] makananAnjing = {"Pedigree", "Pro Plan", "Equilibrio"};
        String[] makananBurung = {"Fancy 9 Star", "Amazonian", "Fancy Love", "Tropical Carnival"};
        String[] makananKambing = {"Ramban"};
        String[] makananSapi = {"Suket / Rumput"};

        if (comboKategoriCheck("Makanan Kucing")) {
            combo_merk.setEnabled(true);
            combo_merk.removeAllItems();
            for(String s : makananKucing) {
                combo_merk.addItem(s);
            }
        } else if (comboKategoriCheck("Makanan Anjing")) {
            combo_merk.setEnabled(true);
            combo_merk.removeAllItems();
            for(String s : makananAnjing) {
                combo_merk.addItem(s);
            }
        } else if (comboKategoriCheck("Makanan Kambing")) {
            combo_merk.setEnabled(true);
            combo_merk.removeAllItems();
            for(String s : makananKambing) {
                combo_merk.addItem(s);
            }
        } else if (comboKategoriCheck("Makanan Sapi")) {
            combo_merk.setEnabled(true);
            combo_merk.removeAllItems();
            for(String s : makananSapi) {
                combo_merk.addItem(s);
            }
        } else if (comboKategoriCheck("Makanan Burung")) {
            combo_merk.setEnabled(true);
            combo_merk.removeAllItems();
            for(String s : makananBurung) {
                combo_merk.addItem(s);
            }            
        } 
    }//GEN-LAST:event_combo_kategoriActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        int jumlah = Integer.parseInt(txJumlah.getText());
        int harga = Integer.parseInt(txHarga.getText());

        int totalAkhir = total(harga, jumlah);
        String totalAkhirSt = String.valueOf(totalAkhir);
        txTotal.setText(totalAkhirSt);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        updateDB();
    }//GEN-LAST:event_btnShowActionPerformed
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableData.getModel());
        tableData.setRowSorter(rowSorter);
        String text = txSearch.getText();
        
        if(text.trim().length() == 0) {
            rowSorter.setRowFilter(null);
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        DefaultTableModel recordTable = (DefaultTableModel) tableData.getModel();
        int selectedRows = tableData.getSelectedRow();

        combo_kategori.setSelectedItem(recordTable.getValueAt(selectedRows, 1).toString());
        combo_merk.setSelectedItem(recordTable.getValueAt(selectedRows, 2).toString());
        txHarga.setText(recordTable.getValueAt(selectedRows, 3).toString());
        txJumlah.setText(recordTable.getValueAt(selectedRows, 4).toString());
        txTotal.setText(recordTable.getValueAt(selectedRows, 5).toString());
        txNama.setText(recordTable.getValueAt(selectedRows, 6).toString());
        txAlamat.setText(recordTable.getValueAt(selectedRows, 7).toString());
        txHp.setText(recordTable.getValueAt(selectedRows, 8).toString());
    }//GEN-LAST:event_tableDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int selectedRows = tableData.getSelectedRow();

        try {
            String cell = tableData.getValueAt(selectedRows, 0).toString();

            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to delete this data?", "Kyuubi Pet Shop",
                    JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(DATACONN, USERNAME, PASSWORD);

                String query = "delete from app where id = ?";

                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, cell);

                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Deleted");
                updateDB();

                clearText();
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Delete Failed");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DATACONN, USERNAME, PASSWORD);

            String query = "update app set kategori=?, merk=?, harga=?, jumlah=?, total=?, nama= ?, alamat=?, hp=? where id=?";

            int row = tableData.getSelectedRow();
            String cell = tableData.getValueAt(row, 0).toString();

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, combo_kategori.getSelectedItem().toString());
            statement.setString(2, combo_merk.getSelectedItem().toString());
            statement.setString(3, txHarga.getText());
            statement.setString(4, txJumlah.getText());
            statement.setString(5, txTotal.getText());
            statement.setString(6, txNama.getText());
            statement.setString(7, txAlamat.getText());
            statement.setString(8, txHp.getText());
            statement.setString(9, cell);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");
            updateDB();

            clearText();

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the program?", "Pet Care",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed
  
    private void combo_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_sortActionPerformed
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableData.getModel());
        tableData.setRowSorter(sorter);
        List <RowSorter.SortKey> sortKeys = new ArrayList<>();
                
        int columnIndexSort = 9;
        
        if(combo_sort.getSelectedItem().equals("Ascending")) {
            sortKeys.add(new RowSorter.SortKey(columnIndexSort, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
            sorter.sort();
        }else {
            sortKeys.add(new RowSorter.SortKey(columnIndexSort, SortOrder.DESCENDING));
            sorter.setSortKeys(sortKeys);
            sorter.sort();
        }
    }//GEN-LAST:event_combo_sortActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tableData.getModel());
        tableData.setRowSorter(rowSorter);
        String text = txSearch.getText();
        
        if(text.trim().length() != 0) {
            rowSorter.setRowFilter(null);
            txSearch.setText("");
        } else {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportApp.jasper"), null, Koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        Purchase purchase = new Purchase();
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableData.getModel());
        tableData.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();

        int columnIndexSort = 9;

        sortKeys.add(new RowSorter.SortKey(columnIndexSort, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();
        
        String purchaseID = tableData.getValueAt(0, 0).toString();
        String purchaseTotal = tableData.getValueAt(0, 5).toString();
        String purchaseNama = tableData.getValueAt(0, 6).toString();
        
        purchase.txId.setText(purchaseID);
        purchase.txNama.setText(purchaseNama);
        purchase.txTotal.setText(purchaseTotal);
        
        purchase.show();
        setVisible(false);
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        MakananKucing[] kucing = new MakananKucing[5];
        kucing[0] = new MakananKucing("Bold", "21000");
        kucing[1] = new MakananKucing("Me-O", "48000");
        kucing[2] = new MakananKucing("Royal Canin", "200000");
        kucing[3] = new MakananKucing("Pro Plan", "97000");
        kucing[4] = new MakananKucing("Whiskas", "80000");  
        for(MakananKucing ob : kucing) {
            if(comboMerkCheck(ob.getMerk())) {
                txHarga.setText(ob.getHarga());
            }
        }
        
        MakananAnjing[] anjing = new MakananAnjing[3];
        anjing[0] = new MakananAnjing("Pedigree", "67000");
        anjing[1] = new MakananAnjing("Pro Plan", "107000");
        anjing[2] = new MakananAnjing("Equilibrio", "135000");
        for(MakananAnjing ob : anjing) {
            if(comboMerkCheck(ob.getMerk())) {
                txHarga.setText(ob.getHarga());
            }
        }
        
        MakananBurung[] burung = new MakananBurung[4];
        burung[0] = new MakananBurung("Fancy 9 Star", "17000");
        burung[1] = new MakananBurung("Amazonian", "100000");
        burung[2] = new MakananBurung("Fancy Love", "12000");
        burung[3] = new MakananBurung("Tropical Carnival", "130000");
        for(MakananBurung ob : burung) {
            if(comboMerkCheck(ob.getMerk())) {
                txHarga.setText(ob.getHarga());
            }
        }
        
        MakananKambing[] kambing = new MakananKambing[1];
        kambing[0] = new MakananKambing("Ramban", "10000");
        for(MakananKambing ob : kambing) {
            if(comboMerkCheck(ob.getMerk())) {
                txHarga.setText(ob.getHarga());
            }
        }
        
        MakananSapi[] sapi = new MakananSapi[1];
        sapi[0] = new MakananSapi("Suket / Rumput", "15000");
        for(MakananSapi ob : sapi) {
            if(comboMerkCheck(ob.getMerk())) {
                txHarga.setText(ob.getHarga());
            }
        }
    }//GEN-LAST:event_btnRefreshActionPerformed
 
    private void txHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHargaActionPerformed
        
    }//GEN-LAST:event_txHargaActionPerformed

    private void txTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTotalKeyReleased
       
    }//GEN-LAST:event_txTotalKeyReleased

    private void txJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txJumlahKeyPressed
        
    }//GEN-LAST:event_txJumlahKeyPressed

    private void txJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txJumlahKeyReleased
     
    }//GEN-LAST:event_txJumlahKeyReleased

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(
                    new FlatDarculaLaf()
            );
        } catch (Exception e) {
            System.out.println(e);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> combo_kategori;
    private javax.swing.JComboBox<String> combo_merk;
    private javax.swing.JComboBox<String> combo_sort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableData;
    private javax.swing.JTextField txAlamat;
    private javax.swing.JTextField txHarga;
    private javax.swing.JTextField txHp;
    private javax.swing.JTextField txJumlah;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txSearch;
    private javax.swing.JTextField txTotal;
    // End of variables declaration//GEN-END:variables
}
