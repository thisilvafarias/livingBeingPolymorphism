public class Main {

    public static void main(String[] arg){

        //testing cast
        Dog dog = new Dog();
        Dog dogLabrador = new Labrador();
        Dog dogChocolateLabrador = new ChocolateLabrador();
      //  (ChocolateLabrador)dogLabrador).characteristics(); // Throws ClassCastException at runtime. Labrador cannot be cast to ChocolateLabrador
        ((Labrador)dogLabrador).body(); // If casting not done throws compile time exception.
        ((ChocolateLabrador)dogChocolateLabrador).characteristics();
        ((Labrador)dogChocolateLabrador).body();
        ((ChocolateLabrador) dogChocolateLabrador).characteristics();

        LivingBeing p1 = new Human(32,"Thiago");
        System.out.println(((Human) p1).name);

        LivingBeing p2 = new Human();
        ((Human)p2).setName("Leon");
        System.out.println(((Human) p2).name);
    }
}
