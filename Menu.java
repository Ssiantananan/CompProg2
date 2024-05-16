/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cp2.test;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author ssianrosalejos
 */
public class Menu extends javax.swing.JFrame {
private static final String FILE_PATH = System.getProperty("user.dir") + "/src/cp2/test/MotorPH Employee Data.csv";
    String userID;
    int empIDLabel;
    
    public void updateUserNameLabel(String userName) {
        if (userNameLabel != null) {
            userNameLabel.setText("Welcome, " + userName + "!");
            empIDDisplay.setText(empIDLabel);
        }
    }
    
    public void applyUserName(String userName) {
        if (userNameLabel != null) {
            userNameLabel.setText("Welcome, " + userName + "!");
            userID = userName;
        }
    }

        public String getUserName(int empID) {
        String userName = null;
        int EmpID = empID;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int storedEmpID = Integer.parseInt(data[0]);
                String storedName = data[2];

                // Check if the provided empID matches with the stored empID
                if (empID == storedEmpID) {
                    userName = storedName;
                    userID = userName;
                    empIDLabel = EmpID;
                    System.out.println("emp ID is:" + userID);
                    break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace(); // Handle IOException or NumberFormatException as needed
        }
        
        return userName;

    }
        
        public void fadeInUserName() {
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            private int opacity = 0;

            @Override
            public void run() {
                opacity += 25; // Increase opacity gradually
                if (opacity >= 255) {
                    // Stop the timer when opacity reaches 255 (fully opaque)
                    cancel();
                    opacity = 255;
                }
                int alpha = (int) (255 * (opacity / 255.0));
                // Set the new opacity value to the userNameLabel
                userNameLabel.setForeground(new Color(0, 0, 0, opacity));
            }
        }, 0, 100); // Run every 100 milliseconds
    }
    public Menu() {
        initComponents();
        fadeInUserName();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        empIDDisplay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchEmployeeButton = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JLabel();
        editEmployeeButton = new javax.swing.JLabel();
        viewPayrollButton = new javax.swing.JLabel();
        deleteEmployeeButton = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empIDDisplay.setText("empIDDisplay");
        jPanel1.add(empIDDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setOpaque(false);

        searchEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/searchEmployeeButton_unselected.png"))); // NOI18N
        searchEmployeeButton.setAlignmentY(0.0F);
        searchEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchEmployeeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchEmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchEmployeeButtonMouseExited(evt);
            }
        });

        addEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/addEmployeeButton_unselected.png"))); // NOI18N
        addEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMouseExited(evt);
            }
        });

        editEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/editEmployeeButton_unselected.png"))); // NOI18N
        editEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmployeeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editEmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editEmployeeButtonMouseExited(evt);
            }
        });

        viewPayrollButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/viewPayrollButton_unselected.png"))); // NOI18N
        viewPayrollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPayrollButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewPayrollButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewPayrollButtonMouseExited(evt);
            }
        });

        deleteEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/deleteEmployeeButton_unselected.png"))); // NOI18N
        deleteEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmployeeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteEmployeeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteEmployeeButtonMouseExited(evt);
            }
        });

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/logoutButton_unselected.png"))); // NOI18N
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteEmployeeButton)
                        .addGap(56, 56, 56)
                        .addComponent(logoutButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchEmployeeButton)
                        .addGap(56, 56, 56)
                        .addComponent(addEmployeeButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(editEmployeeButton)
                        .addGap(56, 56, 56)
                        .addComponent(viewPayrollButton))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchEmployeeButton)
                    .addComponent(addEmployeeButton))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editEmployeeButton)
                    .addComponent(viewPayrollButton))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmployeeButton)
                    .addComponent(logoutButton)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 370, 190));

        userNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        userNameLabel.setText("userName");
        jPanel1.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cp2/test/backgroundImage.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        setSize(new java.awt.Dimension(950, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchEmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeButtonMouseEntered
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/searchEmployeeButton_selected.png");
        searchEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_searchEmployeeButtonMouseEntered

    private void editEmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeButtonMouseEntered
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/editEmployeeButton_selected.png");
        editEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_editEmployeeButtonMouseEntered

    private void deleteEmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/deleteEmployeeButton_selected.png");
        deleteEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_deleteEmployeeButtonMouseEntered

    private void addEmployeeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/addEmployeeButton_selected.png");
        addEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_addEmployeeButtonMouseEntered

    private void viewPayrollButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPayrollButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/viewPayrollButton_selected.png");
        viewPayrollButton.setIcon(selectedIcon);
    }//GEN-LAST:event_viewPayrollButtonMouseEntered

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/logoutButton_selected.png");
        logoutButton.setIcon(selectedIcon);
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void searchEmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/searchEmployeeButton_unselected.png");
        searchEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_searchEmployeeButtonMouseExited

    private void editEmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/editEmployeeButton_unselected.png");
        editEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_editEmployeeButtonMouseExited

    private void deleteEmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/deleteEmployeeButton_unselected.png");
        deleteEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_deleteEmployeeButtonMouseExited

    private void addEmployeeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/addEmployeeButton_unselected.png");
        addEmployeeButton.setIcon(selectedIcon);
    }//GEN-LAST:event_addEmployeeButtonMouseExited

    private void viewPayrollButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPayrollButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/viewPayrollButton_unselected.png");
        viewPayrollButton.setIcon(selectedIcon);
    }//GEN-LAST:event_viewPayrollButtonMouseExited

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        // TODO add your handling code here:
        ImageIcon selectedIcon = new ImageIcon(System.getProperty("user.dir") + "/src/cp2/test/logoutButton_unselected.png");
        logoutButton.setIcon(selectedIcon);
    }//GEN-LAST:event_logoutButtonMouseExited

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void searchEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeButtonMouseClicked
        // TODO add your handling code here:
        searchEmployee search = new searchEmployee();
        search.updateUserNameLabel(userID);
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchEmployeeButtonMouseClicked

    private void editEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeButtonMouseClicked
        // TODO add your handling code here:
        editEmployee edit = new editEmployee();
        edit.updateUserNameLabel(userID);
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editEmployeeButtonMouseClicked

    private void deleteEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeButtonMouseClicked
        // TODO add your handling code here:
        searchEmployee search = new searchEmployee();
        search.updateUserNameLabel(userID);
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteEmployeeButtonMouseClicked

    private void addEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMouseClicked
        // TODO add your handling code here:
        addEmployee add = new addEmployee();
        add.updateUserNameLabel(userID);
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addEmployeeButtonMouseClicked

    private void viewPayrollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPayrollButtonMouseClicked
        // TODO add your handling code here:
        viewPayroll view = new viewPayroll();
        view.updateUserNameLabel(userID);
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewPayrollButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEmployeeButton;
    private javax.swing.JLabel deleteEmployeeButton;
    private javax.swing.JLabel editEmployeeButton;
    private javax.swing.JLabel empIDDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel searchEmployeeButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel viewPayrollButton;
    // End of variables declaration//GEN-END:variables
}