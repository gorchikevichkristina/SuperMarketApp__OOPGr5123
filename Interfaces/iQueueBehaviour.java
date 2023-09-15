package SeminarsOOP.SuperMarketApp.Interfaces;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Интерфей для описания поведения посетителя в магазине
 */
public interface iQueueBehaviour {
    /**
     * @apiNote Метод регистрации посетителя в очереди
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * @apiNote Метод регистрации посетителя при выходе из очереди
     */
    void releaseFromQueue();

    /**
     * @apiNote Метод оформления заказа посетителем
     */
    void takeOrder();

    /**
     * @apiNote Метод получения заказа посетителем
     */
    void giveOrder();
}
