package HomeWorks.HW2.Interfaces;

import HomeWorks.HW2.Classes.Actor;

public interface iActorBehaviuor {
    /**
     * Is client take the order
     * @return true or false
     */
    public boolean isTakeOrder();

    /**
     * Is client make the order
     * @return true or false
     */
    public boolean isMakeOrder();

    /**
     * Set take order flag
     * @param takeOrder true ore false flag
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * Set make order flag
     * @param makeOrder true ore false flag
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Return this
     * @return this
     */
    public Actor getActor();
}
