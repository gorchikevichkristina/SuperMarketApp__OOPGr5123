package SeminarsOOP.SuperMarketApp.Classes;

import SeminarsOOP.SuperMarketApp.Interfaces.iActorBehaviour;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Класс для представления посетителя-инспектора
 */
public class TaxInspector implements iActorBehaviour {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;


    public TaxInspector() {
        this.name = "Tax audit";
    }

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
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
