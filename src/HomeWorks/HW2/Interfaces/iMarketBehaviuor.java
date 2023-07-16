package HomeWorks.HW2.Interfaces;

import HomeWorks.HW2.Classes.Actor;

import java.util.List;

public interface iMarketBehaviuor {

    /**
     * Enter actor in the market
     * @param actor all objects implements iActorBehaviour
     */
    void acceptToMarket(iActorBehaviuor actor);

    /**
     * Added actor in queue (ArrayList<iActorBehaviuor>)
     * @param actor all objects implements iActorBehaviour
     */
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Remove actor from queue (ArrayList<iActorBehaviuor>)
     * @param list all objects implements iActorBehaviour
     */
    void releaseFromMarket(List<iActorBehaviuor> list);

    /**
     * Universal method =)
     */
    void update();
}
