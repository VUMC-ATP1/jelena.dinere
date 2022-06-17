package homework.classHomeWork;

public class Triangle {
    //a.
    public int firstSide;
    public int secondSide;
    public int thirdSide;

    //b.
    public Triangle() {

        System.out.println("Create triangle");
    }
    //c.

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    public double calculateArea() {
        double halfOfPerimeter = (firstSide + secondSide + thirdSide) / 2.0d;
        ;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide) * (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));
    }

    //d.
    public boolean isEqual() {
        return firstSide == secondSide && secondSide == thirdSide;
    }

    //e.
    public boolean isTwoSideEqual() {
        return firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide;
    }
}
