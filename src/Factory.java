public class Factory {
    public String owner = "Isabel";
    public boolean isOpen = true;
    public int yearFounded = 2026;
    public Candies candiesorder1;
    public Candies candiesorder2;
    public Candies candiesorder3;


    public static void main(String[] args) {
        Factory a = new Factory();
    }

    public Factory(){
        //background info
        System.out.println("Welcome to Isabel's factory");
        System.out.println("the factory was founded in " + yearFounded);
        System.out.println("it is " + isOpen + " that the factory is open");
        //create the objects first
        candiesorder1 = new Candies(true, true,"bland", "pink");
        candiesorder2 = new Candies(true, false,"bland", "white");
        candiesorder3 = new Candies(false, true,"bland", "brown");
        //first candy object
        candiesorder1.addCandies();
        candiesorder1.changeFlavor("strawberry");
        candiesorder1.printInfo1();
        candiesorder1.removeCandies();
        candiesorder1.printInfo2();

        //second candy object
        candiesorder2.addCandies();
        candiesorder2.changeFlavor("vanilla");
        candiesorder2.printInfo1();
        candiesorder2.removeCandies();
        candiesorder2.printInfo2();

        //third candy object
        candiesorder3.addCandies();
        candiesorder3.changeFlavor("chocolate");
        candiesorder3.printInfo1();
        candiesorder3.removeCandies();
        candiesorder3.printInfo2();
    }



}
