package e31192281_stack;
import java.util.Scanner;
/**
 *
 * @author Ihsan
 */
class Stack {
    Buku noob; //inisialisasi variabel buku adalah noob
    public Stack(){
        noob=null; //nilai pada noob bernilai null atau tidak memiliki nilai
    }
    public void push(Buku x){ //konstruktor push untuk memasukkan data
        if(noob==null)noob=x; //kondisi yang terjadi jika noob bernilai null
        else{
            x.next=noob; //kondisi yang terjadi jika data x ditambahkan maka bernilai sama dengan noob
            noob=x;
        }
    }
    public void pop(){ //konstruktor untuk mengeluarkan data yang paling atas
        if(noob==null) System.out.println("Data Kosong"); //kondisi yang terjadi jika nilai noob sama dengan null maka akan menampilkan data kosong
        else{
            System.out.println("Melakukan pooping"); //menampilkan output tulisan Melakukan pooping
            noob.display(); //kondisi dimana menampilkan data yaitu pop
            noob=noob.next; // memunculkan data yang telah dikeluarkan
        }
    }
    public void display(){
        if(noob==null)System.out.println("Data Kosong"); //kondisi yang terjadi jika nilai noob sama dengan null maka akan menampilkan data kosong
        else{
            Buku lbr=noob; //inisialisasi nilai lbr sama dengan noob pada variabel buku
            while(lbr!=null){ //kondisi yang terjadi jika lbr bernilai null
                System.out.println("-----"); //memunculkan tulisan ----- saat di run
                lbr.display(); //menampilkan data yang ada pada stack
                lbr=lbr.next;
            }
        }
    }
}
public class Buku {
    int kode, rak;
    String jenis;
    Buku next;
    /*
    Kode diatas adalah pendeklarasian tipe data dan variabel dimana kode dan rak
    berupa angka maka dari menggunakan tipe data integer, sedangkan untuk jenis 
    kalimat menggunakan tipe data String
    */
    public static Scanner input=new Scanner(System.in);
    public static Scanner string=new Scanner(System.in);
    
    /*
    Kode diatas menggunakan static, gunanya agar objek dari kelas lain dapat
    mengaksesnya tanpa membuat instansinya. Kode pertama "input" digunakan
    untuk inputan bertipe string dan kode kedua "string" digunakan untuk input
    data bertipe String
    */
    public void input(){
        System.out.println("Masukkan kode buku      : ");
        kode = input.nextInt();
        System.out.println("Masukkan jenis buku     : ");
        jenis = string.nextLine();
        System.out.println("Masukkan rak buku       : ");
        rak = input.nextInt();
        next = null;
    }
    
    /*Kode diatas adalah konstruktor yang dipakai untuk menginputkan data yang
    diinginkan sesuai tipe data yang ada
    */
    public void display(){
        System.out.println("Kode buku       : "+kode); //menampilkan output berupa kode
        System.out.println("Jenis buku      : "+jenis); //menampilkan output berupa jenis
        System.out.println("Rak buku        : "+rak); //menampilkan output berupa rak
    }
    public static void main(String[] args) {
        int pilihan; //deklarasi nilai variabel menu yaitu 0 dengan tipe data integer
        Stack stc = new Stack(); //deklarasi stc sebagai pengganti nilai stack
        do{
            System.out.println("1. PUSH"); //menampilkan output tulisan push saat di run
            System.out.println("2. POP"); //menampilkan output tulisan pop saat di run
            System.out.println("3. Lihat isi data"); //menampilkan output tulisan Lihat isi data saat di run
            System.out.println("4. KELUAR"); //menampilkan output tulisan keluar saat di run
            System.out.println("Masukkan pilihan : "); //menampilkan output tulisan saat di run
            pilihan = input.nextInt(); //menggunakan fungsi scanner pada variabel menu yang bertipe integer
            if(pilihan == 1){ //kondisi dimana jika nilai pilihan sama dengan satu maka akan melakukan..
                Buku baru = new Buku(); //deklarasi baru sebagai pengganti variabel buku
                baru.input(); //variabel baru dimana mengembalikan nilai dari input
                stc.push(baru); //program melakukan perintah push pada data yang sudah diinput
            }else if(pilihan == 2){
                stc.pop(); //kondisi jika memilih pilihan 2 maka akan melakukan perintah pop
            }else if(pilihan == 3){
                stc.display(); //kondisi jika memilih pilihan tiga maka akan melakukan
            }else if(pilihan == 4){
                System.exit(0); //kondisi jika memilih pilihan 4 maka program selesai
            }else{
                System.out.println("Pilihan tidak ada"); //kondisi dimana jika memilih selain 4 pilihan maka akan muncul tulisan pilihan tidak ada
            }
        } while(pilihan != 0);
    }
}