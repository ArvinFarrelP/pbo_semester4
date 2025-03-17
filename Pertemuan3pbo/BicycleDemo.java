public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.speed = 10;
        bike.gear = 2;
        bike.speedUp(10);
        bike.changeGear(2);
    }
}