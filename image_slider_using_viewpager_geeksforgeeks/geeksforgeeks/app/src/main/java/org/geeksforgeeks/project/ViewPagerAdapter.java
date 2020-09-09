package org.geeksforgeeks.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.Objects;

class ViewPagerAdapter extends PagerAdapter {

    //Context object
    Context context;

    //Array of images
    int[] images;

    //Layout Inflater
    LayoutInflater mLayoutInflater;


    //Viewpager Constructor
    public ViewPagerAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        //return the number of images
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        //inflating the item.xml
        View itemView = mLayoutInflater.inflate(R.layout.item, container, false);

        //referencing the image view from the item.xml file
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageViewMain);

        //setting the image in the imageView
        imageView.setImageResource(images[position]);

        //Adding the View
        Objects.requireNonNull(container).addView(itemView);



        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}
