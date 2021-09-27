/*
Name: Clinton Schultz
Prof: Dr. Rasib Khan
Assign: Homework#2 Problem#2
Date: 09/25/2019
 */

package part2;

import java.util.Arrays;
import java.util.Random;

//create Laptop Class and implement Comparable interface
public class Laptop implements Comparable<Laptop> {

    //declare and initialize fields
    int graphicsCard;
    double screenSize, weight, batteryLife, price, score, cpu, ram, hdd;

    //contructor method for Laptop
    public Laptop(double cpu, double ram, double hdd, int graphicsCard, double screenSize,
                  double weight, double batteryLife, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.graphicsCard = graphicsCard;
        this.screenSize = screenSize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.price = price;

        //equation for obtaining overall score
        this.score = (2 * (cpu / 3.0)) +
                (2 * (ram / 32.0)) +
                (1 * (hdd / 2048)) +
                (graphicsCard) +
                (1 * (screenSize / 17.0)) +
                (1 * (weight / 6.0)) +
                (1 * (batteryLife / 9.0)) +
                (1 * (price / 2000));
    }

    //start main here
    public static void main(String[] args) {
        System.out.println();
        Laptop[] laptopList = randomLaptopCreator();
        Arrays.sort(laptopList);

        //for loop for printing out sorted random laptops
        for (int i = 0; i < 5; i++)
            System.out.println(laptopList[i]);
    }

    //method that creates random laptops by passing in generateRandomLaptop
    //and stores them all in a list
    public static Laptop[] randomLaptopCreator() {
        Laptop[] laptopList = new Laptop[5];
        laptopList[0] = generateRandomLaptop();
        laptopList[1] = generateRandomLaptop();
        laptopList[2] = generateRandomLaptop();
        laptopList[3] = generateRandomLaptop();
        laptopList[4] = generateRandomLaptop();
        return laptopList;
    }

    //method for generating the random laptops
    public static Laptop generateRandomLaptop() {
        Random random = new Random();
        return new Laptop(random.nextDouble() * 3.0, random.nextDouble() * 32,
                random.nextDouble() * 2048, random.nextInt(2),
                random.nextDouble() * 17.0, random.nextDouble() * 6.0,
                random.nextDouble() * 9.0, random.nextDouble() * 2000);
    }

    //print random laptops using toString
    @Override
    public String toString() {
        return "CPU: " + cpu + "\nRam: " + ram + "\nHDD: " + hdd + "\nGraphics Card: " + graphicsCard +
                "\nScreen Size: " + screenSize + "\nWeight: " + weight + "\nBattery Life: " +
                batteryLife + "\nPrice: " + price + "\nScore: " + score + "\n";
    }

    //compare scores of the clone and Octagon and return 0 if they are the same
    @Override
    public int compareTo(Laptop o) {
        if (this.score > o.score)
            return 1;
        else if (this.score < o.score)
            return -1;
        else
            return 0;
    }
}

/*
CPU: 1.965619535762004
Ram: 19.823207354978155
HDD: 1220.249655626124
Graphics Card: 0
Screen Size: 3.233456245647855
Weight: 0.2856555023692391
Battery Life: 2.7474212668634226
Price: 407.096337934455
Score: 3.8918182682697773

CPU: 1.139808593483818
Ram: 17.17708074400669
HDD: 402.00805792093774
Graphics Card: 0
Screen Size: 7.263118254256559
Weight: 3.4164828517192776
Battery Life: 4.6398956731832035
Price: 708.9076712528711
Score: 3.8963867973717283

CPU: 2.1649869150643806
Ram: 25.26243068421269
HDD: 979.7835494017581
Graphics Card: 0
Screen Size: 1.2204119897231038
Weight: 5.994555715119836
Battery Life: 2.11095503734447
Price: 138.02338151126813
Score: 4.875080274256701

CPU: 1.5800709895281821
Ram: 6.967070468806593
HDD: 1169.3786228822364
Graphics Card: 1
Screen Size: 5.644273145579193
Weight: 5.6470781445692495
Battery Life: 6.491839188502707
Price: 884.1824003960442
Score: 5.496410643425849

CPU: 2.4256346301124285
Ram: 15.655383273636726
HDD: 1575.37043688187
Graphics Card: 0
Screen Size: 14.77827562817306
Weight: 3.548134984210164
Battery Life: 2.6003745949991313
Price: 1292.60070136144
Score: 5.760672077151184
 */