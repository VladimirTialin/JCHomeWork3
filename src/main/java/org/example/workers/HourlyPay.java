package org.example.workers;

public class HourlyPay extends Workers {
    private int hourlyPay;

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public HourlyPay(String surname, String name, int hourlyPay) {
        super(surname, name);
        this.hourlyPay=hourlyPay;

    }

    @Override
    public int salary() {
        return (int) (20.8*8*this.hourlyPay);
    }
    @Override
    public String toString() {
        return "    Почасовая оплата: " +
                " " + getSurname() +
                " " +getName() +
                ": Зарплата "+salary()+'\'';
    }
}
