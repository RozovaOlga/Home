package main.java.lesson6.atm;

import java.util.Scanner;

/**
 * The type Operation selection.
 */
public final class OperationSelection {
    /**
     * Balance operation.
     * <p>
     * Upon successful verification of the PIN code, select the operation.
     *
     * @param cart the cart
     */
    public static void balanceOperation(Cart cart) {
        MoneyTransaction moneyTransaction = new MoneyTransaction();
        Scanner scanner = new Scanner(System.in);
        Security.checkSecurity(cart);
        boolean operation = true;
        String menu = "Введите номер операции.1-положить деньги.2 -снять деньги.3-посмотреть баланс.4-выход";
        String money = "Введите сумму";
        while (operation) {
            System.out.println(menu);
            int numberOperation = scanner.nextInt();
            switch (numberOperation) {
                case 1:
                    System.out.println(money);
                    int takeMoney = scanner.nextInt();
                    System.out.println(moneyTransaction.take(takeMoney, cart));
                    break;
                case 2:
                    System.out.println(money);
                    int giveMoney = scanner.nextInt();
                    System.out.println(moneyTransaction.give(giveMoney, cart));
                    break;
                case 3:
                    System.out.println(moneyTransaction.readBalance(cart));
                    break;
                case 4:
                    System.out.println("До свидания");
                    operation = false;
                    break;
                default:
                    System.out.println("Такой операции не существует");
                    break;
            }
        }
    }
}
