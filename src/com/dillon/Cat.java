package com.dillon;

/** @author Created by Matt Green
 *
 * Cat class used for returning the number of mice killed per cat
 *
 */


public class Cat extends Pet implements Talkable {

    /**
     * Number of mice Killed
     */
    private int mousesKilled;

    /**
     *  This is a constructor to initililize cat
     * @param mousesKilled the number of mice killed
     * @param name the name of the cat
     */

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return returns integer of the number of mice killed
     */

    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Increments the number of mice killed by 1
     */

    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * Implements the talk method and overrides with Meow
     */

    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return returns the Cat name and number of mice killed as string
     */

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}
