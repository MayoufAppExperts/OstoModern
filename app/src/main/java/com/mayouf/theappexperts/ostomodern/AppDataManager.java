package com.mayouf.theappexperts.ostomodern;


import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.network.service.ApiHelper;
import com.mayouf.theappexperts.ostomodern.network.service.AppApiHelper;

import io.reactivex.Observable;

/**
 * Created by TheAppExperts on 18/10/2017.
 */
public class AppDataManager implements DataManager {

    private ApiHelper apiHelper;

    public AppDataManager() {
        this.apiHelper = new AppApiHelper();
    }

    @Override
    public Observable<SetList> useCaseHomeSlug(String slug) {
        return apiHelper.useCaseHomeSlug(slug);
    }

    @Override
    public Observable<EpisodeModel> useCaseEpisodes(String url) {
        return apiHelper.useCaseEpisodes(url);
    }
}
