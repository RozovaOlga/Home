package main.java.lesson6.atm;

public class MoneyTransaction {
    public static void Give(int giveMoney, Cart cart) {
        int faceValueOfBanknotes = Money.getMoney().size();
        for (int index = 0; index < faceValueOfBanknotes; index++) {
            if (giveMoney % Money.getMoney().get(index) == 0) {
                cart.setBalance(cart.getBalance() - giveMoney);
                System.out.println("Ваш баланс " + cart.getBalance());
                //MoneyTransaction.AmountOfBanknote(giveMoney);
                break;
            } else if (index == faceValueOfBanknotes - 1) {
                System.out.print("Извините,банкомат выдает только купюры номиналом 20,50,100");
            }
        }
    }

    public static void Take(int takeMoney, Cart cart) {
        int faceValueOfBanknotes = Money.getMoney().size();
        for (int index = 0; index < faceValueOfBanknotes; index++) {
            if (takeMoney % Money.getMoney().get(index) == 0) {
                cart.setBalance(cart.getBalance() + takeMoney);
                System.out.println(takeMoney);
                System.out.println("Ваш баланс " + cart.getBalance());
                break;
            } else if (index == faceValueOfBanknotes - 1) {
                System.out.println("Извините,банкомат принимает только купюры номиналом 20,50,100");
            }
        }
    }

    public static void AmountOfBanknote(int giveMoney) {
        int faceValueOfBanknotes = Money.getMoney().size();
        int i = 0;
        while ((faceValueOfBanknotes != 0) && (Money.getMoney().get(--faceValueOfBanknotes)) > (giveMoney)) ;
        int index = faceValueOfBanknotes;
        int tempSum, count;
        do {
            if ((tempSum = giveMoney % Money.getMoney().get(index)) >= Money.getMoney().get(index) || tempSum == 0) {
                count = giveMoney / Money.getMoney().get(index);
                giveMoney = tempSum;
            } else {
                count = giveMoney / Money.getMoney().get(index) - 1;
                giveMoney = tempSum + Money.getMoney().get(index);
            }
            System.out.println("Номинал - " + Money.getMoney().get(index) + "; количество - " + count);
            while ((index != 0 && Money.getMoney().get(--index) > giveMoney)) ;
        } while ((i < faceValueOfBanknotes && giveMoney > 0));
    }
}




