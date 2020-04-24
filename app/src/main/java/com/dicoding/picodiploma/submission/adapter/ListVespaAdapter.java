package com.dicoding.picodiploma.submission.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.submission.DetailActivity;
import com.dicoding.picodiploma.submission.MainActivity;
import com.dicoding.picodiploma.submission.R;
import com.dicoding.picodiploma.submission.model.Vespa;
import com.dicoding.picodiploma.submission.model.VespasData;

import java.util.ArrayList;

public class ListVespaAdapter extends RecyclerView.Adapter<ListVespaAdapter.ListViewHolder> {
    private ArrayList<Vespa> listVespa;

    public ListVespaAdapter(ArrayList<Vespa> list) {
        this.listVespa = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_vespa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Vespa vespa = listVespa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(vespa.getPhoto())
                .apply(new RequestOptions().override(50, 50))
                .into(holder.imgPhoto);
        holder.tvName.setText(vespa.getName());
        holder.tvDetail.setText(vespa.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listVespa.get(holder.getAdapterPosition()));

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);

                intent.putExtra("vespaImage", vespa.getPhoto());
                intent.putExtra("vespaNames", vespa.getName());
                intent.putExtra("vespaDetails", vespa.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listVespa.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Vespa data);
    }
}
