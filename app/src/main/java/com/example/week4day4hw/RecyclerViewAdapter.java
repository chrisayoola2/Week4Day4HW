package com.example.week4day4hw;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    List<Celebrity> celebList;
   CelebListBottomFragment.OnFragmentInteractionListener mlistener;



    public RecyclerViewAdapter(List<Celebrity> celebList, CelebListBottomFragment.OnFragmentInteractionListener listener){
        this.celebList = celebList;
        this.mlistener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_list,parent,false); // inflate the view you want
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final String name = celebList.get(position).getName();
        final String description = celebList.get(position).getDescription();
        final int picturePath = celebList.get(position).getPicturePath();
        holder.tvCelebName.setText(name);
        holder.tvCelebDescription.setText(description);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(null != mlistener) {
                    mlistener.sendPath(picturePath ,description);
                    Log.d("TAG", "imGE =" + picturePath);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return celebList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvCelebName;
        TextView tvCelebDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCelebName = itemView.findViewById(R.id.tvCelebName);
             tvCelebDescription = itemView.findViewById(R.id.tvCelebDescription);
        }
    }

}
