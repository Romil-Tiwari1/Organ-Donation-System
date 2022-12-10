/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DoctorWorkArea;

import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Organization.DoctorOrganization;
import HealthCentre.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author romiltiwari
 */
public class ManageDoctorProfileJPanel extends javax.swing.JPanel {

    
    private DoctorOrganization doctorOrganization;
    private UserAccount userAccount;
    private Enterprise enterprise;

    /**
     * Creates new form ManageDoctorProfile
     */
    public ManageDoctorProfileJPanel(UserAccount userAccount, 
            DoctorOrganization doctorOrg, Enterprise enterprise) {
        initComponents();
        this.doctorOrganization = doctorOrg;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateFields();
    }
    
    /**
     * Description : Populate Fields with Text Values
     */
    private void populateFields(){
        genderComboBox.removeAllItems();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        addressTextField.setText(userAccount.getEmployee().getAddress());
        cityTextField.setText(userAccount.getEmployee().getCity());
        contactTextField.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        dateOfBirthTextField.setText(String.valueOf(userAccount.getEmployee().getDateOfBirth()));
        nameTextField.setText(userAccount.getEmployee().getName());
        specializationTextField.setText(userAccount.getEmployee().getSpecialization());
        stateTextField.setText(userAccount.getEmployee().getState());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        specializationLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        specializationTextField = new javax.swing.JTextField();
        dateOfBirthTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        genderComboBox = new javax.swing.JComboBox();
        backLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 247, 247));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 0));
        nameLabel.setText("Name:");

        contactLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(255, 255, 1));
        contactLabel.setText("Contact:");

        addressLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 1));
        addressLabel.setText("Address:");

        cityLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 1));
        cityLabel.setText("City:");

        stateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stateLabel.setForeground(new java.awt.Color(255, 255, 1));
        stateLabel.setText("State:");

        genderLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 1));
        genderLabel.setText("Gender:");

        dateOfBirthLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateOfBirthLabel.setForeground(new java.awt.Color(255, 255, 1));
        dateOfBirthLabel.setText("DOB:");

        specializationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        specializationLabel.setForeground(new java.awt.Color(255, 255, 1));
        specializationLabel.setText("Specialization:");

        nameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        contactTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addressTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cityTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cityTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stateTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stateTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        specializationTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        specializationTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateOfBirthTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateOfBirthTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        genderComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        backLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backLabel.setForeground(new java.awt.Color(255, 255, 255));
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        titleLabel.setText("DOCTOR PROFILE");
        titleLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        titleLabel.setBounds(new java.awt.Rectangle(3, 3, 3, 3));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backLabel)
                                .addGap(92, 92, 92)
                                .addComponent(saveButton)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nameLabel)
                                    .addGap(113, 113, 113)
                                    .addComponent(nameTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(genderLabel)
                                            .addGap(101, 101, 101))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(specializationLabel)
                                            .addGap(55, 55, 55)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(specializationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stateTextField)
                                        .addComponent(cityTextField)
                                        .addComponent(addressTextField)
                                        .addComponent(dateOfBirthTextField)
                                        .addComponent(contactTextField)))))
                        .addContainerGap(123, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(contactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateOfBirthLabel)
                    .addComponent(dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(specializationTextField))
                    .addComponent(specializationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(cityTextField.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(contactTextField.getText()));
        userAccount.getEmployee().setDateOfBirth(new Date(dateOfBirthTextField.getText()));
        userAccount.getEmployee().setGender((String) genderComboBox.getSelectedItem());
        userAccount.getEmployee().setAddress(addressTextField.getText());
        userAccount.getEmployee().setState(cityTextField.getText());
        userAccount.getEmployee().setSpecialization(specializationTextField.getText());

    }//GEN-LAST:event_saveButtonActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backLabelMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        genderComboBox.removeAllItems();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        addressTextField.setText(userAccount.getEmployee().getAddress());
        cityTextField.setText(userAccount.getEmployee().getCity());
        contactTextField.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        dateOfBirthTextField.setText(String.valueOf(userAccount.getEmployee().getDateOfBirth()));
        nameTextField.setText(userAccount.getEmployee().getName());
        specializationTextField.setText(userAccount.getEmployee().getSpecialization());
        stateTextField.setText(userAccount.getEmployee().getState());
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel specializationLabel;
    private javax.swing.JTextField specializationTextField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
