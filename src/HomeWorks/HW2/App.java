package HomeWorks.HW2;

import HomeWorks.HW2.Classes.*;
import HomeWorks.HW2.Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) {
        Market market = new Market();

        iActorBehaviuor client1 = new OrdinaryClient("Bob");
        iActorBehaviuor client2 = new SpecialClient("Mike", 1001);
        iActorBehaviuor client3 = new PensionerClient("Eva", 7);
        iActorBehaviuor promoClient1 = new PromoClient("Promo client1");
        iActorBehaviuor promoClient2 = new PromoClient("Promo client2");
        iActorBehaviuor promoClient3 = new PromoClient("Promo client3");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(promoClient1);
        market.acceptToMarket(promoClient2);
        market.acceptToMarket(promoClient3);

        PromoClient.setPromoTitle("Promo1");



        market.update();

        market.returnOrder(client1);
    }
}
