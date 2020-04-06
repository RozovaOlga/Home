package by.home.lesson15.ReadObject;


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
            System.out.println("error");
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
            System.out.println("error");
        }
        return list;
    }
}


