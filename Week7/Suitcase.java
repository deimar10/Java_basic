package Week7;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
        private int weightLimit;

        public Suitcase(int weightLimit){
            this.weightLimit = weightLimit;
            this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing){
            int weightCurrent = this.totalWeight();
            if(weightCurrent + thing.getWeight() <= this.weightLimit){
                this.things.add(thing);
            }
    }

    @Override
    public String toString(){
            int weightCurrent = this.totalWeight();
        if(weightCurrent == 0) {
            return "empty (" + weightCurrent + " kg)";
        }
        return this.things.size() + " things (" + weightCurrent + " kg)";
    }

    public int totalWeight(){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        return weightCurrent;
    }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 310", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}
