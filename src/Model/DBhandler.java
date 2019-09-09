package Model;

import java.util.ArrayList;
import java.util.List;

// hardcoded items for the cart
public class DBhandler {
    Item whiteCup;
    Description whiteDesc;
    Item blackCup;
    Description blackDesc;

    public DBhandler(){
        fakeaWhiteCup();
        fakeaBlackCup();
    }

    public void fakeaWhiteCup(){
        List<String> White = new ArrayList<String>();
        White.add("White Coffee Cup(TM)");
        whiteCup = new Item(0001, White, 9.75, "dsfs");
        List<String> desc = new ArrayList<String>();
        desc.add("This is the ultimate white coffee cup");
        desc.add("Dette er den ultimate hvite kaffekoppen");
        desc.add("hablas español");
        whiteDesc = new Description(0001, "whiteboi", desc);
    }

    public void fakeaBlackCup(){
        List<String> White = new ArrayList<String>();
        White.add("Black Coffee Cup(TM)");
        whiteCup = new Item(0001, White, 7.12, "dsfs");
    }
}
