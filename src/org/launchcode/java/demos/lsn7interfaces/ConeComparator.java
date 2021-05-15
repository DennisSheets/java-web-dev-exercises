package org.launchcode.java.demos.lsn7interfaces;

import  java.util.Comparator;

public class ConeComparator implements Comparator<Cone>{


    @Override
    public int compare(Cone o1, Cone o2) {

        //  return o1.getCost().compareTo(o2.getCost());
        //  return o1.getCost() - o2.getCost();

        //  https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html (scroll down to Method Detail)
        if(o1.getCost() - o2.getCost() < 0 ){
            return -1;
        }else if (o1.getCost() - o2.getCost() == 0 ){
            return 0;
        }return 1;
    }
}
