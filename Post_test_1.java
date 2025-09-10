package com.mycompany.post_test_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Post_test_1 {
    public static void main(String[] args) {
        ArrayList<String> namaTanaman = new ArrayList<>();
        ArrayList<String> jenisTanaman = new ArrayList<>();
        ArrayList<String> sistemHidroponik = new ArrayList<>();
        ArrayList<String> tanggalTanam = new ArrayList<>();
        ArrayList<String> statusTanaman = new ArrayList<>();
        ArrayList<String> phAir = new ArrayList<>();
        ArrayList<String> catatan = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Tanaman Hidroponik ===");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Lihat Tanaman");
            System.out.println("3. Update Tanaman");
            System.out.println("4. Hapus Tanaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Tanaman: ");
                    String nama = input.nextLine();

                    System.out.println("Jenis Tanaman: 1.Sayuran 2.Buah 3.Herbal 4.Tanaman Hias");
                    System.out.print("Pilih jenis (1-4): ");
                    int j = input.nextInt(); input.nextLine();
                    String jenis = (j==1)?"Sayuran":(j==2)?"Buah":(j==3)?"Herbal":(j==4)?"Tanaman Hias":"Belum ditentukan";

                    System.out.println("Sistem Hidroponik: 1.NFT 2.DWC 3.Wick 4.Drip 5.Ebb&Flow 6.Aeroponik");
                    System.out.print("Pilih sistem (1-6): ");
                    int s = input.nextInt(); input.nextLine();
                    String sistem = (s==1)?"NFT":(s==2)?"DWC":(s==3)?"Wick":(s==4)?"Drip":(s==5)?"Ebb&Flow":(s==6)?"Aeroponik":"Belum ditentukan";

                    System.out.print("Tanggal Tanam (dd/mm/yyyy): ");
                    String tanggal = input.nextLine();

                    System.out.println("Status Tanaman: 1.Bibit 2.Tumbuh 3.Berbunga 4.Berbuah 5.Panen 6.Mati");
                    System.out.print("Pilih status (1-6): ");
                    int st = input.nextInt(); input.nextLine();
                    String status = (st==1)?"Bibit":(st==2)?"Tumbuh":(st==3)?"Berbunga":(st==4)?"Berbuah":(st==5)?"Panen":(st==6)?"Mati":"Belum ditentukan";

                    System.out.print("pH Air: ");
                    String ph = input.nextLine();
                    System.out.print("Catatan: ");
                    String ctn = input.nextLine();

                    namaTanaman.add(nama);
                    jenisTanaman.add(jenis);
                    sistemHidroponik.add(sistem);
                    tanggalTanam.add(tanggal);
                    statusTanaman.add(status);
                    phAir.add(ph);
                    catatan.add(ctn);

                    System.out.println("Tanaman berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("=== Daftar Tanaman ===");
                    if(namaTanaman.isEmpty()) System.out.println("Belum ada tanaman.");
                    else {
                        for(int i=0;i<namaTanaman.size();i++){
                            System.out.println((i+1)+". "+namaTanaman.get(i)+
                                    " | "+jenisTanaman.get(i)+
                                    " | "+sistemHidroponik.get(i)+
                                    " | "+tanggalTanam.get(i)+
                                    " | "+statusTanaman.get(i)+
                                    " | pH:"+phAir.get(i)+
                                    " | "+catatan.get(i));
                        }
                    }
                    break;

                case 3:
                    if(namaTanaman.isEmpty()){System.out.println("Belum ada tanaman."); break;}
                    System.out.print("Nomor tanaman yang ingin diupdate: ");
                    int u = input.nextInt(); input.nextLine();
                    if(u>0 && u<=namaTanaman.size()){
                        int idx=u-1;
                        System.out.print("Nama baru: "); namaTanaman.set(idx,input.nextLine());
                        System.out.print("Jenis baru: "); jenisTanaman.set(idx,input.nextLine());
                        System.out.print("Sistem baru: "); sistemHidroponik.set(idx,input.nextLine());
                        System.out.print("Tanggal baru: "); tanggalTanam.set(idx,input.nextLine());
                        System.out.print("Status baru: "); statusTanaman.set(idx,input.nextLine());
                        System.out.print("pH baru: "); phAir.set(idx,input.nextLine());
                        System.out.print("Catatan baru: "); catatan.set(idx,input.nextLine());
                        System.out.println("Tanaman berhasil diupdate!");
                    } else System.out.println("Nomor tidak valid.");
                    break;

                case 4:
                    if(namaTanaman.isEmpty()){System.out.println("Belum ada tanaman."); break;}
                    System.out.print("Nomor tanaman yang ingin dihapus: ");
                    int h = input.nextInt(); input.nextLine();
                    if(h>0 && h<=namaTanaman.size()){
                        namaTanaman.remove(h-1);
                        jenisTanaman.remove(h-1);
                        sistemHidroponik.remove(h-1);
                        tanggalTanam.remove(h-1);
                        statusTanaman.remove(h-1);
                        phAir.remove(h-1);
                        catatan.remove(h-1);
                        System.out.println("Tanaman berhasil dihapus!");
                    } else System.out.println("Nomor tidak valid.");
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(pilihan != 5);
    }
}
