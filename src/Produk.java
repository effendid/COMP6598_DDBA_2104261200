public class Produk {
    private String nama_produk;
    private int jumlah_produk;

    public Produk(String nama_produk, int jumlah_produk) {
        this.nama_produk = nama_produk;
        this.jumlah_produk = jumlah_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getJumlah_produk() {
        return jumlah_produk;
    }

    public void setJumlah_produk(int jumlah_produk) {
        this.jumlah_produk = jumlah_produk;
    }
}
