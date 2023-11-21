public class Rettangolo extends  Forma {
    private int base;
    private int altezza;
    private int area;

    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
        area = base * altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public int getArea() {
        return area;
    }


}
