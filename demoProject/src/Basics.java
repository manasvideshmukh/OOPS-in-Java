//Here you're going to learn about "Class,Objects,Methods,'this' keyword"
//So the part1 will teach you about how do you define objects inside the main Java class

class Pen { 
    String color;
    String type; //gelpen, ballpen
    //data points of a class, blueprint
    
    public void write() {
        System.out.println("write something");
    } //this is your methods, member of a class

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class Basics {
    public static void main(String args[]) {
        //define the objects 
        Pen Pen1 = new Pen();
        Pen Pen2 = new Pen();

        Pen1.color = "blue";
        Pen2.color = "red";
        Pen1.type = "gelpen";
        Pen2.type = "ballpen";

        Pen1.write();
        Pen1.printColor();
        Pen1.printType();
        Pen2.printColor();
        Pen2.printType(); 

    }

}