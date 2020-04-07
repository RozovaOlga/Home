package by.home.lesson6.number25;

/**
 * Создать иерархию классов,описывающих банковские карточки.
 * Иерархия должна описывать хотя бы три уровня
 */
public class BankCard {
    public static void main(String[] args) {
        BelCard belCard = new BelCard(1234, "Ivan", true, 10);
        CurrencyCard visaGold = new CurrencyCard(2345, "Vasilij", true, false, 1999);
        RubleCard visaClassic = new RubleCard(3456, "Natasha", false, true, 200);
    }
}
