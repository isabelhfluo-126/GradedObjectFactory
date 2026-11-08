public class Candies {
    //instance variables
    public boolean hasFilling;
    public boolean isHard;
    public String flavor;
    public String Color;
    public int numberOfCandies;

    public Candies(boolean phasFilling, boolean pisHard, String pflavor, String pColor){
        //incorporate math.random
        //the variables
        hasFilling=phasFilling;
        isHard=pisHard;
        flavor=pflavor;
        Color=pColor;
        numberOfCandies= (int)(Math.random()*100)+1;
    }//end of candy constructor

    //method that changes number of candies
    public void addCandies(){
        numberOfCandies++;
    }
    //method that changes flavor
    public void changeFlavor(String newFlavor){
        flavor= newFlavor;
    }

    //method that removes candies
    public void removeCandies(){
        if(numberOfCandies > 0){
            numberOfCandies--;
        }
    }

    public void printInfo1(){
      //sout it
      System.out.println("----------------------------------------------");
      System.out.println("Candy Order");
      System.out.println("it is " +hasFilling +" that the candies have filling");
      System.out.println("it is " +isHard+ " that the candies are hard");
      System.out.println("the flavor of the candies are "+flavor);
      System.out.println("the color of the candies are " +Color);
      System.out.println("there are "+numberOfCandies+ " candies");
    }//end of print info1

    public void printInfo2(){
        //sout it
        System.out.println("oh boy! sorry I think I gave you one more candy you actually have "+numberOfCandies+ " candies");
        System.out.println("----------------------------------------------");
    }//end of print info1

}
