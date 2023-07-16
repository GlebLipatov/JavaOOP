package HomeWorks.HW2.Interfaces;

import HomeWorks.HW2.Classes.Actor;

public interface iQueueBehaviuor {
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Those clients that have order get out from the queue
     */
    void releaseFromQueue();

    /**
     * Take order
     */
    void takeOrder();

    /**
     * Give order
     */
    void giveOrder();
}
