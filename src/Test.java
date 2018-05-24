public class Test {
    public static void main(String[] args) {
        Square kwadrat1 = new Square(3.25);
        Rectangle prostokat1 = new Rectangle(2.00, 5.00);
        Circle kolo1 = new Circle(10);
        Triangle trojkat1= new Triangle(2,3);
        //to tak dodatkowo
        System.out.println(kwadrat1.pole);
        ShapeCalculator kalkulator = new ShapeCalculator();
        System.out.println(kalkulator.circleArea(kolo1));
        System.out.println(kalkulator.squareArea(kwadrat1));
        System.out.println(kalkulator.rectPerimeter(prostokat1));
        System.out.println(kalkulator.trianglePerimeter(trojkat1));
        


    }
}
