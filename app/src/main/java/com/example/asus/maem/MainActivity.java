package com.example.asus.maem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep_nama.add("Lodeh");
        resep_detail.add("Sayur lodeh adalah masakan sayur yang berkuah santan khas Indonesia, terutama di daerah Jawa Tengah. Sayur lodeh mempunyai berbagai macam variasi terutama pada bumbunya, ada yang santannya berwarna putih dan ada juga yang santannya berwarna kuning kemerahan. ");
        resep_ingredients.add("\n" 
                "1/4 kg nangka muda/gori/cecek\n"+
                "5 helai kacang panjang,potong-potong\n"+
                "Santan encer dari 1/4 butir kelapa\n"+
                "1 lembar daun salam\n"+
                "1 ruas laos, keprek\n"+
                "2 sdm minyak goreng untuk menumis\n"+
                "Secukupnya garam\n"+
                "1/4 sdt gula jawa/gula pasir\n"+
                "Sedikit bawang goreng untuk taburan\n"+
                "Secukupnya garam\n"+
                "Bumbu halus :\n"+
                "5 siung bawang merah\n"+
                "3 siung bawang putih\n"+
                "1 buah kemiri\n"+
                "1/2 sdt ketumbar\n"+
                "1 ruas jari kunyit ");
        resep_process.add("1.process");
        resep_nama.add("Gudeg");
        resep_detail.add("Gudeg adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tahu dan sambal goreng krecek. ");
        resep_ingredients.add("1.Nasi\n2.Air");
        resep_process.add("1.process");
        resep_nama.add("Rendang");
        resep_detail.add("Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam hingga kering dan berwarna hitam pekat.");
        resep_ingredients.add("1.Daging");
        resep_process.add("1.process");
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
