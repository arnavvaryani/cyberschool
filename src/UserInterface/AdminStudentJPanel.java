/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import static UserInterface.ProfessorProfileJPanel.showPasswordInputDialog;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Degree;
import model.userProfiles.Student;
import model.userProfiles.Students;
import utils.Manager;

/**
 *
 * @author nehadevarapalli
 */
public class AdminStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminStudentJPanel
     */
    Manager m;
    Students students;
    JPanel workArea;
    
    public AdminStudentJPanel(Manager m, JPanel workArea) {
        initComponents();
        this.m = m;
        this.workArea = workArea;
        this.students = m.getStudents();
        populateTable();
        btnSave.setEnabled(false);
        btnView.setEnabled(true);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        model.setRowCount(0);
        
        ArrayList<Student> studentsList = students.getStudents();

        for (Student student : studentsList) {
            model.addRow(new Object[]{
                student,
                student.getPerson().getGender(),
                student.getSelectedDegree().getName(),
                student.getPerson().getEmail(),
                student.getPerson().getUsername(),
                student.getPerson().getCurrentHashedPassword(),});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnViewTranscript = new javax.swing.JButton();
        comboSwitchDegree = new javax.swing.JComboBox<>();
        btnUpdatePassword = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Degree", "Email", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblStudent);

        jLabel1.setText("Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Gender");

        jLabel3.setText("Degree");

        jLabel4.setText("Email");

        jLabel5.setText("Username");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnViewTranscript.setText("View Transcript");
        btnViewTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTranscriptActionPerformed(evt);
            }
        });

        comboSwitchDegree.setForeground(new java.awt.Color(0, 0, 0));
        comboSwitchDegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSIS", "MSCS", "MSDS" }));

        btnUpdatePassword.setText("Update Password");
        btnUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewTranscript)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboSwitchDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {email, gender, name, username});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete)
                            .addComponent(btnSave)
                            .addComponent(btnClear)
                            .addComponent(btnViewTranscript)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboSwitchDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 57, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {email, gender, name, username});

    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        Student selectedStudent = (Student) model.getValueAt(selectedRowIndex, 0);
        name.setText(selectedStudent.getPerson().getName());
        gender.setText(selectedStudent.getPerson().getGender());
        comboSwitchDegree.setSelectedItem(selectedStudent.getSelectedDegree().getName());
        email.setText(selectedStudent.getPerson().getEmail());
        username.setText(selectedStudent.getPerson().getUsername());

        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        Student selectedStudent = (Student) model.getValueAt(selectedRowIndex, 0);
        
        students.delete(selectedStudent);
        JOptionPane.showMessageDialog(this, "Student deleted.");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        Student selectedStudent = (Student) model.getValueAt(selectedRowIndex, 0);
        
        if(name.getText().isBlank() || gender.getText().isBlank() || email.getText().isBlank() || username.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please fill all the details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!m.isValidUsername(username.getText())) {
            JOptionPane.showMessageDialog(this, "Choose a valid username.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        selectedStudent.getPerson().setName(name.getText());
        selectedStudent.getPerson().setGender(gender.getText());
        selectedStudent.getPerson().setEmail(email.getText());
        String degree = comboSwitchDegree.getSelectedItem().toString();
        Degree switchDegree = m.getDegreeOfferings().get(degree);
        selectedStudent.setSelectedDegree(switchDegree);
        selectedStudent.getPerson().setUsername(username.getText());

        JOptionPane.showMessageDialog(this, "Student updated.");
        
        populateTable();
        btnSave.setEnabled(false);
        btnView.setEnabled(true);
        name.setText("");
        gender.setText("");
        email.setText("");
        username.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        gender.setText("");
        email.setText("");
        username.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnViewTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTranscriptActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        Student selectedStudent = (Student) model.getValueAt(selectedRowIndex, 0);

        AdminTranscriptJPanel transcriptPanel = new AdminTranscriptJPanel(selectedStudent, workArea);
        workArea.add("TranscriptPanel", transcriptPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewTranscriptActionPerformed

    private void btnUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasswordActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudent.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a student.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        Student s = (Student) model.getValueAt(selectedRowIndex, 0);
        
        String newPassword = showPasswordInputDialog();
        if (!m.isValidPassword(newPassword)) {
            JOptionPane.showMessageDialog(this, "Please choose a password with one uppercase letter, lowercase letters, a special character and a number.");
            return;
        }

        newPassword = m.hashPassword(s.getPerson().getSalt(), newPassword);

        if (newPassword != null && !newPassword.isEmpty()) {
            if (!s.getPerson().setCurrentHashedPassword(newPassword)) {
                JOptionPane.showMessageDialog(this, "You cannot use a previously used password. Please choose a different one.");
            } else {
                s.getPerson().setCurrentHashedPassword(newPassword);
                JOptionPane.showMessageDialog(this, "Password updated.");
            }
            populateTable();
        } else {
            JOptionPane.showMessageDialog(this, "No changes made to password.");
        }
    }//GEN-LAST:event_btnUpdatePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdatePassword;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewTranscript;
    private javax.swing.JComboBox<String> comboSwitchDegree;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
