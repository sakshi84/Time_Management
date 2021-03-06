package com.packtpub.timemanagement;

import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sakshi on 8/11/16.
 */

public class Adapter_n extends RecyclerView.Adapter<Adapter_n.ViewHolder> {

    private String[] titles = {"Software Engineering",
            "Theory Of Computation",
            "Operating System",
            "Principle of Programing Language",
            "Optimization",
            "French",
            "Artificial Intelligence",
    };

    private String[] details = {"Quiz on this Tuesday ",
            "Extra class from 10am - 11am 7/11/2016 ", "No class on Monday 7/11/2016",
            "Bring your laptops in today's class ", "Mid term Answer sheets will be shown on Monday 7/11/2016",
            "Assignment Summation Last date 20/11/2016", "Today's class in LT-4",
    };
    /*
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
    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        //public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            //itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
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
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        //viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}