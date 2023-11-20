package com.muratalarcin.banggoodappdesign.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import com.muratalarcin.banggoodappdesign.R;
import com.muratalarcin.banggoodappdesign.databinding.FragmentBottomSheetBinding;

public class BottomSheetFragment extends BottomSheetDialogFragment {
    private FragmentBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false);

        binding.imageViewPaylas.setOnClickListener(view -> {
            Snackbar.make(view, "Paylaşıldı", Snackbar.LENGTH_LONG).show();
        });

        binding.imageViewKopyala.setOnClickListener(view -> {
            Snackbar.make(view, "Kopyalandı", Snackbar.LENGTH_LONG).show();
        });

        return binding.getRoot();

    }


}