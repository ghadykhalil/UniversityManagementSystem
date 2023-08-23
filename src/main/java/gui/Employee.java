package gui;

import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.AcademicYear;
import models.Corrector;
import models.Exam;
import models.Exercise;
import models.Question;
import models.Session;
import models.SessionSubject;
import models.Specialty;
import models.Student;
import models.Subject;
import services.AcademicYearService;
import static services.AcademicYearService.addAcademicYear;
import static services.AcademicYearService.getAcademicYears;
import services.CorrectorService;
import static services.CorrectorService.addCorrectorToList;
import services.ExamService;
import services.ExerciseService;
import services.SessionService;
import services.SessionSubjectService;
import services.SpecialtyService;
import static services.SpecialtyService.addSpecialty;
import services.StudentService;
import static services.StudentService.addStudentToList;
import services.SubjectService;

public class Employee extends javax.swing.JFrame {

    public Employee() {
        initComponents();
        loadCbxAcademicYear();
        loadCbxSpecialities();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        employeePane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cbxSessionExamSection = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cbxSubjectAddExamSection = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        addExamTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        modality = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        coefficient = new javax.swing.JTextField();
        date = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        addExam = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        SELECTED_NUMBER = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        addExerciseTable = new javax.swing.JTable();
        lblExercise = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        newExercise = new javax.swing.JTextArea();
        addExercise = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        questionContent = new javax.swing.JTextField();
        addQuestion = new javax.swing.JButton();
        numberInput = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        SELECTED_NUMBER1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        addQuestionTable = new javax.swing.JTable();
        scaleScore = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        addYear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        academicYearsTable = new javax.swing.JList<>();
        jPanel17 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sessionType = new javax.swing.JComboBox<>();
        addSession = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sessionsTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        selectedYearSessionTab = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        specialityList = new javax.swing.JList<>();
        newSpeciality = new javax.swing.JTextField();
        addSpeciality = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        newStudent = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        correctorList = new javax.swing.JList<>();
        newCorrector = new javax.swing.JTextField();
        addCorrector = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        addSubject = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        selectedSpecialityTab = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        subjectList = new javax.swing.JList<>();
        newSubject = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbxAcademicYear = new javax.swing.JComboBox<>();
        cbxSpecialities = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        goToStudents = new javax.swing.JButton();
        goToCorrectors = new javax.swing.JButton();
        result = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sessionCbx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("University System");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Academic Year:");

        employeePane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        employeePane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                employeePaneStateChanged(evt);
            }
        });
        employeePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeePaneMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Select Session");

        cbxSessionExamSection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxSessionExamSection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSessionExamSectionItemStateChanged(evt);
            }
        });
        cbxSessionExamSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSessionExamSectionActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Select Subject");

        cbxSubjectAddExamSection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxSubjectAddExamSection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSubjectAddExamSectionItemStateChanged(evt);
            }
        });
        cbxSubjectAddExamSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSubjectAddExamSectionActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Exams");

        addExamTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addExamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        addExamTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExamTableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(addExamTable);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Current Year:");

        year.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        year.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearPropertyChange(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Add Exam");

        modality.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "written", "project", "homework", "research" }));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setText("Modality");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setText("Coefficient (%)");

        coefficient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coefficientActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Date(dd/mm/yyyy)");

        addExam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addExam.setText("Add Exam ");
        addExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExamMouseClicked(evt);
            }
        });
        addExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Exercises");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Selected Exam Number:");

        SELECTED_NUMBER.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SELECTED_NUMBER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        addExerciseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        addExerciseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExerciseTableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(addExerciseTable);

        lblExercise.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblExercise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExercise.setText("Add Exercice");

        newExercise.setColumns(20);
        newExercise.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        newExercise.setRows(5);
        jScrollPane12.setViewportView(newExercise);

        addExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addExercise.setText("Add Exercise");
        addExercise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExerciseMouseClicked(evt);
            }
        });
        addExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExerciseActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setText("Selected Exercise:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Number");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Content");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Scale Score");

        questionContent.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        addQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addQuestion.setText("Add Question");
        addQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addQuestionMouseClicked(evt);
            }
        });

        numberInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numberInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberInputActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        SELECTED_NUMBER1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SELECTED_NUMBER1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Questions");

        addQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(addQuestionTable);

        scaleScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scaleScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(cbxSessionExamSection, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modality, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxSubjectAddExamSection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(coefficient)))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(addExam, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SELECTED_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel20))
                    .addComponent(addExercise))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SELECTED_NUMBER1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(questionContent, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addQuestion)
                            .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(scaleScore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SELECTED_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lblExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxSessionExamSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxSubjectAddExamSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coefficient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel25)
                            .addGap(18, 18, 18)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(addExam)
                            .addGap(27, 27, 27))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SELECTED_NUMBER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(5, 5, 5)
                        .addComponent(numberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questionContent, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scaleScore, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addExercise)
                            .addComponent(addQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1488, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        employeePane.addTab("Main", jPanel1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Academic Years");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add year");

        txtYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addYear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addYear.setText("Done");
        addYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addYearMouseClicked(evt);
            }
        });

        academicYearsTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        academicYearsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        academicYearsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                academicYearsTableMouseClicked(evt);
            }
        });
        academicYearsTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                academicYearsTableValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(academicYearsTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addYear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addGap(320, 320, 320))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addYear)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 587, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        employeePane.addTab("Academic Years", jPanel16);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Session");

        sessionType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sessionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Partial", "Final", "Catchup" }));

        addSession.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addSession.setText("Add");
        addSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSessionMouseClicked(evt);
            }
        });

        sessionsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sessionsTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sessionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sessionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sessionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sessionsTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Selected Year:");

        selectedYearSessionTab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sessionType, 0, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedYearSessionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(328, 328, 328))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedYearSessionTab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(sessionType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addSession)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 329, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        employeePane.addTab("Sessions", jPanel17);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Specialties");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Specialty");

        specialityList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        specialityList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        specialityList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specialityListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(specialityList);

        newSpeciality.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addSpeciality.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addSpeciality.setText("Done");
        addSpeciality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSpecialityMouseClicked(evt);
            }
        });
        addSpeciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSpecialityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newSpeciality)
                    .addComponent(addSpeciality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)))
                .addGap(373, 373, 373))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1488, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        employeePane.addTab("Specialities", jPanel18);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Students");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add Student");

        studentList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studentList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(studentList);

        newStudent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addStudent.setText("Done");
        addStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStudentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(newStudent)
                    .addComponent(addStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                .addGap(373, 373, 373))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        employeePane.addTab("Students", jPanel19);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Correctors");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Add Corrector");

        correctorList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correctorList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        correctorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correctorListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(correctorList);

        newCorrector.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addCorrector.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addCorrector.setText("Done");
        addCorrector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCorrectorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newCorrector)
                    .addComponent(addCorrector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)))
                .addGap(373, 373, 373))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newCorrector, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCorrector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        employeePane.addTab("Correctors", jPanel20);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Add Subject");

        addSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addSubject.setText("Add");
        addSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSubjectMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Selected Speciality:");

        selectedSpecialityTab.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        subjectList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subjectList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectListMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(subjectList);

        newSubject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newSubject))))
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedSpecialityTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(591, 591, 591))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedSpecialityTab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addSubject)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        employeePane.addTab("Subjects", jPanel21);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Speciality:");

        cbxAcademicYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxAcademicYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAcademicYearItemStateChanged(evt);
            }
        });

        cbxSpecialities.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxSpecialities.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSpecialitiesItemStateChanged(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refresh.setText("Restart App");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        goToStudents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goToStudents.setText("Go to Students ");
        goToStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToStudentsMouseClicked(evt);
            }
        });

        goToCorrectors.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        goToCorrectors.setText("Go to Correctors");
        goToCorrectors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToCorrectorsMouseClicked(evt);
            }
        });

        result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        result.setText("Check Results");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Please select a session here before continuing");

        sessionCbx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeePane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSpecialities, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(416, 416, 416)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(sessionCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goToStudents)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goToCorrectors)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refresh)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(result))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxAcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sessionCbx))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxSpecialities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goToCorrectors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goToStudents)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(employeePane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        Employee employee = new Employee();
        employee.setVisible(true);
        dispose();
    }//GEN-LAST:event_refreshMouseClicked

    private void cbxAcademicYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAcademicYearItemStateChanged
        Object selectedValue = cbxAcademicYear.getSelectedItem();
        if (selectedValue != null) {
            String stringValue = String.valueOf(selectedValue);
            try {
                int intValue = Integer.parseInt(stringValue);
                populateSessionTable(intValue);
                populateSessionCbx(intValue);
                loadCurrentYear(intValue);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_cbxAcademicYearItemStateChanged

    private void cbxSpecialitiesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSpecialitiesItemStateChanged
        if (cbxSpecialities.getSelectedItem() != null) {
            Object selectedValue = cbxSpecialities.getSelectedItem();
            String stringValue = String.valueOf(selectedValue);
            populateSubjectsList(stringValue);
        }
    }//GEN-LAST:event_cbxSpecialitiesItemStateChanged

    private void employeePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeePaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_employeePaneMouseClicked

    private void employeePaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_employeePaneStateChanged
        // TODO add your handling code here:
        int selectedIndex = employeePane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                break;
            case 1:
                populateAcademicYearsTable();
                break;
            case 3:
                populateSpecialtiesList();
                break;
            case 4:
                populateStudentList();
                break;
            case 5:
                populateCorrectorList();
                break;
        }
    }//GEN-LAST:event_employeePaneStateChanged

    private void subjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectListMouseClicked

    private void addSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSubjectMouseClicked
        Subject subject = new Subject(newSubject.getText());
        Specialty selectedSpecialty = SpecialtyService.getSpecialtyByName(selectedSpecialityTab.getText());
        selectedSpecialty.addSubject(subject);
        Predicate<Specialty> predicate = specialty -> specialty.getName().equals(selectedSpecialty.getName());
        SpecialtyService.updateSpeciality(selectedSpecialty, predicate);
        populateSubjectsList(selectedSpecialityTab.getText());
    }//GEN-LAST:event_addSubjectMouseClicked

    private void addCorrectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCorrectorMouseClicked
        // TODO add your handling code here:
        try {
            Corrector corrector = new Corrector(newCorrector.getText());
            addCorrectorToList(corrector);
            populateCorrectorList();
            correctorList.repaint();
            newCorrector.setText(null);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addCorrectorMouseClicked

    private void correctorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correctorListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_correctorListMouseClicked

    private void addStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStudentMouseClicked
        // TODO add your handling code here:
        try {
            Student student = new Student(newStudent.getText());
            addStudentToList(student);
            populateStudentList();
            studentList.repaint();
            newStudent.setText(null);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStudentMouseClicked

    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentListMouseClicked

    private void addSpecialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSpecialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSpecialityActionPerformed

    private void addSpecialityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSpecialityMouseClicked
        String specialityName = newSpeciality.getText();
        Specialty speciality = new Specialty(specialityName);
        addSpecialty(speciality);

        populateSpecialtiesList();
        specialityList.repaint();
        newSpeciality.setText(null);
        loadCbxSpecialities();
    }//GEN-LAST:event_addSpecialityMouseClicked

    private void specialityListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specialityListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_specialityListMouseClicked

    private void sessionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sessionsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionsTableMouseClicked

    private void addSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSessionMouseClicked
        String selectedSessionType = sessionType.getSelectedItem().toString();
        AcademicYear academicyear = AcademicYearService.getAcademicYearByYear((parseInt(String.valueOf(cbxAcademicYear.getSelectedItem()))));
        Session examinationSession = new Session(academicyear, selectedSessionType);
        SessionService.addExaminationSessionToList(examinationSession);
        populateSessionTable((int) cbxAcademicYear.getSelectedItem());
    }//GEN-LAST:event_addSessionMouseClicked

    private void academicYearsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicYearsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_academicYearsTableMouseClicked

    private void addYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addYearMouseClicked
        String yearText = txtYear.getText().trim();
        if (yearText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter a Year", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int year = Integer.parseInt(yearText);
            AcademicYear academicYear = new AcademicYear(year);
            addAcademicYear(academicYear);
            populateAcademicYearsTable();
            txtYear.setText(null);
            loadCbxAcademicYear();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Year", "Error!", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Year Already Exists", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addYearMouseClicked

    private void scaleScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scaleScoreActionPerformed

    private void numberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberInputActionPerformed

    private void addQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQuestionMouseClicked
        // TODO add your handling code here:
        try {
            int selectedNumber = parseInt(numberInput.getText());
            String content = questionContent.getText();
            double selectedScaleScore = Double.parseDouble(scaleScore.getText());
            int selectedRow = addExerciseTable.getSelectedRow();
            if (selectedRow != -1) {
                Question question = new Question(selectedNumber, content, selectedScaleScore);
                String exerciseId = (String) addExerciseTable.getValueAt(selectedRow, 0);
                Exercise selectedExercise = ExerciseService.getExerciseById(exerciseId);
                selectedExercise.addQuestion(question);
                ExerciseService.updateExercise(selectedExercise);
                numberInput.setText(null);
                questionContent.setText(null);
                scaleScore.setText(null);
                populateQuestionTable(selectedExercise);
            } else {
            }

        } catch (NumberFormatException e) {
            numberInput.setText(null);
            scaleScore.setText(null);
            JOptionPane.showMessageDialog(this, "Please Enter Valid Values", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_addQuestionMouseClicked

    private void addExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExerciseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addExerciseActionPerformed

    private void addExerciseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExerciseMouseClicked
        String selectedExercise = newExercise.getText();
        Exercise exercise = new Exercise(selectedExercise);
        int selectedRow = addExamTable.getSelectedRow();
        if (selectedRow != -1) {
            String examId = (String) addExamTable.getValueAt(selectedRow, 0);
            Exam selectedExam = ExamService.getExamById(examId);
            selectedExam.addExercise(exercise);
            ExamService.updateExam(selectedExam);
            populateExerciseTable(selectedExam);
            newExercise.setText(null);
        } else {
            JOptionPane.showMessageDialog(this, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addExerciseMouseClicked

    private void addExerciseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExerciseTableMouseClicked
        int selectedRow = addExerciseTable.getSelectedRow();
        if (selectedRow != -1) {
            String exerciseId = (String) addExerciseTable.getValueAt(selectedRow, 0);
            int exerciseNumber = (int) addExerciseTable.getValueAt(selectedRow, 1);
            SELECTED_NUMBER1.setText(String.valueOf(exerciseNumber));
            Exercise selectedExercise = ExerciseService.getExerciseById(exerciseId);
            populateQuestionTable(selectedExercise);
        } else {
            JOptionPane.showMessageDialog(this, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addExerciseTableMouseClicked

    private void addExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addExamActionPerformed

    private void addExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExamMouseClicked
        Session selectedSession = (Session) cbxSessionExamSection.getSelectedItem();
        Subject selectedSubject = (Subject) cbxSubjectAddExamSection.getSelectedItem();
        String selectedModality = (String) this.modality.getSelectedItem();
        String coefficientText = coefficient.getText();
        String selectedDate = date.getText();

        // Validate inputs
        if (selectedSession == null || selectedSubject == null || selectedModality == null || coefficientText.isEmpty() || selectedDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int selectedCoefficient;
        try {
            selectedCoefficient = Integer.parseInt(coefficientText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid coefficient value. Please enter a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        SessionSubject sessionSubject = SessionSubjectService.getSessionSubjectById(selectedSession, selectedSubject);
        Exam exam = new Exam(selectedDate, selectedModality, selectedCoefficient);
        sessionSubject.addExam(exam);
        SessionSubjectService.updateSessionSubject(sessionSubject);
        populateExamTable(selectedSession, selectedSubject);
        coefficient.setText(null);
        date.setText(null);
    }//GEN-LAST:event_addExamMouseClicked

    private void coefficientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coefficientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coefficientActionPerformed

    private void yearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearPropertyChange
        String input = year.getText();
        if (!input.isEmpty()) {
            input = input.trim();
            try {
                int parsedValue = Integer.parseInt(input);
                loadCbxSessionExamSection(parsedValue);
                loadcbxSubjectAddExamSection();

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
            }
        }
    }//GEN-LAST:event_yearPropertyChange

    private void addExamTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExamTableMouseClicked
        int selectedRow = addExamTable.getSelectedRow();
        if (selectedRow != -1) {
            String examId = (String) addExamTable.getValueAt(selectedRow, 0);
            int examNumber = (int) addExamTable.getValueAt(selectedRow, 1);
            SELECTED_NUMBER.setText(String.valueOf(examNumber));
            Exam selectedExam = ExamService.getExamById(examId);
            DefaultTableModel model = (DefaultTableModel) (addQuestionTable.getModel());
            model.setRowCount(0);

            populateExerciseTable(selectedExam);
        } else {
            System.out.println("No row selected.");
        }
    }//GEN-LAST:event_addExamTableMouseClicked

    private void cbxSubjectAddExamSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSubjectAddExamSectionActionPerformed
        Session selectedSession = (Session) cbxSessionExamSection.getSelectedItem();
        Subject selectedSubject = (Subject) cbxSubjectAddExamSection.getSelectedItem();

        if (selectedSession == null || selectedSubject == null) {
            DefaultTableModel model = (DefaultTableModel) addExamTable.getModel();
            model.setRowCount(0);
            DefaultTableModel model1 = (DefaultTableModel) addExerciseTable.getModel();
            model1.setRowCount(0);
            DefaultTableModel model2 = (DefaultTableModel) addQuestionTable.getModel();
            model2.setRowCount(0);
            return;
        }
        SessionSubject sessionSubject = new SessionSubject(selectedSession, selectedSubject);
        SessionSubjectService.addSessionSubject(sessionSubject);
        DefaultTableModel model1 = (DefaultTableModel) addExerciseTable.getModel();
        model1.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) addQuestionTable.getModel();
        model2.setRowCount(0);
        populateExamTable(selectedSession, selectedSubject);
    }//GEN-LAST:event_cbxSubjectAddExamSectionActionPerformed

    private void cbxSubjectAddExamSectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSubjectAddExamSectionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSubjectAddExamSectionItemStateChanged

    private void cbxSessionExamSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSessionExamSectionActionPerformed
        Session selectedSession = (Session) cbxSessionExamSection.getSelectedItem();
        Subject selectedSubject = (Subject) cbxSubjectAddExamSection.getSelectedItem();

        if (selectedSession == null || selectedSubject == null) {
            DefaultTableModel model = (DefaultTableModel) addExamTable.getModel();
            model.setRowCount(0);
            return;
        }
        SessionSubject sessionSubject = new SessionSubject(selectedSession, selectedSubject);
        SessionSubjectService.addSessionSubject(sessionSubject);
        populateExamTable(selectedSession, selectedSubject);
    }//GEN-LAST:event_cbxSessionExamSectionActionPerformed

    private void cbxSessionExamSectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSessionExamSectionItemStateChanged

    }//GEN-LAST:event_cbxSessionExamSectionItemStateChanged

    private void academicYearsTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_academicYearsTableValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_academicYearsTableValueChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void goToStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToStudentsMouseClicked
        Session selectedSession = (Session) sessionCbx.getSelectedItem();
        if (selectedSession == null) {
            JOptionPane.showMessageDialog(this, "No Selected Session", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Student_Interface student = new Student_Interface(selectedSession);
            student.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goToStudentsMouseClicked

    private void goToCorrectorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToCorrectorsMouseClicked
        Session selectedSession = (Session) sessionCbx.getSelectedItem();
        if (selectedSession == null) {
            JOptionPane.showMessageDialog(this, "No Selected Session", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Corrector_Interface student = new Corrector_Interface(selectedSession);
            student.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goToCorrectorsMouseClicked

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        Result result=new Result();
        result.setVisible(true);
        dispose();
    }//GEN-LAST:event_resultActionPerformed

    private void loadCurrentYear(int year) {
        this.year.setText(String.valueOf(year));
    }

    private void populateQuestionTable(Exercise exercise) {
        List<Question> questions = exercise.getQuestions();

        if (questions == null) {
            return;
        }

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        addQuestionTable.setModel(model);

        // Set the column names (including the hidden ID column)
        String[] columnNames = {"Question ID", "Number", "Content", "Scale Score"};
        model.setColumnIdentifiers(columnNames);

        // Hide the ID column
        TableColumn idColumn = addQuestionTable.getColumnModel().getColumn(0);
        idColumn.setMinWidth(0);
        idColumn.setMaxWidth(0);
        idColumn.setWidth(0);

        // Populate the table with questions
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            Object[] row = {question.getId(), question.getNumber(), question.getContent(), question.getScaleScore()};
            model.addRow(row);
        }
    }

    private void populateExerciseTable(Exam exam) {
        List<Exercise> exercises = exam.getExercises();

        if (exercises == null) {
            return;
        }

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        addExerciseTable.setModel(model);

        String[] columnNames = {"Exercise ID", "Number", "Content"};
        model.setColumnIdentifiers(columnNames);

        TableColumn idColumn = addExerciseTable.getColumnModel().getColumn(0);
        idColumn.setMinWidth(0);
        idColumn.setMaxWidth(0);
        idColumn.setWidth(0);

        // Set custom cell renderer for the "Content" column
        TableColumn contentColumn = addExerciseTable.getColumnModel().getColumn(2);
        contentColumn.setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                JTextArea textArea = new JTextArea();
                textArea.setText(value != null ? value.toString() : "");
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setSize(contentColumn.getWidth(), textArea.getPreferredSize().height);

                // Adjust the row height to display all the wrapped text
                if (table.getRowHeight(row) != textArea.getPreferredSize().height) {
                    table.setRowHeight(row, textArea.getPreferredSize().height);
                }

                return textArea;
            }
        });

        // Populate the table with exercises
        for (int i = 0; i < exercises.size(); i++) {
            Exercise exercise = exercises.get(i);
            Object[] row = {exercise.getId(), i + 1, exercise.getContent()};
            model.addRow(row);
        }
    }

    private void loadYear() {
        year.setText(cbxAcademicYear.getSelectedItem().toString());
    }

    private void populateSessionCbx(int year) {
        List<Session> allSessions = SessionService.getExaminationSessionsByYear(year);
        sessionCbx.removeAllItems();
        sessionCbx.addItem(null);
        for (Session obj : allSessions) {
            sessionCbx.addItem(obj);
        }
    }

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Employee employee = new Employee();
                employee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                employee.setVisible(true);
            }
        });
    }

    private void loadCbxAcademicYear() {
        List<AcademicYear> academicYears = getAcademicYears();
        Set<AcademicYear> years = new TreeSet<>();
        years.addAll(academicYears);
        cbxAcademicYear.removeAllItems();
        for (AcademicYear year : years) {
            cbxAcademicYear.addItem(year.getYear());
        }
    }

    private void loadCbxSpecialities() {
        List<Specialty> allSpecialities = SpecialtyService.getAllSpecialties();
        Set<Specialty> specialities = new TreeSet<>(Comparator.comparing(Specialty::getName));
        specialities.addAll(allSpecialities);
        cbxSpecialities.removeAllItems();
        for (Specialty obj : specialities) {
            cbxSpecialities.addItem(obj.getName());
        }
    }

    private void loadCbxSessionExamSection(int year) {
        AcademicYear academicYear = AcademicYearService.getAcademicYearByYear(year);
        List<Session> sessions = SessionService.getExaminationSessionsByYear(academicYear.getYear());
        cbxSessionExamSection.removeAllItems();

        cbxSessionExamSection.addItem(null);

        for (Session obj : sessions) {
            cbxSessionExamSection.addItem(obj);
        }
    }

    private void loadcbxSubjectAddExamSection() {
        List<Subject> allSubjects = SubjectService.getAllSubjects();
        cbxSubjectAddExamSection.removeAllItems();

        cbxSubjectAddExamSection.addItem(null);
        for (Subject obj : allSubjects) {
            cbxSubjectAddExamSection.addItem(obj);
        }
    }

    private void populateAcademicYearsTable() {
        List<AcademicYear> academicYears = getAcademicYears();
        Set<AcademicYear> years = new TreeSet<>(Comparator.comparing(AcademicYear::getYear));
        years.addAll(academicYears);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        academicYearsTable.setModel(listModel);

        academicYearsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        for (AcademicYear obj : years) {
            listModel.addElement(String.valueOf(obj.getYear()));
        }
    }

    private void populateSessionTable(int year) {
        selectedYearSessionTab.setText(String.valueOf(year));
        DefaultTableModel model = (DefaultTableModel) sessionsTable.getModel();
        model.setRowCount(0);

        List<Session> sessions = SessionService.getExaminationSessionsByYear(year);

        for (Session session : sessions) {
            String[] rowData = {String.valueOf(model.getRowCount() + 1), session.getSessionType()};
            model.addRow(rowData);
        }
    }

    private void populateSpecialtiesList() {
        List<Specialty> allSpecialities = SpecialtyService.getAllSpecialties();
        Set<Specialty> specialities = new TreeSet<>(Comparator.comparing(Specialty::getName));
        specialities.addAll(allSpecialities);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        specialityList.setModel(listModel);

        for (Specialty obj : specialities) {
            listModel.addElement(String.valueOf(obj.getName()));
        }
    }

    private void populateStudentList() {
        List<Student> allStudents = StudentService.getStudentsList();
        Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getUsername));
        students.addAll(allStudents);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        studentList.setModel(listModel);

        for (Student obj : students) {
            listModel.addElement(String.valueOf(obj.getUsername()));
        }
    }

    private void populateCorrectorList() {
        List<Corrector> allCorrectors = CorrectorService.getCorrectorList();
        Set<Corrector> correctors = new TreeSet<>(Comparator.comparing(Corrector::getUsername));
        correctors.addAll(allCorrectors);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        correctorList.setModel(listModel);

        for (Corrector obj : correctors) {
            listModel.addElement(String.valueOf(obj.getUsername()));
        }
    }

    private void populateSubjectsList(String value) {
        selectedSpecialityTab.setText(value);
        List<Subject> allSubjects = SpecialtyService.getSubjectsBySpeciality(value);
        Set<Subject> subjects = new TreeSet<>(Comparator.comparing(Subject::getName));
        subjects.addAll(allSubjects);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        subjectList.setModel(listModel);

        for (Subject obj : subjects) {
            listModel.addElement(obj.getName());
        }
        newSubject.setText(null);
    }

    private void populateExamTable(Session session, Subject subject) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        addExamTable.setModel(model);

        String[] columnNames = {"ID", "Exam Number", "Date", "Modality", "Coefficient"};
        model.setColumnIdentifiers(columnNames);

        addExamTable.getColumnModel().getColumn(0).setMinWidth(0);
        addExamTable.getColumnModel().getColumn(0).setMaxWidth(0);
        addExamTable.getColumnModel().getColumn(0).setWidth(0);

        List<Exam> exams = SessionSubjectService.getExamsBySessionAndSubject(session, subject);
        for (int i = 0; i < exams.size(); i++) {
            Exam exam = exams.get(i);
            Object[] row = {exam.getId(), i + 1, exam.getDate(), exam.getModality(), exam.getCoefficient()};
            model.addRow(row);
        }

        addExamTable.setCellSelectionEnabled(false);
        addExamTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        addExamTable.setRowSelectionAllowed(true);
        addExamTable.setColumnSelectionAllowed(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SELECTED_NUMBER;
    private javax.swing.JLabel SELECTED_NUMBER1;
    private javax.swing.JList<String> academicYearsTable;
    private javax.swing.JButton addCorrector;
    private javax.swing.JButton addExam;
    private javax.swing.JTable addExamTable;
    private javax.swing.JButton addExercise;
    private javax.swing.JTable addExerciseTable;
    private javax.swing.JButton addQuestion;
    private javax.swing.JTable addQuestionTable;
    private javax.swing.JButton addSession;
    private javax.swing.JButton addSpeciality;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton addSubject;
    private javax.swing.JButton addYear;
    private javax.swing.JComboBox<Integer> cbxAcademicYear;
    private javax.swing.JComboBox<Session> cbxSessionExamSection;
    private javax.swing.JComboBox<String> cbxSpecialities;
    private javax.swing.JComboBox<Subject> cbxSubjectAddExamSection;
    private javax.swing.JTextField coefficient;
    private javax.swing.JList<String> correctorList;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JTabbedPane employeePane;
    private javax.swing.JButton goToCorrectors;
    private javax.swing.JButton goToStudents;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblExercise;
    private javax.swing.JComboBox<String> modality;
    private javax.swing.JTextField newCorrector;
    private javax.swing.JTextArea newExercise;
    private javax.swing.JTextField newSpeciality;
    private javax.swing.JTextField newStudent;
    private javax.swing.JTextField newSubject;
    private javax.swing.JTextField numberInput;
    private javax.swing.JTextField questionContent;
    private javax.swing.JButton refresh;
    private javax.swing.JButton result;
    private javax.swing.JTextField scaleScore;
    private javax.swing.JLabel selectedSpecialityTab;
    private javax.swing.JLabel selectedYearSessionTab;
    private javax.swing.JComboBox<Session> sessionCbx;
    private javax.swing.JComboBox<String> sessionType;
    private javax.swing.JTable sessionsTable;
    private javax.swing.JList<String> specialityList;
    private javax.swing.JList<String> studentList;
    private javax.swing.JList<String> subjectList;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables

}
