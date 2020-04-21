package com.example.salesmartnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class WelcomeViewPageAdaptor extends PagerAdapter {

    Context myContext;
    List<WelcomeScreen> myListScreen;


    public WelcomeViewPageAdaptor(Context myContext, List<WelcomeScreen> myListScreen) {
        this.myContext = myContext;
        this.myListScreen = myListScreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View welcomeScreen = inflater.inflate(R.layout.layout_screen, null);
    }

    @Override
    public int getCount() {
        return myListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }
}
