class Pen { 
    String color;
    String type; 

    Pen() {
        System.out.println("Non-parameterized constructor called");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class NonParameterized {
    public static void main(String args[]) {
        //define the objects 
        Pen Pen1 = new Pen();
        Pen1.color = "blue";
        Pen1.type = "gelpen";
        Pen1.printColor();


    }

}