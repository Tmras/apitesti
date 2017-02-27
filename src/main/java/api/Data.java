package api;

/**
 * Created by Tuomas on 26.2.2017.
 */
public class Data {

    private final long id;
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public Data(long id, String a, String b, String c, String d) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public long getId() {
        return id;
    }

    public String getA() {
        return a;
    }
    public String getB() {
        return b;
    }
    public String getC() {
        return c;
    }
    public String getD() {
        return d;
    }
}
