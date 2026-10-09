public class Main {
    public static void main(String[] args) {
        Bujursangkar bs = new Bujursangkar(10.0, "Merah");
        Lingkaran lg = new Lingkaran(6.0, "Biru");
        Silinder sl = new Silinder(4.0, 12.0, "Hijau");
        bs.printInfo();
        lg.printInfo();
        sl.printInfo();
    }
}
