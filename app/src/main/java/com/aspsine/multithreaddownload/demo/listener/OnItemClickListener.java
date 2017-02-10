package com.aspsine.multithreaddownload.demo.listener;

import android.view.View;

public interface OnItemClickListener<T> {
    void onItemClick(View v, int position, T t);
}
