package com.example.covid_19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHold> {
    private List<Country> country;

    public AdapterHome(List<Country> country) {
        this.country = country;
    }

    @NonNull
    @Override
    public ViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_list,parent,false);
        return new ViewHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHold holder, int position) {
        Country c = country.get(position);
        holder.tv1.setText(c.getCountry());
        holder.tv2.setText(c.getCases()+"");
        holder.tv3.setText(c.getRecovered()+"");
        holder.tv4.setText(c.getCritical()+"");
        holder.tv5.setText(c.getDeaths()+"");

    }

    @Override
    public int getItemCount() {
        return country.size();
    }

    public class ViewHold extends RecyclerView.ViewHolder {
        TextView tv1,tv2,tv3,tv4,tv5;
        public ViewHold(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.country_name);
            tv2 = itemView.findViewById(R.id.confirmed);
            tv3 = itemView.findViewById(R.id.recovered);
            tv4 = itemView.findViewById(R.id.critical);
            tv5 = itemView.findViewById(R.id.deaths);
        }
    }
}
