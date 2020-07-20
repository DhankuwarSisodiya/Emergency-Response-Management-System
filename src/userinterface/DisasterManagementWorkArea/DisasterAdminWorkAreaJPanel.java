/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DisasterManagementWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DisasterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class DisasterAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisasterAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem business;

    public DisasterAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        manageEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageUser = new javax.swing.JPanel();
        manageUserLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manageScene = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageSceneLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageEmployeePanel = new javax.swing.JPanel();
        manageEmployee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1338, 840));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(215, 81, 81));

        jPanel3.setBackground(new java.awt.Color(215, 81, 81));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUser.setBackground(new java.awt.Color(215, 81, 81));
        manageUser.setPreferredSize(new java.awt.Dimension(264, 48));
        manageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserMousePressed(evt);
            }
        });
        manageUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageUserLabel.setText("Manage User");
        manageUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserLabelMousePressed(evt);
            }
        });
        manageUser.add(manageUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginUser24x.png"))); // NOI18N
        manageUser.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, 30));

        jPanel3.add(manageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 30));

        manageScene.setBackground(new java.awt.Color(215, 81, 81));
        manageScene.setPreferredSize(new java.awt.Dimension(280, 48));
        manageScene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSceneMousePressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/crime24x.png"))); // NOI18N

        manageSceneLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageSceneLabel.setText("Manage Scene Assignment");
        manageSceneLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageSceneLayout = new javax.swing.GroupLayout(manageScene);
        manageScene.setLayout(manageSceneLayout);
        manageSceneLayout.setHorizontalGroup(
            manageSceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSceneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageSceneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        manageSceneLayout.setVerticalGroup(
            manageSceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSceneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(manageSceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manageSceneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jPanel3.add(manageScene, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DISASTER UNIT SYSTEM");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 20));

        manageEmployeePanel.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeePanel.setPreferredSize(new java.awt.Dimension(280, 48));
        manageEmployeePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeePanelMousePressed(evt);
            }
        });

        manageEmployee.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageEmployee.setText("Manage Employee");
        manageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/employeesmallicon24x.png"))); // NOI18N

        javax.swing.GroupLayout manageEmployeePanelLayout = new javax.swing.GroupLayout(manageEmployeePanel);
        manageEmployeePanel.setLayout(manageEmployeePanelLayout);
        manageEmployeePanelLayout.setHorizontalGroup(
            manageEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        manageEmployeePanelLayout.setVerticalGroup(
            manageEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(manageEmployeePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 40));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeMousePressed
        manageEmployee();
    }//GEN-LAST:event_manageEmployeeMousePressed

    private void manageEmployeePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeePanelMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageEmployeePanelMousePressed

    private void manageUserLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserLabelMousePressed
        manageUser();
    }//GEN-LAST:event_manageUserLabelMousePressed

    private void manageUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMousePressed
        // TODO add your handling code here:
        manageUser();
    }//GEN-LAST:event_manageUserMousePressed

    private void manageSceneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSceneMousePressed
        manageSceneAssignment();
    }//GEN-LAST:event_manageSceneMousePressed
    
    public void manageEmployee(){
        manageEmployeePanel.setBackground(new Color(236,113,107));
        manageUser.setBackground(new Color(215,81,81));
        manageScene.setBackground(new Color(215,81,81));
        DisasterAdminManageEmployeeJPanel disasterAdminManageEmployeeJPanel = new DisasterAdminManageEmployeeJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory(),account, organization);
        rightSystemAdminPanel.add("disasterAdminManageEmployeeJPanel",disasterAdminManageEmployeeJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    public void manageUser(){
        manageUser.setBackground(new Color(236,113,107));
        manageEmployeePanel.setBackground(new Color(215,81,81));
        manageScene.setBackground(new Color(215,81,81));
        DisasterAdminManageUserJPanel disasterAdminManageUserJPanel = new DisasterAdminManageUserJPanel(rightSystemAdminPanel, enterprise, business);
        rightSystemAdminPanel.add("disasterAdminManageUserJPanel",disasterAdminManageUserJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    public void manageSceneAssignment(){
         manageScene.setBackground(new Color(236,113,107));
        manageEmployeePanel.setBackground(new Color(215,81,81));
        manageUser.setBackground(new Color(215,81,81));
        DisasterAdminSceneManageJPanel disasterAdminSceneManageJPanel = new DisasterAdminSceneManageJPanel(rightSystemAdminPanel, account, enterprise, network, business, organization);
        rightSystemAdminPanel.add("disasterAdminSceneManageJPanel",disasterAdminSceneManageJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel manageEmployee;
    private javax.swing.JPanel manageEmployeePanel;
    private javax.swing.JPanel manageScene;
    private javax.swing.JLabel manageSceneLabel;
    private javax.swing.JPanel manageUser;
    private javax.swing.JLabel manageUserLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}