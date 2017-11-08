package com.mayouf.theappexperts.ostomodern.network.service;



import com.mayouf.theappexperts.ostomodern.network.API_Constants;
import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Mohammed on 01/10/2017.
 */

public interface ReqInterface {

    @GET(API_Constants.SET_URL)
    Observable<SetList> getHome(@Query("slug") String slug);

    @GET(API_Constants.EP_URL)
    Observable<EpisodeModel> getEpisodes(@Path("url") String url);

}
