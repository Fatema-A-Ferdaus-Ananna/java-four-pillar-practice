package inheritance.characters;

public class CharacterRoot {
    private String character_name;
    private String character_id;
    private int character_hp;
    private int character_energy;
    private int character_xp;
    private int character_level;


    public String getCharacter_name() {
       return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public String getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(String character_id) {
        this.character_id = character_id;
    }

    public int getCharacter_hp() {
        return character_hp;
    }

    public void setCharacter_hp(int character_hp) {
        this.character_hp = character_hp;
    }

    public int getCharacter_energy() {
        return character_energy;
    }

    public void setCharacter_energy(int character_energy) {
        this.character_energy = character_energy;
    }

    public int getCharacter_xp() {
        return character_xp;
    }

    public void setCharacter_xp(int character_xp) {
        this.character_xp = character_xp;
    }

    public int getCharacter_level() {
        return character_level;
    }

    public void setCharacter_level(int character_level) {
        this.character_level = character_level;
    }
}
