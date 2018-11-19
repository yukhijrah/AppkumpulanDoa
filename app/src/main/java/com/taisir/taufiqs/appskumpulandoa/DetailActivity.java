package qifuatpop.app.kumpulanDoa.kumpulandoa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import qifuatpop.app.kumpulanDoa.Model.ModelDoa;

/**
 * Created by qifuats on 11/13/2018.
 */

public class DetailActivity extends AppCompatActivity{

    TextView doaTitle, doaSubtitle, doaSurah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(qifuatpop.app.kumpulanDoa.R.layout.activity_detail);

        doaTitle = (TextView) findViewById(qifuatpop.app.kumpulanDoa.R.id.doaTitle);
        doaSurah = (TextView) findViewById(qifuatpop.app.kumpulanDoa.R.id.doaSurah);
        doaSubtitle = (TextView) findViewById(qifuatpop.app.kumpulanDoa.R.id.doaSubtitle);


        ModelDoa doa = (ModelDoa) getIntent().getSerializableExtra("id_doa");

        doaTitle.setText(doa.getDoaTitle());
        doaSurah.setText(doa.getDoaSurah());
        doaSubtitle.setText(doa.getDoaSubtitle());

    }
}
