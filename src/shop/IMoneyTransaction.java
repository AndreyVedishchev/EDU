package shop;

/**
 * Created by User on 20.05.2017.
 */
public interface IMoneyTransaction {
    void transferMoney(IMoneyTransaction recipient, IMoneyTransaction donor, int amount);
}
