package package2;

public class Relationship {
    protected String[] relationshipPool = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

    protected String selectedRelationship;

    protected Relationship(boolean x)
    {
        this.selectedRelationship = (x) ? this.relationshipPool[(int)(Math.random()*this.relationshipPool.length)] : "";
    }
}
