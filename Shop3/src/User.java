import java.util.ArrayList;
import java.util.HashMap;

public class User {
    String login,password;
    int deposite =0;
    HashMap<String,GoodItem> cart;

    User (String l){
        login=l;
    }
    void setPassword (String p){
        password=p;
    }

    void addMoney (int m){
        deposite=deposite+m;
    }

    void subtractMoney (int m){
        deposite=deposite-m;
    }

    void addGood (String k, GoodItem g){
        cart.put ( k, g );
    }

    void deleteGood (String k){
        cart.remove ( k );
    }

    void changeGoodCount(String k, int c){
        cart.get ( k ).setCount ( c );
    }

}
