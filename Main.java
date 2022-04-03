package HomeWork1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5));
        Team team = new Team("Heroes", new Human("Петя"), new Cat("Барск"), new Dog("Тревор"));
         c.doIt(team);

            System.out.println("\nWinners:");
            team.passedTheDistance();

            System.out.println("\nResult:");
            team.showResults();
        }
    }
