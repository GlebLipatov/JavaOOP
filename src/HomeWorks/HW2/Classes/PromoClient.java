package HomeWorks.HW2.Classes;

public class PromoClient extends Actor{
    private static String promoTitle;
    private int idPromo;
    private static int IDPROMO;

    static {
        IDPROMO = 2;
    }

    /**
     *
     * @param name client name
     */
    public PromoClient(String name) {
        super(name);
        if (IDPROMO > 0) {
            this.idPromo = IDPROMO--;
        } else {
            this.idPromo = -1;
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public PromoClient getActor() {
        return this;
    }

    /**
     * Return client promo id
     * @return promo id
     */
    public int getIdPromo(){
        return idPromo;
    }

    /**
     * Enter promotional title
     * @param title promotional title
     */
    public static void setPromoTitle(String title) {
        promoTitle = title;
    }
}
