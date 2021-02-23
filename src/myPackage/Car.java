package myPackage;


abstract class Fruit{

   public abstract void color();

    public int Price(){
        int price = 1000;
        //hello
        return price;
    }



}

class Apple extends Fruit{

    public void color(){
        System.out.println("red");
    }

}


class Car {

    public static void main(String[] args) {
        Apple newApple = new Apple();
        newApple.color();
        System.out.println(newApple.Price());

    }
}
