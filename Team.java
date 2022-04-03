package HomeWork1;

package HomeWork1;

import java.util.Random;

public class Team {

    String nameTeam ;
    Random random = new Random();

    Competitor[] partner = new Competitor[3];
    Animal[] zoo = {new Cat("Барсик"), new Dog("Тревор")};
    
    public Team(String nameTeam, Competitor com1, Competitor com2, Competitor com3 ) {
        this.nameTeam  = nameTeam;

        partner[0] = com1;
        partner[1] = com2;
        partner[2] = com3;
       for(int i = 0; i < 4; i++){
          int ran = random.nextInt(3);

    }
    
      public void passedTheDistance() {
        for (Competitor com : partner) {
            
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }

    
    public void showResults() {
        for (Competitor com : partner) {
            com.info();
        }
    }

    
    public Competitor[] getTeammates() {
        return partner;
    }
}

