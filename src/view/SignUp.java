package view;

import Dao.UserDao;
import model.User;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUpp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
                          

    

                          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Email_Field = new javax.swing.JTextField();
        Username_Field = new javax.swing.JTextField();
        Password_Field = new javax.swing.JPasswordField();
        Phone_Field = new javax.swing.JTextField();
        Address_Field = new javax.swing.JTextField();
        Gender_Box = new javax.swing.JComboBox<>();
        Blood_Box = new javax.swing.JComboBox<>();
        MedicalHistory_Field = new javax.swing.JTextField();
        SignUp_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bd.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SignUp");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 66, -1, -1));

        Email_Field.setText("Email");
        Email_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Email_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Email_FieldFocusLost(evt);
            }
        });
        getContentPane().add(Email_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 140, 151, -1));

        Username_Field.setText("Username");
        Username_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Username_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Username_FieldFocusLost(evt);
            }
        });
        getContentPane().add(Username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 204, 151, -1));

        Password_Field.setText("Password");
        Password_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Password_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Password_FieldFocusLost(evt);
            }
        });
        getContentPane().add(Password_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 268, 151, -1));

        Phone_Field.setText("Phone.No");
        Phone_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Phone_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Phone_FieldFocusLost(evt);
            }
        });
        getContentPane().add(Phone_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 332, 151, -1));

        Address_Field.setText("Address");
        Address_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Address_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Address_FieldFocusLost(evt);
            }
        });
        getContentPane().add(Address_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 140, 152, -1));

        Gender_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Male", "Female", "Others" }));
        getContentPane().add(Gender_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 204, -1, -1));

        Blood_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(Blood_Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 268, -1, -1));

        MedicalHistory_Field.setText("Medical History");
        MedicalHistory_Field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MedicalHistory_FieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MedicalHistory_FieldFocusLost(evt);
            }
        });
        getContentPane().add(MedicalHistory_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 332, 151, -1));

        SignUp_Button.setText("SignUp");
        SignUp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bd.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Email_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_FieldFocusGained
        // TODO add your handling code here:
         if (Email_Field.getText().equals("Email")) {
            Email_Field.setText("");
        }
    }//GEN-LAST:event_Email_FieldFocusGained

    private void Email_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_FieldFocusLost

        // TODO add your handling code here:
         if (Email_Field.getText().isEmpty()) {
            Email_Field.setText("Email");
        }
    }//GEN-LAST:event_Email_FieldFocusLost

    private void Username_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username_FieldFocusGained
        // TODO add your handling code here:
        if (Username_Field.getText().equals("Username")) {
            Username_Field.setText("");
        }
    }//GEN-LAST:event_Username_FieldFocusGained

    private void Username_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Username_FieldFocusLost
        // TODO add your handling code here:
        if (Username_Field.getText().isEmpty()) {
            Username_Field.setText("Username");
        }
    }//GEN-LAST:event_Username_FieldFocusLost

    private void Password_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_FieldFocusGained
        // TODO add your handling code here:
       String  pwd = new String(Password_Field.getPassword());
    if (pwd.equals("Password")) {
        Password_Field.setText("");
        Password_Field.setEchoChar('●'); // or '*'
    }
    }//GEN-LAST:event_Password_FieldFocusGained

    private void Password_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_FieldFocusLost
        // TODO add your handling code here:
        String pwd = new String(Password_Field.getPassword());
    if (pwd.isEmpty()) {
        Password_Field.setText("Password");
        Password_Field.setEchoChar((char) 0); // Show placeholder
    }
    }//GEN-LAST:event_Password_FieldFocusLost

    private void Phone_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_FieldFocusGained
        // TODO add your handling code here:
        if (Phone_Field.getText().equals("Phone.No")) {
            Phone_Field.setText("");
        }
    }//GEN-LAST:event_Phone_FieldFocusGained

    private void Phone_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Phone_FieldFocusLost
        // TODO add your handling code here:
        if (Phone_Field.getText().isEmpty()) {
            Phone_Field.setText("Phone.No");
        }
    }//GEN-LAST:event_Phone_FieldFocusLost

    private void Address_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address_FieldFocusGained
        // TODO add your handling code here:
        if (Address_Field.getText().equals("Address")) {
            Address_Field.setText("");
        }
    }//GEN-LAST:event_Address_FieldFocusGained

    private void Address_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address_FieldFocusLost
        // TODO add your handling code here:
        if (Address_Field.getText().isEmpty()) {
            Address_Field.setText("Address");
        }
    }//GEN-LAST:event_Address_FieldFocusLost

    private void MedicalHistory_FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MedicalHistory_FieldFocusGained
        // TODO add your handling code here:
        if (MedicalHistory_Field.getText().equals("Medical History")) {
            MedicalHistory_Field.setText("");
        }
    }//GEN-LAST:event_MedicalHistory_FieldFocusGained

    private void MedicalHistory_FieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MedicalHistory_FieldFocusLost
        // TODO add your handling code here:
        if (MedicalHistory_Field.getText().isEmpty()) {
            MedicalHistory_Field.setText("Medical History");
        }
    }//GEN-LAST:event_MedicalHistory_FieldFocusLost

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Button Clicked");

        String email = Email_Field.getText();
        String username = Username_Field.getText();
        String password = new String(Password_Field.getPassword());
        String phone = Phone_Field.getText();
        String address=Address_Field.getText();
        String medical_history=MedicalHistory_Field.getText();
        
        String[] genders={"Gender", "Male", "Female", "Others"};
        String[] bloodgroups ={"Blood Group","A+","A-","B+","B-","AB+","AB-","O+","O-"};
        
        int genderIndex=Gender_Box.getSelectedIndex();
        int bloodIndex=Blood_Box.getSelectedIndex();
        
        if (genderIndex==0 || bloodIndex==0){
            JOptionPane.showMessageDialog(this, "Please select a valid Gender and Blood Group");
            return;
        }
        
        String selectGender=genders[genderIndex];
        String selectBloodGroup=bloodgroups[bloodIndex];

        System.out.println("Collected user data");

        try {
            User user = new User(email, username, password, phone, address, selectGender, selectBloodGroup, medical_history);
            UserDao userDao = new UserDao();

            System.out.println("Attempting registration");
            boolean isRegistered = userDao.registerUser(user);

            if (isRegistered) {
                System.out.println("User registered successfully");
                JOptionPane.showMessageDialog(this, "Registration successful!");
                this.dispose();
            } else {
                System.out.println("User already exists or registration failed");
                JOptionPane.showMessageDialog(this, "User already exists or registration failed.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address_Field;
    private javax.swing.JComboBox<String> Blood_Box;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JTextField Email_Field;
    private javax.swing.JComboBox<String> Gender_Box;
    private javax.swing.JTextField MedicalHistory_Field;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JTextField Phone_Field;
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JTextField Username_Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
public boolean isPasswordSecure(String password) {
    if (password.length() < 8) return false;

    boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

    for (char ch : password.toCharArray()) {
        if (Character.isUpperCase(ch)) hasUpper = true;
        else if (Character.isLowerCase(ch)) hasLower = true;
        else if (Character.isDigit(ch)) hasDigit = true;
        else if ("!@#$%^&*()_+-=[]{}|;':\",.<>?/`~".contains(Character.toString(ch))) hasSpecial = true;
    }

    return hasUpper && hasLower && hasDigit && hasSpecial;
}
}
