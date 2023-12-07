package Projectone;



import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an odd number of rounds.");
        int R = Integer.parseInt(console.nextLine());
        int point1= 0;
        int point2= 0;
        Random random = new Random();
        for(int i =0; i < R; i++) {
            System.out.println("Enter Character name for player 1:");
            String name1 = console.nextLine();
            System.out.println("Enter Character HP for player 1");
            int HP1 = Integer.parseInt(console.nextLine());
            System.out.println("Enter Characters attack move name for player 1");
            String move1 = console.nextLine();
            System.out.println("Enter moves attack power for player 1 ");
            int movePower1 = Integer.parseInt(console.nextLine());
            System.out.println("Enter moves speed for player 1");
            int movespeed1 = Integer.parseInt(console.nextLine());

            System.out.println("Enter Character name for player 2:");
            String name2 = console.nextLine();
            System.out.println("Enter Character HP for player 2");
            int HP2 = Integer.parseInt(console.nextLine());
            System.out.println("Enter Characters attack move name for player 2");
            String move2 = console.nextLine();
            System.out.println("Enter moves attack power for player 2 ");
            int movePower2 = Integer.parseInt(console.nextLine());
            System.out.println("Enter moves speed for player 2");
            int movespeed2 = Integer.parseInt(console.nextLine());

            if (movespeed1 < movespeed2) {
                HP1 -= movePower2;
                if (HP1 <= 0) {
                    point2 += 1;
                    System.out.printf("%s wins round using %s",name2,move2);
                } else if (HP1 > 1) {
                    System.out.println("No winner this round. Resetting round.");
                    R += 1;
                }
            } else if (movespeed1 > movespeed2) {
                HP2 -= movePower1;
                if (HP2 <= 0) {
                    point1 += 1;
                    System.out.printf("%s wins round using %s",name1,move1);
                }else if (HP2 > 1)
                    System.out.println("No winner this round. Resetting round.");
                    R += 1;
                }
                if (movespeed1 == movespeed2) {
                    int rnd = random.nextInt(2);
                    if (rnd == 0) {
                        HP2 -= movePower1;
                        if (HP2 < 1) {
                            point1 += 1;
                            System.out.printf("%s wins round using %s",name1,move1);

                        } else if (HP2 > 1) {
                            System.out.println("No winner this round. Resetting round.");
                            R += 1;

                        } else {
                            HP1 -= movePower2;
                            if (HP1 <= 0) {
                                point2 += 1;
                                System.out.printf("%s wins round using %s",name2,move2);
                            } else if (HP1 > 1) {
                                System.out.println("No winner this round. Resetting round.");
                                R += 1;
                            }
                        }

                    }
                }
            }
        System.out.println("Rounds over.\n Player 1 score "+point1+ "\n Player 2 score "+point2);
        if(point1 <point2){
            System.out.println("Player 2 wins");
            }else{
            System.out.println("Player 1 wins");
        }

    }
}
        /*
            String Rname= "Rocco";
            int RHP = 4;
            String Rmove = "Rock Bash";
            int RmovePower = 1;
            int Rmovespeed = 1;

            String Pname= "Papier";
            int PHP = 2;
            String Pmove = "Paper cut";
            int PmovePower = 2;
            int Pmovespeed = 2;

            String Sname= "Scisic";
            int SHP = 1;
            String Smove = "Metal shear";
            int SmovePower = 3;
            int Smovespeed = 3;

            CharacterBattle Rocco = new CharacterBattle(Rname,RHP,Rmove,RmovePower,Rmovespeed);
            CharacterBattle Papier = new CharacterBattle(Pname,PHP,Pmove,PmovePower,Pmovespeed);
            CharacterBattle Scisic = new CharacterBattle(Sname,SHP,Smove,SmovePower,Smovespeed);


         */



