package com.muratalarcin.banggoodappdesign.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.banggoodappdesign.data.repo.UrunlerDaoRepository;

public class DetayViewModel extends ViewModel {
    public UrunlerDaoRepository krepo = new UrunlerDaoRepository();
}
