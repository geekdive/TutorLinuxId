package id.dev.septiyadi.tutorlinuxid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class homeActivity extends AppCompatActivity {

    ListView listingData;

    //Database dengan Type Array ------------------------------------------------------------------------------>

    Integer[] iconKonten = {
            R.drawable.icn_ifconfig,
            R.drawable.icn_htop,
            R.drawable.icn_cd,
            R.drawable.icn_quit,
            R.drawable.icn_poweroff,
            R.drawable.icn_reboot,
            R.drawable.icn_ls_li,
            R.drawable.icn_chmod,
            R.drawable.icn_mkdir,
            R.drawable.icn_nano,
            R.drawable.icn_top,
            R.drawable.icn_clear,
            R.drawable.icn_ping,
            R.drawable.icn_ssh,
            R.drawable.icon_mysql,
            R.drawable.icn_service,
            R.drawable.icn_ls
    };

    String[] dataPenjelasan = {
            "ifconfig merupakan command untuk menampilkan informasi network pada sistem operasi linux dengan versi tampilan command line.",
            "htop merupakan command untuk menampilkan informasi task pada sistem operasi linux dengan versi tampilan command line.",
            "cd merupakan command untuk mengakses / berpindah ke folder lain pada sistem operasi linux dengan versi tampilan command line.",
            "quit merupakan command untuk keluar dari sebuah program / service pada sistem operasi linux dengan versi tampilan command line. Misalkan MySQL Service",
            "poweroff merupakan command untuk melakukan shutdown terhadap komputer / laptop via command line.",
            "reboot merupakan command untuk me-restart komputer / laptop via command line.",
            "ls -li merupakan command untuk menampilkan informasi listing isi pada sebuah folder sistem linux via tampilan command line.",
            "chmod merupakan command untuk memberikan hak akses pada sebuah file / folder via command line. Tentunya dengan ada ketentuan dalam memberikan hak akses",
            "mkdir merupakan command untuk membuat folder via command line.",
            "nano merupakan command untuk mengakses editor text versi command line.",
            "top merupakan command untuk menampilkan informasi task pada sistem operasi linux dengan versi tampilan command line. Sama seperti htop, namun dalam versi lama",
            "clear merupakan command untuk membersihkan layar pada terminal.",
            "ping merupakan command untuk menge-ping alamat IP/DNS via command line.",
            "ssh merupakan command untuk mengakses / me-remote komputer, laptop atau server via command line.",
            "mysql merupakan service database server yang disedikan dalam sistem operasi linux akses via command line.",
            "service merupakan layanan yang ada didalam sistem operasi linux, karena pada dasarnya komputer merupakan sekumpulan service yang aktif melalui command line.",
            "ls merupakan command untuk menampilkan informasi listing isi dalam folder via command line."
    };

    String[] kontenLinux = {
            "ifconfig",
            "htop",
            "cd",
            "quit",
            "poweroff",
            "reboot",
            "ls -li",
            "chmod",
            "mkdir",
            "nano",
            "top",
            "clear",
            "ping",
            "ssh",
            "mysql",
            "service",
            "ls"
    };

    Integer[] kontenBahasan ={
            R.drawable.ifconfig,
            R.drawable.htop,
            R.drawable.cd,
            R.drawable.quit,
            R.drawable.poweroff,
            R.drawable.reboot,
            R.drawable.ls_li,
            R.drawable.chmod,
            R.drawable.mkdir,
            R.drawable.nano,
            R.drawable.top,
            R.drawable.clear,
            R.drawable.ping,
            R.drawable.ssh,
            R.drawable.mysql,
            R.drawable.service,
            R.drawable.ls
    };

    Integer[] gambarKonten = {
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon
    };

    //Database dengan Type Array ------------------------------------------------------------------------------>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listingData = (ListView)findViewById(R.id.idList);

        CustomList adapterKustomList = new CustomList(homeActivity.this, kontenLinux, gambarKonten, kontenBahasan);

        listingData.setAdapter(adapterKustomList);

        System.out.println("Nilai dari String IfConfig: " + dataPenjelasan[0]);

        listingData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisiKonten, long l) {
                String linuxKonten = kontenLinux[posisiKonten];
                Integer materiKonten = kontenBahasan[posisiKonten];
                Integer gbrIcnConten = iconKonten[posisiKonten];
                String kontenDetail = dataPenjelasan[posisiKonten];

                Bundle transferData = new Bundle();
                //Title
                transferData.putString("TITLE", linuxKonten);
                //Picture Konten
                transferData.putInt("CONTENT", materiKonten);
                //Icon Konten
                transferData.putInt("ICON", gbrIcnConten);
                //Penjelasan Konten
                transferData.putString("DETAIL", kontenDetail);


                Intent transferAction = new Intent(homeActivity.this, contentdetailActivity.class);
                transferAction.putExtras(transferData);
                startActivity(transferAction);

                System.out.println("Title: " + linuxKonten +" \nGambar Konten: " + materiKonten + " \nIcon Content: " +gbrIcnConten + " \nDetail: " + kontenDetail);
            }
        });
    }
}
