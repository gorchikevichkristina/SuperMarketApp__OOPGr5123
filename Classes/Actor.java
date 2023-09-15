package SeminarsOOP.SuperMarketApp.Classes;

import SeminarsOOP.SuperMarketApp.Interfaces.iActorBehaviour;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Родительский класс для представления посетителя магазина
 */
public abstract class Actor implements iActorBehaviour {

    /**
     * @apiNote Имя посетителя
     */
    protected String name;

    /**
     * @apiNote признак получения заказа
     */
    protected boolean isTakeOrder;

    /**
     * @apiNote признак оформления заказа
     */
    protected boolean isMakeOrder;

    public Actor(String name) {

        this.name = name;
    }

    abstract public void setName(String name);

    abstract public String getName();

}
