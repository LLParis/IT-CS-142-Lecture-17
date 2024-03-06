// London Paris
// IT-CS-142-Lecture-17

public class Lecture17 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello, world!");
        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #10 here:
        // Vehicle v = new Car();
        // Vehicle V = new SUV();
        // Car c = new SUV();
        // SUV s = new SUV();

        // Put your answer for #12 here:
        // flute
        // shoe 1
        // flute 2
        //
        // flute
        // blue 1
        // flute 2
        //
        // moo
        // moo 1
        // moo 2
        //
        // moo
        // blue 1
        // moo 2

        // Put your answer for #13 here:
        // moo 2
        // blue 1
        // moo
        //
        // moo 2
        // moo 1
        // moo
        //
        // flute 2
        // shoe 1
        // flute
        //
        // flute 2
        // blue 1
        // flute

        // Put your answer for #18 here:
        // is-a refers to inheritance, for example, a car is a vehicle
        // has-a refers to functionality and fields without inheritance, for example,
        // if the Person class has a List<address> field containing the addresses associated
        // with a person.

        // Put your answer for #19 here:
        // The Liskov Substitution Principle states that the objects of a superclass should be replaceable
        // by the objects of a subclass without negatively affecting the program. So not exactly.

        // Put your answer for #20 here:
        // No, this is a bad design because it creates a large number of unnecessary subclasses.
        // A better design would be to have a Card class that has attributes to represent suit and rank.

        // EXERCISES:

        // NOTE: Your program must compile and run,
        // and the code for all your exercises should be left UNcommented in the file.
        // In order to do that you should put any new classes that you create OUTSIDE
        // of main() even though there may be comments in main() saying to "Put your
        // answer for #5 here".
        // Instead, put code that tests / tries out / uses your classes in main(),
        // and keep the class definitions themselves outside of main().

        // Put your answer for #5
        // I.e., create a Ticket object, try calling the methods and printing out the
        // results, etc, etc
        Ticket wt = new WalkupTicket();
        Ticket at = new AdvanceTicket();

        System.out.println("Walk-up ticket price: $" + wt.getPrice());
        System.out.println("Advance ticket price: $" + at.getPrice());


        // Put your answer for #6
        //

        // Put your answer for #7

        // Put your answer for #8

        // Put your answer for #14
    }
}

// Put your class definitions here
// NOTE: Do NOT mark them public
class Ticket {
    private int number;
    private double price;
    public Ticket(int number) {
        this.price = price;
    }

    public Ticket() {
    }

    public double getPrice() {
        price = 50.0;
        return price;
    }

    public String toString() {
        return "Number: " + this.number + ", " + "Price: " + this.price + ".";
    }

}

class WalkupTicket extends Ticket {


}

class AdvanceTicket extends Ticket {

    @Override
    public double getPrice() {
        return super.getPrice() - 20.0;
    }

}

class StudentAdvanceTicket extends AdvanceTicket {

}