package com.rendy.recyclerviewa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Albania");
        nm.setDeskripsi("Albania adalah sebuah negara di Semenanjung Balkan di Eropa Tenggara. Negara ini memiliki pemandangan alam yang indah, termasuk pegunungan dan garis pantai di Laut Adriatik dan Laut Ionia.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Indonesia");
        nm.setDeskripsi("Indonesia adalah sebuah negara di Asia Tenggara yang terdiri dari ribuan pulau, " +
                "dengan pulau Jawa, Sumatera, Kalimantan, Sulawesi, dan Papua sebagai pulau-pulau " +
                "terbesarnya. Ibu kotanya adalah Jakarta.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Indonesia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Slovenia");
        nm.setDeskripsi("Slovenia adalah sebuah negara di Eropa Selatan yang dulunya bagian dari Yugoslavia. Negara ini terkenal dengan alamnya yang indah, termasuk Pegunungan Alpen dan Danau Bled.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Slovenia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Belgium");
        nm.setDeskripsi("Belgia adalah negara di Eropa Barat yang terkenal dengan cokelat, bir, dan kerajinan tangan. Brussels, ibukotanya, menjadi pusat politik Uni Eropa.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Belgium-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Canada");
        nm.setDeskripsi("Kanada adalah negara terbesar kedua di dunia menurut luas wilayahnya. Terkenal dengan keindahan alamnya yang memukau, Kanada memiliki pegunungan, hutan, dan danau yang luas. Ottawa adalah ibukotanya.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Jepang");
        nm.setDeskripsi("Jepang adalah negara kepulauan di Asia Timur yang terkenal dengan budayanya yang kaya, teknologi canggih, dan pemandangan alam yang indah. Tokyo adalah ibukotanya.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Japan-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Korea Selatan");
        nm.setDeskripsi("Korea Selatan adalah negara di Asia Timur yang terkenal dengan K-pop, drama Korea, dan teknologi canggih. Seoul adalah ibukotanya.");
        nm.setUrl("https://icons.iconarchive.com/icons/gosquared/flag/64/South-Korea-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Malaysia");
        nm.setDeskripsi("Malaysia adalah negara di Asia Tenggara yang terkenal dengan keberagamannya, makanan lezat, dan menara kembar Petronas di Kuala Lumpur, ibukotanya.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Malaysia-Flag-icon.png");
        negaraModelList.add(nm);

// Tambahan tiga negara baru

        nm = new NegaraModel();
        nm.setNama("Australia");
        nm.setDeskripsi("Australia adalah negara dan benua di belahan bumi selatan yang terkenal dengan satwa liarnya yang unik, seperti kanguru dan koala. Ibukotanya adalah Canberra.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Australia-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Brazil");
        nm.setDeskripsi("Brasil adalah negara terbesar di Amerika Selatan yang terkenal dengan hutan hujan Amazon dan budaya Karnaval di Rio de Janeiro. Ibukotanya adalah Brasília.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Brazil-Flag-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Mesir");
        nm.setDeskripsi("Mesir adalah negara di Afrika Utara yang terkenal dengan sejarah kuno, piramida, dan Sungai Nil. Ibukotanya adalah Kairo.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/256/Egypt-Flag-icon.png");
        negaraModelList.add(nm);



        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        _recyclerView1.setAdapter(na);

    }
}