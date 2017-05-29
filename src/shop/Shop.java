package shop;

import java.util.Arrays;

public class Shop implements IMoneyTransaction{
    private String name;//название
    private String address;//адрес
    private Good[] goods;
    private int money;

    Shop(String name, String address, int lengh) {
        this.name = name;
        this.address = address;
        this.goods = new Good[lengh];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGoods(Good[] goods) {
        this.goods = goods;
    }

    public Good[] getGoods() {
        return goods;
    }

    int getCntGood(){
        int cnt = 0;
        for (Good good : goods) {
            if (good != null) cnt++;
        }
        return cnt;
    }

    void arrivalGoods(Good good) throws ShopIsFull{
        if (getCntGood() < goods.length){
            for (int i = 0; i < goods.length; i++){
                if (goods[i] == null){
                    goods[i] = good;
                    break;
                }}
        }else throw new ShopIsFull();
    }

    void sellGoods(Good good) throws ObjectIsMissing, GoodsEnded {
        if (good == null) {
            throw new ObjectIsMissing();
        }else {
            if (getCntGood() > 0) {
                for (int i = 0; i < goods.length; i++) {
                    if (goods[i] == good) {
                        goods[i] = null;
                        break;
                    }
                }
            } else throw new GoodsEnded();
        }
    }

    void printProduct(){
        for (Good good : goods) {
            if (good != null) {
                System.out.println(good.getName());
            }}}

    double getCash(){
        int cnt = 0;
        for (Good good: goods) {
            if (good != null) cnt += good.getCost();
        }
        return cnt;
    }

//    public Good getGoodFromStock(Good goodp) throws ObjectIsMissing{
//        for (int i = 0; i < goods.length; i++) {
//            if (goodp.getName() == goods[i].getName()){
//                return goodp;
//            }
//        }
//        throw new ObjectIsMissing();
//    }

    @Override
    public void transferMoney(IMoneyTransaction recipient, IMoneyTransaction donor, int amount) {

    }
//todo Связи пока только одна одностороняя Shop -> Good Помимо инкапсуляции полей, ожидаю методы Shop,
//todo обеспечивающие продажу товара, назначение цен, вывод списка и количества товара.
}