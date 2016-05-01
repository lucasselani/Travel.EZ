package com.swinatel.travelez;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lucas on 30/04/2016.
 */
public class InterchangeAdapter extends RecyclerView.Adapter<InterchangeAdapter.InterchangeViewHolder>{
    ArrayList<Program> programList;

    public InterchangeAdapter(ArrayList<Program> programsList){
        this.programList = programsList;
    }

    @Override
    public InterchangeAdapter.InterchangeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card, parent, false);
        return new InterchangeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(InterchangeViewHolder holder, int position) {
        Program program = programList.get(position);
        holder.destination.setText(program.getDestination());
        holder.type.setText(program.getType());
        holder.agency.setText("Agência " + program.getAgency());
        holder.icon.setImageResource(program.getIcon());
        holder.duration.setText(Integer.toString(program.getDuration()) + " semanas");
        holder.price.setText("R$ "+ program.getPrice());
    }

    @Override
    public int getItemCount() {
        return programList.size();
    }

    public static class InterchangeViewHolder extends RecyclerView.ViewHolder{
        protected TextView destination;
        protected TextView type;
        protected TextView agency;
        protected ImageView icon;
        protected TextView duration;
        protected TextView price;


        public InterchangeViewHolder(View view){
            super(view);
            destination = (TextView) view.findViewById(R.id.txLocal);
            type = (TextView) view.findViewById(R.id.txType);
            agency = (TextView) view.findViewById(R.id.txAgency);
            icon = (ImageView) view.findViewById(R.id.img);
            duration = (TextView) view.findViewById(R.id.txDuration);
            price = (TextView) view.findViewById(R.id.txPrice);
        }

    }
}

