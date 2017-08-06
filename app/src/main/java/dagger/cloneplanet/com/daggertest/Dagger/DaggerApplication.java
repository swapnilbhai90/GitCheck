package dagger.cloneplanet.com.daggertest.Dagger;

import android.app.Application;

/**
 * Created by swapnilbhaisare on 30/07/17.
 */

public class DaggerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    }
    private AppComponent appComponent;

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
