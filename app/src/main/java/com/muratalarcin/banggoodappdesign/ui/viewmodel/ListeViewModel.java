package com.muratalarcin.banggoodappdesign.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muratalarcin.banggoodappdesign.data.entity.Urunler;
import com.muratalarcin.banggoodappdesign.data.repo.UrunlerDaoRepository;

import java.util.List;

public class ListeViewModel extends ViewModel {
    public UrunlerDaoRepository krepo = new UrunlerDaoRepository();
    public MutableLiveData<List<Urunler>> urunlerListesi;

    public ListeViewModel(){
        urunlerYukle();
        urunlerListesi = krepo.urunlerlistesi;
    }
    public void ara(String aramaKelimesi) {
        krepo.ara(aramaKelimesi);
    }

    public void urunlerYukle() {
        krepo.urunlerYukle();
    }
}
