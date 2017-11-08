package com.mayouf.theappexperts.ostomodern.ui.episode;

import com.mayouf.theappexperts.ostomodern.SlugAdapter;
import com.mayouf.theappexperts.ostomodern.ui.base.MvpPresenter;
import com.mayouf.theappexperts.ostomodern.ui.base.MvpView;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public interface IEpisodeMvpPresenter <V extends IEpisodeMvpView> extends MvpPresenter<V> {

    void onViewPrepared(String slug, SlugAdapter.InfoViewHolder infoViewHolder);
}
