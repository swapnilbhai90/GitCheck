package dagger.cloneplanet.com.daggertest.Dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by swapnilbhaisare on 29/07/17.
 */

@Module
public class AppModule {


    private final Application application;

    public AppModule(Application application) {
        this.application=application;
    }


    /*The @Provides annotation tells Dagger that the method provides a certain type of dependency,
    in this case, a Context object.
    When a part of the app requests that Dagger inject a Context, the @Provides annotation tells Dagger where to find it.*/
    @Provides
    @Singleton
    public Context provideContext(){

        return application;
    }
}
