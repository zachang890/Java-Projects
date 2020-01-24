
/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrezSocial
{
    public static void main(String[] args)
    {
        // ADD 1ST PERSON TO THE PRESIDENT SOCIAL
        Prez prezW = new Prez("Washington", 70);
        
        // SHOW RESULTS: NO FRIENDS
        System.out.print("\nRESULT: ");
        System.out.println(prezW.getOwnName() + "age (" + prezW.getOwnAge() + ")"
                   + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has no friends right now");
        
        // ADD FRIENDS TO THE 1ST PRESIDENT
        Prez prezA1 = new Prez("Adams", 44);     prezW.addFriend(prezA1.getOwnName());
        Prez prezA2 = new Prez("Jefferson", 22);   prezW.addFriend(prezA2.getOwnName());
        Prez prezA3 = new Prez("Madison", 33);   prezW.addFriend(prezA3.getOwnName());
        Prez prezA4 = new Prez("Monroe", 24);   prezW.addFriend(prezA4.getOwnName());

        
        // SHOW RESULTS: W/ FRIENDS
        System.out.print("\nRESULT after addFriend: ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 4 friends: Adams, Jefferson, Madison, Monroe");
          
        
      // UNFRIEND
         prezW.unfriend(prezA2.getOwnName());
      
       // SHOW RESULTS: AFTER UNFRIENDING
        System.out.print("\nRESULT after trying to unFriend (" + prezA2.getOwnName() + "): ");
        System.out.println(prezW.getOwnName() + " has " + prezW.getFriendCount() + " friends: "
                   + prezW.getAllFriendsNames());
        System.out.println("EXPECTED: Washington has 3 friends: Adams, Madison, Monroe");
    }

}
