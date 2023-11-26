
package com.mycompany.proyectocamisetas.igu;

import com.mycompany.proyectocamisetas.logica.Cliente;
import com.mycompany.proyectocamisetas.logica.ControladoraLogica;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BuscarDni extends javax.swing.JFrame {

    ControladoraLogica control;
    Cliente socio;

    public BuscarDni() {
        control = new ControladoraLogica();
        initComponents();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocioDni = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Buscar socio");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaSocioDni.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaSocioDni);

        jLabel2.setText("(Con dni o nombre completo)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed
    
    // FALTA ACA *******


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       
       cargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSocioDni;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

        public void cargarTabla() {
        
         String buscarDni = txtBuscar.getText();
         String buscarNombre = txtBuscar.getText();
        //definir modelo de la tabla
        
        DefaultTableModel tabla = new DefaultTableModel() {
        
            //para que la tabla sea fija y no editable desde igu
        @Override
        public boolean isCellEditable (int row, int column) { // override necesario xq estoy sobreescribiendo un método
            
            return false;
        }
    };
        
        //Establecer nombres de columnas
        
        String titulos[] = {"Id", "Nombre", "DNI", "Cuota"};       
        tabla.setColumnIdentifiers(titulos);
        
        //Cargas de datos desde BD
        List<Cliente> listaCliente = control.traerClientes();
    
    
        //Recorrer lista y mostrar
    
    if (listaCliente!=null) {
    
    for(Cliente cli : listaCliente) {

            Object[] producto = {cli.getId(), cli.getNombre(), cli.getDni(), cli.getEstadoPeña()};
            
            if(producto[2].equals(buscarDni)|| producto[1].equals(buscarNombre)) {
           tabla.addRow(producto); 
    }
}

    tablaSocioDni.setModel(tabla); // importamos los elementos del modelo de tabla (DefaultTableModel tabla) en miTabla para que finalmente se muestre
} 
        
   }
}
