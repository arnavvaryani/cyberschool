/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Course;
import model.userProfiles.Professor;
import model.userProfiles.Student;
import utils.Manager;

/**
 *
 * @author nehadevarapalli
 */
public class StudentCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorCourseJPanel
     */
    Student s;
    Manager m;

    public StudentCourseJPanel(Student s, Manager m) {
        initComponents();
        this.s = s;
        this.m = m;
        populateTable();
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
        jPanel1 = new javax.swing.JPanel();
        scheduleLbl = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        language = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        searchNUIDTF = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        instructor = new javax.swing.JTextField();
        creditsLbl = new javax.swing.JLabel();
        languageLbl = new javax.swing.JLabel();
        schedule = new javax.swing.JTextField();
        credits = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        instructorLbl = new javax.swing.JLabel();
        languageLbl1 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        languageLbl2 = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        creditsLbl1 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(840, 600));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Course Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        scheduleLbl.setBackground(new java.awt.Color(255, 255, 255));
        scheduleLbl.setFont(scheduleLbl.getFont());
        scheduleLbl.setForeground(new java.awt.Color(0, 0, 0));
        scheduleLbl.setText("Schedule");

        btnView.setFont(btnView.getFont());
        btnView.setForeground(new java.awt.Color(0, 0, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        language.setForeground(new java.awt.Color(0, 0, 0));
        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(jLabel1.getFont());
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search:");

        name.setForeground(new java.awt.Color(0, 0, 0));

        searchNUIDTF.setForeground(new java.awt.Color(0, 0, 0));
        searchNUIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNUIDTFActionPerformed(evt);
            }
        });
        searchNUIDTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchNUIDTFKeyReleased(evt);
            }
        });

        nameLbl.setBackground(new java.awt.Color(255, 255, 255));
        nameLbl.setFont(nameLbl.getFont());
        nameLbl.setForeground(new java.awt.Color(0, 0, 0));
        nameLbl.setText("Name");

        descLbl.setBackground(new java.awt.Color(255, 255, 255));
        descLbl.setFont(descLbl.getFont());
        descLbl.setForeground(new java.awt.Color(0, 0, 0));
        descLbl.setText("Description");

        instructor.setForeground(new java.awt.Color(0, 0, 0));
        instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorActionPerformed(evt);
            }
        });

        creditsLbl.setBackground(new java.awt.Color(255, 255, 255));
        creditsLbl.setFont(creditsLbl.getFont());
        creditsLbl.setForeground(new java.awt.Color(0, 0, 0));
        creditsLbl.setText("Credits");

        languageLbl.setBackground(new java.awt.Color(255, 255, 255));
        languageLbl.setFont(languageLbl.getFont());
        languageLbl.setForeground(new java.awt.Color(0, 0, 0));
        languageLbl.setText("Language");

        schedule.setForeground(new java.awt.Color(0, 0, 0));
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });

        credits.setForeground(new java.awt.Color(0, 0, 0));

        tblCourse.setFont(tblCourse.getFont().deriveFont(tblCourse.getFont().getStyle() & ~java.awt.Font.BOLD, tblCourse.getFont().getSize()+1));
        tblCourse.setForeground(new java.awt.Color(0, 0, 0));
        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Credits", "Name", "Schedule", "Language", "Description", "Region", "Semester", "Professor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCourse);

        instructorLbl.setBackground(new java.awt.Color(255, 255, 255));
        instructorLbl.setFont(instructorLbl.getFont());
        instructorLbl.setForeground(new java.awt.Color(0, 0, 0));
        instructorLbl.setText("Instructor");

        languageLbl1.setBackground(new java.awt.Color(255, 255, 255));
        languageLbl1.setFont(languageLbl1.getFont());
        languageLbl1.setForeground(new java.awt.Color(0, 0, 0));
        languageLbl1.setText("Region");

        txtRegion.setForeground(new java.awt.Color(0, 0, 0));
        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane3.setViewportView(desc);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        languageLbl2.setBackground(new java.awt.Color(255, 255, 255));
        languageLbl2.setFont(languageLbl2.getFont());
        languageLbl2.setForeground(new java.awt.Color(0, 0, 0));
        languageLbl2.setText("Semester");

        semester.setForeground(new java.awt.Color(0, 0, 0));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        creditsLbl1.setBackground(new java.awt.Color(255, 255, 255));
        creditsLbl1.setFont(creditsLbl1.getFont());
        creditsLbl1.setForeground(new java.awt.Color(0, 0, 0));
        creditsLbl1.setText("Course Code");

        code.setForeground(new java.awt.Color(0, 0, 0));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 122, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchNUIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(nameLbl))
                                    .addComponent(instructorLbl)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scheduleLbl)
                                        .addComponent(creditsLbl))
                                    .addComponent(languageLbl, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(language, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(credits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(languageLbl1)
                                .addComponent(languageLbl2)
                                .addComponent(creditsLbl1))
                            .addComponent(descLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(code)
                                .addComponent(semester)
                                .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegister)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {creditsLbl, creditsLbl1, descLbl, instructorLbl, languageLbl, languageLbl1, languageLbl2, nameLbl, scheduleLbl});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {credits, instructor, language, name, schedule});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnRegister, btnView});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchNUIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnClear)
                    .addComponent(btnRegister))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languageLbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languageLbl2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditsLbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLbl)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructorLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scheduleLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languageLbl)
                            .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creditsLbl)
                            .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {creditsLbl, creditsLbl1, descLbl, instructorLbl, languageLbl, languageLbl1, languageLbl2, nameLbl, scheduleLbl});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnRegister, btnView});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRowIndex = tblCourse.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex, 0);
        Professor selectedProfessor = (Professor) model.getValueAt(selectedRowIndex, 8);
        name.setText(selectedCourse.getName());
        instructor.setText(selectedCourse.getInstructor());
        schedule.setText(selectedCourse.getSchedule());
        language.setText(selectedCourse.getLanguage());
        desc.setText(selectedCourse.getDesc());
        credits.setText(String.valueOf(selectedCourse.getCredits()));
        code.setText(String.valueOf(selectedCourse.getCode()));
        semester.setText(selectedCourse.getSemester());
        txtRegion.setText(selectedProfessor.getPerson().getCountry());
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        model.setRowCount(0);
        for (Professor p : m.getProfessors().getProfessors()) {
            for (Course course1 : p.getCourseOfferings()) {
                model.addRow(new Object[]{
                    course1,
                    course1.getCredits(),
                    course1.getName(),
                    course1.getSchedule(),
                    course1.getLanguage(),
                    course1.getDesc(),
                    p.getPerson().getCountry(),
                    course1.getSemester(),
                    p});
            }
        }
    }

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    private void searchNUIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNUIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNUIDTFActionPerformed

    private void searchNUIDTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchNUIDTFKeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel) tblCourse.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        tblCourse.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchNUIDTF.getText()));
    }//GEN-LAST:event_searchNUIDTFKeyReleased

    private void instructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructorActionPerformed

    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleActionPerformed

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        name.setText("");
        instructor.setText("");
        schedule.setText("");
        language.setText("");
        credits.setText("");
        desc.setText("");
        txtRegion.setText("");
        code.setText("");
        semester.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCourse.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to register.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex, 0);
        for (Course c : s.getTranscript().keySet()) {
            if (c.getCode() == selectedCourse.getCode()) {
                JOptionPane.showMessageDialog(this, "Already registered to this course.");
                return;
            }
        }
        s.getTranscript().put(selectedCourse, "TBA");
        selectedCourse.getRegisteredStudents().add(s);
        JOptionPane.showMessageDialog(this, "Course registred successfully!");
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField code;
    private javax.swing.JTextField credits;
    private javax.swing.JLabel creditsLbl;
    private javax.swing.JLabel creditsLbl1;
    private javax.swing.JTextArea desc;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField instructor;
    private javax.swing.JLabel instructorLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField language;
    private javax.swing.JLabel languageLbl;
    private javax.swing.JLabel languageLbl1;
    private javax.swing.JLabel languageLbl2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField schedule;
    private javax.swing.JLabel scheduleLbl;
    private javax.swing.JTextField searchNUIDTF;
    private javax.swing.JTextField semester;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtRegion;
    // End of variables declaration//GEN-END:variables
}