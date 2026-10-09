public class Bujursangkar extends Bentuk {
    private double sisi;

    public Bujursangkar (double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
    }

}
