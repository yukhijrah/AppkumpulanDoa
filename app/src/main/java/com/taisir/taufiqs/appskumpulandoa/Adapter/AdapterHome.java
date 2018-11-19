package qifuatpop.app.kumpulanDoa.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import qifuatpop.app.kumpulanDoa.Model.ModelHome;
import qifuatpop.app.kumpulanDoa.R;
import qifuatpop.app.kumpulanDoa.ViewHolder.HolderHome;

/**
 * Created by qifuats on 11/11/2018.
 */

public class AdapterHome extends RecyclerView.Adapter<HolderHome> {

    private List<ModelHome> home;

    public AdapterHome(List<ModelHome> home) {
        this.home = home;
    }

    @Override
    public HolderHome onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HolderHome(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(HolderHome holder, int position) {
        holder.jadwalSholat.setText(home.get(position).getJadwal());
        holder.waktuSholat.setText(home.get(position).getWaktu());


    }

    @Override
    public int getItemCount() {
        return home.size();
    }
}
