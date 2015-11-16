/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-12
*/

public class Mage extends Player{
  public Mage(String nombre) {
    name = nombre;
    hp = 125;
    strength = 80;
    defense = 40;
    attack = 0.7;
    about = "Mage";
    description = "Magic user, not as strong as a warrior but hits harder with spells.";
  }
  
}
