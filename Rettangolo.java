public class Rettangolo extends  Forma {
    public Rettangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println(getX() * getY());
    }
}
