package dagger.cloneplanet.com.daggertest.Dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by swapnilbhaisare on 30/07/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
}
