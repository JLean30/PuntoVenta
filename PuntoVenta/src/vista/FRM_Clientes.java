/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.Controlador_FRM_Clientes;
import javax.swing.JOptionPane;
//libreria para el manejo del modelo de la tabla
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JeanC
 */
public class FRM_Clientes extends javax.swing.JFrame {
    
    public Controlador_FRM_Clientes controlador;
    private DefaultTableModel modelo;

    /**
     * Creates new form FRM_Clientes
     */
    public FRM_Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlador = new Controlador_FRM_Clientes(this);
        this.modelo = new DefaultTableModel();
        String[] columnas = new String[5];
        columnas[0] = "Cedula";
        columnas[1] = "Nombre Completo";
        columnas[2] = "Telefono";
        columnas[3] = "Dirección";
        columnas[4]= "Email";
      
        //asignamos los nombres de columnas al modelo
        this.modelo.setColumnIdentifiers(columnas);
        
        //le asignamos el modelo a la tabla
        this.jt_ListaClientes.setModel(modelo);
        // Con este metodo se pueden obtener los TEXT 
        
        this.jP_Botones1.agregarControladorClientes(controlador);
        this.estadoInicial();
        this.controlador.inicioTabla();
    }
    
    public String getCedulaCliente(){
        return this.jt_CedulaCliente.getText();
    }
    
    public String getNombre(){
        return this.jt_Nombre.getText();
    }
    
    public String getPrimerApellido(){
        return this.jt_PriApellido.getText();
    }
    
    public String getSegundoApellido(){
        return this.jt_SegApell.getText();
    }
    
    public String getTelefono(){
        return this.jt_Telefono.getText();
    }
    
    public String getDireccion(){
        return this.jt_DireccionCliente.getText();
    }
    
    public String getEmail(){
        return this.jt_Email.getText();
    }
    
    public  void estadoInicial(){
        
        this.jt_CedulaCliente.setText("");
        this.jt_Nombre.setText("");
        this.jt_PriApellido.setText("");
        this.jt_SegApell.setText("");
        this.jt_DireccionCliente.setText("");
        this.jt_Email.setText("");
        this.jt_Telefono.setText("");
        
        this.jt_CedulaCliente.setEnabled(true);
        this.jt_Nombre.setEnabled(false);
        this.jt_PriApellido.setEnabled(false);
        this.jt_DireccionCliente.setEnabled(false);
        this.jt_Telefono.setEnabled(false);
        this.jt_SegApell.setEnabled(false);
        this.jt_Email.setEnabled(false);
       
        this.jP_Botones1.estadoInicialBotones();
    }
    
    public void habilitarAgregar(){
        
        this.jt_CedulaCliente.setEnabled(false);
        this.jt_Nombre.setEnabled(true);
        this.jt_PriApellido.setEnabled(true);
        this.jt_SegApell.setEnabled(true);
        this.jt_DireccionCliente.setEnabled(true);
        this.jt_Email.setEnabled(true);
        this.jt_Telefono.setEnabled(true);
        
        this.jP_Botones1.habilitarAgregar();
    }
    
    public void mostrarMensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void setNombre(String valor){
        this.jt_Nombre.setText(valor);
    }
    
    public void setCedulaCliente(String valor){
        this.jt_CedulaCliente.setText(valor);
    }
    
     public void setPrimerApellido(String valor){
         this.jt_PriApellido.setText(valor);
     }
     
     public void setSegundoApellido(String valor){
         this.jt_SegApell.setText(valor);
     }
     
     public void setTelefono(String valor){
         this.jt_Telefono.setText(valor);
     }
     
     public void setDireccion(String valor){
         this.jt_DireccionCliente.setText(valor);
     }
     
     public void setEmail(String valor){
         this.jt_Email.setText(valor);
     }
     
     public void habilitarModificarEliminar(){
         
        this.jt_CedulaCliente.setEnabled(false);
        this.jt_Nombre.setEnabled(true);
        this.jt_Email.setEnabled(true);
        this.jt_PriApellido.setEnabled(true);
        this.jt_SegApell.setEnabled(true);
        this.jt_Telefono.setEnabled(true);
        this.jt_DireccionCliente.setEnabled(true);
        
        this.jP_Botones1.habilitarModificarEliminar();
    }
     public void agregarUsuarioTabla(String[] datos) {
        this.modelo.addRow(datos);
    }
    
    public void modificarUsuarioTabla(String[] datos) {
        for(int fila=0; fila<this.modelo.getRowCount();fila++) {
            if(this.modelo.getValueAt(fila, 0).equals(datos[0])) {
                
                this.modelo.setValueAt(datos[1], fila, 1);
                this.modelo.setValueAt(datos[2], fila, 2);
                this.modelo.setValueAt(datos[3], fila, 3);
                this.modelo.setValueAt(datos[4], fila, 4);
                
                break;
                
            }
        }
    }
    
    public void eliminarUsuarioTabla(String pCedula) {
        for(int fila=0;fila<this.modelo.getRowCount();fila++) {
            if(this.modelo.getValueAt(fila, 0).equals(pCedula)) {
                
                this.modelo.removeRow(fila);
                break;
                
            }
        }
    }
    
   
     
     
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jt_Cedula = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_CedulaCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_SegApell = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_Telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jt_DireccionCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_Email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jt_PriApellido = new javax.swing.JTextField();
        jP_Botones1 = new vista.JP_Botones();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListaClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Cedula Jurídica: ");

        jt_Cedula.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        setTitle("Mantenimiento de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cédula:");

        jt_CedulaCliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jt_Nombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer Apellido:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segundo Apellido:");

        jt_SegApell.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono:");

        jt_Telefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dirección:");

        jt_DireccionCliente.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");

        jt_Email.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1193, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jt_PriApellido.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jt_ListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_ListaClientes);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1173, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_PriApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jt_SegApell, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jt_CedulaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jt_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jP_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jt_CedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jt_PriApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jt_SegApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jt_DireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jP_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.controlador.consolidarInformacion();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private vista.JP_Botones jP_Botones1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_CedulaCliente;
    private javax.swing.JTextField jt_DireccionCliente;
    private javax.swing.JTextField jt_Email;
    private javax.swing.JTable jt_ListaClientes;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_PriApellido;
    private javax.swing.JTextField jt_SegApell;
    private javax.swing.JTextField jt_Telefono;
    // End of variables declaration//GEN-END:variables
}
