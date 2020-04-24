package com.dicoding.picodiploma.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.submission.adapter.ListVespaAdapter;
import com.dicoding.picodiploma.submission.model.Vespa;
import com.dicoding.picodiploma.submission.model.VespasData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView vespaImage;
    TextView vespaName, vespaDetail;
    private RecyclerView rvVespas;
    private ArrayList<Vespa> list = new ArrayList<>();
    public void showSelectedVespa(Vespa vespa) {
        Toast.makeText(this, "Kamu memilih " + vespa.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vespaImage = findViewById(R.id.img_item_photo);
        vespaName = findViewById(R.id.tv_item_name);
        vespaDetail = findViewById(R.id.tv_item_detail);

        rvVespas = findViewById(R.id.rv_vespas);
        rvVespas.setHasFixedSize(true);

        list.addAll(VespasData.getListData());
        showRecyclerList();

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

    private void showRecyclerList(){
        rvVespas.setLayoutManager(new LinearLayoutManager(this));
        ListVespaAdapter listVespaAdapter = new ListVespaAdapter(list);
        rvVespas.setAdapter(listVespaAdapter);

        listVespaAdapter.setOnItemClickCallback(new ListVespaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Vespa vespa) {
                showSelectedVespa(vespa );
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_halamanutama:
                break;
            case R.id.action_halamandetail:
                break;
            case R.id.action_halamanabout:
                break;
        }
    }
}

