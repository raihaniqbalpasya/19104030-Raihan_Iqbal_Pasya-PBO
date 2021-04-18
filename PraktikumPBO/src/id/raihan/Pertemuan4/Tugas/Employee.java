package id.raihan.Pertemuan4.Tugas;

public abstract class Employee {
    private String jenisPekerjaan;

    public Employee(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    //method abstract gaji
    protected abstract void gaji();

    public String toString() {
        return "Jenis Pekerjaan\t: " + jenisPekerjaan;
    }
}
