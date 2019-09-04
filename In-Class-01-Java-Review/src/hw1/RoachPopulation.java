package hw1;

public class RoachPopulation
{

        private int population;
        
        public RoachPopulation(int r)
        {
            population =r;
        }
        public void breed()
        {
            population *= 2;
        }
        
       public void spray()
       {
           population -= (int)(population *0.10);
       }
       public int getRoaches()
       {
           return population;
       }
}
