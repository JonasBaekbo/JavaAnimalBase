import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {
   private String direction;

   public AgeComparator(String direction){
       this.direction = direction;
   }
    @Override
    public int compare(Animal o1, Animal o2) {
        int resultat = Integer.compare(o1.getAge(), o2.getAge());
        if (direction.equals("DESC")){
        resultat = resultat * -1;

        }

        return resultat;
    }
}
