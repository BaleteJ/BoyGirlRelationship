public class Girl {
    String[] namePool = {"Jenny", "Jonalene", "Karen", "Belle", "Kat"};

    String selectedName;

    public Girl(boolean x) {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }
}
