package Perusahaan;

public class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, Perusahaan perusahaan, double bonus) {
        super(nama, gajiPokok, perusahaan);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    } 
}
