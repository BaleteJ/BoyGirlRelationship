public class Boy {
    String[] namePool = {"Jason", "Vince", "David", "Heinz", "Roland"};

    String selectedName;

    public Boy(boolean x)
    {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }
}
