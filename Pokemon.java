package Pokemon_Battle;

/* This class represents one pokemon from the list of pokemon found inside the pokemon array list, each pokemon within the arraylist has a multitude of different abilities as specified below.
*@author Shiv Patel
*/

class Pokemon {
  /**creates instance variables, coorelating to attributes of one pokemon.
  */
  private String Name;
  private String Type;
  private int MaxHP;
  private int CurrentHP;
  private int Defense;
  private int Attack;
  private int Speed;
  private int CriticalHits;

  /**creates pokemon object.
  *@param n - the Pokemon's name
  *@param t - the Pokemon's type
  *@param m - the maximum preset HP of the Pokemon
  *@param c - the current HP of the Pokemon
  *@param d - the defence value
  *@param a - the attack value
  *@param s - the speed value.
  *@param cH - the Critical Hit value
  */
  public Pokemon(String n, String t, int m, int c, int d, int a, int s, int cH){
    this.Name = n;
    this.Type = t;
    this.MaxHP = m;
    this.CurrentHP = c;
    this.Defense = d;
    this.Attack = a;
    this.Speed = s;
    this.CriticalHits = cH;
  }

  /** returns the Pokemon's name.
  * @return the Pokemon's name.
  */
  public String getName(){
    return Name;
  }
  
/** returns the Pokemon's type.
  * @return the Pokemon's type.
  */
  public String getType(){
    return Type;
  }

  /** returns the Pokemon's Max HP.
  * @return the Pokemon's Max HP.
  */
  public int getMaxHP(){
    return MaxHP;
  }

  /** Sets the current HP of the Pokemon
  @param delete the amount of HP that is taken off of the max HP.
  */
  public void setCurrentHP(int delete){
    if(delete >= 0){
      if(delete <= this.CurrentHP){
        this.CurrentHP -= delete;
    }else{
      this.CurrentHP = 0;
    } 
    }
    else{
      this.CurrentHP = this.CurrentHP;
    }
  }

  /** returns the Pokemon's current HP.
  * @return the Pokemon's current HP.
  */
  public int getCurrentHP(){
    return CurrentHP;
  }
  
  /** returns the defence value.
  * @return the Pokemon's defence value.
  */
  public int getDefense(){
    return Defense;
  }

  /** returns the base attack value.
  * @return the Pokemon's attacking value.
  */
  public int getAttack(){
    return Attack;
  }

  /** returns the speed value of the Pokemon.
  * @return the speed value.
  */
  public int getSpeed(){
    return Speed;
  }

  /** returns the bonus attacking value.
  * @return the Critical Hit value.
  */
  public int getCriticalHits(){
    return CriticalHits;
  }

  /** Returns a String containing specific information about the Pokemon.
  * @return a string displaying information about a pokemon.
  */
  public String toString(){
    String toReturn = "Pokemon Name: " + this.Name + "\n-Type: " + this.Type + "\n-Attack: " + this.Attack + "\n-HP: " + this.CurrentHP + " / " + this.MaxHP;
    
    return toReturn;
  }
}
