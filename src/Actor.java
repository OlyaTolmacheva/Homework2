public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public abstract String getName();

    public Actor(java.lang.String name) {
        this.name = name;
    }
}
