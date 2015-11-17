/* The Hamburglars: Sarah Yoon, Gabriel Marks
   APCS1 pd 10
   HW31 -- Ye Olde Role Playing Game, Unchained
   2015-11-16
*/

public class Warrior extends Player{
    public Warrior(String nombre) {
	name = nombre;
	hp = 125;
	strength = 100;
	defense = 40;
	attack = 0.4;
    }
    public String about() {
	return "Your standard melee-using basher of faces, the standard for all classes.";
    }
    public void specialize() {
	defense -= 5;
	attack += 0.1;
    }
    public void normalize() {
	defense += 5;
	attack -= 0.1;
    }
    
}
