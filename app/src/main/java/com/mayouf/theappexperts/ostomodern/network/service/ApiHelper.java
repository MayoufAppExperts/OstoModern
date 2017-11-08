package com.mayouf.theappexperts.ostomodern.network.service;


import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;


import io.reactivex.Observable;



public interface ApiHelper {
    Observable<SetList> useCaseHomeSlug(String slug);
    Observable<EpisodeModel> useCaseEpisodes(String url);
}
