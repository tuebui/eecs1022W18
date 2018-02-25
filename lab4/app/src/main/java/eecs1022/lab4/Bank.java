package eecs1022.lab4;

/**
 * Created by etjsc on 2/22/18.
 */

public class Bank {
    private Client client1;
    private Client client2;
    private Client client3;
    public Bank(){
        //Create new object for client1, client2, client3 without name and money
        setClient1(new Client());
        setClient2(new Client());
        setClient3(new Client());
    }
    public void initialClient(String name1, String name2, String name3, double money1, double money2, double money3){
        getClient1().setName(name1);
        getClient1().setMoney(money1);
        getClient2().setName(name2);
        getClient2().setMoney(money2);
        getClient3().setName(name3);
        getClient3().setMoney(money3);
    }

    public Client getClient1() {
        return client1;
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public Client getClient2() {
        return client2;
    }

    public void setClient2(Client client2) {
        this.client2 = client2;
    }

    public Client getClient3() {
        return client3;
    }

    public void setClient3(Client client3) {
        this.client3 = client3;
    }

    public void completedTransaction(String service,int number1, int number2, double amount){
        if(service.equals("Deposit")){
            deposit(number2,amount);
        }else if(service.equals("Withdraw")){
            withdraw(number1,amount);
        }else if(service.equals("Transfer")){
            transfer(number1,number2,amount);
        }
    }

    public void deposit(int number2, double amount){
        if(number2 == 1){
            client1.setMoney(client1.getMoney() + amount);
        }else if(number2==2){
            client2.setMoney(client2.getMoney() + amount);
        }else if(number2==3){
            client3.setMoney(client3.getMoney() + amount);
        }
    }
    public void withdraw(int number, double amount){
        if(number==1){
            client1.setMoney(client1.getMoney() - amount);
        } else if(number==2){
            client2.setMoney(client2.getMoney() - amount);
        } else if (number ==3){
            client3.setMoney(client3.getMoney() - amount);
        }
    }
    public void transfer(int number1, int number2, double amount){
        if(number1==1){
            if(number2==2){
                client2.setMoney(client2.getMoney() + amount);
                client1.setMoney(client1.getMoney() - amount);
            } else if (number2==3){
                client3.setMoney(client3.getMoney() + amount);
                client1.setMoney(client1.getMoney() - amount);
            }
        } else if (number1==2){
            if(number2==1){
                client1.setMoney(client1.getMoney() + amount);
                client2.setMoney(client2.getMoney() - amount);
            } else if (number2==3){
                client3.setMoney(client3.getMoney() + amount);
                client2.setMoney(client2.getMoney() - amount);
            }
        } else if (number1==3){
            if(number2==2){
                client2.setMoney(client2.getMoney() + amount);
                client3.setMoney(client3.getMoney() - amount);
            } else if (number2==1){
                client1.setMoney(client1.getMoney() + amount);
                client3.setMoney(client3.getMoney() - amount);
            }
        }
    }
}
