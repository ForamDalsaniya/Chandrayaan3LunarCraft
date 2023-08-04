package org.incubyte.chandrayaan3.lunarcraft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the initial Co-ordinates of Lunar Craft:");

        Scanner pos = new Scanner(System.in);
        int x = pos.nextInt();
        int y = pos.nextInt();
        int z = pos.nextInt();

        System.out.println("Enter Initial Direction of Lunar Craft:");
        System.out.println("Enter N for North direction\nEnter S for South direction\nEnter E for East direction\nEnter W for West direction\nEnter Up for Up direction\nEnter Down for Down Ddirection");
        pos = new Scanner(System.in);
        String dir = pos.nextLine();

        Direction direction;

        switch (dir){
            case "N":
                direction = Direction.N;
                break;
            case "E":
                direction = Direction.E;
                break;
            case "S":
                direction = Direction.S;
                break;
            case "W":
                direction = Direction.W;
                break;
            case "Up":
                direction = Direction.Up;
                break;
            case "Down":
                direction = Direction.Down;
                break;
            default:
                direction = Direction.N;
        }

//        char commands[] = {};
//        System.out.println("Enter size of command array:");
//        pos = new Scanner(System.in);
//        int sizeOfCommandArray = pos.nextInt();
//        System.out.println("Enter Commands:");
//        for(int i=0; i<sizeOfCommandArray; i++){
//            pos = new Scanner(System.in);
//            commands[i] =  pos.next().charAt(0);
//        }
        char commands[] = {'f','r','u','b','l'};
        Position position = new Position(x,y,z,direction);

        CraftNavigation craftNavigation = new CraftNavigation();


        for(char command : commands){
            switch (position.getDirection()){
                case N:
                    position = craftNavigation.northNavigation(command,position);
                    break;
                case S:
                    position = craftNavigation.southNavigation(command,position);
                    break;
                case E:
                    position = craftNavigation.eastNavigation(command,position);
                    break;
                case W:
                    position = craftNavigation.westNavigation(command,position);
                    break;
                case Up:
                    position = craftNavigation.upNavigation(command,position);
                    break;
                case Down:
                    position = craftNavigation.downNavigation(command,position);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }

        System.out.println("Final Position: ("+ position.getX() + " "+position.getY()+ " "+position.getZ()+")");
        System.out.println("Final Direction: " + position.getDirection());
    }
}