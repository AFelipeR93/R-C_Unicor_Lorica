/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Principal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresFelipe
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        TabPrincipal = new javax.swing.JTabbedPane();
        PanelAdministrar = new javax.swing.JPanel();
        BotonRegistrarFacultad = new javax.swing.JButton();
        BotonRegistrarPrograma = new javax.swing.JButton();
        BotonRegistrarMateria = new javax.swing.JButton();
        BotonRegistrarDocente = new javax.swing.JButton();
        BotonRegistrarEstudiante = new javax.swing.JButton();
        BotonRegistrarCurso = new javax.swing.JButton();
        BotonRegistrarUsuarios = new javax.swing.JButton();
        PanelReportes = new javax.swing.JPanel();
        BotonReportesGeneral = new javax.swing.JButton();
        ReportesProgramas = new javax.swing.JButton();
        PanelConexion = new javax.swing.JPanel();
        BotonNuevaConexion = new javax.swing.JButton();
        Barra_de_Menu = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        MenuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        BotonRegistrarFacultad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Facultad-O.png"))); // NOI18N
        BotonRegistrarFacultad.setText("Reg. Facultad");
        BotonRegistrarFacultad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarFacultad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Programa-O.png"))); // NOI18N
        BotonRegistrarPrograma.setText("Reg. Programa");
        BotonRegistrarPrograma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarPrograma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Materia-O.png"))); // NOI18N
        BotonRegistrarMateria.setText("Reg. Materia");
        BotonRegistrarMateria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarMateria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Docente-O.png"))); // NOI18N
        BotonRegistrarDocente.setText("Reg. Docente");
        BotonRegistrarDocente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarDocente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Estudiante-I-O.png"))); // NOI18N
        BotonRegistrarEstudiante.setText("Reg. Estudiantes");
        BotonRegistrarEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Curso-O.png"))); // NOI18N
        BotonRegistrarCurso.setText("Reg. Cursos");
        BotonRegistrarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        BotonRegistrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unicordoba/Registro_Control/Imagenes/Estudiante-O.png"))); // NOI18N
        BotonRegistrarUsuarios.setText("Reg. Usuarios");
        BotonRegistrarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanelAdministrarLayout = new javax.swing.GroupLayout(PanelAdministrar);
        PanelAdministrar.setLayout(PanelAdministrarLayout);
        PanelAdministrarLayout.setHorizontalGroup(
            PanelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonRegistrarFacultad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarPrograma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarCurso)
                .addGap(10, 10, 10)
                .addComponent(BotonRegistrarUsuarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAdministrarLayout.setVerticalGroup(
            PanelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdministrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdministrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegistrarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarPrograma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TabPrincipal.addTab("Administrar Sistema", PanelAdministrar);

        BotonReportesGeneral.setText("Reporte General");
        BotonReportesGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReportesGeneralActionPerformed(evt);
            }
        });

        ReportesProgramas.setText("Reporte de Programas");
        ReportesProgramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesProgramasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonReportesGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReportesProgramas)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonReportesGeneral)
                    .addComponent(ReportesProgramas))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        TabPrincipal.addTab("Reportes", PanelReportes);

        BotonNuevaConexion.setText("Nueva Conexion");

        javax.swing.GroupLayout PanelConexionLayout = new javax.swing.GroupLayout(PanelConexion);
        PanelConexion.setLayout(PanelConexionLayout);
        PanelConexionLayout.setHorizontalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonNuevaConexion)
                .addContainerGap(662, Short.MAX_VALUE))
        );
        PanelConexionLayout.setVerticalGroup(
            PanelConexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConexionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BotonNuevaConexion)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        TabPrincipal.addTab("Conexion", PanelConexion);

        MenuFile.setText("File");
        Barra_de_Menu.add(MenuFile);

        MenuEdit.setText("Edit");
        Barra_de_Menu.add(MenuEdit);

        setJMenuBar(Barra_de_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabPrincipal)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonReportesGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReportesGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonReportesGeneralActionPerformed

    private void ReportesProgramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesProgramasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesProgramasActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_de_Menu;
    private javax.swing.JButton BotonNuevaConexion;
    private javax.swing.JButton BotonRegistrarCurso;
    private javax.swing.JButton BotonRegistrarDocente;
    private javax.swing.JButton BotonRegistrarEstudiante;
    private javax.swing.JButton BotonRegistrarFacultad;
    private javax.swing.JButton BotonRegistrarMateria;
    private javax.swing.JButton BotonRegistrarPrograma;
    private javax.swing.JButton BotonRegistrarUsuarios;
    private javax.swing.JButton BotonReportesGeneral;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuEdit;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JPanel PanelAdministrar;
    private javax.swing.JPanel PanelConexion;
    private javax.swing.JPanel PanelReportes;
    private javax.swing.JButton ReportesProgramas;
    private javax.swing.JTabbedPane TabPrincipal;
    // End of variables declaration//GEN-END:variables
}
