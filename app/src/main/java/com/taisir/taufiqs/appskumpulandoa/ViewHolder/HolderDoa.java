package qifuatpop.app.kumpulandoa.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import qifuatpop.app.kumpulanDoa.R;

/**
 * Created by taufiqs on 11/11/2018.
 */

public class HolderDoa extends RecyclerView.ViewHolder {
    public TextView title, subtitle ;

    public HolderDoa(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.doaTitle);
        subtitle = (TextView) itemView.findViewById(R.id.doaSubtitle);
    }
}
