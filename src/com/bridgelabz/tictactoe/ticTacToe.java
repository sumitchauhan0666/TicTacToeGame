package com.bridgelabz.tictactoe;

public class ticTacToe {

 public static char[] gameArray = new char[10];

 public static void ticTacToe() {
  for (int i = 0; i < gameArray.length; i++) {
   gameArray[i] = ' ';
  }
 }
}
