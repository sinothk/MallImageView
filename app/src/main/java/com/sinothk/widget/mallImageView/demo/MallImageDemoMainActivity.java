package com.sinothk.widget.mallImageView.demo;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.sinothk.widget.mallImageView.MallImageView;
import com.sinothk.widget.mallImageView.ImgLoader;

import java.util.ArrayList;

public class MallImageDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] urls = {
                "https://img.alicdn.com/imgextra/i4/113462038/TB2y0NFfMLD8KJjSszeXXaGRpXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rbXYfL6H8KJjSspmXXb2WXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rbXYfL6H8KJjSspmXXb2WXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2NUXDfRDH8KJjSspnXXbNAVXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2NUXDfRDH8KJjSspnXXbNAVXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i4/113462038/TB2rENDfRTH8KJjy0FiXXcRsXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2ZZNwfL2H8KJjy0FcXXaDlFXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i1/113462038/TB2rmRSfPnD8KJjSspbXXbbEXXa_!!113462038.jpg",
                "https://img.alicdn.com/imgextra/i2/113462038/TB2rupFfMLD8KJjSszeXXaGRpXa_!!113462038.jpg"

        };

        MallImageView mallDetailImageView = (MallImageView) this.findViewById(R.id.mallDetailView);
//        mallDetailImageView.setImgUrls(urls);

        ArrayList<String> urlList = new ArrayList<>();
        urlList.add("https://img.alicdn.com/imgextra/i2/113462038/TB2rupFfMLD8KJjSszeXXaGRpXa_!!113462038.jpg");
        urlList.add("https://img.alicdn.com/imgextra/i1/113462038/TB2rmRSfPnD8KJjSspbXXbbEXXa_!!113462038.jpg");

        mallDetailImageView.setImgUrls(urlList, new ImgLoader() {

            @Override
            public void onShow(ImageView imageView, String imgUrl) {

                Glide.with(MallImageDemoMainActivity.this)
                        .load(imgUrl)
//                    .placeholder(R.drawable.loading_spinner)
                        .into(imageView);

            }
        });

//        mallDetailImageView.showImgListener(new ShowImg() {
//
//            @Override
//            public void onShow(ImageView imageView, String imgUrl) {
//                Glide.with(MainActivity.this)
//                        .load(imgUrl)
////                    .placeholder(R.drawable.loading_spinner)
//                        .into(imageView);
//            }
//        });

        mallDetailImageView.setOnImgLongClickListener(new MallImageView.OnImgLongClickListener() {
            @Override
            public void imgLongClick(int position, String imgUrl) {
                Log.e("MallDemoImageView", imgUrl);
            }
        });
    }
}
