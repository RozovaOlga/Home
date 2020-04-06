package by.home.lesson15.ReadText;

import java.io.*;

public class CreateFile {
    private static File filePath = new File("Books");
    private static File file = new File(filePath, "text.txt");

    public static File getFile() {
        return file;
    }

    public static File getFilePath() {
        return filePath;
    }

    public void createDirectory() {
        filePath.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public void writeFileText() {
        String text = "Пушкин А.С.\" Капитанская дочка\"\nБулгаков М.Ф.\"Мастер и Маргарита\"\nПушкин А.С.\" Евгений Онегин \"\nПушкин А.С.\" Пиковая дама\"\nЕсенин С.А.\"Черный человек\"";
        createDirectory();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(CreateFile.getFile()))) {
            if (text != null) {
                fileWriter.write(text);
            } else {
                System.out.println("Извините,текст не найден");
                System.exit(0);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}