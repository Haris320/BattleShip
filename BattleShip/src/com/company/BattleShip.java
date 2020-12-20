package com.company;// Haris Ahmed
import java.util.Scanner;
public class BattleShip{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);

        System.out.println("888             888   888   888                888     d8b         ");
        System.out.println("888             888   888   888                888     Y8P         ");
        System.out.println("888             888   888   888                888                 ");
        System.out.println("88888b.   8888b. 888888888888888 .d88b. .d8888b 88888b. 88888888b.  ");
        System.out.println("888 \"88b    \"88b888   888   888d8P  Y8b88K     888 \"88b888888 \"88b ");
        System.out.println("888  888 .d888888888   888   88888888888\"Y8888b.888  888888888  888 ");
        System.out.println("888 d88P 888  888Y88b. Y88b. 888Y8b.         X8 888  888888888 d88P ");
        System.out.println("88888P\"  \"Y888888 \"Y888 \"Y888888 \"Y8888  88888P\'888  88888888888P\"  ");
        System.out.println("                                                          888      ");
        System.out.println("                                                          888      ");
        System.out.println("                                                          888   ");
        //ASCII welcome art

        char[][]ocean = new char[7][7];
        ocean = initBoard(ocean);
        printBoard(ocean);
        int tries = 7;
        int win = 1;



        while(tries>0){
            System.out.println("Enter a row");
            int userR = reader.nextInt();
            while((userR>7)||(userR<1)){
                System.out.println("Invalid Input. Re-enter a row");
                userR = reader.nextInt();
            }

            System.out.println("Enter a column");
            int userC = reader.nextInt();
            while((userC>7)||(userC<1)){
                System.out.println("Invalid Input. Re-enter a column");
                userC = reader.nextInt();
            }


            while(ocean[(userR-1)][(userC-1)]=='X'){
                System.out.println("You already choose that spot.");
                System.out.println("Enter a row");
                userR = reader.nextInt();
                while((userR>7)||(userR<1)){
                    System.out.println("Invalid Input. Re-enter a row");
                    userR = reader.nextInt();
                }

                System.out.println("Enter a column");
                userC = reader.nextInt();
                while((userC>7)||(userC<1)){
                    System.out.println("Invalid Input. Re-enter a column");
                    userC = reader.nextInt();
                }

            }//Validation if they choose the same spot again

            if(ocean[(userR-1)][(userC-1)]=='b'){
                System.out.println("You Win");
                tries-=7;
                win--;
            }

            if(ocean[(userR-1)][(userC-1)]!='b'){
                System.out.println("Incorrect try again");
                ocean[(userR-1)][(userC-1)]='X';
                printBoard(ocean);
                tries--;
            }


        }


        if(win==0){

            System.out.println(" 	                                __ ");
            System.out.println(" 	 __ __            _ _ _        |  |");
            System.out.println("	|  |  |___ _ _   | | | |___ ___|  |");
            System.out.println(" 	|_   _| . | | |  | | | | . |   |__|");
            System.out.println("  	  |_| |___|___|  |_____|___|_|_|__|\n\n");


        }

        if(win!=0)
            System.out.println("You lose!");


    }//Main

    public static char[][]initBoard (char[][] b){

        int n = (int)(Math.random()*6)+1;
        int w = (int)(Math.random()*6)+1;


        for( int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length; c++){
                b[r][c]='~';
            }
        }
        b[n][w]='b';
        System.out.println("The boat is at ("+(n+1)+","+(w+1)+").");

        return b;
    }//Board




    public static char[][]printBoard (char[][] b){

        for( int r = 0; r < b.length; r++){
            for(int c = 0; c < b[r].length; c++){
                if(b[r][c]=='b')
                    System.out.print("~ ");

                if(b[r][c]!='b')
                    System.out.print(b[r][c]+" ");
            }
            System.out.println();
        }
        return b;
    }//Print Board


}
