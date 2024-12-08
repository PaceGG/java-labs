package ru.butorin.university;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Exam {
    public static List<String> failureStudents() {
        String filename = "ru/butorin/university/results.txt";

        Map<String, int[]> students = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                String[] parts = line.split(" ");

                String fullName = parts[0] + " " + parts[1];
                int score1 = Integer.parseInt(parts[2]);
                int score2 = Integer.parseInt(parts[3]);
                
                students.put(fullName, new int[]{score1, score2});
            }
        } catch(IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            System.out.println("Текущая директория: " + System.getProperty("user.dir"));
        }

        return students.entrySet().stream().filter(entry -> entry.getValue()[0] < 30 || entry.getValue()[1] < 30).map(Map.Entry::getKey).collect(Collectors.toList());

    }
}
