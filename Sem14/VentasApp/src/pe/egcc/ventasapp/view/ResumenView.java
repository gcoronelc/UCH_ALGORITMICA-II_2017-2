package pe.egcc.ventasapp.view;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import pe.egcc.ventasapp.controller.VentaController;
import pe.egcc.ventasapp.model.Resumen;

public class ResumenView extends javax.swing.JInternalFrame {

    private VentaController ventaController;
    private int tamano = 0;
    public int time=100;

    public ResumenView() {
        initComponents();
        ventaController = new VentaController();

        TimerTask timerTask = new TimerTask() {
            public void run() {
                llenarTabla();

            }
        };

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(timerTask, 0, time);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblImporte = new javax.swing.JLabel();
        lblImpuesto = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("CONSULTAR VENTAS");

        tblRepo.setBackground(new java.awt.Color(226, 246, 231));
        tblRepo.setForeground(new java.awt.Color(102, 102, 102));
        tblRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ARTICULO", "PRECIO", "CANT", "IMPORTE", "IMPUESTO", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRepo.setRowHeight(25);
        tblRepo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblRepo);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        lblImporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblImporte.setText("Importe:");

        lblImpuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblImpuesto.setText("Impuesto:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblRepo;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        //Lista ventas ventacontroller
        List<Resumen> repo = ventaController.leerResumen();

        tamano = repo.size();
        double importe = 0.0, impuesto = 0.0, total = 0.0;

        DefaultTableModel tabla;
        tabla = (DefaultTableModel) tblRepo.getModel();
        
        int selectedRow = tblRepo.getSelectedRow();
        
        tabla.setRowCount(0);

        for (Resumen r : repo) {
            tabla.addRow(r.toRowData());
            importe += r.getImporte();
            impuesto += r.getImpuesto();
            total += r.getTotal();
        }
        
        if( selectedRow > -1 ){
            tblRepo.setRowSelectionInterval(selectedRow, selectedRow);
        }

        lblImporte.setText("Importe: " + importe);
        lblImpuesto.setText("Impuesto: " + impuesto);
        lblTotal.setText("Total: " + total);

    }

}
