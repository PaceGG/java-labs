package ru.butorin.text;

import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class TextProcessing {
    public static Set<Character> processText(){
        String filename = "ru/butorin/text/text.txt";

        Set<Character> goodCharacters = new HashSet<>();
        goodCharacters.add('й');
        goodCharacters.add('к');
        goodCharacters.add('с');
        goodCharacters.add('т');
        goodCharacters.add('ф');
        goodCharacters.add('х');
        goodCharacters.add('ц');
        goodCharacters.add('ч');
        goodCharacters.add('ш');
        goodCharacters.add('щ');

        Set<Character> chars = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (int i = 0; i < words.length; i+=2) {
                    String word = words[i];

                    for (char c : word.toCharArray()) {
                        c = Character.toLowerCase(c);
                        if (goodCharacters.contains(c)) {
                            chars.add(c);
                        }
                    }
                }
            }
        } catch(IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            System.out.println("Текущая директория: " + System.getProperty("user.dir"));
        }

        return new TreeSet<>(chars);

    }
}