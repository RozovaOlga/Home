package main.java.lesson6.atm;

import java.util.Scanner;

public class OperationSelection {
    public static void balanceOperation() {
        MoneyTransaction moneyTransaction = new MoneyTransaction();
        Cart cart = new Cart(1234, 2000);
        Scanner scanner = new Scanner(System.in);
        if (!Security.checkSecurity(cart)) {
            Security.checkSecurity(cart);
        }
        System.out.println("Введите номер операции.1-положить деньги.2 -снять деньги.3-посмотреть баланс.4-выход");
        int numberOperation = scanner.nextInt();
        switch (numberOperation) {
            case 1:
                System.out.println("Введите сумму");
                int takeMoney = scanner.nextInt();
                System.out.println(moneyTransaction.take(takeMoney, cart));
                moneyTransaction.anotherOperation();
                break;
            case 2:
                System.out.println("Введите сумму");
                int giveMoney = scanner.nextInt();
                System.out.println(moneyTransaction.give(giveMoney, cart));
                moneyTransaction.anotherOperation();
                break;
            case 3:
                moneyTransaction.readBalance(cart);
                moneyTransaction.anotherOperation();
                break;
            case 4:
                System.out.println("До свидания");
                break;
            default:
                System.out.println("Такой операции не существует");
                moneyTransaction.anotherOperation();
                break;
        }
    }
}
