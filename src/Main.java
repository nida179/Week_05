
public class Main{
    public static void main(String[] args){
        Triangle DefaultTriangle = new Triangle();
        System.out.println("DEFAULT TRIANGLE: "+DefaultTriangle);
        System.out.println("Perimeter: "+DefaultTriangle.perimeter());
        System.out.println("Right Angle: "+DefaultTriangle.isRightAngle());
        System.out.println();

        Triangle triangle1 = new Triangle(3);
        System.out.println("Triangle1: "+triangle1.perimeter());
        System.out.println("Triangle1(isRightAngle): "+triangle1.isRightAngle());
        System.out.println();

        Triangle triangle2 = new Triangle(5,5);
        System.out.println("Triangle2: "+triangle2.perimeter());
        System.out.println("Triangle2(isRightAngle): "+triangle2.isRightAngle());
        System.out.println();

        Triangle triangle3 = new Triangle(3,4,5);
        System.out.println("Triange3: "+triangle3.perimeter());
        System.out.println("Triamgle3(isRightAngle): "+triangle3.isRightAngle());
        System.out.println();

        Triangle triangle4 = new Triangle(triangle2);
        System.out.println("Triangle4: "+triangle4.perimeter());
        System.out.println("Triangle4(isRightAngle): "+triangle4.isRightAngle());
        System.out.println();

        System.out.println("ObjectCount: "+Triangle.getObjectCount());

    }
}