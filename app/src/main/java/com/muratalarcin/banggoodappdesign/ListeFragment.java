package com.muratalarcin.banggoodappdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.banggoodappdesign.databinding.FragmentListeBinding;

public class ListeFragment extends Fragment {
    FragmentListeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListeBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}