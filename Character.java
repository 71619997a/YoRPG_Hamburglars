/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-12
*/
public class Character{
    protected int hp, strength, defense;
    protected double attack;
    protected String name;
    public boolean isAlive() {
        return hp > 0;
    }
    public int getDefense() {
        return defense;
    }
    public String getName() {
        return name;
    }
    public void lowerHP(int damage) {
        hp -= damage;
    }
    public int attack(Character other) {
        int damage = (int)(strength * attack) - other.getDefense();
        if(damage < 1) damage = 1;
        other.lowerHP(damage);
        return damage;
    }
}