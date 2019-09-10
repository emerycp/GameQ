package com.emerycprimeau.gameq.GUI.completed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.emerycprimeau.gameq.R;
import com.emerycprimeau.gameq.models.gameCompleted;

import java.util.List;


public class monAdapteurCompleted extends RecyclerView.Adapter<monAdapteurCompleted.MyViewHolder>{
    public Context context;
    public List<gameCompleted> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tvDateAdded;
        public TextView tvName;
        public TextView tvScore;
        public MyViewHolder(LinearLayout v) {
            super(v);
            tvDateAdded = v.findViewById(R.id.textDateCompleted);
            tvName = v.findViewById(R.id.textGameCompleted);
            tvScore= v.findViewById(R.id.textScore);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public monAdapteurCompleted(List<gameCompleted> pDataset, Context ctx) {
        mDataset = pDataset;
        this.context = ctx;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public monAdapteurCompleted.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                 int viewType) {
        // create a new view
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_completed, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final gameCompleted objetActuel = mDataset.get(position);

        holder.tvDateAdded.setText(objetActuel.date);
        holder.tvName.setText(String.valueOf(objetActuel.name));
        holder.tvScore.setText(String.valueOf(objetActuel.score));

    }



    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}