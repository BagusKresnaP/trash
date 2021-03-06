package com.example.user.trash.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import com.example.user.trash.DetailKegiatanActivity;
import com.example.user.trash.Holder.HolderKegiatan;
import com.example.user.trash.ItemObject.ItemObjectKegiatan;
import com.example.user.trash.R;

/**
 * Created by Heatcliff on 11/08/2016.
 */
public class AdapterKegiatan extends RecyclerView.Adapter<HolderKegiatan> {

    public Context context;
    public List<ItemObjectKegiatan.Children> objectKegiatanList;

    public AdapterKegiatan(Context context, List<ItemObjectKegiatan.Children> objectKegiatanList){
        this.context = context;
        this.objectKegiatanList = objectKegiatanList;
    }

    @Override
    public HolderKegiatan onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_kegiatan, null);
        HolderKegiatan holderKegiatan = new HolderKegiatan(view);
        return holderKegiatan;
    }

    @Override
    public void onBindViewHolder(HolderKegiatan holder, final int position) {
        holder.txtJudul.setText(objectKegiatanList.get(position).judul);
        holder.txtTanggal.setText(objectKegiatanList.get(position).tanggal);
        holder.txtDeskripsi.setText(objectKegiatanList.get(position).konten);

        //Glide.with(context).load("http://yuclean.andara-tech.com/images/event/" + objectKegiatanList.get(position).image)
               // .diskCacheStrategy(DiskCacheStrategy.ALL)
               // .placeholder(R.drawable.logo)
               // .into(holder.imgKegiatan);

        holder.cardview_kegiatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailKegiatanActivity.class);
                intent.putExtra("judul", objectKegiatanList.get(position).judul);
                intent.putExtra("tanggal", objectKegiatanList.get(position).tanggal);
                intent.putExtra("deskripsi", objectKegiatanList.get(position).konten);
                intent.putExtra("gambar", objectKegiatanList.get(position).image);
                intent.putExtra("url", objectKegiatanList.get(position).id);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return objectKegiatanList.size();
    }
}
