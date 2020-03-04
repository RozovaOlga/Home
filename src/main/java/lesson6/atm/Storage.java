package main.java.lesson6.atm;

import java.io.*;

public class Storage implements DataOperations {

    public Cart read(Cart cart) {
        try {
            File file = new File("balance.txt");
            boolean create = file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                cart = (Cart) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cart;
    }

    public void save(Cart cart) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("balance.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(cart);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

