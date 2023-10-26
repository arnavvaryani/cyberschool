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
import model.Courses;
import model.UserProfiles.Student;
import utils.Manager;

/**
 *
 * @author arnav
 */
public class StuCourseJPanel extends javax.swing.JPanel {

    Course course;
    Courses courses;
    Student selectedUser;
    Manager manager;

    /**
     * Creates new form CourseJPanel
     */
    public StuCourseJPanel() {
        initComponents();
        course = new Course();
        courses = new Courses();
        manager = new Manager();
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

        scheduleLbl = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        language = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        searchNUIDTF = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        instructor = new javax.swing.JTextField();
        creditsLbl = new javax.swing.JLabel();
        languageLbl = new javax.swing.JLabel();
        schedule = new javax.swing.JTextField();
        createCourse = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        credits = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        instructorLbl = new javax.swing.JLabel();
        languageLbl1 = new javax.swing.JLabel();
        language1 = new javax.swing.JTextField();
        schedule1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        nameLbl1 = new javax.swing.JLabel();
        instructorLbl1 = new javax.swing.JLabel();
        scheduleLbl1 = new javax.swing.JLabel();
        instructor1 = new javax.swing.JTextField();
        codeLbl1 = new javax.swing.JLabel();
        code1 = new javax.swing.JTextField();

        scheduleLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        scheduleLbl.setText("Schedule");

        btnView.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        jLabel1.setText("Search:");

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

        nameLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        nameLbl.setText("Name:");

        descLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        descLbl.setText("Description:");

        instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructorActionPerformed(evt);
            }
        });

        creditsLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        creditsLbl.setText("Credits:");

        languageLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        languageLbl.setText("Language:");

        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });

        createCourse.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        createCourse.setText("Register for Course");
        createCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCourseActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Student Course panel");

        tblCourse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Instructor", "Schedule", "Language", "Description", "Review", "Credits", "Outcomes", "Tuition cost", "Prereq", "Curriculum", "Region"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        instructorLbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        instructorLbl.setText("Instructor:");

        languageLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        languageLbl1.setText("Region:");

        language1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                language1ActionPerformed(evt);
            }
        });

        schedule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schedule1ActionPerformed(evt);
            }
        });

        nameLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        nameLbl1.setText("Tuiton cost:");

        instructorLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        instructorLbl1.setText("Prereq:");

        scheduleLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        scheduleLbl1.setText("Curriculum:");

        instructor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructor1ActionPerformed(evt);
            }
        });

        codeLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        codeLbl1.setText("Outcomes:");

        code1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(357, 357, 357)
                        .addComponent(searchNUIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(creditsLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(languageLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(descLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(scheduleLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nameLbl)
                                                    .addComponent(instructorLbl))
                                                .addGap(121, 121, 121)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(instructor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(languageLbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nameLbl1)
                                                    .addComponent(instructorLbl1))
                                                .addGap(121, 121, 121)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(instructor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(codeLbl1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(scheduleLbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(schedule1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(createCourse)
                                .addGap(323, 323, 323)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchNUIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeLbl1)
                            .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructorLbl1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schedule1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(scheduleLbl1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(instructorLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scheduleLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languageLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLbl)
                            .addComponent(desc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languageLbl1)
                    .addComponent(language1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(creditsLbl)))
                .addGap(18, 18, 18)
                .addComponent(createCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRowIndex = tblCourse.getSelectedRow();

        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex,0);
        name.setText(selectedCourse.getName());
        instructor.setText(selectedCourse.getInstructor());
        schedule.setText(selectedCourse.getSchedule());
        language.setText(selectedCourse.getLanguage());
        desc.setText(selectedCourse.getDesc());
        credits.setText(String.valueOf(selectedCourse.getCredits())); 
    }//GEN-LAST:event_btnViewActionPerformed

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    private void searchNUIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNUIDTFActionPerformed
        DefaultTableModel obj = (DefaultTableModel) tblCourse.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        tblCourse.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchNUIDTF.getText()));
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

    private void createCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCourseActionPerformed
      // manager.registerCourse(selectedUser, course);
        populateTable();
    }//GEN-LAST:event_createCourseActionPerformed

    private void language1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_language1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_language1ActionPerformed

    private void schedule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schedule1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schedule1ActionPerformed

    private void instructor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instructor1ActionPerformed

    private void code1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code1ActionPerformed

  private void populateTable() {
              DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        model.setRowCount(0);
        
       for (Course course1: courses.getCourses()) {
        model.addRow(new Object[]{
            course1,  
            course1.getCode(),
            course1.getCredits(),
            course1.getDesc(),
            course1.getGrade(),
            course1.getInstructor(),
            course1.getLanguage(),
            course1.getName(),
    
            course1.getReview(),
            course1.getSchedule(),          
        });                              
    }
//        outcomes.setText("");
//        name.setText("");
//        instructor.setText("");
//        schedule.setText("");
//        language.setText("");
//        desc.setText("");
//        credits.setText(""); 
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JTextField code1;
    private javax.swing.JLabel codeLbl1;
    private javax.swing.JButton createCourse;
    private javax.swing.JTextField credits;
    private javax.swing.JLabel creditsLbl;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField instructor;
    private javax.swing.JTextField instructor1;
    private javax.swing.JLabel instructorLbl;
    private javax.swing.JLabel instructorLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField language;
    private javax.swing.JTextField language1;
    private javax.swing.JLabel languageLbl;
    private javax.swing.JLabel languageLbl1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameLbl1;
    private javax.swing.JTextField schedule;
    private javax.swing.JTextField schedule1;
    private javax.swing.JLabel scheduleLbl;
    private javax.swing.JLabel scheduleLbl1;
    private javax.swing.JTextField searchNUIDTF;
    private javax.swing.JTable tblCourse;
    // End of variables declaration//GEN-END:variables
}
