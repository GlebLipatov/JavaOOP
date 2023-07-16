package HomeWorks.HW2.Classes;

import HomeWorks.HW2.Interfaces.iActorBehaviuor;
import HomeWorks.HW2.Interfaces.iMarketBehaviuor;
import HomeWorks.HW2.Interfaces.iQueueBehaviuor;
import HomeWorks.HW2.Interfaces.iReturnOrder;

import java.util.ArrayList;
import java.util.List;

public class Market implements iMarketBehaviuor, iQueueBehaviuor, iReturnOrder {

    private List<iActorBehaviuor> queue;

    /**
     * Init market
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviuor>();
    }


    @Override
    public void acceptToMarket(iActorBehaviuor actor) {
        if (actor instanceof PromoClient) {
            PromoClient client = (PromoClient) actor;
            if (client.getIdPromo() <= 0) {
                System.out.println(client.getName() +
                        " не может быть обслужен, так как количество акционых клиентов ограниченно");
                return;
            }
        }
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor.getActor());
    }


    @Override
    public void takeInQueue(iActorBehaviuor actor) {
        this.queue.add(actor.getActor());
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }


    @Override
    public void releaseFromMarket(List<iActorBehaviuor> actors) {
        for(var actor : actors)
        {
            System.out.println(actor.getActor().getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }


    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }


    @Override
    public void giveOrder() {
        for(iActorBehaviuor actor : queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }

    }


    @Override
    public void releaseFromQueue() {
        List<iActorBehaviuor> releaseActors = new ArrayList<>();
        for(iActorBehaviuor actor : queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for(iActorBehaviuor actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

    @Override
    public void returnOrder(iActorBehaviuor actor) {
        if(actor.getActor().isTakeOrder) {
            actor.getActor().setTakeOrder(false);
            actor.getActor().setMakeOrder(false);
            System.out.println(actor.getActor().getName() + " вернул заказ");
        }
    }
}
