/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import models.Answer;
import models.Exam;
import models.Exercise;
import models.Question;
import models.Session;
import models.Student;
import models.Subject;
import services.AnswerService;
import services.ExamService;
import services.ExerciseService;
import services.QuestionService;
import services.SessionSubjectService;
import services.StudentService;
import services.SubjectService;

public class Student_Interface extends javax.swing.JFrame {

    private Session session;

    public Student_Interface() {
        initComponents();
    }

    public Student_Interface(Session session) {
        initComponents();
        this.session = session;
        loadSessionType(session);
        loadSubjectCbx();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sessionType = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        subjectCbx = new javax.swing.JComboBox<>();
        studentCbx = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examTable = new javax.swing.JTable();
        startExam = new javax.swing.JButton();
        examSection = new javax.swing.JPanel();
        returnToMenu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Students Interface");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Exam:");

        sessionType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sessionType.setText("Partiel yyyy");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Select Subject");

        subjectCbx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subjectCbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectCbxItemStateChanged(evt);
            }
        });

        studentCbx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentCbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentCbxItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Student name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Available Exams");

        examTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(examTable);

        startExam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startExam.setText("Start Exam");
        startExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startExamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout examSectionLayout = new javax.swing.GroupLayout(examSection);
        examSection.setLayout(examSectionLayout);
        examSectionLayout.setHorizontalGroup(
            examSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        examSectionLayout.setVerticalGroup(
            examSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        returnToMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnToMenu.setForeground(new java.awt.Color(51, 102, 0));
        returnToMenu.setText(">>>Return to menu");
        returnToMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnToMenuMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("See Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(examSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subjectCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startExam)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sessionType)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returnToMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sessionType)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnToMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectCbx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(studentCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startExam)
                .addGap(12, 12, 12)
                .addComponent(examSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectCbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectCbxItemStateChanged
        Subject selectedSubject = (Subject) subjectCbx.getSelectedItem();
        if (selectedSubject == null) {
            studentCbx.setEnabled(false);
            return;
        } else {
            studentCbx.setEnabled(true);
            loadStudentCbx();
        }
    }//GEN-LAST:event_subjectCbxItemStateChanged

    private void startExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startExamMouseClicked
        if (subjectCbx.getSelectedItem() == null || studentCbx.getSelectedItem() == null || examTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Please Select A Subject,an Exam And Your Name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String examId = (String) examTable.getValueAt(examTable.getSelectedRow(), 0);
            Exam exam = ExamService.getExamById(examId);
            List<Exercise> allExercises = exam.getExercises();
            printExercises(allExercises);
        }
    }//GEN-LAST:event_startExamMouseClicked

    private void studentCbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentCbxItemStateChanged
        Student student = (Student) studentCbx.getSelectedItem();

        if (student == null) {
            DefaultTableModel model = new DefaultTableModel() {
            };
            examTable.setModel(model);
            examSection.removeAll();
            examSection.revalidate();
            examSection.repaint();
        } else {
            Subject selectedSubject = (Subject) subjectCbx.getSelectedItem();
            populateExamTable(session, selectedSubject, student);
        }
    }//GEN-LAST:event_studentCbxItemStateChanged

    private void returnToMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMenuMouseClicked
        Employee employee = new Employee();
        employee.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnToMenuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Result result=new Result();
        result.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printExercises(List<Exercise> exercises) {
        examSection.removeAll();

        examSection.setLayout(new BoxLayout(examSection, BoxLayout.Y_AXIS));
        int counter = 0;
        List<JTextField> answerFields = new ArrayList<>(); // Store the answer fields
        List<Question> allQuestions = new ArrayList<>();
        Student student = (Student) studentCbx.getSelectedItem();

        Font exerciseFont = new Font(examSection.getFont().getName(), Font.BOLD, 16);

        for (Exercise exercise : exercises) {
            ++counter;
            Exercise currentExercise = ExerciseService.getExerciseById(exercise.getId());

            JLabel exerciseLabel = new JLabel(counter + " " + currentExercise.getContent());
            exerciseLabel.setFont(exerciseFont); // Set the exercise label font size
            examSection.add(exerciseLabel);

            List<Question> questions = currentExercise.getQuestions();
            for (Question question : questions) {
                JLabel questionLabel = new JLabel(question.getNumber() + " " + question.getContent() + "    (" + question.getScaleScore() + ")");
                examSection.add(questionLabel);

                JTextField answerField = new JTextField(20);
                examSection.add(answerField);
                allQuestions.add(question);
                answerFields.add(answerField);
            }
        }

        JButton submitButton = new JButton("Submit");
        examSection.add(submitButton);

        // Add an action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the submission logic here
                for (int i = 0; i < allQuestions.size(); i++) {
                    Question objQuestion = allQuestions.get(i);
                    String answerTxt = answerFields.get(i).getText();
                    Answer answer = new Answer(student, answerTxt);
                    AnswerService.addAnswer(answer);
                    QuestionService.addAnswerToQuestion(objQuestion, answer);
                }
                JOptionPane.showMessageDialog(null, "Exam submitted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                studentCbx.setSelectedIndex(0);
            }
        });

        examSection.revalidate();
        examSection.repaint();
    }

    private void populateExamTable(Session session, Subject subject, Student student) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        examTable.setModel(model);

        String[] columnNames = {"ID", "Exam Number", "Date", "Modality"};
        model.setColumnIdentifiers(columnNames);

        examTable.getColumnModel().getColumn(0).setMinWidth(0);
        examTable.getColumnModel().getColumn(0).setMaxWidth(0);
        examTable.getColumnModel().getColumn(0).setWidth(0);

        List<Exam> exams = SessionSubjectService.getExamsBySessionAndSubject(session, subject);
        int examNumber = 0;
        for (int i = 0; i < exams.size(); i++) {
            Exam exam = exams.get(i);
            if (ExamService.hasStudentCompletedExam(exam, student)) {
                continue;
            } else {
                examNumber++;
                Object[] row = {exam.getId(), examNumber, exam.getDate(), exam.getModality()};
                model.addRow(row);
            }
        }

        examTable.setCellSelectionEnabled(false);
        examTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        examTable.setRowSelectionAllowed(true);
        examTable.setColumnSelectionAllowed(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Interface().setVisible(true);
            }
        });
    }

    private void loadSessionType(Session session) {
        sessionType.setText(session.getSessionType() + " " + session.getAcademicYear().getYear());
    }

    private void loadStudentCbx() {
        List<Student> allStudents = StudentService.getStudentsList();
        studentCbx.removeAllItems();
        studentCbx.addItem(null);
        for (Student obj : allStudents) {
            studentCbx.addItem(obj);
        }
    }

    private void loadSubjectCbx() {
        List<Subject> allSubjects = SubjectService.getAllSubjects();
        subjectCbx.removeAllItems();
        subjectCbx.addItem(null);
        for (Subject obj : allSubjects) {
            subjectCbx.addItem(obj);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel examSection;
    private javax.swing.JTable examTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel returnToMenu;
    private javax.swing.JLabel sessionType;
    private javax.swing.JButton startExam;
    private javax.swing.JComboBox<Student> studentCbx;
    private javax.swing.JComboBox<Subject> subjectCbx;
    // End of variables declaration//GEN-END:variables
}
