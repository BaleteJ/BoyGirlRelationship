package package2;

public class Boy {
    private String[] namePool = {"Jason", "Vince", "David", "Heinz", "Roland"};
    private String selectedName;

    public static String publicName;


    protected Boy(boolean x)
    {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }

    public Boy(boolean x, boolean y)
    {
        this.publicName = "Asterios";
    }

    public void publicGenerateBoyName()
    {
        this.selectedName = this.namePool[(int)(Math.random()*this.namePool.length)];
    }

    //Getters
    public String getSelectedName(){ return this.selectedName;}

    //Setters
}
