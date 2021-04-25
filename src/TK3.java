import java.util.*;

public class TK3 {

    static String nama_produk ="-";
    static int jumlah_produk;

    static ArrayList<Produk> list = new ArrayList<Produk>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        menuUtama();

    }

    static void menuUtama(){
        int pilihan = 0;
        do {
            System.out.println("====== Menu ======");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Lihat Produk");
            System.out.println("5. Keluar");

            System.out.print("Masukkan pilihan > ");
            pilihan = input.nextInt();

            if (pilihan == 1){
                tambahProduk();
            }
            if (pilihan == 2){
                hapusProduk();
            }
            if (pilihan == 4){
                lihatProduk();
            }

        } while(pilihan == 5);
    }

    static void tambahProduk(){

        Scanner inp = new Scanner(System.in);

        System.out.println("***** Tambah Produk *****");

        System.out.print("Nama Produk > ");
        nama_produk = inp.nextLine();
        System.out.print("Jumlah Produk > ");
        try {
            jumlah_produk = input.nextInt();
            list.add(new Produk(nama_produk, jumlah_produk));
        } catch (InputMismatchException ime){
            System.out.println("Hanya Menerima inputan angka");
        }

        menuUtama();
    }

    static void hapusProduk(){

    }
    
    static void lihatProduk(){
        //for loop untuk menampilkan nama buah, jumlah, dan harga setiap elemen
        for(int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ".) Nama produk "+ list.get(i).getNama_produk() + " jumlah produk " +
                    list.get(i).getJumlah_produk());

        }
    }

}
