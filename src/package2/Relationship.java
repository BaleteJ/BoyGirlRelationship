package package2;

public class Relationship {
    private String[] relationshipPool = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

    private String selectedRelationship;

    protected Relationship(boolean x)
    {
        this.selectedRelationship = (x) ? this.relationshipPool[(int)(Math.random()*this.relationshipPool.length)] : "";
    }

    //Getters
    public String getSelectedRelationship(){return this.selectedRelationship;}

    //Setters
}
