package shop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String addres;
    private ArrayList<Goods> product;

    public Shop(String name, String addres, ArrayList<Goods> product) {
        this.name = name;
        this.addres = addres;
        this.product = product;
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
//todo реализовать методы Shop, обеспечивающие продажу товара, назначение цен, вывод списка и количества товара.

}
