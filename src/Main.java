public class Main {

    void add(int x, int y){
    System.out.println(x+y);
    }


    public static void main(String[] args) {

        System.out.println("Hello world!");
        Main calculator=new Main ();
        calculator.add(10,20);
        System.out.println(calculator);
    }
}