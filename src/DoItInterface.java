interface DoItInterface {
    abstract void doOneThing();

    default void doAnotherThing(){
        System.out.println("This is default method: doAnotherThing");
    }
}
