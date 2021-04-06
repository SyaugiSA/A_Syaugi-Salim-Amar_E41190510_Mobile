package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList){
        this.dataList = dataList;
    }

    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_itemnya, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.textNama.setText(dataList.get(position).getNama());
        holder.textNpm.setText(dataList.get(position).getNpm());
        holder.textNohp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView textNama, textNpm, textNohp;

        public MahasiswaViewHolder(View itemView){
            super(itemView);
            textNama = (TextView) itemView.findViewById(R.id.text_nama_mahasiswa);
            textNpm = (TextView) itemView.findViewById(R.id.text_npm_mahasiswa);
            textNohp = (TextView) itemView.findViewById(R.id.text_nohp_mahasiswa);
        }
    }
}
