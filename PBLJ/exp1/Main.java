interface Drivable{
    void drive();
}
class Vechicle{
    String brand;
    int speed;
    void move(){
        System.out.println("Moving");
    }
    Vechicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
    Vechicle(){}
}
class Car extends Vechicle implements Drivable{
    @Override
    public void drive() {
        System.out.println("Driving");
    }
    int seats;
    Car(){
        seats = 0;
    }
    Car(int seats,String brand,int speed){
        this.seats =seats;
        super(brand,speed);
    }
    void display(){
        System.out.println("Seats : " + seats);
        System.out.println("Brand : " + brand );
        System.out.println("Speed : " + speed);
    }
}
void main(){
Car c = new Car(5,"XYZ",80);
c.display();
c.move();
c.drive();
}