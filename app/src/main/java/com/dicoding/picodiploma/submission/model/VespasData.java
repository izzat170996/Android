package com.dicoding.picodiploma.submission.model;

import com.dicoding.picodiploma.submission.R;

import java.util.ArrayList;

public class VespasData {
    private static String[] vespaNames = {
            "Vespa 98 Corsa Circuito",
            "Vespa 125",
            "Vespa 125 Six Day",
            "Vespa 125 (VNA2)",
            "Vespa 150 GS VS5",
            "Vespa 90 Super Sprint",
            "Vespa 180 Rally",
            "Vespa 50 Special",
            "Vespa 100 Sport",
            "Vespa 125 T5 Pole Position"
    };

    private static String[] vespaDetails = {
            "Vespa 98 Corsa diciptakan khusus untuk menunjukkan kepada dunia bahwa scooter kecil juga dapat bersaing di arena balap.Vespa yang semakin banyak terlihat di jalanan dan alun-alun kota Italia, membuat Enrico Piaggio termotivasi untuk menciptakan scooterbaru yang agresif untuk menjadi pemenang di arena balap. Giuseppe Cau merupakan orang pertama yang menggunakan Vespa 98 di sirkuit dan berhasil keluar sebagai pemenang di Climb Monte Mario Hill pada tahun 1947. Vespa 98 Corsa (Circuit) merupakan kombinasi antara kecepatan dan inovasi; body-nya dirakit oleh tangan menggunakan rangka baja; rem tromolnya dilengkapi dengan ventilasi udara belakang untuk sistem cooling; serta memiliki tiga persneling guna memastikan bahwa kontrol katup dan sistem coolingdapat terjadi melalui ventilasi udara. Dikenal dengan warna originalmerah, Vespa 98 Corsa ini dijuluki sebagai si \"bola api\" kecil.",
            "Pada tahun 1948 Piaggio meluncurkan Vespa baru. Antara tahun 1946 dan 1947, sebanyak 1183 unit Vespa 125cc dijual dan dipasarkan di luar negeri (terutama di Swiss). Pada akhir tahun 1947 Enrico Piaggio memutuskan untuk menghentikan produksi Vespa 98cc, dan hanya menjual Vespa 125cc baik untuk pasar Italia maupun penjualan internasional. Beberapa model baru juga telah dilengkapi oleh lengan suspensi depan, dan kap mesin yang dibuat lebih terbuka untuk memudahkan akses ke mesin dan komponen mekanis lainnya. Seri Vespa tahun 1949 berikutnya, yang kini dipamerkan di Museum Piaggio, tampak lebih baik dengan sistem cooling dan kontrol persneling yang baru.",
            "Secara estetika masih mirip dengan Vespa 125, \"Six Days\" hanya memiliki perbedaan pada tanki bahan bakar yang ditutup oleh tameng, dan adanya tas di sisi kanan yang mampu menampung karburator yang lebih besar. Nama \"Six Days\" berasal acara Twenty-sixth International Six Days pada tahun 1951, di mana Vespa berhasil memenangkan 9 medali emas. Tim balap Piaggio terdiri dari: Biasci, Cau, Kepiting, Mazzoncini, Merlo, Nesti, Opesso, Riva, Romano, dan Vivaldi. Vespa 125 \"Six Days\" juga memenangkan trofi Italian Motorcycle Federation pada tahun 1951, dimana 3 pembalap Vespa Italia berhasil mendominasi (Giuseppe Cau, Miro Riva, Bruno Romano).",
            "Di produksi dalam 2 jenis warna, yakni abu-abu dan krem, Vespa 125cc di tahun 1958 merupakan awal dari suatu era. Ini adalah Vespa pertama yang merupakan hasil rangkaian dari dua lembar lempengan logam. Rangkaian seperti ini ternyata memberikan keuntungan sendiri dari sisi produksi. Mulai tahun 1958, rangkaian tersebut mulai diaplikasikan ke semua model Vespa. Dengan desain baru, tentunya mesin compact baru juga turut diintegrasikan",
            "Vespa Legendaris, 150 Gran Sport memperlihatkan sosoknya pada tahun 1955 melalui model VS1. Model ini kemudian diadaptasi dan lahirlah versi VS5, yang dilengkapi dengan kipas speedometer khusus, lampu belakang yang di chrome, dan lampu rem yang telah terintegrasi. Model ini juga memiliki sistem rem yang lebih baik, dan dilengkapi oleh logo Piaggio pada fender depan. Vespa 150 GS (VS5) memegang rekor untuk jumlah produksi model unit terbanyak (80.000 unit) di antara tahun 1958 dan 1961.",
            "Vespa Super Sprint 90 tidak perlu diragukan lagi yakni merupakan model original yang dirancang oleh Vespa. Ukuran tamengnya diperkecil, dan kotak penyimpanan barangnya kini ditempatkan di antara kursi dan setang. Seperti Vespa GS 1955, ban serep diletakan di tengah-tengah pijakan kaki. Vespa 90 SS, seperti Vespa 50, merupakan model yang paling dicari dan sungguh-sungguh menjadi barang koleksi.",
            "Setelah sukses dengan Vespa Super Sport 180, Piaggio kembali mengembangkan model 180cc dengan spesifikasi yang lebih tinggi, mesin dan sasis yang baru, serta perubahan kosmetik pada setang dan sadel. Vespa Rally 180 masih tetap menjadi salah satu model yang paling sukses yang diproduksi diantara tahun 1968-1973 dengan total lebih dari 26.000 unit.",
            "Dipasarkan sejak tahun 1969, Vespa 50 Special memang disajikan untuk kaum muda dengan perubahan kosmetik pada setang, lampu depan, dan lampu belakang. Di tahun 1969, Vespa 50 Elestart juga diluncurkan, dengan desain yang sama dengan Vespa 50 Special, namun memiliki inovasi teknis tersendiri, yakni starter elektrik. Dari tahun 1969-1973, Piaggio meluncurkan kampanye yang paling populer: \"Who 'Vespas' eats apples\", yang mengacu kepada kesuksesan Vespa 50 Spesia",
            "Berasal dari Vespa 90, model Vespa 100 Sport dibuat untuk kebutuhan skuter pasar Amerika Serikat. Lampu belakang, secara khusus dibuat lebih besar. Kapasistasnya juga yang lebih besar, dari 90cc menjadi 100cc yang dibuat dengan membesarkan lubang silinder.",
            "Dikembangkan pada tahun 1985 sebagai Vespa yang baru dan didesain ulang,  Vespa 125 T5 Pole Position dilengkapi dengan mesin baru dengan kinerja yang lebih tinggi. Untuk menekankan karakter sporty-nya, Vespa tersebut juga dilengkapi dengan desain garis tebal, spoiler, kaca depan dan tachometer digital. Pada saat ini Piaggio tengah menghadapi persaingan yang sulit dan sengit dari Jepang.",
    };

    private static int[] vespasImage = {
            R.drawable.vespa_98_corsa_circuito,
            R.drawable.vespa_125,
            R.drawable.vespa_125_six_days,
            R.drawable.vespa_125_vna,
            R.drawable.vespa_150_gs_vs5,
            R.drawable.vespa_90_super_sprint,
            R.drawable.vespa_180_rally,
            R.drawable.vespa_50_special,
            R.drawable.vespa_100_sport,
            R.drawable.vespa_125_ts_pole_position,
    };

    public static ArrayList<Vespa> getListData() {
        ArrayList<Vespa> list = new ArrayList<>();
        for (int position = 0; position < vespaNames.length; position++) {
            Vespa vespa = new Vespa();
            vespa.setName(vespaNames[position]);
            vespa.setDetail(vespaDetails[position]);
            vespa.setPhoto(vespasImage[position]);
            list.add(vespa);
        }
        return list;
    }
}



