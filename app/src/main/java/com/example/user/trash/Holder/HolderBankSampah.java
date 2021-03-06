package com.example.user.trash.Holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.trash.R;

public class HolderBankSampah extends RecyclerView.ViewHolder {

    public ImageView img_result;
    public TextView txtNamaBank, txtLokasi;
    public CardView cardview_banksampah;

    public HolderBankSampah(View itemView) {
        super(itemView);
        cardview_banksampah = (CardView) itemView.findViewById(R.id.cardview_banksampah);
        img_result = (ImageView) itemView.findViewById(R.id.img_result);
        txtNamaBank = (TextView) itemView.findViewById(R.id.txtNamaBank);
        txtLokasi = (TextView) itemView.findViewById(R.id.txtLokasi);
    }
}
