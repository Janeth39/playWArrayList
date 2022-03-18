import java.util.ArrayList;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> dogBreeds = new ArrayList<String>();

        dogBreeds.add("Doberman");
        dogBreeds.add("German Shepherd");
        dogBreeds.add("Husky");
        dogBreeds.add("Poodle");
        dogBreeds.add(2, "Pug");//add between other elements

        //removals
        /*
        dogBreeds.remove("Poodle");//don't need to know where it is
        dogBreeds.remove(0);
         */
        //removals looking at output
        System.out.println("Removed: " + dogBreeds.remove("Poodle"));//return true
        System.out.println("Try remove again: " + dogBreeds.remove("Corgi"));//return false
        System.out.println("New removal: " + dogBreeds.remove(dogBreeds.size()-1));
       //System.out.println("Bad removal: " + dogBreeds.remove(10)); throws an exception

        //mutate
        dogBreeds.set(1, "Chihuahua");//need location and new value

        ListIterator dogIterator = dogBreeds.listIterator();
        while(dogIterator.hasNext())
        {
            System.out.println(dogIterator.next());
        }
        System.out.println("");
        for(String s:dogBreeds )
        {
            System.out.println(s);
        }
    }//end of main method
}
