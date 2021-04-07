package package2;

public class Boy {
    protected String[] namePool = {"Jason", "Vince", "David", "Heinz", "Roland"};

    public static String publicName;

    protected String selectedName;

    protected Boy(boolean x)
    {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }

    public Boy(boolean x, boolean y)
    {
        this.publicName = "Asterios";
    }
}
