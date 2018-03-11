package id.dev.septiyadi.tutorlinuxid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class screensplashActivity extends AppCompatActivity {

    private int progressStatus = 0;
    private Handler handler = new Handler();

    TextView tvValueProgress, konten, initialProgress;
    ProgressBar pgrSplash;

    String[] InfoLinux = {
            "Linux adalah sistem operasi yang dikembangkan oleh Mr. Linus Torvarld, dimana sistem operasi ini dikembangkan dan di sebarluaskan dan berlisensi sumber terbuka atau yang lebih kita tau (OpenSource)",
            "Linux sejalan perkembangannya mengalami perubahan yang segnifikan, dari mulai macam-macam distro, yang sudah kita kenal seperti Ubuntu, Linux Mint, Arch Linux, Kali Linux dan banyak Lagi.",
            "Dan Android sendiri berbasiskan atau mengadopsi sistem operasi Linux, dan Versi linux Saat itu yang digunakan adalah V.2.1",
            "Teknologi OS (Sistem Operasi Linux) terus bermunculan seiring berjalannya waktu, karen banyak pengembang diluar sana, sehingga sampai saat ini, linux sangat terkenal dari berbagai distronya",
            "Mr. Linux tidak hanya mengembangkan Sistem Operasi Linux namun juga mengembangkan banyak sekali produk seperti GitHub, GitLab dan lain sebagainya",
            "Hingga teknologi Docker saat ini mendukung teknologi ini, walaupun Docker kini bekerja sama dengan Microsoft, yang notabene OS yang berbayar, jadi So Fun on this Apps."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screensplash);

        tvValueProgress = (TextView)findViewById(R.id.tvProgressSplash);
        pgrSplash = (ProgressBar) findViewById(R.id.pgSplash);
        konten = (TextView)findViewById(R.id.tvKontenInfoLinux);
        initialProgress = (TextView)findViewById(R.id.tvInitial);

        splashRun();
    }

    public void splashRun(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progressStatus < 100){
                    progressStatus += 1;
                    try {
                        Thread.sleep(300);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pgrSplash.setProgress(progressStatus);
                            tvValueProgress.setText(progressStatus + "%");

                            methodInitial();
                            methodInfoLinux();

                            int hasil = progressStatus;
                            if(hasil == 100){
                                intentPindahAksi();
                            }
                        }
                    });
                }
            }
        }).start();
    }

    public void methodInfoLinux(){
        if (progressStatus == 15){
            //konten.setText("Info.1 Muncul");
            konten.setText("" + InfoLinux[0]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
        if (progressStatus == 25){
            //konten.setText("Info.2 Muncul");
            konten.setText("" + InfoLinux[1]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
        if (progressStatus == 35){
            //konten.setText("Info.3 Muncul");
            konten.setText("" + InfoLinux[2]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
        if (progressStatus == 75){
            //konten.setText("Info.4 Muncul");
            konten.setText("" + InfoLinux[3]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
        if (progressStatus == 85){
            //konten.setText("Info.5 Muncul");
            konten.setText("" + InfoLinux[4]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
        if (progressStatus == 95){
            //konten.setText("Info.6 Muncul");
            konten.setText("" + InfoLinux[5]);
            System.out.println("Progress Status " + progressStatus + "%");
        }
    }

    public void methodInitial(){
        if(progressStatus == 1){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 5){
            initialProgress.setText("initialize.");
        }
        if(progressStatus == 8){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 12){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 18){
            initialProgress.setText("initialize....");
        }
        if(progressStatus == 21){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 26){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 30){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 39){
            initialProgress.setText("initialize....");
        }
        if(progressStatus == 43){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 48){
            initialProgress.setText("initialize.");
        }
        if(progressStatus == 50){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 53){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 57){
            initialProgress.setText("initialize....");
        }
        if(progressStatus == 60){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 64){
            initialProgress.setText("initialize.");
        }
        if(progressStatus == 67){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 69){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 73){
            initialProgress.setText("initialize....");
        }
        if(progressStatus == 75){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 78){
            initialProgress.setText("initialize.");
        }
        if(progressStatus == 80){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 85){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 87){
            initialProgress.setText("initialize....");
        }
        if(progressStatus == 90){
            initialProgress.setText("initialize");
        }
        if(progressStatus == 95){
            initialProgress.setText("initialize.");
        }
        if(progressStatus == 99){
            initialProgress.setText("initialize..");
        }
        if(progressStatus == 100){
            initialProgress.setText("initialize...");
        }
        if(progressStatus == 100){
            initialProgress.setText("initialize....");
        }
    }

    public void intentPindahAksi(){
        Intent i = new Intent(screensplashActivity.this, menuActivity.class);
        startActivity(i);
        //Mengakhiri Activity Splash Agar tidak Bisa kembali dari Home ke Splash
        finish();
    }
}
