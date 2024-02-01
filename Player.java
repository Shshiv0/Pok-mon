package Pokemon_Battle;

/**class representing one player.
*@author Shiv Patel
*/
import java.util.ArrayList;

class Player{
  private String PlayerID;
  private ArrayList<Pokemon> PokeList = new ArrayList<Pokemon>();

  /**Create a player class 
  *@param Player ID - the name of the player
  */
  public Player(String ID){
    this.PlayerID = ID;
  }
  
/**return a Pokemon from a given index number
*@param p the index value
@return the Pokemon object*/
  public Pokemon getPokemon(int p){
    if(p >= PokeList.size() || p < 0){
      return null;
    }
    else{
      return PokeList.get(p);
    }
  }

  /**Add a Pokemon to the list of pokemon
  *@param pN the pokemon name
  *@param pT the pokemon type
  *@param mHP the maximum  preset HP
  *@param cHP the current HP
  *@param dfn the defense value
  *@param atk the attack value
  *@param spd the speed value
  *@param crit the critical hit value
  */
  public void addPokemon(String pN, String pT, int mHP, int cHP, int dfn, int atk, int spd, int crit){
    Pokemon toAdd = new Pokemon(pN, pT, mHP, cHP, dfn, atk, spd, crit);
    PokeList.add(toAdd);
  }
}

