package com.hk.newsapp.di;

import android.content.Context;

import com.hk.newsapp.db.AppDatabase;
import com.hk.newsapp.db.PhotoDao;
import com.hk.newsapp.db.NewsDao;
import com.hk.newsapp.db.VideoDao;

import javax.inject.Singleton;

import androidx.room.Room;
import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
class DatabaseModule {

    @Singleton
    @Provides
    AppDatabase providesDatabaseModule(Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, "AppDB").build();
    }

    @Singleton
    @Provides
    NewsDao providesNewsDao(AppDatabase appDatabase) {
        return appDatabase.newsDao();
    }

    @Singleton
    @Provides
    PhotoDao providesPhotoDao(AppDatabase appDatabase) {
        return appDatabase.photoDao();
    }

    @Singleton
    @Provides
    VideoDao providesVideoDao(AppDatabase appDatabase) {
        return appDatabase.videoDao();
    }

}
