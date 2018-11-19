package qifuatpop.app.kumpulanDoa.Model;

/**
 * Created by qifuats on 10/11/2018.
 */

public class ModelHome {
    private String jadwal;
    private String waktu;

    /* *Constructor * Menginisialisasikan Variable  */
    public ModelHome(String jadwal, String waktu) {
        this.jadwal = jadwal;
        this.waktu = waktu;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getWaktu() {
        return waktu;
    }
}
