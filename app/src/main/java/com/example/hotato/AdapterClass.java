package com.example.hotato;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    ArrayList<RecipeModel> list;
    public AdapterClass(ArrayList<RecipeModel> list){
        this.list = list;
        Log.d("listing", toString());
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_holder,viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(list.get(i).getName());
        myViewHolder.ingredients.setText(list.get(i).getIngredients());
        myViewHolder.description.setText(list.get(i).getDescription());
        myViewHolder.image.setText(list.get(i).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView image,name,ingredients,description;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.rNameTv);
            ingredients = itemView.findViewById(R.id.rIngretientsTv);
            description = itemView.findViewById(R.id.rDescriptionTv);
            image = itemView.findViewById(R.id.rImageView);
        }
    }
}
