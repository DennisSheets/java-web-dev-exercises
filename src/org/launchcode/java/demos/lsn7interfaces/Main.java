package org.launchcode.java.demos.lsn7interfaces;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: create comparators

        Comparator comparatorFlavors = new FlavorComparator();
        flavors.sort(comparatorFlavors);
        // combine lines 14 & 15   flavors.sort(new FlavorComparator());

        Comparator comparatorCones = new ConeComparator();
        cones.sort(comparatorCones);

        Comparator compareToppings = new ToppingComparator();
        toppings.sort(compareToppings);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


        System.out.println("\n\n<<<<<  Toppings  >>>>>\n");
        for ( Topping topping : toppings ){
            String allergenStr = "     Allergens [";
            for ( String allergen : topping.getAllergens() ){
                allergenStr += " " + allergen;
            }
            allergenStr += " ]";
            System.out.println(topping.getName() + ": $" + topping.getCost() + allergenStr);
        }

        System.out.println("\n\n<<<<<  Flavors  >>>>>\n");
        for ( Flavor flavor : flavors ){
            String allergenStr = "     Allergens [";
            for ( String allergen : flavor.getAllergens() ){
                allergenStr += " " + allergen;
            }
            allergenStr += " ]";
            System.out.println(flavor.getName() + ": $" + flavor.getCost() + allergenStr);
        }

        System.out.println("\n\n<<<<<  Cones  >>>>>\n");
        for ( Cone cone : cones ){
            String allergenStr = "     Allergens [";
            for ( String allergen : cone.getAllergens() ){
                allergenStr += " " + allergen;
            }
            allergenStr += " ]";
            System.out.println(cone.getName() + ": $" + cone.getCost() + allergenStr);
        }
    }
}
