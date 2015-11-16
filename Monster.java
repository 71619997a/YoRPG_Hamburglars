/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-12
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