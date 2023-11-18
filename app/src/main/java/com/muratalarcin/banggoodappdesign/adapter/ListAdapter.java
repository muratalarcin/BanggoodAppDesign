package com.muratalarcin.banggoodappdesign.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.muratalarcin.banggoodappdesign.R;
import com.muratalarcin.banggoodappdesign.data.entity.Urunler;
import com.muratalarcin.banggoodappdesign.databinding.RowBinding;
import com.muratalarcin.banggoodappdesign.ui.ListeFragment;
import com.muratalarcin.banggoodappdesign.ui.ListeFragmentDirections;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.RowHolder> {
    private List<Urunler> urunlerListesi;
    private Context mContext;

    public ListAdapter(List<Urunler> urunlerListesi, Context mContext) {
        this.urunlerListesi = urunlerListesi;
        this.mContext = mContext;
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        private RowBinding tasarim;

        public RowHolder(RowBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowBinding binding = RowBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new RowHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        Urunler urun = urunlerListesi.get(position);

        RowBinding t = holder.tasarim;

        t.twBaslik.setText(urun.getBaslik());
        t.twFiyat.setText("TRY" + urun.getFiyat());
        t.twYorum.setText(urun.getYorum() + " Sold");
        t.twEtiket.setText(urun.isEtiket() ? "Inclusive of duties" : null);
        t.twRating.setRating(urun.getRating());

        t.imageView.setImageResource(mContext.getResources()
                .getIdentifier(urun.getFoto(), "drawable", mContext.getPackageName()));

        t.cardView.setOnClickListener(view -> {
            ListeFragmentDirections.DetayGecis gecis = ListeFragmentDirections.detayGecis(urun);
            Navigation.findNavController(view).navigate(gecis);
        });
    }


    @Override
    public int getItemCount() {
        return urunlerListesi.size();
    }
}
