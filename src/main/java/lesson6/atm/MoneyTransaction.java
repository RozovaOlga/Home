package main.java.lesson6.atm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MoneyTransaction {
    public static void Give(int giveMoney, Cart cart) throws IOException {
        int faceValue20 = 20;
        int faceValue50 = 50;
        int faceValue100 = 100;
        int numberOfBanknotes = giveMoney / faceValue20;
        int numberFaceValue20 = 0, numberFaceValue50 = 0, numberFaceValue100 = 0;
        for (int i = 0; faceValue100 * i <= giveMoney; i++) {
            for (int j = 0; faceValue100 * i + faceValue50 * j <= giveMoney; j++) {
                for (int k = 0; faceValue100 * i + faceValue50 * j + faceValue20 * k <= giveMoney; k++) {
                    if ((giveMoney == faceValue100 * i + faceValue50 * j + faceValue20 * k) && (numberOfBanknotes > i + j + k)) {
                        numberOfBanknotes = i + j + k;
                        numberFaceValue20 = k;
                        numberFaceValue50 = j;
                        numberFaceValue100 = i;
                    }
                }
            }
        }
        if ((numberFaceValue20 + numberFaceValue50 + numberFaceValue100 != 0) || (giveMoney == faceValue20)) {
            if (giveMoney == faceValue20) {
                numberFaceValue20 = 1;
            }
            cart.setBalance(cart.getBalance() - giveMoney);
            System.out.println("Вам выдали купюр достоинством 20р - " + numberFaceValue20 + "шт." + "\n" +
                    "купюр достоинством 50р - " + numberFaceValue50 + "шт." + "\n"
                    + "купюр достоинством 100р - " + numberFaceValue100 + "шт.");
            System.out.println("Ваш баланс " + cart.getBalance());
        } else {
            System.out.print("Извините,банкомат выдает только купюры номиналом 20,50,100");
        }
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\balance.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cart);
        objectOutputStream.close();
    }

    public static void Take(int takeMoney, Cart cart) throws IOException {
        int faceValue20 = 20;
        int faceValue50 = 50;
        int faceValue100 = 100;
        int numberOfBanknotes = takeMoney / faceValue20;
        int numberFaceValue20 = 0, numberFaceValue50 = 0, numberFaceValue100 = 0;
        for (int i = 0; faceValue100 * i <= takeMoney; i++) {
            for (int j = 0; faceValue100 * i + faceValue50 * j <= takeMoney; j++) {
                for (int k = 0; faceValue100 * i + faceValue50 * j + faceValue20 * k <= takeMoney; k++) {
                    if ((takeMoney == faceValue100 * i + faceValue50 * j + faceValue20 * k) && (numberOfBanknotes > i + j + k)) {
                        numberOfBanknotes = i + j + k;
                        numberFaceValue20 = k;
                        numberFaceValue50 = j;
                        numberFaceValue100 = i;
                    }
                }
            }
        }
        if ((numberFaceValue20 + numberFaceValue50 + numberFaceValue100 != 0) || (takeMoney == faceValue20)) {
            cart.setBalance(cart.getBalance() + takeMoney);
            System.out.println("Ваш баланс " + cart.getBalance());
        } else {
            System.out.print("Извините,банкомат принимает купюры номиналом 20,50,100");
        }
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\balance.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cart);
        objectOutputStream.close();
    }
}
