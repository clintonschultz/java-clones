/*
Name: Clinton Schultz
Prof: Dr. Rasib Khan
Assign: Homework#2 Problem#1
Date: 09/25/2019
 */

package part1;

//test to see if octagon clone is the same object as the Octagon
public class TestOctagon {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(5);
        System.out.println(oct1 + "\n");
        Octagon oct2 = (Octagon) oct1.clone();
        System.out.println(oct2 + "\n");
        System.out.println(oct1.compareTo(oct2));
    }
}

/*
sideLength is: 5.0
Area is: 120.71067811865474
Perimeter is: 40.0
wasCloned: false

sideLength is: 5.0
Area is: 120.71067811865474
Perimeter is: 40.0
wasCloned: true

0
 */