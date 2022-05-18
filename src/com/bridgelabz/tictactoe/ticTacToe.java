package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class ticTacToe {
 public static char[] gameArray = new char[10];
 private static char userTurn;
 private static char computerTurn;
 public static int userPos;
 public static Scanner scanner = new Scanner(System.in);

 public static void ticTacToe() {
  for (int i = 0; i < gameArray.length; i++) {
   gameArray[i] = ' ';
  }
 }

 public static char user(Scanner scanner) {
  System.out.println("Enter your choice  X or O only");
  return scanner.next().toUpperCase().charAt(0);
 }

 public static void showBoard() {

  System.out.println(gameArray[0] + " | " + gameArray[1] + " | " + gameArray[2]);
  System.out.println(gameArray[3] + " | " + gameArray[4] + " | " + gameArray[5]);
  System.out.println(gameArray[6] + " | " + gameArray[7] + " | " + gameArray[8]);
 }

 public static void userLocation() {
  System.out.print("\nSelect the position in board from range [0 - 8] : ");
  userPos = scanner.nextInt();

  switch (userPos) {
   case 0:
    if (gameArray[0] == ' ') {
     gameArray[0] = userTurn;
    }
    break;

   case 1:
    if (gameArray[1] == ' ') {
     gameArray[1] = userTurn;
    }
    break;

   case 2:
    if (gameArray[2] == ' ') {
     gameArray[2] = userTurn;
    }
    break;

   case 3:
    if (gameArray[3] == ' ') {
     gameArray[3] = userTurn;
    }
    break;

   case 4:
    if (gameArray[4] == ' ') {
     gameArray[4] = userTurn;
    }
    break;

   case 5:
    if (gameArray[5] == ' ') {
     gameArray[5] = userTurn;
    }
    break;

   case 6:
    if (gameArray[6] == ' ') {
     gameArray[6] = userTurn;
    }
    break;

   case 7:
    if (gameArray[7] == ' ') {
     gameArray[7] = userTurn;
    }
    break;

   case 8:
    if (gameArray[8] == ' ') {
     gameArray[8] = userTurn;
    }
    break;

   default:
    System.out.println("Invalid Position ! Restart game");
    return;
  }
 }


 public static void main(String[] args) {
  ticTacToe();
  userTurn = user(scanner);
  computerTurn = (userTurn == 'X') ? 'O' : 'X';
  showBoard();
  userLocation();
 }
}



