package com.muratalarcin.banggoodappdesign.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.muratalarcin.banggoodappdesign.adapter.ListAdapter;
import com.muratalarcin.banggoodappdesign.data.entity.Urunler;
import com.muratalarcin.banggoodappdesign.databinding.FragmentListeBinding;
import com.muratalarcin.banggoodappdesign.ui.viewmodel.ListeViewModel;

import java.util.ArrayList;

public class ListeFragment extends Fragment {
    private FragmentListeBinding binding;
    private ListeViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListeBinding.inflate(inflater, container, false);

        binding.rvUrunler.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.urunlerListesi.observe(getViewLifecycleOwner(), urunlerListesi -> {
            ListAdapter adapter = new ListAdapter(urunlerListesi, requireContext(), viewModel);
            binding.rvUrunler.setAdapter(adapter);
        });


        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String a) {
                viewModel.ara(a);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                viewModel.ara(s);
                return true;
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(ListeViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.urunlerYukle();
    }
}