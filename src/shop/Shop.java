package shop;

import java.util.ArrayList;

public class Shop{
    static int cas = 0;//деньги в кассе
    private String name;//название
    private String addres;//адрес
    private ArrayList<Goods> product;//список продуктов

    public Shop(String name, String addres) {
        this.name = name;
        this.addres = addres;
        this.product = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public ArrayList<Goods> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Goods> product) {
        this.product = product;
    }

    void arrivalGoods(String name, double cost){
        product.add(new Goods(name, cost));
    }

    void sellProduct(){

    }

    void setPrice(){
    }

    void printProduct(){
        System.out.print(product.size());
    }
//todo реализовать методы Shop, обеспечивающие продажу товара, назначение цен, вывод списка и количества товара.
}
