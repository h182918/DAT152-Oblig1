package Model;

import java.util.List;

public class Item {
        public int pno;
        public List<String> pName;
        public double priceInEuro;
        public String imageFile;

        public Item(int pno, List<String> pName, double priceInEuro, String imageFile){
            this.pno = pno;
            this.pName = pName;
            this.priceInEuro = priceInEuro;
            this.imageFile = imageFile;
        }

}
