package com.muratalarcin.banggoodappdesign.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.banggoodappdesign.R;
import com.muratalarcin.banggoodappdesign.data.entity.Urunler;
import com.muratalarcin.banggoodappdesign.databinding.FragmentDetayBinding;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetayBinding.inflate(inflater, container, false);

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Urunler urun = bundle.getUrun();

        binding.textView.setText(urun.getBaslik());
        binding.imageView.setImageResource(getResources().getIdentifier(
                urun.getFoto(), "drawable", requireContext().getPackageName()
        ));

        return binding.getRoot();
    }
}