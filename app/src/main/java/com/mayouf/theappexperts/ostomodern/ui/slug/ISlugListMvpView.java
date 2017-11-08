package com.mayouf.theappexperts.ostomodern.ui.slug;

import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.ui.base.MvpView;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public interface ISlugListMvpView extends MvpView {
    void onFetchDataCompleted (SetList setList);
}
