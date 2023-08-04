package org.incubyte.chandrayaan3.lunarcraft;

public class CraftNavigation {
    public CraftNavigation(){

    }
    public Position northNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.W);
                break;
            case 'r':
                position.setDirection(Direction.E);
                break;
            case 'f':
                position.setY(position.getY()+1);
                break;
            case 'b':
                position.setY(position.getY()-1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }

    public Position southNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.E);
                break;
            case 'r':
                position.setDirection(Direction.W);
                break;
            case 'f':
                position.setY(position.getY()-1);
                break;
            case 'b':
                position.setY(position.getY()+1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }

    public Position eastNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.N);
                break;
            case 'r':
                position.setDirection(Direction.S);
                break;
            case 'f':
                position.setX(position.getX()+1);
                break;
            case 'b':
                position.setX(position.getX()-1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }

    public Position westNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.S);
                break;
            case 'r':
                position.setDirection(Direction.N);
            case 'f':
                position.setX(position.getX()-1);
                break;
            case 'b':
                position.setX(position.getX()+1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }

    public Position upNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.W);
                break;
            case 'r':
                position.setDirection(Direction.E);
                break;
            case 'f':
                position.setZ(position.getZ()+1);
                break;
            case 'b':
                position.setZ(position.getZ()-1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }
    public Position downNavigation(char command, Position position){
        switch (command){
            case 'l':
                position.setDirection(Direction.E);
                break;
            case 'r':
                position.setDirection(Direction.W);
                break;
            case 'f':
                position.setZ(position.getZ()-1);
                break;
            case 'b':
                position.setZ(position.getZ()+1);
                break;
            case 'u':
                position.setDirection(Direction.Up);
                break;
            case 'd':
                position.setDirection(Direction.Down);
                break;
            default:
                System.out.println("Invalid Direction Specified");
        }
        return position;
    }
}
