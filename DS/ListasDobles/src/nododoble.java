public class nododoble {

    public int dato;
    nododoble siguiente, anterior;

    public nododoble(int dat) {
        this(dat, null, null);
    }

    public nododoble(int dat, nododoble s, nododoble a) {
        dato = dat;
        siguiente = s;
        anterior = a;
    }

}
