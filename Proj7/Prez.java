import java.util.ArrayList;

public class Prez
{
    private String ownName;
    private int ownAge;
    private ArrayList<String> friendsNames;

    public Prez (String aName, int anAge)
    {
        ownName = aName;
        ownAge = anAge;
        friendsNames = new ArrayList<String>();
    }

    /**
     * Gets the president's name.
     * @return president's own name.
     */
    public String getOwnName()
    {
        return ownName;
    }

    /**
     * Gets the president's age.
     * @return president's own age.
     */
    public int getOwnAge()
    {
        return ownAge;
    }

    /**
     * Sets the president's age.
     * @param 's new age.
     */
    public void setOwnAge(int givenAge)
    {
        ownAge = givenAge;
    }

    /**
     * Gets the number of friends this president has.
     * @return the number of friends.
     */
    public int getFriendCount()
    {
        return friendsNames.size();
    }

    /**
     * Gets a list of all of this president's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Lincoln, Johnson"
     */
    public String getAllFriendsNames()
    {
        //unneccessary
        /**
        String blah = "";
        for(int i = 0; i < friendsNames.size(); i++) {
        blah = friendsNames.get(i) + ", ";

        }
        return blah;
         **/
        return friendsNames.toString();
    }

    /**
     * Gets the ith friend.
     * @param i the index of the friend you want to get.
     * @return the ith friend's name.
     */
    public String get1FriendsName(int index)
    {
        return friendsNames.get(index);
    }

    /**
     * Adds the given friend to this president's friends list if the friend is not
     * yet in the list.t
     * @param friend the friend to add.
     */
    public void addFriend(String aFriend)
    {

        friendsNames.add(aFriend);

    }

    /**
     * Remove the given name from this president's friends list.
     * @param foe Name of president to remove.
     */
    public void unfriend(String foe)
    {
        friendsNames.remove(foe);
    }

    public String toString()
    {
        return ownName + ": " + getAllFriendsNames();
    }

    private int findFriend(String aFriend)
    {
        boolean found = false;
        int indx = 0;
        int count = friendsNames.size();

        if (count > 0)
        {
            while (!found && indx < count)
            {
                if (friendsNames.get(indx).equals(ownName))
                {
                    found = true;
                }
                else
                {
                    indx++;
                }
            }
        }

        if (!found)
        {
            indx = -1;
        }
        return indx; 
    }
}
