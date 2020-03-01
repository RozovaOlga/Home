package main.java.lesson6.atm;


import java.io.*;
import java.util.Scanner;

public class OperationSelection {
    public static void BalanceOperation(Cart cart) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(".\\", "balance.txt");
        boolean create = file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.available() > 0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            cart = (Cart) objectInputStream.readObject();
            objectInputStream.close();
        }
        System.out.println("Введите номер операции.1-положить деньги.2 -снять деньги.3-посмотреть баланс.4-выход");
        int numberOperation = scanner.nextInt();
        int balance = cart.getBalance();
        switch (numberOperation) {
            case 1:
                System.out.println("Введите сумму");
                int takeMoney = scanner.nextInt();
                MoneyTransaction.Take(takeMoney, cart);
                System.out.println("Для продолжения работы нажмите 1. Для выхода - нажмите 2");
                int continueOperation1 = scanner.nextInt();
                switch (continueOperation1) {
                    case 1:
                        BalanceOperation(cart);
                        break;
                    case 2:
                        System.out.println("До свидания");
                        break;
                    default:
                        System.out.println("Такой операции не существует");
                }
                break;
            case 2:
                System.out.println("Введите сумму");
                int giveMoney = scanner.nextInt();
                if (balance >= giveMoney) {
                    MoneyTransaction.Give(giveMoney, cart);
                } else {
                    System.out.println("недостаточно денег на счете");
                }
                System.out.println("Для продолжения работы нажмите 1. Для выхода - нажмите 2");
                int continueOperation2 = scanner.nextInt();
                switch (continueOperation2) {
                    case 1:
                        BalanceOperation(cart);
                        break;
                    case 2:
                        System.out.println("До свидания");
                        break;
                    default:
                        System.out.println("Такой операции не существует");
                }
                break;
            case 3:
                System.out.println(balance);
                System.out.println("Для продолжения работы нажмите 1. Для выхода - нажмите 2");
                int continueOperation3 = scanner.nextInt();
                switch (continueOperation3) {
                    case 1:
                        BalanceOperation(cart);
                        break;
                    case 2:
                        System.out.println("До свидания");
                        break;
                    default:
                        System.out.println("Такой операции не существует");
                }
                break;
            case 4:
                System.out.println("До свидания");
                break;
            default:
                System.out.println("Такой операции не существует");
        }
    }
}


