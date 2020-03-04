package main.java.lesson6.atm;

import java.util.Scanner;

public class MoneyTransaction {
    DataOperations dataOperations = new Storage();

    public boolean give(int giveMoney, Cart cart) {
        cart = dataOperations.read(cart);
        boolean resultGive = true;
        if (cart.getBalance() >= giveMoney) {
            int faceValue20 = 20;
            int faceValue50 = 50;
            int faceValue100 = 100;
            int numberOfBanknotes = giveMoney / faceValue20;
            int numberFaceValue20 = 0, numberFaceValue50 = 0, numberFaceValue100 = 0;
            if (giveMoney == faceValue20) {
                numberFaceValue20 = 1;
            }
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
            } else {
                resultGive = false;
            }
        } else {
            resultGive = false;
        }
        dataOperations.save(cart);
        return resultGive;
    }

    public boolean take(int takeMoney, Cart cart) {
        cart = dataOperations.read(cart);
        boolean resultTake = true;
        int faceValue20 = 20;
        int faceValue50 = 50;
        int faceValue100 = 100;
        int numberOfBanknotes = takeMoney / faceValue20;
        int numberFaceValue20 = 0, numberFaceValue50 = 0, numberFaceValue100 = 0;
        if (takeMoney == faceValue20) {
            numberFaceValue20 = 1;
        }
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
        } else {
            resultTake = false;
        }
        dataOperations.save(cart);
        return resultTake;
    }

    public void readBalance(Cart cart) {
        cart = dataOperations.read(cart);
        System.out.println(cart.getBalance());
    }

    public void anotherOperation() {
        System.out.println("Для продолжения работы нажмите 1. Для выхода - нажмите 2");
        Scanner scanner = new Scanner(System.in);
        int continueOperation1 = scanner.nextInt();
        switch (continueOperation1) {
            case 1:
                OperationSelection.balanceOperation();
                break;
            case 2:
                System.out.println("До свидания");
                break;
            default:
                System.out.println("Такой операции не существует");
        }
    }
}