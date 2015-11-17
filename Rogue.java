/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-12
*/

public class Rogue extends Player{
  public Rogue(String nombre) {
    name = nombre;
    hp = 80;
    strength = 100;
    defense = 40;
    attack = 0.7;
  }
    public String about() {
	return "Uses stealth to kill prey, isn't as durable as a warrior but lots of damage.";
    }
    public void specialize() {
	defense -=6;
	attack += 0.3;
    }
    public void normalize() {
	defense +=6;
	attack -= 0.3;
    }	
}
