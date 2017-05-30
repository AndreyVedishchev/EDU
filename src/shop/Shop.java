package shop;

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
        if (getCntGood() > 0) {
            for (int j = 0; j < goods.length; j++) {
                if (goods[j] == good) {
                    goods[j] = null;
                    good.setName(null);
                    break;
                }else {
                    if (good.getName() == null) {
                      throw new ObjectIsMissing();
                    }}}
        } else throw new GoodsEnded();
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

    @Override
    public void transferMoney(IMoneyTransaction recipient, IMoneyTransaction donor, int amount) {
    }
}