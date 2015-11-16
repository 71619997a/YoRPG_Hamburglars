/* The Hamburglars: Sarah Yoon, Gabriel Marks
APCS1 pd 10
HW29 -- Ye Olde Role Playing Game, Improved
2015-11-12
*/

public class Warrior extends Player{
  public Warrior(String nombre) {
    name = nombre;
    hp = 125;
    strength = 100;
    defense = 40;
    attack = 0.4;
    about = "Warrior";
    description = "Your standard melee-using basher of faces, the standard for all classes.";
  }
  
}
