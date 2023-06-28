package formularioPersonas;

import static formularioPersonas.manejoArchivo.CrearArchivo;
import static formularioPersonas.manejoArchivo.EscribirArchivo;
import static formularioPersonas.manejoArchivo.LeerArchivo;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UI_VentanaPrincipal extends javax.swing.JFrame {

    int xmouse, ymouse;
    DefaultTableModel modelo;
    int filas;
   // private final ArrayList<formulario> lista = new ArrayList<>();
    //private int cont=0;
    
    
    
    
    
      
    public UI_VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cédula");
        this.tabla.setModel(modelo);
        //LeerArchivo("personas");
        
        
        
        //cargar el archivo .txt a la jtable
        
        try{
            FileReader r = new FileReader("personas.txt");
            
            BufferedReader buffer = new BufferedReader(r);
            
            String temp = "";
            
            while(temp != null){
                temp = buffer.readLine();
                
                String x= temp;
                
                String []arreglo = x.split(" ");
                
                 String []info = new String[4]; 
                    info[0]=arreglo[0];
                    info[1]=arreglo[1];
                    info[2]=arreglo[4];
                    modelo.addRow(info);
                for(int i = 0;i < arreglo.length;i++ ){
                   // System.out.println(arreglo[i]+" "+ i);
                }
                 
                    if(temp == null){
                        break;
                    }
                }
            }
            
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
        
        
        
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background = new javax.swing.JPanel();
        pnl_barra = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_titlte = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_cedula = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lbl_img_persona = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        txt_nombre1 = new javax.swing.JTextField();
        lbl_nombres1 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(222, 220, 220));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_barra.setBackground(new java.awt.Color(142, 57, 70));
        pnl_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_barraMouseDragged(evt);
            }
        });
        pnl_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_barraMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));
        exit.setForeground(new java.awt.Color(142, 57, 70));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        lbl_titlte.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        lbl_titlte.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titlte.setText("Formulario ");

        javax.swing.GroupLayout pnl_barraLayout = new javax.swing.GroupLayout(pnl_barra);
        pnl_barra.setLayout(pnl_barraLayout);
        pnl_barraLayout.setHorizontalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_barraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titlte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_barraLayout.setVerticalGroup(
            pnl_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_titlte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnl_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombreMousePressed(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        background.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, 20));

        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoMouseClicked(evt);
            }
        });
        background.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 150, 20));

        txt_cedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        background.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 150, 20));

        lbl_nombres.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombres.setText("Nombres:");
        background.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 60, 20));

        lbl_apellidos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellidos.setText("Apellidos:");
        background.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 70, 20));

        lbl_cedula.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_cedula.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cedula.setText("Cédula:");
        background.add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 70, 20));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 550, 10));

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cédula"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        background.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 420, 170));

        lbl_img_persona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_img_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guayacan_rosado.png"))); // NOI18N
        lbl_img_persona.setToolTipText("");
        background.add(lbl_img_persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 360));

        BtnAgregar.setBackground(new java.awt.Color(139, 52, 52));
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseExited(evt);
            }
        });
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        background.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 90, 30));

        BtnLimpiar.setBackground(new java.awt.Color(139, 52, 52));
        BtnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarMouseExited(evt);
            }
        });
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        background.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 90, 30));

        BtnModificar.setBackground(new java.awt.Color(139, 52, 52));
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnModificarMouseExited(evt);
            }
        });
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        background.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 253, 90, 30));

        BtnEliminar.setBackground(new java.awt.Color(139, 52, 52));
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseExited(evt);
            }
        });
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        background.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 293, 90, 30));

        txt_nombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_nombre1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_nombre1MousePressed(evt);
            }
        });
        txt_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre1ActionPerformed(evt);
            }
        });
        background.add(txt_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 100, 20));

        lbl_nombres1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        lbl_nombres1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombres1.setText("cédula");
        background.add(lbl_nombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 40, 20));

        BtnBuscar.setBackground(new java.awt.Color(139, 52, 52));
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseExited(evt);
            }
        });
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        background.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void pnl_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnl_barraMousePressed

    private void pnl_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnl_barraMouseDragged

    private void txt_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoMouseClicked
    }//GEN-LAST:event_txt_apellidoMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMousePressed
    }//GEN-LAST:event_txt_nombreMousePressed

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142,57,70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_exitMouseExited

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));
       
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        //String nombre, apellidos, cedula;
        
        //Creacion,confirmacion y Escritura del archivo .txt
        EscribirArchivo("personas.txt",txt_nombre.getText()  +" " +txt_apellido.getText() + " con cédula= " + txt_cedula.getText()+" #");
        
        //ingreso de datos en el jTable
        String []info = new String[3];
        info[0]=txt_nombre.getText();
        info[1]=txt_apellido.getText();
        info[2]=txt_cedula.getText();
        modelo.addRow(info);
        
        //limpiar campos de texto al agregar datos
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_cedula.setText("");
        //verDatos();
        
    }//GEN-LAST:event_BtnAgregarActionPerformed
   
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int seleccion = tabla.getSelectedRow();
        
        txt_nombre.setText(tabla.getValueAt(seleccion, 0).toString());
        txt_apellido.setText(tabla.getValueAt(seleccion, 1).toString());
        txt_cedula.setText(tabla.getValueAt(seleccion, 2).toString());
        filas = seleccion;
        
        System.out.println(seleccion);
        
        try{
            FileReader r = new FileReader("personas.txt");
            
            BufferedReader buffer = new BufferedReader(r);
            
            String temp = "";
            int cont = 0;
            while(temp != null){
                temp = buffer.readLine();
                
                String x= temp;
                
                
                    String []arreglo = x.split("\n ");
                
                
                
                    
                for(int i = 0;i < arreglo.length;i++ ){
                   
                    if(cont == seleccion){
                       System.out.println(arreglo[i]+"  arry: "+ cont); 
                       
                       
                       
                       
                       
                    }
                    
                    cont +=1;
                   
                
                   
                }
                 
                    if(temp == null){
                        break;
                    }
                }
            }
            
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_cedula.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       int fila = tabla.getSelectedRow();
       if(fila>=0){
           modelo.removeRow(fila);
           
       }else{
           JOptionPane.showMessageDialog(null, "seleccione una fila");
        }
        //limpiar campos de texto al eliminar datos
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_cedula.setText("");
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        //modificar datos
        
        
        
        int fila = tabla.getSelectedRow();
        if(fila>=0){
            String []info = new String[3];
            info[0]=txt_nombre.getText();
            info[1]=txt_apellido.getText();
            info[2]=txt_cedula.getText();
        
        
        for (int i = 0; i < tabla.getColumnCount();i++){
            
            modelo.setValueAt(info[i], filas, i);
            
        }
       }else{
           JOptionPane.showMessageDialog(null, "seleccione una fila");
        }
        
        
        
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseEntered
        BtnAgregar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_BtnAgregarMouseEntered

    private void BtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseExited
        BtnAgregar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_BtnAgregarMouseExited

    private void BtnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseEntered
        BtnLimpiar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_BtnLimpiarMouseEntered

    private void BtnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarMouseExited
        BtnLimpiar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_BtnLimpiarMouseExited

    private void BtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseEntered
        BtnModificar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_BtnModificarMouseEntered

    private void BtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarMouseExited
        BtnModificar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_BtnModificarMouseExited

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        BtnEliminar.setBackground(new Color(111,45,54));
    }//GEN-LAST:event_BtnEliminarMouseEntered

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        BtnEliminar.setBackground(new Color(142, 57, 70));
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void txt_nombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombre1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre1MousePressed

    private void txt_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre1ActionPerformed

    private void BtnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarMouseEntered

    private void BtnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarMouseExited

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if(!txt_cedula.getText().isEmpty()){
            String aux = null;
            
            
        }
        
    }//GEN-LAST:event_BtnBuscarActionPerformed

    public static void main(String args[]) {
        
       
    
        
       // EscribirArchivo("personas");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JPanel background;
    private javax.swing.JPanel exit;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_img_persona;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_nombres1;
    private javax.swing.JLabel lbl_titlte;
    private javax.swing.JPanel pnl_barra;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre1;
    // End of variables declaration//GEN-END:variables
}
