public class AdapterPattern implements IUSD{
    private Tenge tenge;

    public AdapterPattern(Tenge tenge) {
        this.tenge = tenge;
    }

    @Override
    public void getMoney() {
        tenge.convertToEuro();
    }
}
