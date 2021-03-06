package com.hk.newsapp.vm.factory;

import com.hk.newsapp.repositories.NewsRepo;
import com.hk.newsapp.vm.NewsListVM;

import javax.inject.Inject;
import javax.inject.Singleton;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

@Singleton
public class NewsListFactory extends ViewModelProvider.NewInstanceFactory {

    private NewsRepo newsRepo;

    @Inject
    public NewsListFactory(NewsRepo newsRepo) {
        this.newsRepo = newsRepo;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new NewsListVM(newsRepo);
    }
}