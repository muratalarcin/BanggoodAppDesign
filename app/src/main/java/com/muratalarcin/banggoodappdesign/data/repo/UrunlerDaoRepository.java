package com.muratalarcin.banggoodappdesign.data.repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.muratalarcin.banggoodappdesign.data.entity.Urunler;

import java.util.ArrayList;
import java.util.List;

public class UrunlerDaoRepository {
    public MutableLiveData<List<Urunler>> urunlerlistesi = new MutableLiveData<>();

    public void ara(String aramaKelimesi) {
        Log.e("Kişi Ara", aramaKelimesi);
    }

    public void urunlerYukle() {
        ArrayList<Urunler> urunlerListesi = new ArrayList<Urunler>();
        Urunler u1 = new Urunler(1, "item", "10Pcs 2S 3A Li-on Lithium Battery 18650 Protection Charger Board BMS PCB Board",
                378.82F, true, 5f, 114);
        Urunler u2 = new Urunler(2, "qq", "3pcs 3 S 1QA 11.1V 12V 12.6V Lithium Battery Charger Protection Board Modu...",
                145.52F, true, 5f, 347);
        Urunler u3 = new Urunler(3, "q", "Micro USB 5V Lithium Battery Charger Boost Protection Board Li-Po 1865...",
                165.35F, true, 4f, 137);
        Urunler u4 = new Urunler(4, "w", "2S 3A Li-ion Lithium Battery 18650 Protection Charger Board BMS PCB Board",
                167.68F, true, 5f, 653);
        Urunler u5 = new Urunler(5, "e", "4S 20A Li-on Lithium Battery 18650 Charger PCB BMS Protection Board with...",
                167.68F, true, 4f, 653);

        urunlerListesi.add(u1);
        urunlerListesi.add(u2);
        urunlerListesi.add(u3);
        urunlerListesi.add(u4);
        urunlerListesi.add(u5);

        urunlerlistesi.setValue(urunlerListesi);
    }
}
