public class Forma {
    private int area;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void calcolaArea () {
        System.out.println(getArea());
    }

    @Override
    public String toString() {
        return "Forma{" +
                "area=" + area +
                '}';
    }
}
