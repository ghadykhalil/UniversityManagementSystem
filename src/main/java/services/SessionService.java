package services;

import helpers.JsonUtils;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import models.Session;

public class SessionService {

    private static final String EXAMINATION_SESSION_FILE = "src/main/java/data/examination_sessions.json";

    public static List<Session> getExaminationSessionsList() {
        try {
            List<Session> examinationSessions = JsonUtils.readData(EXAMINATION_SESSION_FILE, Session.class);
            return examinationSessions != null ? examinationSessions : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Error reading examination sessions data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void addExaminationSessionToList(Session examinationSession) {
        try {
            List<Session> examinationSessions = getExaminationSessionsList();
            examinationSessions.add(examinationSession);
            JsonUtils.writeData(EXAMINATION_SESSION_FILE, examinationSessions);
        } catch (IOException e) {
            System.out.println("Error adding examination session: " + e.getMessage());
        }
    }

    public static List<Session> getExaminationSessionsByYear(int year) {
        List<Session> sessionsByYear = new ArrayList<>();

        List<Session> allSessions = getExaminationSessionsList();

        for (Session session : allSessions) {
            if (session.getAcademicYear().getYear() == year) {
                sessionsByYear.add(session);
            }
        }

        return sessionsByYear;
    }
}
