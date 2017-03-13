class Person {
    private int rost;//Они не ограничены!
    private int age;
    String name;

    Person(int i, int z, String s) {
        setAge(i);
        setRost(z);
        this.name = s;

    }
    public void setAge(int age) {
        this.age = age;
        if (age < 0) this.age = 0;
        if (age > 150) this.age = 150;
        System.out.println(this.age);
    }

    public int getAge() {
        return age;
    }

    public void setRost(int rost) {
        this.rost = rost;
        if (rost < 0) this.rost = 0;
        if (rost > 220) this.rost = 220;

        System.out.println(this.rost);
    }

    public int getRost() {
        return rost;
    }


}