package Pokemon_Battle;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("\nWelcome to the Pokemon battle arena!");
    System.out.println("------------------------------------");

    //Creates Player ID's and Pokemon selection
    System.out.println("Input player ID (1): ");
    String PlayerID = in.nextLine();
    Player newPlayer1 = new Player(PlayerID);
    
    System.out.println("Input player ID (2): ");
    String PlayerID2 = in.nextLine();
    Player newPlayer2 = new Player(PlayerID2);

    //general information about picking pokemon and each of the pokemon choices.
    System.out.println("\nWelcome, Pokemon selection is executed in an alternating manner where, " + PlayerID + " picks their Pokemon then " + PlayerID2 + " picks!: \n\nPokemon: ");
    System.out.println("1- Bulbasaur 2- Charmander 3- Squirtle 4- Pikachu 5- Jigglypuff 6- Eevee\n\n" + PlayerID + ":");

    //for loop executes 6 times, in a manner where player 1 can choose their pokemon while alternating with player 2. The turn variable keeps track of each player's turn throughout the game.
    int turn = 1;
    for(int v = 0; v < 6; v++){
      int select = in.nextInt();
      
      if(select == 1){
        if(turn == 1){
          //adds bulbasaur to pokemon list.
          newPlayer1.addPokemon("Bulbasaur", "Water", 45, 45, 49, 49, 45, 15);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;
        }else{
          newPlayer2.addPokemon("Bulbasaur", "Water", 45, 45, 49, 49, 45, 15);
          System.out.println("Pokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }
      
      else if(select == 2){
        if(turn == 1){
          //adds charmander to pokemon list.
          newPlayer1.addPokemon("Charmander", "Fire", 39, 39, 52, 43, 65, 7);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;

        }else{
          newPlayer2.addPokemon("Charmander", "Fire", 39, 39, 52, 43, 65, 7);
          System.out.println("\nPokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }

      else if(select == 3){
        if(turn == 1){
          //adds squirtle to pokemon list.
          newPlayer1.addPokemon("Squirtle", "Water", 20, 20, 48, 65, 43, 10);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;
        }else{
          newPlayer2.addPokemon("Squirtle", "Water", 20, 20, 48, 65, 43, 10);
          System.out.println("\nPokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }

      else if(select == 4){
        if(turn == 1){
          //adds pikachu to pokemon list.
          newPlayer1.addPokemon("Pikachu", "Electric", 35, 35, 55, 30, 90, 20);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;
        }else{
          newPlayer2.addPokemon("Pikachu", "Electric", 35, 35, 55, 30, 90, 20);
          System.out.println("\nPokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }

      else if(select == 5){
        if(turn == 1){
          //adds jigglypuff to pokemon list.
          newPlayer1.addPokemon("Jigglypuff", "Psychic", 115, 115, 45, 20, 20, 10);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;
        }else{
          newPlayer2.addPokemon("Jigglypuff", "Psychic", 115, 115, 45, 20, 20, 10);
          System.out.println("\nPokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }

      else if(select == 6){
        if(turn == 1){
          //adds eevee to pokemon list.
          newPlayer1.addPokemon("Eevee", "Nature", 55, 55, 55, 50, 55, 12);
          System.out.println("\nPokemon Added! \n" + PlayerID2 + ":");
          turn -= 1;
        }else{
          newPlayer2.addPokemon("Eevee", "Nature", 55, 55, 55, 50, 55, 12);
          System.out.println("\nPokemon Added! \n" + PlayerID + ":");
          turn += 1;
        }
      }
    }

    //checks for the speed values of the each of the player's pokemon to determine which player goes first. If they are equivalent or opposingly larger, the turn defaults to player 2.
    if(newPlayer1.getPokemon(0).getSpeed() > newPlayer2.getPokemon(0).getSpeed()){
      turn = 1;
    }
    else if(newPlayer1.getPokemon(1).getSpeed() > newPlayer2.getPokemon(1).getSpeed()){
      turn = 1;
    }
    else if(newPlayer1.getPokemon(2).getSpeed() > newPlayer2.getPokemon(2).getSpeed()){
      turn = 1;
    }
    else{
      turn = 0;
    }

    System.out.println(newPlayer2.getPokemon(2).getName());
    //num represents the each of the battles, originally set to 0 since that is the first pokemon in the list.
    //score1, and score2 represents each of the player's scores.
    //fainted, is the boolean integer used to run the while loop.
    int num = 0;
    int score1 = 0;
    int score2 = 0;
    Boolean Fainted = false;
    while(!Fainted){
      //general information regarding attacks, and player choices.
      System.out.println("\n\nROUND: " + (num + 1) + "\n" + newPlayer1.getPokemon(num).toString() + "\n\n" + newPlayer2.getPokemon(num).toString() + "\n");
      System.out.println("\nChoose your move!\n1- base attack (the normal attack)\n2- critical hit (normal attack + the critical hit value, your pokemon looses 10HP when applied)");

      //checks to see if there is a winner of the round/game.
      if(newPlayer1.getPokemon(num).getCurrentHP() == 0){
        System.out.println("\n\n\n---------\nThe winner of round " + (num + 1) + " is " + PlayerID2);
        score2 ++;
        System.out.println("SCORE: \n" + PlayerID + ": " + score1 + " " + PlayerID2 + ": " + score2 + " press 1!");
        num ++;
        if(score1 == 2 && score2 == 1){
          System.out.println("VICTORY! The winner is " + PlayerID);
          break;
        }
        else if(score1 == 1 && score2 == 2){
          System.out.println("VICTORY! The winner is " + PlayerID2);
          break;
        }
      }
      //checks to find winner of the round/game for the opposing player.
      else if(newPlayer2.getPokemon(num).getCurrentHP() == 0){
        System.out.println("\n\n\n---------\nThe winner of round " + (num + 1) + " is " + PlayerID);
        score1 ++;
        System.out.println("SCORE: \n" + PlayerID + ": " + score1 + " " + PlayerID2 + ": " + score2 + " press 1");
        num ++;
        if(score1 == 2 && score2 == 1){
          System.out.println("VICTORY! The winner is " + PlayerID);
        }
        else if(score1 == 1 && score2 == 2){
          System.out.println("VICTORY! The winner is " + PlayerID2);
        }
      }
      
      //Move is the variable denoting each of the player's move choices.
      int Move = in.nextInt();
      //if else statements checks for each of the moves.
      if(Move == 1){
        
        if(turn == 1){
          System.out.println(newPlayer1.getPokemon(num).getName() + " Used base attack! -" + newPlayer1.getPokemon(num).getAttack() + "HP");
          System.out.println(newPlayer2.getPokemon(num).getName() + " uses defense (50% effective)\n");
          //atk is the attack value of the current pokemon
          //def is the defence value.
          //total is the total damage given to the opposing pokemon given by the formula, [attack - (defence/2)]
          int atk =  newPlayer1.getPokemon(num).getAttack();
          int def = newPlayer2.getPokemon(num).getDefense();
          int total = atk - (def/2);
          newPlayer2.getPokemon(num).setCurrentHP(total);
          turn -= 1;
        }
          
        else if (turn == 0){
          System.out.println(newPlayer2.getPokemon(num).getName() + " Used base attack! -" + newPlayer2.getPokemon(num).getAttack() + "HP");
          System.out.println(newPlayer1.getPokemon(num).getName() + " uses defense (50% effective)\n");
          int atk =  newPlayer2.getPokemon(num).getAttack();
          int def = newPlayer1.getPokemon(num).getDefense();
          int total = atk - (def/2);
          newPlayer1.getPokemon(num).setCurrentHP(total);
          turn += 1;
        }
      }

    //else if statement checking for if there is a critical hit move inputed. 
    else if(Move == 2){
      if(turn == 1){
          System.out.println(newPlayer1.getPokemon(num).getName() + " Used Critical Hit!");
          System.out.println(newPlayer2.getPokemon(num).getName() + " uses defense (50% effective)\n");
          int atk =  newPlayer1.getPokemon(num).getAttack();
          //crit is the predetermined critical hit value of the pokemon.
          int crit = newPlayer1.getPokemon(num).getCriticalHits();
          int def = newPlayer2.getPokemon(num).getDefense();
          //the formula for total damage taken changes to add crit to the total attack.
          int total = atk+crit - (def/2);
          newPlayer2.getPokemon(num).setCurrentHP(total);
          //the player giving the attack also looses 8HP as a side effect of using the more attack heavy move.
          newPlayer1.getPokemon(num).setCurrentHP(8);
          turn -= 1;
        }
          
        else if (turn == 0){
          System.out.println(newPlayer2.getPokemon(num).getName() + " Used base attack! -" + newPlayer2.getPokemon(num).getAttack() + "HP");
          System.out.println(newPlayer1.getPokemon(num).getName() + " uses defense (50% effective)\n");
          int atk =  newPlayer2.getPokemon(num).getAttack();
          int crit = newPlayer1.getPokemon(num).getCriticalHits();
          int def = newPlayer1.getPokemon(num).getDefense();
          int total = atk+crit - (def/2);
          newPlayer1.getPokemon(num).setCurrentHP(total);
          newPlayer2.getPokemon(num).setCurrentHP(8);
          turn += 1;
          
        }
      }
    }
  } 
}
