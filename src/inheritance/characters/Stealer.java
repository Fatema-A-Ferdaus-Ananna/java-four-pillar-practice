package inheritance.characters;

public class Stealer extends CharacterRoot{
    private int steal_collection;
    private int total_steal_collection;

    private int steal_collection(int steal_collection){
        total_steal_collection = total_steal_collection + steal_collection;
        return 0;
    }
}
