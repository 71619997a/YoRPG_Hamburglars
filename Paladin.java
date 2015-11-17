/* The Hamburglars: Sarah Yoon, Gabriel Marks
   APCS1 pd 10
   HW31 -- Ye Olde Role Playing Game, Unchained
   2015-11-16
*/

public class Paladin extends Player{
    public Paladin(String nombre) {
	name = nombre;
	hp = 160;
	strength = 120;
	defense = 50;
	attack = 0.25;
    }
    public String about() {
	return "Heavily armored, uses melee like warriors, more tanky than a warrior with somewhat less damage.";
    }
    public void specialize() {
	defense -= 2;
	attack += 0.2;
    }
    public void normalize() {
	defense += 2;
	attack -=0.2;
    }
}
