import java.util.Scanner;
//Class representing a cylinder
class Cylinder{
    // an instance variable to store cylinder properties
    double radius, height, area;
    

        void getInput(){//a method for input
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter radius: ");
            radius = sc.nextDouble();
            
            System.out.print("Enter height: ");
            height = sc.nextDouble();
            
        }
        //a method to calculate the area
        void area(){
            area = 2 * Math.PI * radius * radius + 2 * Math.PI * height;
        }
        
        void displayArea(){
            System.out.println("Area: " + area);
        }
    
}
//a class extending cylinder class to calculate the volume
class CylinderVol extends Cylinder{
    double volume;//an instance variable to store the volume
    
    void volume(){// a method to calculate volume
        volume = Math.PI * radius * radius * 2 * height;
    }
    
    void displayVolume(){
        System.out.println("Volume: " + volume);
    }
}

public class SARTO_LAB2{// main class
    public static void main(String []args){
        CylinderVol cylinder = new CylinderVol();
        
        cylinder.getInput();// get the input
        cylinder.area();// calculate area
        cylinder.displayArea();// display the calculated area
        cylinder.volume();//calculate volume
        cylinder.displayVolume();//display the calculated volume
        
    }
}
    