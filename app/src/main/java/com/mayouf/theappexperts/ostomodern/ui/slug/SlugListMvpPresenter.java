package com.mayouf.theappexperts.ostomodern.ui.slug;

import com.mayouf.theappexperts.ostomodern.DataManager;
import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.ui.base.BasePresenter;
import com.mayouf.theappexperts.ostomodern.ui.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public class SlugListMvpPresenter
        <V extends ISlugListMvpView>
        extends BasePresenter<V>
        implements ISlugListMvpPresenter<V> {

    public SlugListMvpPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared(String slug) {
        getCompositeDisposable().add(getDataManager()
                .useCaseHomeSlug(slug)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<SetList>() {
                               @Override
                               public void accept(SetList setList) throws Exception {
                                   getMvpView().onFetchDataCompleted(setList);
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
