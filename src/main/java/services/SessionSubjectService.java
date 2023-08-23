package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import helpers.JsonUtils;
import models.Exam;
import models.Session;
import models.SessionSubject;
import models.Subject;

public class SessionSubjectService {

    private static final String SESSION_SUBJECT_FILE = "src/main/java/data/session_subjects.json";

    public SessionSubjectService() {
    }

    public static void addSessionSubject(SessionSubject sessionSubject) {
        try {
            List<SessionSubject> sessionSubjects = JsonUtils.readData(SESSION_SUBJECT_FILE, SessionSubject.class);

            for (SessionSubject existingSessionSubject : sessionSubjects) {
                if (existingSessionSubject.getSession().getId().equals(sessionSubject.getSession().getId())
                        && existingSessionSubject.getSubject().getId().equals(sessionSubject.getSubject().getId())) {
                    System.out.println("Session subject already exists.");
                    return;
                }
            }

            sessionSubjects.add(sessionSubject);
            JsonUtils.writeData(SESSION_SUBJECT_FILE, sessionSubjects);
        } catch (IOException e) {
            System.out.println("Error adding session subject: " + e.getMessage());
        }
    }

    public static List<SessionSubject> getSessionSubjects() {
        try {
            return JsonUtils.readData(SESSION_SUBJECT_FILE, SessionSubject.class);
        } catch (IOException e) {
            System.out.println("Error reading session subjects data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static SessionSubject getSessionSubjectById(Session session, Subject subject) {
        try {
            List<SessionSubject> sessionSubjects = JsonUtils.readData(SESSION_SUBJECT_FILE, SessionSubject.class);
            for (SessionSubject sessionSubject : sessionSubjects) {
                if (sessionSubject.getSession().getId().equals(session.getId()) && sessionSubject.getSubject().getId().equals(subject.getId())) {
                    return sessionSubject;
                }
            }
            return null; // SessionSubject not found
        } catch (IOException e) {
            System.out.println("Error reading session subjects data: " + e.getMessage());
            return null;
        }
    }

    public static List<Exam> getExamsBySessionAndSubject(Session session, Subject subject) {
        try {
            List<SessionSubject> sessionSubjects = JsonUtils.readData(SESSION_SUBJECT_FILE, SessionSubject.class);
            List<Exam> exams = new ArrayList<>();
            for (SessionSubject sessionSubject : sessionSubjects) {
                if (sessionSubject.getSession().getId().equals(session.getId()) && sessionSubject.getSubject().getId().equals(subject.getId())) {
                    exams.addAll(sessionSubject.getExams());
                }
            }
            return exams;
        } catch (IOException e) {
            System.out.println("Error reading session subjects data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void updateSessionSubject(SessionSubject updatedSessionSubject) {
        try {
            List<SessionSubject> sessionSubjects = JsonUtils.readData(SESSION_SUBJECT_FILE, SessionSubject.class);

            for (int i = 0; i < sessionSubjects.size(); i++) {
                SessionSubject existingSessionSubject = sessionSubjects.get(i);
                if (existingSessionSubject.getSession().getId().equals(updatedSessionSubject.getSession().getId())
                        && existingSessionSubject.getSubject().getId().equals(updatedSessionSubject.getSubject().getId())) {
                    sessionSubjects.set(i, updatedSessionSubject); // Replace the existing session subject with the updated one
                    JsonUtils.writeData(SESSION_SUBJECT_FILE, sessionSubjects); // Save the updated list to the file
                    return;
                }
            }

            System.out.println("Session subject not found."); // Session subject does not exist
        } catch (IOException e) {
            System.out.println("Error updating session subject: " + e.getMessage());
        }
    }

    
}
