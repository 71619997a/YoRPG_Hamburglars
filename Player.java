public class Player extends Character {
  protected String about;
  protected String description;
  
  public String about() {
    return about;
  }
  public String description() {
    return description;
  }
  
  //specialize() decreases defense, increases attack rating
  public void specialize() {
    defense -= 5;
  	attack += 0.1;
  }

  //normalize() resets defense and attack rating
  public void normalize() {
  	defense += 5;
  	attack -= 0.1;
  } 
}