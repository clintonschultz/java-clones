/*
Name: Clinton Schultz
Prof: Dr. Rasib Khan
Assign: Homework#2 Problem#1
Date: 09/25/2019
 */

package part1;

//instantiate Octagon class to extend abstract GeometricObject class and use Cloneable and Comparable interfaces
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    //declare and initiate variables
    double sideLength;
    double area;
    double perimeter;
    boolean wasCloned = false;

    //method for getting sideLength, area and perimeter
    public Octagon(double sideLength) {
        this.sideLength = sideLength;
        this.area = (2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2));

        this.perimeter = (8 * this.sideLength);
    }

    //get side length method
    public double getSideLength() { return sideLength; }

    //returns whether the object has been cloned or not
    public boolean isWasCloned() { return wasCloned; }

    //setter for wasCloned
    public void setWasCloned(boolean wasCloned) {
        this.wasCloned = wasCloned;
    }

    //method for returning area
    @Override
    public double getArea() {
        return area;
    }

    //method for returning perimeter
    @Override
    public double getPerimeter() {
        return perimeter;
    }

    //method that compares objects by their areas
    @Override
    public int compareTo(Octagon o) {
        return this.area == o.area ? 0 : -1;
    }

    //toString method for printing out side length, area, perimeter and whether the object was cloned or not
    @Override
    public String toString() {
        return "sideLength is: " + sideLength + "\nArea is: " + area + "\nPerimeter is: " + perimeter +"\nwasCloned: "
                + wasCloned;
    }


    //object clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Octagon clonedOctagon = (Octagon) super.clone();
        clonedOctagon.setWasCloned(true);
        return clonedOctagon;

    }
}

