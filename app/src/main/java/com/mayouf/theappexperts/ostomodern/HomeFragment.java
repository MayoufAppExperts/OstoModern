package com.mayouf.theappexperts.ostomodern;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayouf.theappexperts.ostomodern.network.model.SetList;
import com.mayouf.theappexperts.ostomodern.ui.base.BaseFragment;
import com.mayouf.theappexperts.ostomodern.ui.slug.ISlugListMvpView;
import com.mayouf.theappexperts.ostomodern.ui.slug.SlugListMvpPresenter;
import com.mayouf.theappexperts.ostomodern.ui.utils.rx.AppSchedulerProvider;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by TheAppExperts on 08/11/2017.
 */

public class HomeFragment extends BaseFragment implements ISlugListMvpView{

    @BindView(R.id.pop_recycler_view)
    RecyclerView recyclerView;

    String slug = "home";

    SlugListMvpPresenter<ISlugListMvpView> iSlugListMvpViewSlugListMvpPresenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onError(String message) {
        Log.i("errorHome", message);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        initialiseRecyclerView(view);


        iSlugListMvpViewSlugListMvpPresenter = new SlugListMvpPresenter<>(
                new AppDataManager(),
                new AppSchedulerProvider(),
                new CompositeDisposable());

        iSlugListMvpViewSlugListMvpPresenter.onAttach(this);
        iSlugListMvpViewSlugListMvpPresenter.onViewPrepared(slug);
        super.onViewCreated(view, savedInstanceState);
    }


    private void initialiseRecyclerView(View view) {

        recyclerView = (RecyclerView) view.findViewById(R.id.pop_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        Log.i("Recycler View", "Initialised True");
    }

    @Override
    public void onFetchDataCompleted(SetList setList) {
        Log.i("FetchData", "Started");
        recyclerView.setAdapter(new SlugAdapter(setList, R.layout.list_item, getActivity().getApplicationContext()));
        Log.i("FetchData", "Completed");

    }
}
