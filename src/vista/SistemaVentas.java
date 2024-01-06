
package vista;
import com.sun.xml.internal.ws.client.ContentNegotiation;
import conexion.ConexionBD;
import java.awt.event.KeyEvent;
import pojos.Usuario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;
import pojos.Cliente;
import pojos.Producto;
import pojos.Proveedor;
import pojos.Venta;


public class SistemaVentas extends javax.swing.JFrame {
    //objeto que reañliza conexion a base de datos
    ConexionBD conBD=new ConexionBD();
    //objeto que genera"h" usuarios
    Usuario objetoUsuarioN = new Usuario();
    Cliente objetoClienteN = new Cliente();
    Proveedor objetoProveN = new Proveedor();
    Producto objetoProdN = new Producto();
    Venta objetoVentaN = new Venta();
    int item;
    DefaultTableModel modelo = new DefaultTableModel();
        
    public SistemaVentas() {
        initComponents();
        //centra la aplicacion a la pantalla
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Venta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        lblCodVenta = new javax.swing.JLabel();
        lblCantVenta = new javax.swing.JLabel();
        lblDescVenta = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        txtCodVenta = new javax.swing.JTextField();
        txtCantVenta = new javax.swing.JTextField();
        txtDescVenta = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalleVenta = new javax.swing.JTable();
        lblStocVenta = new javax.swing.JLabel();
        txtStockVenta = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcFormaPago = new javax.swing.JComboBox<>();
        txtDescuento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtFechaVenta = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        lblFolio = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblRfcCliente = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblCpCliente = new javax.swing.JLabel();
        lblTelCliente = new javax.swing.JLabel();
        lblMailCliente = new javax.swing.JLabel();
        txtRfcCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtDirCliente = new javax.swing.JTextField();
        txtCodposCliente = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JTextField();
        txtMailCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConsulCliente = new javax.swing.JTable();
        btnReporteCliente = new javax.swing.JButton();
        btnAltaCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        btnLimpiaCliente = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        btnEditaCliente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtConsulProve = new javax.swing.JTable();
        lblRfcProve = new javax.swing.JLabel();
        txtRfcProve = new javax.swing.JTextField();
        lblNombreProve = new javax.swing.JLabel();
        txtNombreProve = new javax.swing.JTextField();
        lblDirecProve = new javax.swing.JLabel();
        txtDirProve = new javax.swing.JTextField();
        lblCpProve = new javax.swing.JLabel();
        txtCpProve = new javax.swing.JTextField();
        lblTelProve = new javax.swing.JLabel();
        txtTelProve = new javax.swing.JTextField();
        lblMailProve = new javax.swing.JLabel();
        txtMailProve = new javax.swing.JTextField();
        lblIdProve = new javax.swing.JLabel();
        txtIdProve = new javax.swing.JTextField();
        btnLimpiaProve = new javax.swing.JButton();
        btnAltaProve = new javax.swing.JButton();
        btnBuscarProve = new javax.swing.JButton();
        btnEditarProve = new javax.swing.JButton();
        btnActualizarProve = new javax.swing.JButton();
        btnEliminarProve = new javax.swing.JButton();
        btnReporteProve = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lblCodigoProd = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPrecioProd = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblDescProd = new javax.swing.JLabel();
        txtDescipcion = new javax.swing.JTextField();
        lblProveedor = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConsulProd = new javax.swing.JTable();
        jcProve = new javax.swing.JComboBox<>();
        btnAltaProd = new javax.swing.JButton();
        btnBuscaProd = new javax.swing.JButton();
        btnActProd = new javax.swing.JButton();
        btnEliminaProd = new javax.swing.JButton();
        btnRepoProd = new javax.swing.JButton();
        lblIdProd = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        btnLimpiaProd = new javax.swing.JButton();
        btnEditaProd = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblIdUsuario = new javax.swing.JLabel();
        btnAltaUsuario = new javax.swing.JButton();
        btnBuscaUsuario = new javax.swing.JButton();
        btnActualizaUsuario = new javax.swing.JButton();
        btnElimUsuario = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtConsulUsuario = new javax.swing.JTable();
        btnLimpiaUsuario = new javax.swing.JButton();
        btnEditaUsuario = new javax.swing.JButton();
        btnRepoUsuario = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 220, 207));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(228, 220, 207));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoBoutique200px.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(100, 99, 97));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        jButton1.setText("    Usuarios");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Venta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Venta.setForeground(new java.awt.Color(100, 99, 97));
        Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.png"))); // NOI18N
        Venta.setText("       Venta");
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(100, 99, 97));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor.png"))); // NOI18N
        jButton3.setText("Proveedores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(100, 99, 97));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jButton4.setText("   Productos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Clientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Clientes.setForeground(new java.awt.Color(100, 99, 97));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        Clientes.setText("      Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addComponent(Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 760));

        jPanel4.setBackground(new java.awt.Color(228, 220, 207));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 99, 97));
        jLabel2.setText("Punto de venta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(643, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 0, 1100, 140));

        jTabbedPane1.setBackground(new java.awt.Color(233, 156, 159));

        jPanel5.setBackground(new java.awt.Color(195, 226, 194));

        lblCodVenta.setText("Codigo");

        lblCantVenta.setText("Cantidad");

        lblDescVenta.setText("Descripcion");

        lblPrecioVenta.setText("Precio");

        txtCodVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodVentaActionPerformed(evt);
            }
        });
        txtCodVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodVentaKeyPressed(evt);
            }
        });

        txtCantVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantVentaActionPerformed(evt);
            }
        });
        txtCantVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantVentaKeyPressed(evt);
            }
        });

        txtPrecioVenta.setEditable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cantidad", "Descripcion", "Precio", "Descuento", "Total"
            }
        ));
        jScrollPane1.setViewportView(jtDetalleVenta);

        lblStocVenta.setText("Stock");

        txtStockVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockVentaActionPerformed(evt);
            }
        });

        txtTotalPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });

        jLabel7.setText("Forma de pago: ");

        jcFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta debito", "Tarjeta credito" }));
        jcFormaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFormaPagoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descuento");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkout.png"))); // NOI18N
        jButton5.setText("Total a pagar:");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        jButton7.setText("Imprimir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtFechaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaVentaMouseClicked(evt);
            }
        });
        txtFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVentaActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha:");

        lblFolio.setText("Folio:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jcFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(58, 58, 58)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtCodVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lblCodVenta)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantVenta))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblDescVenta)
                                .addGap(158, 158, 158)
                                .addComponent(lblPrecioVenta)
                                .addGap(71, 71, 71)
                                .addComponent(lblStocVenta))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDescVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblFecha)
                                        .addGap(5, 5, 5)
                                        .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFolio))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodVenta)
                            .addComponent(lblDescVenta)
                            .addComponent(lblPrecioVenta)
                            .addComponent(lblStocVenta)
                            .addComponent(jLabel3)
                            .addComponent(lblCantVenta))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFolio))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalPagar)
                    .addComponent(jLabel7)
                    .addComponent(jcFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("1", jPanel5);

        jPanel6.setBackground(new java.awt.Color(195, 226, 195));

        lblRfcCliente.setText("RFC:");

        lblNombreCliente.setText("Nombre o Razon social:");

        lblDireccionCliente.setText("Direccion:");

        lblCpCliente.setText("CP.:");

        lblTelCliente.setText("Telefono:");

        lblMailCliente.setText("Email:");

        jtConsulCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RFC", "Nombre/Razon Soc", "Direccion", "CP", "Telefono", "Email"
            }
        ));
        jScrollPane3.setViewportView(jtConsulCliente);
        if (jtConsulCliente.getColumnModel().getColumnCount() > 0) {
            jtConsulCliente.getColumnModel().getColumn(0).setPreferredWidth(3);
            jtConsulCliente.getColumnModel().getColumn(1).setPreferredWidth(15);
            jtConsulCliente.getColumnModel().getColumn(4).setPreferredWidth(8);
            jtConsulCliente.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        btnReporteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnReporteCliente.setText("Reporte");
        btnReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteClienteActionPerformed(evt);
            }
        });

        btnAltaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnAltaCliente.setText("Alta Cliente");
        btnAltaCliente.setToolTipText("");
        btnAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setToolTipText("Ingresa ID a eliminar");
        btnEliminarCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        btnBuscarCliente.setText("     Buscar");
        btnBuscarCliente.setToolTipText("Ingresa el ID del cliente a buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnLimpiaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiaCliente.setText("    Limpiar");
        btnLimpiaCliente.setToolTipText("");
        btnLimpiaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaClienteActionPerformed(evt);
            }
        });

        lblIdCliente.setText("ID Cliente:");

        btnEditaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditaCliente.setText("    Editar");
        btnEditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRfcCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccionCliente)
                                    .addComponent(lblTelCliente))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(lblMailCliente)
                                        .addGap(30, 30, 30)
                                        .addComponent(txtMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtDirCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCpCliente)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodposCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtNombreCliente)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnEditaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnLimpiaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAltaCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReporteCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRfcCliente)
                            .addComponent(txtRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodposCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpCliente)
                            .addComponent(txtDirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelCliente)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMailCliente)
                                .addComponent(txtMailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("2", jPanel6);

        jPanel7.setBackground(new java.awt.Color(195, 226, 196));

        jtConsulProve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RFC", "Nombre/Razon Soc", "Direccion", "CP", "Telefono", "Email"
            }
        ));
        jScrollPane4.setViewportView(jtConsulProve);
        if (jtConsulProve.getColumnModel().getColumnCount() > 0) {
            jtConsulProve.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtConsulProve.getColumnModel().getColumn(1).setPreferredWidth(10);
            jtConsulProve.getColumnModel().getColumn(4).setPreferredWidth(8);
            jtConsulProve.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        lblRfcProve.setText("RFC:");

        lblNombreProve.setText("Nombre o Razon social:");

        lblDirecProve.setText("Direccion:");

        lblCpProve.setText("CP.:");

        lblTelProve.setText("Telefono:");

        lblMailProve.setText("Email:");

        lblIdProve.setText("ID Proveedor:");

        btnLimpiaProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiaProve.setText("    Limpiar");
        btnLimpiaProve.setToolTipText("");
        btnLimpiaProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaProveActionPerformed(evt);
            }
        });

        btnAltaProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnAltaProve.setText("Alta Proveedor");
        btnAltaProve.setToolTipText("");
        btnAltaProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaProveActionPerformed(evt);
            }
        });

        btnBuscarProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        btnBuscarProve.setText("     Buscar");
        btnBuscarProve.setToolTipText("Ingresa el ID del cliente a buscar");
        btnBuscarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveActionPerformed(evt);
            }
        });

        btnEditarProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditarProve.setText("    Editar");
        btnEditarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveActionPerformed(evt);
            }
        });

        btnActualizarProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizarProve.setText("Actualizar");
        btnActualizarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveActionPerformed(evt);
            }
        });

        btnEliminarProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminarProve.setText("Eliminar");
        btnEliminarProve.setToolTipText("Ingresa ID a eliminar");
        btnEliminarProve.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarProvenone(evt);
            }
        });
        btnEliminarProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveActionPerformed(evt);
            }
        });

        btnReporteProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnReporteProve.setText("Reporte");
        btnReporteProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(lblNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lblDirecProve)
                                .addGap(27, 27, 27)
                                .addComponent(txtDirProve, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCpProve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpProve, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblTelProve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelProve, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(lblMailProve)
                                .addGap(18, 18, 18)
                                .addComponent(txtMailProve, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lblIdProve)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdProve, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRfcProve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRfcProve, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiaProve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAltaProve, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnBuscarProve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReporteProve, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarProve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarProve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRfcProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRfcProve)
                            .addComponent(txtIdProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdProve))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDirecProve)
                            .addComponent(txtDirProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpProve)
                            .addComponent(txtCpProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelProve)
                            .addComponent(txtTelProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMailProve)
                            .addComponent(txtMailProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnLimpiaProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAltaProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnBuscarProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarProve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReporteProve))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("3", jPanel7);

        jPanel8.setBackground(new java.awt.Color(195, 226, 194));

        lblCodigoProd.setText("Codigo:");

        lblPrecioProd.setText("Precio:");
        lblPrecioProd.setToolTipText("");

        lblDescProd.setText("Descripcion:");

        lblProveedor.setText("Proveedor:");

        lblCantidad.setText("Cantidad:");

        jtConsulProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Descripcion", "Cantidad", "Precio", "Proveedor"
            }
        ));
        jScrollPane2.setViewportView(jtConsulProd);
        if (jtConsulProd.getColumnModel().getColumnCount() > 0) {
            jtConsulProd.getColumnModel().getColumn(0).setPreferredWidth(5);
            jtConsulProd.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtConsulProd.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jcProve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jcProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProveActionPerformed(evt);
            }
        });

        btnAltaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnAltaProd.setText("Alta Prod");
        btnAltaProd.setToolTipText("");
        btnAltaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaProdActionPerformed(evt);
            }
        });

        btnBuscaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarProducto.png"))); // NOI18N
        btnBuscaProd.setText("Buscar");
        btnBuscaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdActionPerformed(evt);
            }
        });

        btnActProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActProd.setText("Actualizar");
        btnActProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActProdActionPerformed(evt);
            }
        });

        btnEliminaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminaProd.setText("Eliminar");
        btnEliminaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProdActionPerformed(evt);
            }
        });

        btnRepoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnRepoProd.setText("Reporte");

        lblIdProd.setText("ID producto:");

        btnLimpiaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiaProd.setText("    Limpiar");
        btnLimpiaProd.setToolTipText("");
        btnLimpiaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaProdActionPerformed(evt);
            }
        });

        btnEditaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditaProd.setText("    Editar");
        btnEditaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescProd)
                            .addComponent(lblCantidad)
                            .addComponent(lblProveedor)
                            .addComponent(lblIdProd))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodigoProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDescipcion)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio))
                            .addComponent(jcProve, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(btnLimpiaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(btnRepoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAltaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdProd)
                            .addComponent(btnRepoProd)
                            .addComponent(btnAltaProd)
                            .addComponent(btnBuscaProd)
                            .addComponent(lblCodigoProd)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDescProd)
                                    .addComponent(txtDescipcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCantidad)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEditaProd)
                                .addComponent(btnActProd)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProveedor)
                            .addComponent(jcProve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiaProd)
                            .addComponent(btnEliminaProd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("4", jPanel8);

        jPanel9.setBackground(new java.awt.Color(195, 226, 194));

        lblUsuario.setText("Usuario:");

        lblPass.setText("Password:");

        lblIdUsuario.setText("ID Usuario:");

        btnAltaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnAltaUsuario.setText("Alta Usuario");
        btnAltaUsuario.setToolTipText("");
        btnAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuarioActionPerformed(evt);
            }
        });

        btnBuscaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarCliente.png"))); // NOI18N
        btnBuscaUsuario.setText("Buscar");
        btnBuscaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaUsuarioActionPerformed(evt);
            }
        });

        btnActualizaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizaUsuario.setText("Actualizar");
        btnActualizaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaUsuarioActionPerformed(evt);
            }
        });

        btnElimUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnElimUsuario.setText("Eliminar");
        btnElimUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimUsuarioActionPerformed(evt);
            }
        });

        txtPass.setText("jPasswordField1");

        jtConsulUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id usuario", "Nombre", "Password"
            }
        ));
        jScrollPane5.setViewportView(jtConsulUsuario);

        btnLimpiaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiaUsuario.setText("    Limpiar");
        btnLimpiaUsuario.setToolTipText("");
        btnLimpiaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaUsuarioActionPerformed(evt);
            }
        });

        btnEditaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnEditaUsuario.setText("    Editar");
        btnEditaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaUsuarioActionPerformed(evt);
            }
        });

        btnRepoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btnRepoUsuario.setText("Reporte");
        btnRepoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnLimpiaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnElimUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAltaUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRepoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(176, 176, 176))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblIdUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(lblUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUsuario)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimUsuario)
                    .addComponent(btnLimpiaUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepoUsuario)
                    .addComponent(btnActualizaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaUsuario)
                    .addComponent(btnEditaUsuario)
                    .addComponent(btnAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("5", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 162, 1080, 600));
        jTabbedPane1.getAccessibleContext().setAccessibleName("1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_VentaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        conBD.conectarBase();
        try {//inicia try
            objetoClienteN.setIdcliente(Integer.parseInt(txtIdCliente.getText()));
            //cursor es la busqueda de un campo distintivo
            conBD.rs = conBD.stmt.executeQuery("SELECT * from clientes where idcliente ='" + objetoClienteN.getIdcliente() + "'");
            JOptionPane.showMessageDialog(null, "Buscando cliente espere");
            if (conBD.rs.next() == true) {//inicia if
                //imprime los datos del usuario encontrado en campos de texto
                txtRfcCliente.setText(conBD.rs.getString("rfc"));
                txtNombreCliente.setText(conBD.rs.getString("nombre"));
                txtDirCliente.setText(conBD.rs.getString("direccion"));
                txtCodposCliente.setText(conBD.rs.getString("codpostal"));
                txtTelCliente.setText(conBD.rs.getString("telefono"));
                txtMailCliente.setText(conBD.rs.getString("email"));

                JOptionPane.showMessageDialog(null, "Registro encontrado\n Modifica los campos\nnecesarios");
            } else {
                JOptionPane.showMessageDialog(null, "no existe el cliente verifica ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en busqueda: " + e);
        }//termina catch
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaClienteActionPerformed
        //llamada a la conexion
        conBD.conectarBase();
        //guardar en objetos los valores capturados en el formulario
        objetoClienteN.setIdcliente(Integer.parseInt(txtIdCliente.getText()));
        objetoClienteN.setRfc(txtRfcCliente.getText());
        objetoClienteN.setNombre(txtNombreCliente.getText());
        objetoClienteN.setDireccion(txtDirCliente.getText());
        objetoClienteN.setCodpostal(txtCodposCliente.getText());
        objetoClienteN.setTelefono(txtTelCliente.getText());
        objetoClienteN.setEmail(txtMailCliente.getText());

        String altaCliente = "INSERT INTO CLIENTES VALUES ('" + objetoClienteN.getIdcliente() + "','" + objetoClienteN.getRfc() + "','" + objetoClienteN.getNombre() + "','" + objetoClienteN.getDireccion() + "', '" + objetoClienteN.getCodpostal() + "','" + objetoClienteN.getTelefono() + "', '" + objetoClienteN.getEmail() + "')";
        try {
            conBD.stmt.executeUpdate(altaCliente);
            JOptionPane.showMessageDialog(null, "Se registro cliente con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, verifica" + e);
        }
    }//GEN-LAST:event_btnAltaClienteActionPerformed

    private void jcFormaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFormaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcFormaPagoActionPerformed

    private void btnAltaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaProdActionPerformed
        //llamada a la conexion
        conBD.conectarBase();
        //guardar en objetos los valores capturados en el formulario
        objetoProdN.setIdProd(Integer.parseInt(txtIdProd.getText()));
        objetoProdN.setCodigo(txtCodigo.getText());
        objetoProdN.setDescrip(txtDescipcion.getText());
        objetoProdN.setProveedor(jcProve.getSelectedItem().toString());
        objetoProdN.setStock(Integer.parseInt(txtCant.getText()));
        objetoProdN.setPrecio(Float.parseFloat(txtPrecio.getText()));
        
        String altaProd = "INSERT INTO PRODUCTOS VALUES ('" + objetoProdN.getIdProd()+ "','" + objetoProdN.getCodigo()+ "','" + objetoProdN.getDescrip()+ "','" + objetoProdN.getProveedor() + "', '" + objetoProdN.getStock()+ "','" + objetoProdN.getPrecio()+ "')";
        try {
            conBD.stmt.executeUpdate(altaProd);
            JOptionPane.showMessageDialog(null, "Se registro PRODUCTO con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, verifica" + e);
        }        
    }//GEN-LAST:event_btnAltaProdActionPerformed

    private void btnBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdActionPerformed
        conBD.conectarBase();
        try {//inicia try
            objetoProdN.setIdProd(Integer.parseInt(txtIdProd.getText()));
            //cursor es la busqueda de un campo distintivo
            conBD.rs = conBD.stmt.executeQuery("SELECT * from productos where idproducto ='" + objetoProdN.getIdProd()+ "'");
            JOptionPane.showMessageDialog(null, "Buscando PRODUCTO espere");
            if (conBD.rs.next() == true) {//inicia if
                //imprime los datos del usuario encontrado en campos de texto
                txtIdProd.setText(conBD.rs.getString("idproducto"));
                txtCodigo.setText(conBD.rs.getString("codigo"));
                txtDescipcion.setText(conBD.rs.getString("descripcion"));
                txtCant.setText(conBD.rs.getString("stock"));
                txtPrecio.setText(conBD.rs.getString("precio"));
                //jcProve.setText(conBD.rs.getString("proveedor"));

                JOptionPane.showMessageDialog(null, "Registro encontrado\n Modifica los campos\nnecesarios");
            } else {
                JOptionPane.showMessageDialog(null, "no existe el cliente verifica ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en busqueda: " + e);
        }//termina catch
    }//GEN-LAST:event_btnBuscaProdActionPerformed

    private void btnAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUsuarioActionPerformed
        //llamada a la conexion
        conBD.conectarBase();
        //guardar en objetos los valores capturados en el formulario
        objetoUsuarioN.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        objetoUsuarioN.setUsuario(txtUsuario.getText());
        objetoUsuarioN.setPassword(txtPass.getText());
        
        String altaUsuario = "INSERT INTO USUARIOSIS VALUES ('" + objetoUsuarioN.getIdUsuario() + "','" + objetoUsuarioN.getUsuario()+ "','" + objetoUsuarioN.getPassword()+ "')";
        try {
            conBD.stmt.executeUpdate(altaUsuario);
            JOptionPane.showMessageDialog(null, "Se registro USUARIO con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, verifica" + e);
        }
    }//GEN-LAST:event_btnAltaUsuarioActionPerformed

    private void btnBuscaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaUsuarioActionPerformed
        conBD.conectarBase();
        try {//inicia try
            objetoUsuarioN.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
            //cursor es la busqueda de un campo distintivo
            conBD.rs = conBD.stmt.executeQuery("SELECT * from usuariosis where idusuariosis ='" + objetoUsuarioN.getIdUsuario()+ "'");
            JOptionPane.showMessageDialog(null, "Buscando USUARIO espere");
            if (conBD.rs.next() == true) {//inicia if
                //imprime los datos del usuario encontrado en campos de texto
                txtIdUsuario.setText(conBD.rs.getString("idusuariosis"));
                txtUsuario.setText(conBD.rs.getString("usuariosis"));
                txtPass.setText(conBD.rs.getString("passsis"));
                

                JOptionPane.showMessageDialog(null, "Registro encontrado\n Modifica los campos\n  necesarios");
            } else {
                JOptionPane.showMessageDialog(null, "no existe el USUARIO verifica ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en busqueda: " + e);
        }//termina catch  
    }//GEN-LAST:event_btnBuscaUsuarioActionPerformed

    private void btnLimpiaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaClienteActionPerformed
        txtIdCliente.setText(null);
        txtRfcCliente.setText(null);
        txtNombreCliente.setText(null);
        txtDirCliente.setText(null);
        txtCodposCliente.setText(null);
        txtTelCliente.setText(null);
        txtMailCliente.setText(null);
    }//GEN-LAST:event_btnLimpiaClienteActionPerformed

    private void btnEditaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaClienteActionPerformed
        conBD.conectarBase();
        try {
            objetoClienteN.setIdcliente(Integer.parseInt(txtIdCliente.getText()));
            objetoClienteN.setRfc(txtRfcCliente.getText());
            objetoClienteN.setNombre(txtNombreCliente.getText());
            objetoClienteN.setDireccion(txtDirCliente.getText());
            objetoClienteN.setCodpostal(txtCodposCliente.getText());
            objetoClienteN.setTelefono(txtTelCliente.getText());
            objetoClienteN.setEmail(txtMailCliente.getText());

            String editarCliente = "UPDATE clientes SET idcliente= '" + objetoClienteN.getIdcliente() + "', rfc='" + objetoClienteN.getRfc() + "', nombre= '" + objetoClienteN.getNombre() + "', direccion='" + objetoClienteN.getDireccion() + "', codpostal= '" + objetoClienteN.getCodpostal() + "', telefono='" + objetoClienteN.getTelefono() + "', email='" + objetoClienteN.getEmail() + "' where idcliente = '" + objetoClienteN.getIdcliente() + "'";
            conBD.stmt.executeUpdate(editarCliente);
            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en edicion" + e);
        }
    }//GEN-LAST:event_btnEditaClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        conBD.conectarBase();//llamada a la conexion
        //objeto table model para el manejo de datos
        DefaultTableModel modeloDatos = new DefaultTableModel();
        jtConsulCliente.setModel(modeloDatos);//manda datos totales

        try {
            conBD.rs = conBD.stmt.executeQuery("select * from clientes");
            ResultSetMetaData rsmd = conBD.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("ID");
            modeloDatos.addColumn("RFC");
            modeloDatos.addColumn("NOMBRE");
            modeloDatos.addColumn("DIRECCION");
            modeloDatos.addColumn("COD POSTAL");
            modeloDatos.addColumn("TELEFONO");
            modeloDatos.addColumn("EMAIL");

            //PARA MOSTRAR REGISTROS
            while (conBD.rs.next()) {
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for para mandar los resultados
                    fila[i] = conBD.rs.getObject(i + 1);
                }//termina for para mandar resultados
                modeloDatos.addRow(fila);//agrega nueva fila

            }//termina while

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta" + ex);
        }
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        //llamada a la conexion de base de datos
        conBD.conectarBase();
        int confirmaBaja;
        try {
            //para guardar en el objeto el id cliente a eliminar
            objetoClienteN.setIdcliente(Integer.parseInt(txtIdCliente.getText()));
            confirmaBaja = conBD.stmt.executeUpdate("DELETE FROM clientes where idcliente = '" + objetoClienteN.getIdcliente() + "' ");
            
            if (confirmaBaja == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja con exito al cliente" + objetoClienteN.getIdcliente());
            } else {
                JOptionPane.showMessageDialog(null, "Error en eliminacion");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no existe cliente en base de datos");
        }        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        //pasar mouse poir el boton
        
    }//GEN-LAST:event_none

    private void btnReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteClienteActionPerformed
        conBD.conectarBase();
        try {
            String rutaReporte="src/informes/rptUsuarios.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,conBD.cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de Clientes");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteClienteActionPerformed

    private void btnLimpiaProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaProveActionPerformed
        txtIdProve.setText(null);
        txtRfcProve.setText(null);
        txtNombreProve.setText(null);
        txtDirProve.setText(null);
        txtCpProve.setText(null);
        txtTelProve.setText(null);
        txtMailProve.setText(null);
    }//GEN-LAST:event_btnLimpiaProveActionPerformed

    private void btnAltaProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaProveActionPerformed
    //llamada a la conexion
        conBD.conectarBase();
        //guardar en objetos los valores capturados en el formulario
        objetoProveN.setIdProve(Integer.parseInt(txtIdProve.getText()));
        objetoProveN.setRfcProve(txtRfcProve.getText());
        objetoProveN.setNombrePro(txtNombreProve.getText());
        objetoProveN.setDirProve(txtDirProve.getText());
        objetoProveN.setCodposProve(txtCpProve.getText());
        objetoProveN.setTelProve(txtTelProve.getText());
        objetoProveN.setMailProve(txtMailProve.getText());
        
        String altaProve = "INSERT INTO PROVEEDOR VALUES ('" + objetoProveN.getIdProve() + "','" + objetoProveN.getRfcProve()+ "','" + objetoProveN.getNombrePro() + "','" + objetoProveN.getDirProve()+ "', '" + objetoProveN.getCodposProve()+ "','" + objetoProveN.getTelProve()+ "', '" + objetoProveN.getMailProve()+ "')";
        try {
            conBD.stmt.executeUpdate(altaProve);
            JOptionPane.showMessageDialog(null,"Se registro proveedor con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error, verifica"+e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaProveActionPerformed

    private void btnBuscarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveActionPerformed
        conBD.conectarBase();
        try {//inicia try
            objetoProveN.setIdProve(Integer.parseInt(txtIdProve.getText()));
            //cursor es la busqueda de un campo distintivo
            conBD.rs = conBD.stmt.executeQuery("SELECT * from proveedor where idproveedor ='" + objetoProveN.getIdProve()+ "'");
            JOptionPane.showMessageDialog(null, "Buscando proveedor espere");
            if (conBD.rs.next() == true) {//inicia if
                //imprime los datos del usuario encontrado en campos de texto
                txtRfcProve.setText(conBD.rs.getString("rfcpro"));
                txtNombreProve.setText(conBD.rs.getString("nombrepro"));
                txtDirProve.setText(conBD.rs.getString("direccpro"));
                txtCpProve.setText(conBD.rs.getString("codpostalp"));
                txtTelProve.setText(conBD.rs.getString("telpro"));
                txtMailProve.setText(conBD.rs.getString("emailpro"));

                JOptionPane.showMessageDialog(null, "Registro encontrado\n Modifica los campos\nnecesarios");
            } else {
                JOptionPane.showMessageDialog(null, "no existe el proveedor verifica ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en busqueda: " + e);
        }//termina catch
    }//GEN-LAST:event_btnBuscarProveActionPerformed

    private void btnEditarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveActionPerformed
        conBD.conectarBase();
        try {
            objetoProveN.setIdProve(Integer.parseInt(txtIdProve.getText()));
            objetoProveN.setRfcProve(txtRfcProve.getText());
            objetoProveN.setNombrePro(txtNombreProve.getText());
            objetoProveN.setDirProve(txtDirProve.getText());
            objetoProveN.setCodposProve(txtCpProve.getText());
            objetoProveN.setTelProve(txtTelProve.getText());
            objetoProveN.setMailProve(txtMailProve.getText());

            String editarProve = "UPDATE proveedor SET idproveedor= '" + objetoProveN.getIdProve()+ "', rfcpro='" + objetoProveN.getRfcProve()+ "', nombrepro= '" + objetoProveN.getNombrePro()+ "', direccpro='" + objetoProveN.getDirProve()+ "', codpostalp= '" + objetoProveN.getCodposProve()+ "', telpro='" + objetoProveN.getTelProve()+ "', emailpro='" + objetoProveN.getMailProve()+ "' where idproveedor = '" + objetoProveN.getIdProve()+ "'";
            conBD.stmt.executeUpdate(editarProve);
            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en edicion" + e);
        }        
    }//GEN-LAST:event_btnEditarProveActionPerformed

    private void btnActualizarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveActionPerformed
        conBD.conectarBase();//llamada a la conexion
        //objeto table model para el manejo de datos
        DefaultTableModel modeloDatos = new DefaultTableModel();
        jtConsulProve.setModel(modeloDatos);//manda datos totales

        try {
            conBD.rs = conBD.stmt.executeQuery("select * from proveedor");
            ResultSetMetaData rsmd = conBD.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("ID");
            modeloDatos.addColumn("RFC");
            modeloDatos.addColumn("NOMBRE");
            modeloDatos.addColumn("DIRECCION");
            modeloDatos.addColumn("COD POSTAL");
            modeloDatos.addColumn("TELEFONO");
            modeloDatos.addColumn("EMAIL");

            //PARA MOSTRAR REGISTROS
            while (conBD.rs.next()) {
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for para mandar los resultados
                    fila[i] = conBD.rs.getObject(i + 1);
                }//termina for para mandar resultados
                modeloDatos.addRow(fila);//agrega nueva fila

            }//termina while

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta" + ex);
        }        
    }//GEN-LAST:event_btnActualizarProveActionPerformed

    private void btnEliminarProvenone(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProvenone
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProvenone

    private void btnEliminarProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveActionPerformed
        //llamada a la conexion de base de datos
        conBD.conectarBase();
        int confirmaBajaProve;
        try {
            //para guardar en el objeto el id cliente a eliminar
            objetoProveN.setIdProve(Integer.parseInt(txtIdProve.getText()));
            confirmaBajaProve = conBD.stmt.executeUpdate("DELETE FROM proveedor where idproveedor = '" + objetoProveN.getIdProve()+ "' ");

            if (confirmaBajaProve == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja con exito al proveedor" + objetoProveN.getIdProve());
            } else {
                JOptionPane.showMessageDialog(null, "Error en eliminacion");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no existe proveedor en base de datos");
        }
    }//GEN-LAST:event_btnEliminarProveActionPerformed

    private void btnReporteProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteProveActionPerformed

    private void btnLimpiaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaProdActionPerformed
        txtIdProd.setText(null);
        txtCodigo.setText(null);
        txtDescipcion.setText(null);
        txtCant.setText(null);
        txtPrecio.setText(null);
    }//GEN-LAST:event_btnLimpiaProdActionPerformed

    private void btnLimpiaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaUsuarioActionPerformed
        txtIdUsuario.setText(null);
        txtUsuario.setText(null);
        txtPass.setText(null);
    }//GEN-LAST:event_btnLimpiaUsuarioActionPerformed

    private void btnEditaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaUsuarioActionPerformed
        conBD.conectarBase();
        try {
            objetoUsuarioN.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
            objetoUsuarioN.setUsuario(txtUsuario.getText());
            objetoUsuarioN.setPassword(txtPass.getText());
            
            String editarUsuario = "UPDATE usuariosis SET idusuariosis= '" + objetoUsuarioN.getIdUsuario() + "', usuariosis='" + objetoUsuarioN.getUsuario()+ "', passsis= '" + objetoUsuarioN.getPassword()+ "'";
            conBD.stmt.executeUpdate(editarUsuario);
            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en edicion" + e);
        }       
    }//GEN-LAST:event_btnEditaUsuarioActionPerformed

    private void btnRepoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepoUsuarioActionPerformed
    conBD.conectarBase();
        try {
            String rutaReporte="src/informes/rptUsuario.jasper";
            JasperPrint rptlibrosPDF = JasperFillManager.fillReport(rutaReporte,null,conBD.cn);
            JasperViewer ventanaVisor = new JasperViewer(rptlibrosPDF,false);
            ventanaVisor.setTitle("Reporte de  Sistema Ventas");
            ventanaVisor.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en informe Verifica\n\n"+e);
        }
    }//GEN-LAST:event_btnRepoUsuarioActionPerformed

    private void btnActualizaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaUsuarioActionPerformed
        conBD.conectarBase();//llamada a la conexion
        //objeto table model para el manejo de datos
        DefaultTableModel modeloDatos = new DefaultTableModel();
        jtConsulUsuario.setModel(modeloDatos);//manda datos totales

        try {
            conBD.rs = conBD.stmt.executeQuery("select * from usuariosis");
            ResultSetMetaData rsmd = conBD.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("ID");
            modeloDatos.addColumn("USUARIO");
            modeloDatos.addColumn("PASSWORD");
            
            //PARA MOSTRAR REGISTROS
            while (conBD.rs.next()) {
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for para mandar los resultados
                    fila[i] = conBD.rs.getObject(i + 1);
                }//termina for para mandar resultados
                modeloDatos.addRow(fila);//agrega nueva fila

            }//termina while

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta" + ex);
        }
    }//GEN-LAST:event_btnActualizaUsuarioActionPerformed

    private void btnElimUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimUsuarioActionPerformed
//llamada a la conexion de base de datos
        conBD.conectarBase();
        int confirmaBajaU;
        try {
            //para guardar en el objeto el id cliente a eliminar
            objetoUsuarioN.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
            confirmaBajaU = conBD.stmt.executeUpdate("DELETE FROM usuariosis where idusuariosis = '" + objetoUsuarioN.getIdUsuario()+ "' ");

            if (confirmaBajaU == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja con exito al Usuario" + objetoUsuarioN.getIdUsuario());
            } else {
                JOptionPane.showMessageDialog(null, "Error en eliminacion");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no existe cliente en base de datos");
        }              
    }//GEN-LAST:event_btnElimUsuarioActionPerformed

    private void btnActProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActProdActionPerformed
    conBD.conectarBase();//llamada a la conexion
        //objeto table model para el manejo de datos
        DefaultTableModel modeloDatos = new DefaultTableModel();
        jtConsulProd.setModel(modeloDatos);//manda datos totales

        try {
            conBD.rs = conBD.stmt.executeQuery("select * from productos");
            ResultSetMetaData rsmd = conBD.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("ID");
            modeloDatos.addColumn("CODIGO");
            modeloDatos.addColumn("DESCRIPCION");
            modeloDatos.addColumn("PROVEEDOR");
            modeloDatos.addColumn("STOCK");
            modeloDatos.addColumn("PRECIO");
            
            //PARA MOSTRAR REGISTROS
            while (conBD.rs.next()) {
                Object fila[] = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for para mandar los resultados
                    fila[i] = conBD.rs.getObject(i + 1);
                }//termina for para mandar resultados
                modeloDatos.addRow(fila);//agrega nueva fila

            }//termina while

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta" + ex);
        }
    }//GEN-LAST:event_btnActProdActionPerformed

    private void jcProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProveActionPerformed

    }//GEN-LAST:event_jcProveActionPerformed

    private void btnEliminaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProdActionPerformed
        //llamada a la conexion de base de datos
        conBD.conectarBase();
        int confirmaBajaProd;
        try {
            //para guardar en el objeto el id cliente a eliminar
            objetoProdN.setIdProd(Integer.parseInt(txtIdProd.getText()));
            confirmaBajaProd = conBD.stmt.executeUpdate("DELETE FROM productos where idproducto = '" + objetoProdN.getIdProd()+ "' ");
            
            if (confirmaBajaProd == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja con exito el producto" + objetoProdN.getIdProd());
            } else {
                JOptionPane.showMessageDialog(null, "Error en eliminacion");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no existe PRODUCTO en base de datos");
        }        
    }//GEN-LAST:event_btnEliminaProdActionPerformed

    private void btnEditaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaProdActionPerformed
        conBD.conectarBase();
        try {
            objetoProdN.setIdProd(Integer.parseInt(txtIdProd.getText()));
            objetoProdN.setCodigo(txtCodigo.getText());
            objetoProdN.setDescrip(txtDescipcion.getText());
            objetoProdN.setStock(Integer.parseInt(txtCant.getText()));
            objetoProdN.setPrecio(Float.parseFloat(txtPrecio.getText()));
            objetoProdN.setProveedor(jcProve.getSelectedItem().toString());
            

            String editarProd = "UPDATE productos SET idproducto= '" + objetoProdN.getIdProd()+ "', codigo='" + objetoProdN.getCodigo()+ "', descripcion= '" + objetoProdN.getDescrip()+ "', proveedor='" + objetoProdN.getProveedor()+ "', stock= '" + objetoProdN.getStock()+ "', precio='" + objetoProdN.getPrecio()+ "' where idproducto = '" + objetoProdN.getIdProd()+ "'";
            conBD.stmt.executeUpdate(editarProd);
            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en edicion" + e);
        }
    }//GEN-LAST:event_btnEditaProdActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ClientesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodVentaActionPerformed
    conBD.conectarBase();
        try {//inicia try
            objetoProdN.setCodigo(txtCodVenta.getText());
            //cursor es la busqueda de un campo distintivo
            conBD.rs = conBD.stmt.executeQuery("SELECT * from productos where codigo ='" + objetoProdN.getCodigo()+ "'");
            //JOptionPane.showMessageDialog(null, "Buscando PRODUCTO espere");
            if (conBD.rs.next() == true) {//inicia if
                //imprime los datos del usuario encontrado en campos de texto
                txtDescVenta.setText(conBD.rs.getString("descripcion"));
                txtStockVenta.setText(conBD.rs.getString("stock"));
                txtPrecioVenta.setText(conBD.rs.getString("precio"));
                txtCantVenta.requestFocus();
                //JOptionPane.showMessageDialog(null, "Registro encontrado\n Modifica los campos\nnecesarios");
            } else {
                JOptionPane.showMessageDialog(null, "no existe el PRODUCTO verifica ");
                txtDescVenta.setText(null);
                txtStockVenta.setText(null);
                txtPrecioVenta.setText(null);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en busqueda: " + e);
        }//termina catch
    }//GEN-LAST:event_txtCodVentaActionPerformed

    private void txtCodVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodVentaKeyPressed
        
            
            
            
            
        
        
        
    }//GEN-LAST:event_txtCodVentaKeyPressed

    private void txtCantVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVentaActionPerformed

    private void txtCantVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantVentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtCantVenta.getText())) {
                String cod = txtCodVenta.getText();
                int cant = Integer.parseInt(txtCantVenta.getText());
                String descrip = txtDescVenta.getText();
                float preciov = Float.parseFloat(txtPrecioVenta.getText());
                int desc = Integer.parseInt(txtDescuento.getText());
                float totalv = cant * preciov - (preciov*desc/100);
                        
                JOptionPane.showMessageDialog(null, totalv);
                int stock = Integer.parseInt(txtStockVenta.getText());
                if (stock >= cant) {
                    modelo = (DefaultTableModel) jtDetalleVenta.getModel();
                    ArrayList lista = new ArrayList();
                    lista.add(cod);
                    lista.add(cant);
                    lista.add(descrip);
                    lista.add(preciov);
                    lista.add(desc);
                    lista.add(totalv);
                    JOptionPane.showMessageDialog(null,lista);
                    Object[] o= new Object[6];
                    o[0] = lista.get(0);
                    o[1] = lista.get(1);
                    o[2] = lista.get(2);
                    o[3] = lista.get(3);
                    o[4] = lista.get(4);
                    o[5] = lista.get(5);
                    modelo.addRow(o);
                    jtDetalleVenta.setModel(modelo);
                } else {
                    JOptionPane.showMessageDialog(null, "no hay stock suficiente");
                }
            }
        }
    }//GEN-LAST:event_txtCantVentaKeyPressed

    private void txtStockVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockVentaActionPerformed
        
    }//GEN-LAST:event_txtStockVentaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtCodVenta.setText(null);
        txtCantVenta.setText(null);
        txtDescVenta.setText(null);
        txtPrecioVenta.setText(null);
        txtStockVenta.setText(null);
        txtDescuento.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed

    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double totalPagar = 0.0;
        int numFila = jtDetalleVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
             totalPagar += Double.parseDouble(jtDetalleVenta.getValueAt(i, 5).toString());
        }
            txtTotalPagar.setText(String.format("%,2f", totalPagar));

    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVentaActionPerformed

    private void txtFechaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaVentaMouseClicked
        
    }//GEN-LAST:event_txtFechaVentaMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //llamada a la conexion
        conBD.conectarBase();
        //guardar en objetos los valores capturados en el formulario
        objetoVentaN.setIdVenta(Integer.parseInt(txtIdVenta.getText()));
        objetoVentaN.setFormaPago(jcFormaPago.getSelectedItem().toString());
        objetoVentaN.setFechaVenta(txtFechaVenta.getText());
        objetoVentaN.setTotalPagar(Double.parseDouble(txtTotalPagar.getText()));
        
        String altaVenta = "INSERT INTO VENTAS VALUES ('" + objetoVentaN.getIdVenta()+ "','" + objetoVentaN.getFormaPago()+ "','" + objetoVentaN.getTotalPagar()+ "','" + objetoVentaN.getFechaVenta()+ "')";
        try {
            conBD.stmt.executeUpdate(altaVenta);
            JOptionPane.showMessageDialog(null, "Se registro venta con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, verifica" + e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line argumejtnts
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
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Venta;
    private javax.swing.JButton btnActProd;
    private javax.swing.JButton btnActualizaUsuario;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnActualizarProve;
    private javax.swing.JButton btnAltaCliente;
    private javax.swing.JButton btnAltaProd;
    private javax.swing.JButton btnAltaProve;
    private javax.swing.JButton btnAltaUsuario;
    private javax.swing.JButton btnBuscaProd;
    private javax.swing.JButton btnBuscaUsuario;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProve;
    private javax.swing.JButton btnEditaCliente;
    private javax.swing.JButton btnEditaProd;
    private javax.swing.JButton btnEditaUsuario;
    private javax.swing.JButton btnEditarProve;
    private javax.swing.JButton btnElimUsuario;
    private javax.swing.JButton btnEliminaProd;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarProve;
    private javax.swing.JButton btnLimpiaCliente;
    private javax.swing.JButton btnLimpiaProd;
    private javax.swing.JButton btnLimpiaProve;
    private javax.swing.JButton btnLimpiaUsuario;
    private javax.swing.JButton btnRepoProd;
    private javax.swing.JButton btnRepoUsuario;
    private javax.swing.JButton btnReporteCliente;
    private javax.swing.JButton btnReporteProve;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcFormaPago;
    private javax.swing.JComboBox<String> jcProve;
    private javax.swing.JTable jtConsulCliente;
    private javax.swing.JTable jtConsulProd;
    private javax.swing.JTable jtConsulProve;
    private javax.swing.JTable jtConsulUsuario;
    private javax.swing.JTable jtDetalleVenta;
    private javax.swing.JLabel lblCantVenta;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodVenta;
    private javax.swing.JLabel lblCodigoProd;
    private javax.swing.JLabel lblCpCliente;
    private javax.swing.JLabel lblCpProve;
    private javax.swing.JLabel lblDescProd;
    private javax.swing.JLabel lblDescVenta;
    private javax.swing.JLabel lblDirecProve;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdProd;
    private javax.swing.JLabel lblIdProve;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblMailCliente;
    private javax.swing.JLabel lblMailProve;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreProve;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPrecioProd;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblRfcCliente;
    private javax.swing.JLabel lblRfcProve;
    private javax.swing.JLabel lblStocVenta;
    private javax.swing.JLabel lblTelCliente;
    private javax.swing.JLabel lblTelProve;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCantVenta;
    private javax.swing.JTextField txtCodVenta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodposCliente;
    private javax.swing.JTextField txtCpProve;
    private javax.swing.JTextField txtDescVenta;
    private javax.swing.JTextField txtDescipcion;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDirCliente;
    private javax.swing.JTextField txtDirProve;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtIdProve;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtMailCliente;
    private javax.swing.JTextField txtMailProve;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProve;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRfcCliente;
    private javax.swing.JTextField txtRfcProve;
    private javax.swing.JTextField txtStockVenta;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtTelProve;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
