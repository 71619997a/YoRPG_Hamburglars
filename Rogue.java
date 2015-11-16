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
    about = "Rogue";
    description = "Uses stealth to kill prey, isn't as durable as a warrior but lots of damage.";
  }
  
}
