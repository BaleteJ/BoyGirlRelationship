package package2;

public class Main {
    public static void main(String[] args)
    {
/*        package2.Boy newBoy = new package2.Boy();
        package2.Girl newGirl = new package2.Girl();
        package2.Relationship newRelationship = new package2.Relationship();

        newBoy.selectedName = newBoy.namePool[(int)(Math.random()*5)];
        newGirl.selectedName = newGirl.namePool[(int)(Math.random()*5)];
        newRelationship.selectedRelationship = newRelationship.relationshipPool[(int)(Math.random()*5)];

        System.out.println(newBoy.selectedName + " " + newRelationship.selectedRelationship + " " + newGirl.selectedName);*/

        //========================================================================
        Boy newBoy = new Boy(true);
        Girl newGirl = new Girl(true);
        Relationship newRelationship = new Relationship(true);

        System.out.println(newBoy.getSelectedName() + " " + newRelationship.getSelectedRelationship() + " " + newGirl.getSelectedName());
    }
}
