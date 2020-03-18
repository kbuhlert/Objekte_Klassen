public class TamagochiApp {
    public static void main(String[] args) {
        Tamagochi herbert = new Tamagochi();
        herbert.x = 6;
        herbert.y = 4;
        herbert.futterstand = 5;

        herbert.move("links",5);
        herbert.fuettern(5);
        herbert.move("links", 1);
        herbert.move("runter",4);

    }
}
