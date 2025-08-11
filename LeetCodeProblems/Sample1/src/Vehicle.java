public class Vehicle {

    public void sound(){
        System.out.println("sound");
    }

    public static void main(String[] args) {
        Vehicle vec = new Vehicle();
        vec.sound();
        Vehicle car = new Car();
        car.sound();

    }


}

