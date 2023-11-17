package com.muratalarcin.banggoodappdesign;


import static androidx.core.content.ContentProviderCompat.requireContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.muratalarcin.banggoodappdesign.adapter.ListAdapter;
import com.muratalarcin.banggoodappdesign.data.entity.Urunler;
import com.muratalarcin.banggoodappdesign.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        public void kisileriYukle() {
//            ArrayList<Kisiler> liste = new ArrayList<Kisiler>();
//            Kisiler k1 = new Kisiler(1, "Ahmet", "1121312311");
//            Kisiler k2 = new Kisiler(2, "Zeynep", "222323213");
//            Kisiler k3 = new Kisiler(3, "Beyza", "234234234");
//            liste.add(k1);
//            liste.add(k2);
//            liste.add(k3);
//
//            kisilerListesi.setValue(liste);


        binding.rvUrunler.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Urunler> urunlerListesi = new ArrayList<Urunler>();
        Urunler u1 = new Urunler(1, "10Pcs 2S 3A Li-on Lithium Battery 18650 Protection Charger Board BMS PCB Board",
                378.82F, true, 5f, 114);

        urunlerListesi.add(u1);

        ListAdapter adapter = new ListAdapter(urunlerListesi, this);
        binding.rvUrunler.setAdapter(adapter);

    }

}
