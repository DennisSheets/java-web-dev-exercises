package org.launchcode.java.demos.lsn6inheritance;

public class CatMain {

    public static void main(String[] args) {

        HouseCat garfield = new HouseCat("Garfield",12);
        garfield.eat();
        System.out.println(garfield.isTired());
        System.out.println(garfield.getFamily());
        garfield.setWeight(55);
        System.out.println(garfield.getWeight());
        garfield.setHungry(true);

        if(garfield.isHungry()) {
            garfield.setWeight(5);
            System.out.println("Feed this bastard something. He only weighs " + garfield.getWeight() + " lbs");
        } else {
            System.out.print("That's because this shit eats non stop all day.");
        }

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        //System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat suki = new HouseCat("Suki", 8);
        suki.noise();
        System.out.println(((HouseCat) suki).isSatisfied());

    }
}
