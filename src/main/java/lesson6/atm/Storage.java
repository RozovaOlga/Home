package main.java.lesson6.atm;

import java.io.*;

/**
 * The type Storage.
 */
public final class Storage implements DataOperations {
    /**
     * Reads a file with a Card object. If the file cannot be found, an error exits the program.
     *
     * @param cart the cart
     * @return
     */
    public final Cart read(Cart cart) {
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
            System.out.println(e.getMessage());
            System.out.println("Извините, технические неполадки.");
            System.exit(1);
        }
        return cart;
    }

    /**
     * Writes a file with a Card object. If the file cannot be found, an error exits the program.
     *
     * @param cart the cart
     * @return
     */
    public final Cart save(Cart cart) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("balance.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(cart);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Извините, технические неполадки.");
            System.exit(1);
        }
        return cart;
    }
}

