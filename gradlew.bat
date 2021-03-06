<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:background="@color/transparent"
    android:layout_gravity="center"
    >
    <ImageView
        android:id="@+id/suggestion_product_imageview"
        android:layout_width="40dp"
        android:scaleType="fitCenter"
        android:layout_height="40dp"
        android:layout_marginTop="5dp"
        android:layout_gravity="center_vertical"
        android:layout_marginBottom="5dp"
        android:layout_marginStart="10dp"
        android:src="@mipmap/ic_history"
        />
    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="20dp"
        android:orientation="vertical">
        <com.vajro.widget.other.FontTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/suggestion_product_textview"
            android:gravity="center_vertical"
            android:layout_marginTop="10dp"
            android:textColor="@color/primary_text_color"
            android:text="@string/sample_text"
            android:textSize="17dp"/>

        <com.vajro.widget.other.FontTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/price_text"
            android:layout_gravity="center"
            android:layout_marginTop="5dp"
            android:layout_marginBottom="10dp"
            android:textColor="@color/primary_text_color"
            android:textSize="14sp"/>
    </LinearLayout>
</LinearLayout>
<!--<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:background="@color/transparent"
    android:layout_gravity="center"
    >

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >
        