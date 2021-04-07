package package2;

public class Girl {
    private String[] namePool = {"Jenny", "Jonalene", "Karen", "Belle", "Kat"};

    private String selectedName;

    protected Girl(boolean x) {
        this.selectedName =  (x) ? this.namePool[(int)(Math.random()*this.namePool.length)] : "";
    }

    //Getters
    public String getSelectedName(){return this.selectedName;}

    //Setters
}
