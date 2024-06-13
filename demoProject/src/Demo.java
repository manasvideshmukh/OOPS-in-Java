// the Part2 will teach you how you can define objects outside the Main Java class
class Hotel {
    String CourseType; //starters, main course, desserts
    int price; 
    int rating; //3star, 4star, 5star

    public void eat() {
        System.out.println("eating");
    }

    public void pay() {
        System.out.println("paying");
    }

    public void printCourseType() {
        System.out.println(this.CourseType);
    }
}

public class Demo {
    public static void main(String[] args) {
        non_main();
    }
    public static void non_main(){
        Hotel Hotel1 = new Hotel();
        Hotel1.CourseType = "staters";
        Hotel1.price = 3000;
        Hotel1.rating = 3;

        Hotel1.eat();
        Hotel1.pay();
        Hotel1.printCourseType();
    }

}