package com.dicoding.picodiploma.submission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.submission.model.VespasData;

public class DetailActivity extends AppCompatActivity {
    ImageView vespaImage;
    TextView vespaName, vespaDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vespaImage = findViewById(R.id.img_item_photo);
        vespaName = findViewById(R.id.tv_item_name);
        vespaDetail = findViewById(R.id.tv_item_detail);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("vespaImage") && getIntent().hasExtra("vespaName") && getIntent().hasExtra("VespaDetail")){
            int photo = getIntent().getIntExtra("vespaImage", 0);
            String name = getIntent().getStringExtra("vespaName");
            String detail = getIntent().getStringExtra("vespaDetail");

            setDataActivity(photo, name, detail);
        }
    }

    private void setDataActivity(int photo, String name, String detail) {
        Glide.with(this).asBitmap().load(photo).into(vespaImage);

        vespaName.setText(name);
        vespaDetail.setText(detail);

    }
}
