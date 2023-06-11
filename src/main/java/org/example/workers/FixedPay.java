package org.example.workers;

public class FixedPay extends Workers {
    private int fixedPay;
    public FixedPay(String surname, String name,int fixedPay) {
        super(surname, name);
        this.fixedPay=fixedPay;
    }
    public  void setFixedPay(int fixedPay){
        this.fixedPay=fixedPay;
    }

    @Override
    public int salary() {
        return this.fixedPay;
    }

    @Override
    public String toString() {
        return "Фиксированная оплата: " +
                " " + getSurname() +
                " " +getName()+
                ": Зарплата "+salary()+'\'';
    }
}
