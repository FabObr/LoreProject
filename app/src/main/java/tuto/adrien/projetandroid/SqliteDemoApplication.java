package tuto.adrien.projetandroid;

import android.app.Application;

import com.orm.SugarContext;

/**
 * Created by Adrien on 07/02/2018.
 */

public class SqliteDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
    }
}
