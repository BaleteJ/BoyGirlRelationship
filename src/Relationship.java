public class Relationship {
    String[] relationshipPool = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

    String selectedRelationship;

    public Relationship(boolean x)
    {
        this.selectedRelationship = (x) ? this.relationshipPool[(int)(Math.random()*this.relationshipPool.length)] : "";
    }
}
