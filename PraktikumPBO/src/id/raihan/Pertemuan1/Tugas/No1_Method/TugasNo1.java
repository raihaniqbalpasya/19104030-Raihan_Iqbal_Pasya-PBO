package id.raihan.Pertemuan1.Tugas.No1_Method;

// class untuk mengonversi suhu
public class TugasNo1 {
    // method-method konversi suhu
    public double cf(double suhu) {
        return (suhu * 1.8 + 32);
    }

    public double fk(double suhu) {
        return ((suhu + 459.67) / 1.8);
    }

    public double kr(double suhu) {
        return ((suhu - 273.15) * 0.8);
    }

    public double rc(double suhu) {
        return (suhu * 1.25);
    }
}
