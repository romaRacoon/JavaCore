public class Test {
    public static void main(String[] args) {

    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection = null;
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw e;
                }
            } finally {
                try {
                    robotConnection.close();
                } catch (Throwable e) {
                }
            }
        }
    }
}
