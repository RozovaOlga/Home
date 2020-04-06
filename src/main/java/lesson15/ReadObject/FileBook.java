package main.java.lesson15.ReadObject;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileBook implements Serializable {
    private static List<Books> list = new ArrayList<>();

    public static List<Books> getList() {
        return list;
    }

    public static void setList(Books list) {
        FileBook.list = Collections.singletonList(list);
    }

    static {
        File filePath = new File("Books");
        filePath.mkdir();
        File file = new File(filePath, "BookList.txt");
        try {
            file.createNewFile();
            list.add(new Books("Пушкин А.С.", "Капитанская дочка"));
            list.add(new Books("Пушкин А.С.", "Руслан и Людмила"));
            list.add(new Books("Есенин С.А.", "Черный человек"));
            list.add(new Books("Булгаков М.Ф.", "Мастер и Маргарита"));
            list.add(new Books("Пушкин А.С.", " Пиковая дама"));
        } catch (IOException e) {
            System.out.println("error");
        }
    }


}

