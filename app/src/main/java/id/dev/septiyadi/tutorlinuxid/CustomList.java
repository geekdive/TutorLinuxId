package id.dev.septiyadi.tutorlinuxid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by septiyadi on 10/02/18.
 */

public class CustomList extends ArrayAdapter<String> {
    private final Activity contex;
    private final String[] contentLinux;
    private final Integer[] contentPictures;
    private final Integer[] contentPembahasan;

    public CustomList(Activity contex, String[] contentLinux, Integer[] contentPictures, Integer[] contentPembahasan){
        super(contex, R.layout.item_list, contentLinux);

        this.contex = contex;
        this.contentLinux = contentLinux;
        this.contentPictures = contentPictures;
        this.contentPembahasan = contentPembahasan;
    }

    public View getView(int posisi, View view, ViewGroup parent){
        LayoutInflater inflater = contex.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_list, null, true);

        TextView ctnLnx = (TextView)rowView.findViewById(R.id.ktnLinux);
        ImageView ctnImgLnx = (ImageView)rowView.findViewById(R.id.imgPembatas);

        ctnLnx.setText(contentLinux[posisi]);
        ctnImgLnx.setImageResource(contentPictures[posisi]);

        return rowView;
    }

}
