
package kalkulatoraplikasi;
public class HitungHari {
    public int hitung(String bulan, int tahun) {
        int jumlahHari = 0;

        // Menentukan jumlah hari berdasarkan bulan
        switch (bulan.toLowerCase()) {
            case "januari":
            case "maret":
            case "mei":
            case "juli":
            case "agustus":
            case "oktober":
            case "desember":
                jumlahHari = 31;
                break;
            case "februari":
                // Cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun kabisat
                } else {
                    jumlahHari = 28; // Bukan tahun kabisat
                }
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                jumlahHari = 30;
                break;
            default:
                System.out.println("Bulan tidak valid.");
                break;
        }
        
        return jumlahHari;
    }
}
