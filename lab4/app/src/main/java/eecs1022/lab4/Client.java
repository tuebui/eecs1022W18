package eecs1022.lab4;

public class Client {
    private String name = "";
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("Client %s has balance $%.2f",name,money);
    }
}
