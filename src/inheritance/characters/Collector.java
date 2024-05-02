package inheritance.characters;

public class Collector extends CharacterRoot{
    private int collect_item;
    private int total_collect_item = 0;

    public int item_collection(int collect_item){
        total_collect_item = total_collect_item + collect_item;
        return 0;
    }
}
