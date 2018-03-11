package id.dev.septiyadi.tutorlinuxid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menuActivity extends AppCompatActivity {

    ImageView artikel, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        artikel = (ImageView)findViewById(R.id.ID2artikel);
        about = (ImageView)findViewById(R.id.ID2about);

        artikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go2Artikel = new Intent(menuActivity.this, homeActivity.class);
                startActivity(go2Artikel);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go2Artikel = new Intent(menuActivity.this, aboutActivity.class);
                startActivity(go2Artikel);
            }
        });

    }
}