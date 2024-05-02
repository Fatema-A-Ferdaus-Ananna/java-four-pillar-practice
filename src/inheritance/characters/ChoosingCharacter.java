package inheritance.characters;

import java.util.ArrayList;
import java.util.Random;

public class ChoosingCharacter {

    public ArrayList<Collector> collector_list = new ArrayList<>();

    public void collector_insertion(){
        Collector collector = new Collector();

        for(int index = 0; index<=9; index++){
            Random random =new Random();
            collector.setCharacter_id("coo"+random.nextInt(30));
            collector.setCharacter_name("collector00"+ (index+1));
            collector.setCharacter_level(index+1);
            int levelup_energy = 30;
            collector.setCharacter_energy(70 + levelup_energy);
            collector.setCharacter_hp(400 + (index+1)*10);
            collector.setCharacter_xp(90 + (index+1)*10);

            collector_list.add(collector);

           // collector.setCharacter_id("coo"+random.getRandomNumberUsingNextInt(30, 60));
        }
    }

    public void slealer_insertion(){
        Stealer stealer = new Stealer();
        ArrayList<Stealer> collector_list = new ArrayList<>();

        for(int index = 0; index<=9; index++){
            Random random =new Random();
            stealer.setCharacter_id("coo"+random.nextInt(30));

            // stealer.setCharacter_id("coo"+random.getRandomNumberUsingNextInt(30, 60));
        }
    }

    public void summoner_insertion(){
        Summoner summoner = new Summoner();
        ArrayList<Summoner> collector_list = new ArrayList<>();

        for(int index = 0; index<=9; index++){
            Random random =new Random();
            summoner.setCharacter_id("coo"+random.nextInt(30));
            //summoner.setCharacter_id("coo"+random.getRandomNumberUsingNextInt(30, 60));
        }
    }
}
