package tuto.adrien.projetandroid.Model;

import com.orm.SugarRecord;

/**
 * Created by Adrien on 06/02/2018.
 */

public class Book extends SugarRecord {

    private String title;

    public Book(){

    }

    public Book(String title) {
        this.title = title;

    }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

}
