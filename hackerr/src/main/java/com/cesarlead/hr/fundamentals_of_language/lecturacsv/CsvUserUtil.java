package com.cesarlead.hr.fundamentals_of_language.lecturacsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvUserUtil {

    private static final String HEADER = "id, name, email, pNumber";
    private static final String delimiter = ",";

    private CsvUserUtil() {
    }

    public static void writerUsers(Path path, List<User> users) throws IOException {

        try (var writer = Files.newBufferedWriter(path)) {
            writer.write(HEADER);
            writer.newLine();
            for (User user : users) {
                writer.write(user.id() + delimiter);
                writer.write(user.name() + delimiter);
                writer.write(user.email() + delimiter);
                writer.write(user.pNumber());
                writer.newLine();
            }
        }

    }

    public static List<User> readerUsers(Path path) throws IOException {

        List<User> list = new ArrayList<>();
        try (var reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            if (line == null || !line.equals(HEADER)) {
                throw new IOException("Invalid header");
            }
            while ((line = reader.readLine()) != null) {
                var parts = line.split(delimiter, -1);
                if (parts.length != 4) {
                    throw new IOException("Invalid line: " + line);
                }
                int id = Integer.parseInt(parts[0]);
                list.add(new User(id, parts[1], parts[2], parts[3]));
            }
        }

        System.out.println(list);

        return list;
    }
}
