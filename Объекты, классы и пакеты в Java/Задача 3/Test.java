public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 10,12);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX & robot.getY() != toY) {
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnLeft();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
            } if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                }
            } if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnRight();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                }
            } if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnLeft();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                }
            }
        }

        System.out.println(robot.getX() + " " + robot.getY());
    }

    public static class Robot {
        private Direction direction;
        private int x;
        private int y;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            switch (direction) {
                case UP:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.DOWN;
                    break;
                case DOWN:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.UP;
                    break;
                default:
                    break;
            }
        }

        public void turnRight() {
            switch (direction) {
                case UP:
                    direction = Direction.RIGHT;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.UP;
                    break;
                default:
                    break;
            }
        }

        public void stepForward() {
            switch (direction) {
                case UP:
                    y++;
                    break;
                case DOWN:
                    y--;
                    break;
                case LEFT:
                    x--;
                    break;
                case RIGHT:
                    x++;
                    break;
                default:
                    break;
            }
        }
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }
}
