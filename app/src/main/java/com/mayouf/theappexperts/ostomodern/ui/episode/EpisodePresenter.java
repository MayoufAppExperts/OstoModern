package com.mayouf.theappexperts.ostomodern.ui.episode;

import com.mayouf.theappexperts.ostomodern.DataManager;
import com.mayouf.theappexperts.ostomodern.SlugAdapter;
import com.mayouf.theappexperts.ostomodern.network.model.EpisodeModel;
import com.mayouf.theappexperts.ostomodern.ui.base.BasePresenter;
import com.mayouf.theappexperts.ostomodern.ui.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public class EpisodePresenter
    <V extends IEpisodeMvpView>
    extends BasePresenter<V>
    implements IEpisodeMvpPresenter<V> {


    public EpisodePresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared(String slug, final SlugAdapter.InfoViewHolder infoViewHolder) {
        getCompositeDisposable().add(getDataManager()
                .useCaseEpisodes(slug)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<EpisodeModel>() {
                               @Override
                               public void accept(EpisodeModel episodeModel) throws Exception {
                                   getMvpView().onEpisodeDataCompleted(episodeModel, infoViewHolder);
                               }
                           },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                getMvpView().onError(throwable.getMessage());
                            }
                        }));
    }
}
