package dao;

/**
 * Created by khale on 16/05/2016.
 */
public class SingletonDao {
    private static Dao instance ;

    private SingletonDao(){

    }

    public static Dao getInstance(){

        if (instance != null){

            return instance;

        }

        instance = new Dao();
        return instance;
    }
}
