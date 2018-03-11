package id.dev.septiyadi.tutorlinuxid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class contentdetailActivity extends AppCompatActivity {

    TextView title, kontendetail;
    ImageView icon, picturekonten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentdetail);

        title = (TextView)findViewById(R.id.idTITLE);
        kontendetail = (TextView)findViewById(R.id.idDETAILCONTENT);

        icon = (ImageView)findViewById(R.id.idICON);
        picturekonten = (ImageView)findViewById(R.id.idPICCONTENT);

        Bundle getDTAs = getIntent().getExtras();

        String getTitle = getDTAs.getString("TITLE");
        String getKontent = getDTAs.getString("DETAIL");

        Integer getIcon = getDTAs.getInt("ICON");
        Integer getPic = getDTAs.getInt("CONTENT");

        icon.setImageResource(getIcon);
        title.setText(getTitle);
        picturekonten.setImageResource(getPic);
        kontendetail.setText(getKontent);

    }
}
