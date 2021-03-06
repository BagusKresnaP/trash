package com.example.user.trash.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import com.example.user.trash.Holder.HolderHargaSampah;
import com.example.user.trash.ItemObject.ItemObjectHargaSampah;
import com.example.user.trash.R;

/**
 * Created by Heatcliff on 25/08/2016.
 */
public class AdapterHargaSampah extends RecyclerView.Adapter<HolderHargaSampah> {

    List<ItemObjectHargaSampah.Children> itemObjectHargaSampahList;
    Context context;

    public AdapterHargaSampah (Context context, List<ItemObjectHargaSampah.Children> itemObjectHargaSampahList) {
        this.context = context;
        this.itemObjectHargaSampahList = itemObjectHargaSampahList;
    }

    @Override
    public HolderHargaSampah onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_harga_sampah, null);
        HolderHargaSampah holderHargaSampah = new HolderHargaSampah(view);
        return holderHargaSampah;
    }

    @Override
    public void onBindViewHolder(HolderHargaSampah holder, final int position) {
        int har = Integer.parseInt(itemObjectHargaSampahList.get(position).harga);
        int pot = Integer.parseInt(itemObjectHargaSampahList.get(position).potongan);
        int hasil = har-(pot*2);

        holder.txtNamaSampah.setText(itemObjectHargaSampahList.get(position).nama);
        holder.txtHargaSampah.setText("Rp. " + hasil);
    }

    @Override
    public int getItemCount() {
        return itemObjectHargaSampahList.size();
    }
}
