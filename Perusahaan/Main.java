package Perusahaan;

class Main {
    public static void main(String[] args) {
        // Perusahaan
        Perusahaan p1 = new Perusahaan("PT. Gacor Jaya");
        Karyawan ob1 = new Karyawan("Dudung Kopling", 2000000, p1);
        Programmer pr1 = new Programmer("Sucipto Sugianto", 8000000, p1, 200000);
        Manager m1 = new Manager("Ruben Amorim", 10000000, p1, 1000000, "Marketing");
        
        ob1.info();
        pr1.info();
        m1.info();
    }
}
