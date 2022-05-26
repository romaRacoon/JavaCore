public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        task.drawisMonitorsCounter(10, 10);
    }
    public int drawisMonitorsCounter(int monitors, int programmers) {
        int notDelivered = monitors % programmers;
        return notDelivered;
    }
}
