public class Main {
    public static void main(String[] args) {
        Tenge tenge = new Tenge();
        IUSD iusd = new AdapterPattern(tenge);

        iusd.getMoney();
    }
}
