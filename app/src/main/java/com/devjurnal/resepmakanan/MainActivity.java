package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();



        // TODO 5. Masukkan data ke List

        for (int i=0; i< 5; i++) {

            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Mi Celor Palembang");
            resep1.setPoster("http://makananoleholeh.com/wp-content/uploads/2017/06/Mie-Celor-Khas-Palembang.jpg");
            resep1.setSummary("Mi Celor merupakan panganan khas masyarakat Palembang yang mempunyai ciri khas dalam teknik memasaknya." +
                    "Betapa tidak, resep kali ini telah kami rangkum sesederhana mungkin sehingga mampu memberikan sajian " +
                    "yang mudah untuk ditiru.");
            resep1.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan : 15 menit\n" +
                    "Memasak : 20 menit\n" +
                    "Total : 35 Menit\n" +
                    "\n" +
                    "Bahan-Bahan:\n" +
                    "\n" +
                    "300 gr udang\n" +
                    "kupas, sisakan ekornya lalu kerat punggungnya(ambil kulitnya untuk kaldu)\n" +
                    "1 sdt air jeruk limau\n" +
                    "250 gr mi telur, seduh\n" +
                    "100 gr taoge, seduh\n" +
                    "3 btr telur, rebus lalu potong-potong\n" +
                    "6 btg kucai, iris halus\n" +
                    "5 sdm bawang goreng\n\n" +
                    "Bahan Kuah:\n" +
                    "\n" +
                    "1250 ml kaldu udang\n" +
                    "250 ml santan dari ½ btr kelapa\n" +
                    "¼ sdt gula pasir\n" +
                    "½ sdt merica bubuk\n" +
                    "2 sdm tepung terigu encerkan dengan 50 ml air\n" +
                    "1 sdt air jeruk limau\n" +
                    "2 btr telur, kocok lepas\n" +
                    "\nCara Untuk Membuat Mi Celor Palembang yang Sedap:\n" +
                    "\n" +
                    "Aduk udang dan air jeruk limau, diamkan selama 15 menit.\n" +
                    "Didihkan 1500 ml air, masukkan kulit udang, angkat. Ukur kaldunya 1250 ml.\n" +
                    "Didihkan kaldu udang, tambahkan santan, garam, gula, merica dan udang kupas, rebus sampai matang.\n" +
                    "Masukkan telur mentah sambil diaduk hingga berbutir-butir, tambahkan air jeruk limau, aduk sampai matang. Kentalkan.\n" +
                    "Dengan larutan tepung terigu sambil diaduk hingga meletup-letup.\n" +
                    "Sendokkan mi dan taoge ke dalam mangkuk, tambahkan potongan telur rebus, siram dengan kuah panas, taburkan kucai dan bawang goreng. Sajikan.");

            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Sop TEKWAN");
            resep2.setPoster("http://makananoleholeh.com/wp-content/uploads/2017/06/Tekwan-Khas-Palembang.jpg");
            resep2.setSummary("tekwan juga merupakan olahan dengan bahan utamanya terbuat dari ikan dan adanya tambahan tepung tapioka. \n" +
                    "Hidangan ini juga cukup praktis dibuat dan bisa diawetkan dalam lemari es untuk beberapa waktu.");
            resep2.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 40 menit\n" +
                    "\n" +
                    " \n" +
                    "Memasak: 180 menit\n" +
                    "\n" +
                    "Total: 240 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "12 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Sajian Sop TEKWAN yang enak\n" +
                    "\n" +
                    "Bahan Utama Membuat Sop TEKWAN:\n" +
                    "\n" +
                    "300 gr Daging Tenggiri dihaluskan.\n" +
                    "1 gelas Tepung Sagu.\n" +
                    "1 sdm Tepung Terigu.\n" +
                    "200 gr Udang cincang.\n" +
                    "1 gelas Jamur kuping kering, direndam.\n" +
                    "2 sdm Kimlo (bunga sedap malam kering).\n" +
                    "1 batang Daun bawang.\n" +
                    "8 siung Bawang merah , ulek.\n" +
                    "4 siung Bawang Putih.\n" +
                    "3 sdm Kecap asin.\n" +
                    "1 sdm Gula.\n" +
                    "1/2 sdt Lada (Merica).\n" +
                    "2 liter Kaldu udang.\n" +
                    "Cara Memasak Sop TEKWAN yang lezat:\n" +
                    "\n" +
                    "Uleni daging ikan, sagu dan terigu, boleh tambah garam lada sedikit saja supaya tidak tawar. Jika dirasakan adonan sulit kalis (kadang dapat ikan yang rada kering dagingnya), boleh tambahkan air 4 sdm.\n" +
                    "Bulatkan adonan sebesar ujung jempol dan rebus hingga matang dalam air mendidih. Tiriskan.\n" +
                    "Tumis bumbu halus hingga harum. Masukkan udang cincang, tumis hingga harum.\n" +
                    "Masukkan kimlo, jamur kuping, kecap asin, merica, gula. Boleh tambah garam sesuai selera.\n" +
                    "Masukkan hasil tumisan ke dalam kaldu, juga masukkan bola bola ikan tenggiri.\n" +
                    "Terakhir masukkan daun bawang.\n");

            listResep.add(resep2);

            resep3.setJudul(" Malbi");
            resep3.setPoster("http://makananoleholeh.com/wp-content/uploads/2017/06/Malbi-Khas-Palembang.jpg");
            resep3.setSummary("Kuliner dengan nama malbi adalah makanan khas Palembang yang kaya akan rempah-rempah asli Tanah Air dengan bahan dasar utamanya berupa daging sapi.");
            resep3.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 25 menit\n" +
                    "\n" +
                    "Memasak: 45 menit\n" +
                    "\n" +
                    "Total: 70 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "6 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Malbi yang Asli, Enak dan Gurih\n" +
                    "\n" +
                    "Bahan dan Bumbu Malbi:\n" +
                    "\n" +
                    "500 gram daging has, potong 5×5 cm.\n" +
                    "2 lembar daun salam.\n" +
                    "2 cm lengkuas, memarkan.\n" +
                    "4 butir cengkeh.\n" +
                    "1/4 sendok teh pala bubuk.\n" +
                    "2 sendok makan kecap manis.\n" +
                    "1 sendok teh garam.\n" +
                    "1/2 sendok teh air asam (dari 1/2 sendok teh asam jawa dan 1/2 sendok makan air)\n" +
                    "500 ml air.\n" +
                    "2 sendok makan minyak untuk menumis.\n" +
                    "4 buah cabai merah, buang biji, potong serong, goreng untuk taburan.\n" +
                    "5 butir bawang merah, iris tipis, goreng untuk taburan.\n" +
                    "\n" +
                    "Bahan untuk bumbu halus:\n" +
                    "\n" +
                    "10 butir bawang merah\n" +
                    "5 siung bawang putih\n" +
                    "1 sendok teh ketumbar\n" +
                    "1/2 sendok teh jintan\n\n" +
                    "2 cm jahe\n" +
                    "1/2 sendok teh merica\n" +
                    "\n" +
                    "Cara Memasak Bahan-Bahan untuk membuat Malbi:\n" +
                    "\n" +
                    "Tumis bumbu halus, daun salam, lengkuas, dan cengkeh sampai harum. Masukkan daging. Aduk sampai berubah warna.\n" +
                    "Tambahkan pala bubuk, kecap manis, dan garam. Aduk rata.\n" +
                    "Masukkan air secara bertahap. Masak sampai kental. Tambahkan air asam. Aduk rata.\n" +
                    "Sajikan dengan bahan taburan.");

            listResep.add(resep3);
            resep4.setJudul("Model Tahu khas Palembang");
            resep4.setPoster("http://live-03.ilmci.com/wp-content/uploads/2015/01/model-tahu.jpg");
            resep4.setSummary("Model adalah salah satu jenis kuliner dari Sumatera Selatan, khususnya Palembang dengan bahan utamanya tahu cina.");
            resep4.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 45 menit\n" +
                    "\n" +
                    "Memasak: 45 menit\n" +
                    "\n" +
                    "Total: 90 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "10 Orang\n" +
                    "Bahan yang Diperlukan Untuk Membuat Sajian Sedap Model Tahu khas Palembang\n" +
                    "\n" +
                    "Bahan Model\n" +
                    "\n" +
                    "½ resep adonan dasar\n" +
                    "4 tahu putih dipotong 2 diagonal\n" +
                    "Minyak untuk menumis dan menggoreng\n" +
                    "Bahan Kuah:\n" +
                    "\n" +
                    "1250 ml air\n" +
                    "1 batang bawang daun, simpulkan\n" +
                    "2 cm jahe\n" +
                    "1 batang daun seledri, simpulkan\n" +
                    "150 g udang kupas, rebus, haluskan\n" +
                    "¼ sdt gula pasir\n" +
                    "Garam secukupnya\n" +
                    "1 blok kaldu instan\n" +
                    "4 buah kepala udang besar di pecahkan buang kulitnya\n" +
                    "100 gram wortel, potong dadu kemudian rebus sebentar\n" +
                    "Bahan Bumbu yang dihaluskan:" +
                    "\n" +
                    "6 siung bawang putih\n" +
                    "1 ½ sdt tongcai\n" +
                    "1 sdt lada butir\n" +
                    "1 sdm ebi\n" +
                    "Bahan Pelengkap :\n" +
                    "\n" +
                    "Mentimun cacah.\n" +
                    "Sambal cabai rawit.\n" +
                    "1 batang bawang daun, iris halus.\n" +
                    "Kecap asin dan cuka putih.\n" +
                    "1 batang seledri, iris halus.\n" +
                    "\nCara Membuatnya: \n" +
                    "\n" +
                    "Bentuk adonan seperti bola Tenis dan pipihkan.\n" +
                    "Bungkus tahu dengan adonan dasar tadi.\n" +
                    "Goreng dalam minyak panas.\n" +
                    "Angkat dan tiriskan.\n" +
                    "Masukkan udang.\n" +
                    "Aduk hingga anyir udang hilang.\n" +
                    "Didihkan air, masukkan pecahan kepala udang dan kaldu instan.\n" +
                    "Masukkan jahe, daun bawang dan saledri.\n" +
                    "Masukkan garam, gula, cicip rasanya.\n" +
                    "Masukkan Model sebentar sampai lunak. Dan angkat, tiriskan.\n" +
                    "Potong kasar model tahu, letakkan di mangkuk saji.\n" +
                    "Tambahkan soun.\n" +
                    "Tuang kuah model .\n" +
                    "Taburi bawang goreng, irisan saledri dan timun cincang.\n" +
                    "Sajikan.\n" +
                    "Jika rasa asin kurang tambahkan kecap asin.n" +
                    "Jika  ada kurang asam, tetes sedikit cuka putih.\n" +
                    "Untuk rasa pedas, beri sambal cabai rawit.");
            listResep.add(resep4);

        }
        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        recycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

    }
}
