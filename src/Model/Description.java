package Model;

import java.util.List;

public class Description {
    public int pno;
    public String langCode;
    public List<String> text;

    public Description(int pno, String langCode, List<String> text) {
        this.pno = pno;
        this.langCode = langCode;
        this.text = text;
    }
}
