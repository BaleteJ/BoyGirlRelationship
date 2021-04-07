package package1;

import package2.Boy;
import package2.Girl;
import package2.Relationship;

public class Main2 {

    public static void main(String[] args)
    {
        Boy newBoy = new Boy(true, false);
        /*Girl newGirl = new Girl(true);
        Relationship newRelationship = new Relationship(true);*/

        //System.out.println(newBoy.selectedName + " " + newRelationship.selectedRelationship + " " + newGirl.selectedName);
        //System.out.println("This boy name is public: " + newBoy.publicName);

        newBoy.publicGenerateBoyName();
        System.out.println(newBoy.getSelectedName());

    }

}