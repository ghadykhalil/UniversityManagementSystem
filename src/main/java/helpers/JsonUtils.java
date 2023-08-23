package helpers;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JsonUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    private static String getAbsolutePath(String filePath) {
        return Paths.get("").toAbsolutePath().toString() + File.separator + filePath;
    }

    public static <T> List<T> readData(String filePath, Class<T> clazz) throws IOException {
        File file = new File(getAbsolutePath(filePath));
        if (!file.exists()) {
            return new ArrayList<>();
        }
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, clazz));
            }

    public static <T> void writeData(String filePath, List<T> data) throws IOException {
        mapper.writeValue(new File(getAbsolutePath(filePath)), data);
    }

    public static <T> void saveData(String filePath, T item) throws IOException {
        List<T> data = readData(filePath, (Class<T>) item.getClass());
        data.add(item);
        writeData(filePath, data);
    }

    public static <T> void updateData(String filePath, T updatedItem, Predicate<T> predicate) throws IOException {
        List<T> data = readData(filePath, (Class<T>) updatedItem.getClass());
        for (int i = 0; i < data.size(); i++) {
            T item = data.get(i);
            if (predicate.test(item)) {
                data.set(i, updatedItem);
                break;
            }
        }
        writeData(filePath, data);
    }

    public static <T> void deleteData(String filePath, Predicate<T> predicate) throws IOException {
        List<T> data = readData(filePath, null);
        data.removeIf(predicate::test);
        writeData(filePath, data);
    }
}
