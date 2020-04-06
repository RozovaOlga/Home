package by.home.lesson13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * The type Number 33.
 * Вывести список файлов и каталогов выбранного файла на диске
 * Файлы и каталоги должны быть распечатаны отдельно
 * Еще думаю по поводу создания скрытых файлов
 */
public class Number33 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        File filePath = new File("Directory");
        if (filePath != null) {
            filePath.mkdir();
        }
        createNew(filePath);
        readFilePath(filePath);
        readDirectoryPath(filePath);
    }

    private static void createNew(File filePath) {
        try {
            File filePath1 = new File(filePath, "Directory1");
            File filePath2 = new File(filePath, "Directory2");
            File filePath3 = new File(filePath, ".Directory3");
            filePath1.mkdir();
            filePath2.mkdir();
            filePath3.mkdir();
            Process p = Runtime.getRuntime().exec("attrib +H " + filePath3.getAbsolutePath());
            p.waitFor();
            File file1 = new File(filePath1, "test1.txt");
            File file2 = new File(filePath2, "test2.txt");
            File file3 = new File(filePath3, "test3.txt");
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (NullPointerException | InterruptedException | IOException e) {
            System.out.println("Ой ей");
        }
    }

    private static void readDirectoryPath(File filePath) {
        try {
            Files.walk(Paths.get(String.valueOf(filePath)))
                    .map(Path::toFile)
                    .forEach(f -> {
                        if (f.isDirectory()) {
                            System.out.println(f.getAbsolutePath() + " - это папка");
                        }
                    });
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    private static void readFilePath(File filePath) {
        try {
            Files.walk(Paths.get(String.valueOf(filePath)))
                    .map(Path::toFile)
                    .forEach(f -> {
                        if (!f.isDirectory()) {
                            System.out.println(f.getAbsolutePath() + " - это файл");
                        }
                    });
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
