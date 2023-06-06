import java.util.Random;
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Welcome to the First Class compartment.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This compartment is reserved for ladies.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General compartment for everyone.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This compartment is designated for luggage.";
    }
}


public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = random.nextInt(4) + 1;

            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}
