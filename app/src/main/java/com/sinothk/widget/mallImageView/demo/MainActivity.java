package com.sinothk.widget.mallImageView.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.sinothk.widget.mallImageView.MallImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

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

        mallDetailImageView.setImgUrls(urlList);

        mallDetailImageView.setOnImgLongClickListener(new MallImageView.OnImgLongClickListener() {
            @Override
            public void imgLongClick(int position, String imgUrl) {
                Log.e("MallDemoImageView",imgUrl);
            }
        });
    }
}
