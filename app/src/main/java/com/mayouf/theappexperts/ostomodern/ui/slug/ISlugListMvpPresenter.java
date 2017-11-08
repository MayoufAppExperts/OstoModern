package com.mayouf.theappexperts.ostomodern.ui.slug;

import com.mayouf.theappexperts.ostomodern.ui.base.MvpPresenter;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public interface ISlugListMvpPresenter <V extends ISlugListMvpView> extends MvpPresenter<V>{

    void onViewPrepared(String slug);
}
