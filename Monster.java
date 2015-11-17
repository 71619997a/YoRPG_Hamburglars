/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW31 -- Ye Olde Role Playing Game, Unchained
2015-11-16
*/
public class Monster extends Character{
    public Monster() {
        hp = 150;
        defense = 20;
        attack = 1;
        strength = (int)(Math.random()*45)+20;
        name = "undefined";
    }
}
