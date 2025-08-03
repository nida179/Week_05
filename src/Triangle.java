public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int ObjectCount;

    Triangle(){
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
        ObjectCount++;
    }
    Triangle(double sideA){
        this.sideA=sideA;
        this.sideB=1.0;
        this.sideC=1.0;
        ObjectCount++;
    }
    Triangle(double sideA , double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=1.0;
        ObjectCount++;
    }
    Triangle(double sideA , double sideB , double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        ObjectCount++;

    }
    //Copy Constructor
    Triangle(Triangle other){
        this.sideA= other.sideA;
        this.sideB= other.sideB;
        this.sideC = other.sideC;
        ObjectCount++;
    }
    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideA = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    public static int getObjectCount(){
        return ObjectCount;
    }
    public double perimeter(){
        return sideA+sideB+sideC;
    }
    public boolean isRightAngle(){
        double a = sideA , b = sideB , c = sideC;
        return Math.abs(a*a+b*b-c*c)< 1e-6 || Math.abs(c*c+b*b-a*a)< 1e-6 || Math.abs(a*a+c*c-b*b)< 1e-6;
    }

    @Override
    public String toString(){
        return "Triangle [sideA = "+sideA + ", sideB = "+sideB+ ", sideC = "+sideC+ "]";
    }
}
