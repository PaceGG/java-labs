package ru.butorin.university;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exam {
    public static void failureStudents() {
        String filename = "ru/butorin/university/results.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                String[] parts = line.split(" ");

                String surname = parts[0];
                String name = parts[1];
                int score1 = Integer.parseInt(parts[2]);
                int score2 = Integer.parseInt(parts[3]);

                if (score1 < 30 || score2 < 30){
                    System.out.println(surname + " " + name);
                }
            }
        } catch(IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            System.out.println("Текущая директория: " + System.getProperty("user.dir"));
        }
    }
}
