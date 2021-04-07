package package2;

public class Girl {
    protected String[] namePool = {"Jenny", "Jonalene", "Karen", "Belle", "Kat"};

    protected String selectedName;

    protected Girl(boolean x) {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }
}
