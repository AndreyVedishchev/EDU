package shop;

public class Customer implements IMoneyTransaction{
    private String name;
    private String fio;
    private int age;

    public Customer(String name, String fio, int age) {
        this.name = name;
        this.fio = fio;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void transferMoney(IMoneyTransaction recipient, IMoneyTransaction donor, int amount) {
        //Оставь пустым
    }
}
