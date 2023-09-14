public class Lunarspacecraft {
    private int x;
    private int y;
    private int z;
    private String direction;


    //default constructor
    public Lunarspacecraft() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.direction = "N";
    }

    //The spacecraft moves one step forward from its previous
    public void moveForward() {
        if ("N".equals(direction)) {
            y++;
        } else if ("S".equals(direction)) {
            y--;
        } else if ("E".equals(direction)) {
            x++;
        } else if ("W".equals(direction)) {
            x--;
        } else if ("U".equals(direction)) {
            z++;
        } else if ("D".equals(direction)) {
            z--;
        }
    }

    //The spacecraft moves back one step from its previous
    public void moveBackward() {
        if ("N".equals(direction)) {
            y--;
        } else if ("S".equals(direction)) {
            y++;
        } else if ("E".equals(direction)) {
            x--;
        } else if ("W".equals(direction)) {
            x++;
        } else if ("U".equals(direction)) {
            z--;
        } else if ("D".equals(direction)) {
            z++;
        }
    }

//The spacecraft turn left from its previous

    public void turnLeft() {
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        } else if ("W".equals(direction)) {
            direction = "S";
        } else if ("U".equals(direction)) {
            direction = "N";
        } else if ("D".equals(direction)) {
            direction = "S";
        }
    }
//The spacecraft turn right from its previous

    public void turnRight() {
        if ("N".equals(direction)) {
            direction = "E";
        } else if ("S".equals(direction)) {
            direction = "W";
        } else if ("E".equals(direction)) {
            direction = "S";
        } else if ("W".equals(direction)) {
            direction = "N";
        } else if ("U".equals(direction)) {
            direction = "N";
        } else if ("D".equals(direction)) {
            direction = "S";
        }
    }
//The spacecraft Move up from its previous

    public void turnUp() {
        if ("N".equals(direction)) {
            direction = "U";
        } else if ("S".equals(direction)) {
            direction = "D";
        } else if ("E".equals(direction)) {
            direction = "U";
        } else if ("W".equals(direction)) {
            direction = "D";
        }
    }

    public void turnDown() {
        if ("N".equals(direction)) {
            direction = "D";
        } else if ("S".equals(direction)) {
            direction = "U";
        } else if ("E".equals(direction)) {
            direction = "D";
        } else if ("W".equals(direction)) {
            direction = "U";
        }
    }

    public void processCommands(String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    turnLeft();
                    break;
                case "r":
                    turnRight();
                    break;
                case "u":
                    turnUp();
                    break;
                case "d":
                    turnDown();
                    break;
                default:
                    // other than expected input default case will be handendled
                    break;
            }
        }
    }
    public int[] getPosition() {
        return new int[]{x, y, z};
    }

    public String getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        Lunarspacecraft spacecraft = new Lunarspacecraft();
        String[] commands = {"f", "r", "u", "b", "l"};
        spacecraft.processCommands(commands);
        int[] finalPosition = spacecraft.getPosition();
        String finalDirection = spacecraft.getDirection();
        System.out.println("Final Position of spacecraft: (" + finalPosition[0] + ", " + finalPosition[1] + ", " + finalPosition[2] + ")");
        System.out.println("Final Direction of spacecraft: " + finalDirection);
    }
}