package com.mayouf.theappexperts.ostomodern;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.Item;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.ui.episode.EpisodePresenter;
import com.mayouf.theappexperts.ostomodern.ui.episode.IEpisodeMvpView;
import com.mayouf.theappexperts.ostomodern.ui.utils.rx.AppSchedulerProvider;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;

public class SlugAdapter extends RecyclerView.Adapter<SlugAdapter.InfoViewHolder> implements IEpisodeMvpView {
    SetList setList;
    int list_item;
    Context applicationContext;
    EpisodePresenter<IEpisodeMvpView> iEpisodeMvpViewEpisodePresenter;

    public SlugAdapter(SetList setList, int list_item, Context applicationContext) {
        this.setList = setList;
        this.list_item = list_item;
        this.applicationContext = applicationContext;

    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(list_item, parent, false);
        iEpisodeMvpViewEpisodePresenter = new EpisodePresenter<>(
                new AppDataManager(),
                new AppSchedulerProvider(),
                new CompositeDisposable());
        iEpisodeMvpViewEpisodePresenter.onAttach(this);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoViewHolder holder, int position) {
        Item item = setList.getObjects().get(0).getItems().get(position);
        if(item.getHeading()==null) {

            String[] urlContent = item.getContentUrl().split("/");
            iEpisodeMvpViewEpisodePresenter.onViewPrepared(urlContent[urlContent.length-1]+ "/",holder);
        }
        else{
            holder.tvName.setText("Divider : " + position);
        }
        //holder.tvName.setText(item.getContentUrl());
    }

    @Override
    public int getItemCount() {
        return setList.getObjects().get(0).getItems().size();
    }

    @Override
    public void onEpisodeDataCompleted(EpisodeModel episodeModel, InfoViewHolder infoViewHolder) {
        infoViewHolder.tvName.setText(episodeModel.getTitle());

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.artistName)
        TextView tvName;
        @BindView(R.id.collectionName)
        TextView tvPubDate;

        public InfoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    /**
     * public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> implements IHomeMVPView{

     HomePresenter<IHomeMVPView> homeMVPViewHomePresenter;

     SetModel setModel;
     int row;
     Context applicationContext;
     HomeFragment.OnItemClickListener listener;

     public HomeAdapter(SetModel setModel, int row, Context applicationContext, HomeFragment.OnItemClickListener listener) {
     this.setModel = setModel;
     this.row = row;
     this.applicationContext = applicationContext;
     this.listener = listener;
     }

     @Override
     public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View v = LayoutInflater.from(parent.getContext()).inflate(row,parent,false);
     homeMVPViewHomePresenter = new HomePresenter<>(new AppDataManager(), new AppSchedulerProvider(), new CompositeDisposable());
     homeMVPViewHomePresenter.onAttach(this);
     return new HomeViewHolder(v);
     }

     @Override
     public void onBindViewHolder(HomeViewHolder holder, int position) {
     SetModel.Object.Item item = setModel.getObjects().get(0).getItems().get(position);

     if(item.getHeading()==null) {
     Log.i("OSTMODERN","HomeAdapter: onBindView: episode");
     holder.bind(item.getUid(), holder, listener);
     holder.cvHomeRowEpisode.setVisibility(View.VISIBLE);
     holder.cvHomeRowDivider.setVisibility(View.INVISIBLE);
     holder.tvHomeRowDivider.setText("");
     holder.tvHomeRowEpisode.setText("");
     String[] s = item.getContentUrl().split("/");
     homeMVPViewHomePresenter.onEventDetailViewPrepared(s[s.length-1] + "/",holder,position);
     } else {
     Log.i("OSTMODERN","HomeAdapter: onBindView: divider");
     holder.cvHomeRowDivider.setVisibility(View.VISIBLE);
     holder.cvHomeRowEpisode.setVisibility(View.INVISIBLE);
     holder.tvHomeRowEpisode.setText("");
     holder.tvHomeRowDivider.setText(item.getHeading());
     }
     }

     @Override
     public int getItemCount() {
     return setModel.getObjects().get(0).getItems().size();
     }

     @Override
     public void onFetchDataCompleted(EpisodeModel episodeModel, HomeViewHolder holder, int position) {
     holder.tvHomeRowEpisode.setText(episodeModel.getTitle());
     }

     @Override
     public void onError(String message) {
     Log.i("OSTMODERN","HomeAdapter: onError: " + message);
     }


     public class HomeViewHolder extends RecyclerView.ViewHolder {

     CardView cvHomeRowEpisode;
     FrameLayout cvHomeRowDivider;
     TextView tvHomeRowEpisode, tvHomeRowDivider;

     public HomeViewHolder(View itemView) {
     super(itemView);

     cvHomeRowEpisode = itemView.findViewById(R.id.cvHomeRowEpisode);
     cvHomeRowDivider = itemView.findViewById(R.id.cvHomeRowDivider);
     tvHomeRowEpisode = itemView.findViewById(R.id.tvHomeRowEpisode);
     tvHomeRowDivider = itemView.findViewById(R.id.tvHomeRowDivider);
     }

     public void bind(final String id, final HomeViewHolder holder, final HomeFragment.OnItemClickListener listener) {
     itemView.setOnClickListener(v -> listener.onItemClick(holder, id));
     }
     }
     }
     *
     *
     *
     */
}
