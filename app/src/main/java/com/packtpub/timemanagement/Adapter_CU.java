package com.packtpub.timemanagement;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sakshi on 9/11/16.
 */

public class Adapter_CU extends RecyclerView.Adapter<Adapter_CU.ViewHolder> {

    private String[] titles = {
            "Pushpendra Bansal",
            "Kshitiz Gupta",
            "Rishabh Kapoor",
            "Sakshi Sharma ",
            "Sanyam Jain",
            "Vasundhara Sharma",
    };

    private String[] details = {
            "bansalpunitib@gmail.com",
            "kshitiz7gupta@gmail.com ",
            "rkapoor414@gmail.com",
            "sakshi84raj@gmail.com",
            "sanyamjain838@gmail.com ",
            "vasusweety.81@gmail.com",
    };


    private int[] images = {
            R.drawable.pushpa,
            R.drawable.kshitiz,
            R.drawable.rk,
            R.drawable.sakshi,
            R.drawable.sj,
            R.drawable.vasu,
    };

    class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView) itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout_cu, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}