public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human((byte)19, "Рома", "Артеменков", "Бокс");
        Human human2 = new Human((byte)19, "Рома", "Артеменков");
    }
    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {

        }
        public Human(byte age, String name, String secondName, String favoriteSport) {
            this(age, name,secondName);
            this.favoriteSport = favoriteSport;
        }
        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
