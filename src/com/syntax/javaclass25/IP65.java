package com.syntax.javaclass25;

public interface IP65 {
    // private String make="lg"; get error interface can only have public fields, nor protected
    // not need to write public static final String make... because all fields are already public static final
    public String make="LG";
    void wash(); // by default is abstract we don't need to write abstract void();

}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}
class S21Ultra implements IP65,FastChargeAble,FiveG{ // for interface implement is similar to extends
    // you can export multiple inheritance through interfases
    @Override
    public void wash() {
        System.out.println("you guys can wash me easily ezi  pizi no issue");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now because i have implement this requirement as well");
    }

    @Override
    public void speed() {
        System.out.println("you can download supper fast because 5G");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra(); // you can store a variable in an intefase class
        ip65.wash();
    }
}
