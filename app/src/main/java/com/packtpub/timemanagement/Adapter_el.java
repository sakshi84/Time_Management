package com.packtpub.timemanagement;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sakshi on 9/11/16.
 */

public class Adapter_el extends RecyclerView.Adapter<Adapter_el.ViewHolder> {

    private String[] titles = {
            "9am-12pm   OS Lab",
            "12pm-1pm   Lunch",
            "1pm-2pm    Theory Of Computation ",
            "2pm-3pm    Software Engineering",
            "3pm-4pm    Operating System",
            "4pm-5pm    Principle of Programing Language",
            "5pm-6pm    Optimization",
            "7pm-8pm    French",
            "8pm-9pm    Dinner",
            "Till 12am   SWE Sprint 3",
    };
/*
    private String[] details = {"Software Engineering",
            "Theory Of Computation",
            "Operating System",
            "Principle of Programing Language",
            "Optimization",
    };


    private int[] images = {
            R.drawable.android_image_1,
            R.drawable.android_image_2,
            R.drawable.android_image_3,
            R.drawable.android_image_4,
            R.drawable.android_image_5,
            R.drawable.android_image_6,
            R.drawable.android_image_7,
            R.drawable.android_image_8
    };
    */
    class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        //public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            //itemImage = (ImageView)itemView.findViewById(R.id.item_image);
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
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        //viewHolder.itemDetail.setText(details[i]);
        //viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
