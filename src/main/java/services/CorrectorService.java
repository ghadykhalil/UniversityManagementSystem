package services;

import helpers.JsonUtils;
import models.Corrector;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CorrectorService {

    private static final String CORRECTOR_FILE = "src/main/java/data/correctors.json";

    public static List<Corrector> getCorrectorList() {
        try {
            return JsonUtils.readData(CORRECTOR_FILE, Corrector.class);
        } catch (IOException e) {
            System.out.println("Error reading corrector data: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void addCorrectorToList(Corrector corrector) {
        try {
            if (isUsernameExists(corrector.getUsername())) {
                throw new IllegalArgumentException("Username already exists");
            }
            List<Corrector> correctors = getCorrectorList();
            correctors.add(corrector);
            JsonUtils.writeData(CORRECTOR_FILE, correctors);
        } catch (IOException e) {
            System.out.println("Error adding corrector: " + e.getMessage());
        }
    }

    public static boolean isUsernameExists(String username) {
        try {
            List<Corrector> correctors = JsonUtils.readData(CORRECTOR_FILE, Corrector.class);
            for (Corrector objCor : correctors) {
                if (objCor.getUsername().equals(username)) {
                    return true; // Username exists
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
        return false; // Username does not exist
    }

    public static void updateCorrectorData(Corrector updatedCorrector, Predicate<Corrector> predicate) {
        try {
            List<Corrector> correctors = getCorrectorList();
            for (int i = 0; i < correctors.size(); i++) {
                Corrector corrector = correctors.get(i);
                if (predicate.test(corrector)) {
                    correctors.set(i, updatedCorrector);
                    break;
                }
            }
            JsonUtils.writeData(CORRECTOR_FILE, correctors);
        } catch (IOException e) {
            System.out.println("Error updating corrector data: " + e.getMessage());
        }
    }

    public static Corrector getCorrectorById(String id) {
        List<Corrector> correctors = getCorrectorList();
        if (correctors != null) {
            for (Corrector corrector : correctors) {
                if (corrector.getId().equals(id)) {
                    return corrector;
                }
            }
        }
        return null;
    }
}
