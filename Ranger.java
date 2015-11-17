/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW31 -- Ye Olde Role Playing Game, Unchained
2015-11-16
*/

public class Ranger extends Player{
  public Ranger(String nombre) {
    name = nombre;
    hp = 100;
    strength = 100;
    defense = 30;
    attack = 0.6;
}
    public String about() {
	return "Long-range weapon expert, has less health and defense than a warrior but hits harder.";
    }

    public void specialize() {
	defense -=3;
	attack += 0.1;
    }
    public void normalize() {
	defense += 3;
	attack -= 1;
    }
}
