package com.mayouf.theappexperts.ostomodern.network.service;


import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;

import io.reactivex.Observable;

/**
 * Created by TheAppExperts on 18/10/2017.
 */
public class AppApiHelper implements ApiHelper {

    private ReqInterface reqInterface;

    public AppApiHelper() {
        this.reqInterface = ConnectionService.getConnectionService();
    }

    @Override
    public Observable<SetList> useCaseHomeSlug(String slug) {
        return reqInterface.getHome(slug);
    }

    @Override
    public Observable<EpisodeModel> useCaseEpisodes(String url) {
        return reqInterface.getEpisodes(url);
    }
}
