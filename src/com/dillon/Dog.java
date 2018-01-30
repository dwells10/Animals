package com.dillon;

/** @author Matt Green
 * Class Dog is used for storing dog data. This class extends from Pet and implements Talkable
 */

public class Dog extends Pet implements Talkable {

    /**
     *  is dog freindly
     */
    private boolean friendly;

    /**constructor to initialize the dog object
     *
     * @param friendly t of f determine dogs friendly characteristics
     * @param name an initial dogs name
     */

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return returns the friendliness of the dog
     */

    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return returns the sound the dog makes overrides talk class
     */

    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return returns name of dog and its friendliness as a string.
     */

    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}