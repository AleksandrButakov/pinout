package com.anbn.pinout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import static com.anbn.pinout.MainActivity.card;
import static com.anbn.pinout.MainActivity.equip;

// extends AppCompatActivity необходим для загрузки файлов
public class TwoActivity extends AppCompatActivity {

    private ImageView imageView;
    private int currentPage = 0;
    private Button next, previous;

    private static final int WRITE_EXTERNAL_STORAGE = 1;
    // private String link = "https://drive.google.com/uc?export=download&confirm=no_antivirus&id=" +
    // "1c6v46vgYnRSR4n54veKgC4oAVusmpjlz";

    // нарисуем экран
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        // для стрелки назад в ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // pdf Viewer
        PDFView pdfView = findViewById(R.id.pdfView);

        String folder = "";
        String file_name = "";
        String path;

        // укажем имя папки в assets 01_smk30mux
        if (equip == 1) {
            folder = "01_smk30mux";
            file_name = StaticVariablesOffLine.CARD1[card] + ".pdf";
        }

        // укажем имя папки в assets 02_smk30ks
        if (equip == 2) {
            folder = "02_smk30ks";
            file_name = StaticVariablesOffLine.CARD2[card] + ".pdf";
        }

        // укажем имя папки в assets 03_mdk
        if (equip == 3) {
            folder = "03_mdk";
            file_name = StaticVariablesOffLine.CARD3[card] + ".pdf";
        }

        // укажем имя папки в assets 04_rlsm10_40
        if (equip == 4) {
            folder = "04_rlsm10_40";
            file_name = StaticVariablesOffLine.CARD4[card] + ".pdf";
        }

        // укажем имя папки в assets 05_psgo
        if (equip == 5) {
            folder = "05_psgo";
            file_name = StaticVariablesOffLine.CARD5[card] + ".pdf";
        }

        // укажем имя папки в assets 06_different_pulsar
        if (equip == 6) {
            folder = "06_different_pulsar";
            file_name = StaticVariablesOffLine.CARD6[card] + ".pdf";
        }

        // укажем имя папки в assets 07_ECI
        if (equip == 7) {
            folder = "07_ECI";
            file_name = StaticVariablesOffLine.CARD7[card] + ".pdf";
        }

        // укажем имя папки в assets 08_cisco
        if (equip == 8) {
            folder = "08_cisco";
            file_name = StaticVariablesOffLine.CARD8[card] + ".pdf";
        }

        // укажем имя папки в assets 09_cable
        if (equip == 9) {
            folder = "09_cable";
            file_name = StaticVariablesOffLine.CARD9[card] + ".pdf";
        }

        // укажем имя папки в assets 10_DX500
        if (equip == 10) {
            folder = "10_DX500";
            file_name = StaticVariablesOffLine.CARD10[card] + ".pdf";
        }

        // укажем имя папки в assets 11_optical_cable
        if (equip == 11) {
            folder = "11_optical_cable";
            file_name = StaticVariablesOffLine.CARD11[card] + ".pdf";
        }

        /* TODO добавить Logger
           TODO проверяю что folder and file_name <> null, выполняю сериализацию
           TODO если null, выполняю десериализацию,
         */

//        if (folder.equals("") || file_name.equals("")) {
//            // выполняем десериализацию
//
//            // проверяем что переменные не равны нулю
//            if (folder.equals("") || file_name.equals("")) {
//
//            } else {
//
//            }
//        } else {
//            // выполняем сериализацию
//
//        }

        // найдем путь к файлу
        path = folder + "/" + file_name;// + ".pdf";

        TextView textView = findViewById(R.id.textView);
        // уберем расширение файла .pdf
        file_name = file_name.substring(0, file_name.length() - 4);
        textView.setText(file_name);

        pdfView.fromAsset(path)
                //.pages(35) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments,
                // colors or forms)
                .password(null)
                .scrollHandle(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                // screen
                .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                // scaled relative to largest page.
                .load();
        //}
    }

    // для стрелки назад в ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // для стрелки назад в ActionBar
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onClickButtonTwo(View v) {
        //Intent intent = new  Intent(this, MainActivity.class);
        //startActivity(MainActivity.class);
        onBackPressed();// возврат на предыдущий activity
    }
    //"#FF9800"

    // дальнейший фрагмент выполняет загрузку файла по нажатию кнопки Download
    public void onClickButtonDownload(View v) {
        //
        Toast.makeText(this, "Функционал находится в разработке...",
                Toast.LENGTH_SHORT).show();
        //DefineVersion();
    }

    /*
    // метод проверки версии Android
    private void DefineVersion () {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
                    PackageManager.PERMISSION_DENIED) {
                String [] permisi = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                requestPermissions(permisi, WRITE_EXTERNAL_STORAGE);
            } else {
                saveFile();
            }
        } else {
            saveFile();
        }
    }
     */

    /*
    @Override
    protected void onResume() {
        super.onResume();
    }
     */

    /*
    // метод запроса разрешения на доступ к файлу
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case WRITE_EXTERNAL_STORAGE: {
                if (grantResults.length > 0 && grantResults [0] ==
                        PackageManager.PERMISSION_DENIED) {
                    Toast.makeText(this, "Отказано в доступе...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Доступ разрешен...", Toast.LENGTH_LONG).show();
                    DefineVersion();
                }
            }
        }
    }

    // метод сохранения файла в папку /Download
    private void saveFile() {
        if (!link.equals("")) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(link));
            request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);
            request.setTitle("Download...");
            request.setDescription("File is download...");

            // получим путь к папке /Download
            String put = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
            put = put + "/Download/file_from_Pinout.pdf";

            File file = new File(put);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE | DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationUri(Uri.fromFile(file));
            DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            manager.enqueue(request);

            // проверка существования файла

            /*
            if (is == null) {
                try {
                    Log.i(TAG, "Файл в процессе загрузки...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                continue repeat;
            }
             */

            /*
            File f = new File(put);

            if (f.exists()) {
                // файл есть

            } else {
                // файла нет
                try {
                    //Log.i(TAG, "Файл в процессе загрузки...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                continue repeat;

            }

            Toast.makeText(this, "File uploaded successfully!", Toast.LENGTH_SHORT).show();

        }
    }
    */

}
