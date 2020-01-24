import java.util.ArrayList;

public class PrezOrig
{
    private String ownName;
    private int ownAge;
    private ArrayList<String> friendsNames;

    public PrezOrig (String aName, int anAge)
    {
        ownName = aName;
        setOwnAge(anAge); // ownAge = anAge;
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
     * @param president's new age.
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
        return friendsNames.toString();
    }
    
    /**
     * Gets the ith friend.
     * @param i the index of the friend you want to get.
     * @return the ith friend's name.
     */
    public String get1FriendsName(int index)
    {
        if (index >= 0 && index < friendsNames.size())
            return friendsNames.get(index);
        else
            return "";
    }
    
    /**
     * Adds the given friend to this president's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(PrezOrig aFriend)
    {
        int indx = findFriend(aFriend);
        if (indx < 0)
        {
            friendsNames.add(aFriend.ownName);
        }
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
    
    private int findFriend(PrezOrig aFriend)
    {
        boolean found = false;
        int indx = 0;
        int count = friendsNames.size();
        if (count > 0)
        {
            while (!found && indx < count)
            {
                if (friendsNames.get(indx).equals(aFriend.ownName))
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
            indx = -1;
        return indx; 
    }
}
