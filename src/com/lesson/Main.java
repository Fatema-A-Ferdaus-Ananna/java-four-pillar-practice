package com.lesson;

import inheritance.characters.*;

public class Main {

    public static void main(String[] args) {

        ChoosingCharacter ch = new ChoosingCharacter();
        System.out.println("collector list" );
        System.out.print("collector name ~~~"+"collector id ~~~"+"collector level ~~~"+"collector energy ~~~"+
                          "collector hp ~~~"+"collector xp~~~");

        Collector coll = new Collector();

//        for(coll : ch.collector_list){
//                System.out.print("jghdfhfah");
//                System.out.print(coll.getCharacter_name()+"\t"+coll.getCharacter_id()
//                                +coll.getCharacter_level()+"\t"+coll.getCharacter_energy()
//                                +coll.getCharacter_hp()+"\t"+coll.getCharacter_xp());
//        }
    }
}
