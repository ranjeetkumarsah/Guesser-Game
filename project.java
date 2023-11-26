package project1;

import java.util.Scanner;

class guesser{
    int guessNum;
   int guessingNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("guesser! kindly guess the number");
       guessNum= sc.nextInt(guessNum);
       return guessNum;

    }
}
class player{
    int guessNum;
   int guessingNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("guesser! kindly guess the number");
        guessNum= sc.nextInt(guessNum);
        return guessNum;
    }
}
class umpire{
    int numberFromGuesser;
    int numberFromPlayer1;
    int numberFromPlayer2;
    int numberFromPlayer3;
   void collectFromNumGuesser(){
        guesser g=new guesser();
        numberFromGuesser=g.guessingNumber();

    }
  void  collectFromNumPlayers(){
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numberFromPlayer1 =p1.guessingNumber();
       numberFromPlayer2 =p2.guessingNumber();
      numberFromPlayer3 =p3.guessingNumber();
    }
    void compare(){
        if(numberFromGuesser==numberFromPlayer1){
            System.out.println(" player1 won game the game");
        }
        else if(numberFromGuesser==numberFromPlayer2){
            System.out.println("player2 won game the game");
        }
        else if(numberFromGuesser==numberFromPlayer3){
            System.out.println("player3 won game the game");
        }
        else{
            System.out.println("tum game har gya losser hai tum");
        }

     }
}
public class project {
    public static void man(String args[]){
System.out.println("your game start now");
umpire u=new umpire();
u.collectFromNumGuesser();
u.collectFromNumPlayers();
u.compare();
    }
    
}
