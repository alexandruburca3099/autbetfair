package courses.oop;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        Circle.setName("Cerc1");
        System.out.println("Aria cercului:" + circle.getArea());

        Circle circle1 = new Circle(4);
        System.out.println("Aria cercului:" + circle1.getArea());
        Circle.setName("Cerc2");
        System.out.println("Circle name:" + Circle.name);
//        Draw.drawFullShape(4);

        CardBrands carBrands = new CardBrands();
        carBrands.setBrand("Skoda");
        carBrands.setModel("Octavia");
        carBrands.setFuelType(FuelType.DIESEL);
        System.out.println("CarBrand:brand:" + carBrands.getBrand() + ",model:" + carBrands.getModel() + ",fuelType:" + carBrands.getFuelType() + ",maxSpeed:" + carBrands.getMaxSpeed());
        System.out.println(carBrands);
        Car car = new Car(carBrands, Color.BLUE, 80);
        System.out.println(car);
        Circle circle2 = new Circle();
        circle2.draw();
        Triangle tr = new Triangle();
        tr.draw();
        Square sq= new Square();
        sq.setColor("red");
        sq.draw();
        sq.draw("blue");
        Student student = new Student("Bogdana Ionescu", "222222222222224", Gender.FEMININ, "1234", "IT");
        Teacher teacher = new Teacher("Bob Marley", "111225569916543", Gender.MASCULIN, "2", "Math");
        System.out.println(student);
        System.out.println(teacher);
        Shape shapePol1 = new Shape();
        Shape shapePol2 = new Square("RED");
        Shape shapePol3 = new Triangle();

        shapePol1.draw();
        shapePol2.draw();
        shapePol3.draw();
//          parent cannot access methods from child that are not defined on himself
        Shape shapeCircle = new Circle();
    }
}