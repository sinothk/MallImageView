# 引入
 ## Step 1. Add the JitPack repository to your build file
 
 allprojects {
    repositories {
     ...
     maven { url 'https://jitpack.io' }
    }
 }

## Step 2. Add the dependency

 dependencies {



# 使用
## java

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
    mallDetailImageView.setImgUrls(urls);
    mallDetailImageView.setImgUrls(Arrays.asList(urls));
    mallDetailImageView.setOnImgLongClickListener(new MallImageView.OnImgLongClickListener() {
        @Override
        public void imgLongClick(int position, String imgUrl) {
            Log.e("MallDemoImageView",imgUrl);
        }
    });
    }













![](https://github.com/sinothk/MallImageView/blob/master/art/MallImageView.png)
