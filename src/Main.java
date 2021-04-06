public class Main {
    public static void main(String[] args)
    {
        Boy newBoy = new Boy();
        Girl newGirl = new Girl();
        Relationship newRelationship = new Relationship();

        newBoy.selectedName = newBoy.namePool[(int)(Math.random()*5)];
        newGirl.selectedName = newGirl.namePool[(int)(Math.random()*5)];
        newRelationship.selectedRelationship = newRelationship.relationshipPool[(int)(Math.random()*5)];

        System.out.println(newBoy.selectedName + " " + newRelationship.selectedRelationship + " " + newGirl.selectedName);

        //(int)(Math.random()*5)
    }
}
