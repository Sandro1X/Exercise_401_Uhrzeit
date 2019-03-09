package bl;

public enum Ziffern {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
    
    int ziffer;

    private Ziffern(int ziffer) {
        this.ziffer = ziffer;
    }

    public int getZiffer() {
        return ziffer;
    }
}