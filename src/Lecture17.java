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
        Ticket wt = new WalkupTicket(1);
        Ticket at = new AdvanceTicket(2, 9);
        Ticket sat = new StudentAdvanceTicket(3,9);

        System.out.println("Walkup:" + wt.toString());
        System.out.println("Advance:" + at.toString());
        System.out.println("StudentAdvance:" + sat.toString());
        System.out.println();

        // Put your answer for #6
        System.out.println("Walk-up ticket price: $" + wt.getPrice());

        // Put your answer for #7
        System.out.println("Advance ticket price: $" + at.getPrice());

        // Put your answer for #8
        System.out.println("Student advance ticket: $" + sat.getPrice());

        // Put your answer for #14
        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(3, 5);
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        Triangle t1 = new Triangle(3, 5);
        Triangle t2 = new Triangle(3, 5);
        System.out.println(r1.equals(r2));
        System.out.println(c1.equals(c2));
        System.out.println(t1.equals(t2));
    }
}

// Put your class definitions here
// NOTE: Do NOT mark them public
 class Ticket {
    private int number;

    public Ticket(int number) {
        this.number = number;
    }


    public double getPrice() {
        return 50.0;
    }

    public String toString() {
        return "Number: " + this.number + ", " + "Price: " + getPrice() + ".";
    }

}

class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);

    }
}

class AdvanceTicket extends Ticket {
    private int daysBeforeEvent;
    private final double DISCOUNT = 20;

    public AdvanceTicket(int number, int daysBeforeEvent) {
        super(number);
        this.daysBeforeEvent = daysBeforeEvent;
    }

    @Override
    public double getPrice() {
        if (daysBeforeEvent >= 10) {
            return 30.0;
        } else {
            return 40.0;
        }
    }
}

class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int daysBeforeEvent) {
        super(number, daysBeforeEvent);
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }
}