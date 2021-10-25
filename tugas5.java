class siswa{
    String nama;
    int nis;
    double nilai;
}

class murid {
    String nama;
    int nis;
    String jurusan;

    murid(String inputnama, int masuknis, String a){
        nama = inputnama;
        nis = masuknis;
        jurusan  = a;
        System.out.println(nama);
        System.out.println(nis);
        System.out.println(jurusan);

        
    }
}

public class tugas5 {
    public static void main (String[] args) {
            siswa raffi = new siswa();
    
            raffi.nama = "Muhamad Raffi Irawan";
            raffi.nis = 2021101972;
            raffi.nilai = 9.5;
    
            System.out.println(raffi.nama);
            System.out.println(raffi.nis);
            System.out.println(raffi.nilai);

            murid siswa = new murid("Nisa",11,"RPL");   
        }
}