package shop;

public class Main {
    public static void main(String[] args) throws Exception{
        Shop sh = new Shop("Pharmasy", "Pushkina 3", 5);
        Good g1 = new Good("Analgin", 17);
        Good g2 = new Good("Aspirin", 24);
        Good g3 = new Good("Coldrex", 160);

        sh.arrivalGoods(g1);
        sh.arrivalGoods(g2);
        sh.arrivalGoods(g3);

        sh.sellGoods(g1);
        sh.sellGoods(g2);
        sh.sellGoods(g3);
        //sh.sellGoods(g1);

        System.out.println("---------------------------------------------------------------------------");
        sh.printProduct();
        System.out.println("Товаров в наличии " + sh.getCntGood() + " на сумму " + sh.getCash());
    }
}