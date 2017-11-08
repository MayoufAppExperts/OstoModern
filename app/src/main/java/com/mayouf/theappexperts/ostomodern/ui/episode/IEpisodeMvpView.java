package com.mayouf.theappexperts.ostomodern.ui.episode;

import com.mayouf.theappexperts.ostomodern.SlugAdapter;
import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.ui.base.MvpView;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public interface IEpisodeMvpView extends MvpView {

    void onEpisodeDataCompleted(EpisodeModel episodeModel, SlugAdapter.InfoViewHolder infoViewHolder);
}
