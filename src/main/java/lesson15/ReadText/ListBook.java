package main.java.lesson15.ReadText;


import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ListBook implements Serializable {
    private static List<Books> list = ListBook.CreateList();

    public static List<Books> getList() {
        return list;
    }

    public static List<Books> CreateList() {
        List<Books> list = new ArrayList<>();
        CreateFile createFile = new CreateFile();
        createFile.writeFileText();
        try {
            List<String> productLines = Files.readAllLines(java.nio.file.Paths.get(String.valueOf(CreateFile.getFile())), StandardCharsets.UTF_8);
            for (String line : productLines) {
                Books books = new Books();
                String[] tokens = line.split("\"");
                books.setAuthorName(tokens[0]);
                books.setTitleOfTheBook(tokens[1]);
                list.add(books);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
