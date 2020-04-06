package main.java.lesson15.ReadObject;


import java.io.*;

public class Storage implements DataOperation {

    @Override
    public final FileBook readFile(FileBook list) {
        File filePath = new File("Books");
        filePath.mkdir();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filePath, "BookList.txt"));
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                list = (FileBook) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Извините, технические неполадки1.");
            System.exit(1);
        }
        return list;
    }


    @Override
    public final FileBook writeFile(FileBook list) {
        File filePath = new File("Books");
        filePath.mkdir();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath, "BookList.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Извините, технические неполадки.");
        }
        return list;
    }
}


