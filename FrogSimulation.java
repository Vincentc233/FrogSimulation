public class FrogSimulation
{
private int goalDistance;
private int maxHops;


public FrogSimulation(int dist, int numHops)
{
    goalDistance = dist;
    maxHops = numHops;
}

private int hopDistance()
{ 
    int random = ((int)(Math.random() * 61) - 30);
    return random;
}


public boolean simulate()
{
    int distance = 0; 
    for(int i =0; i<maxHops; i++){
        distance += hopDistance(); 
        if(distance >= goalDistance) {
            System.out.println("Distance:"+ distance);
            return true;
        }
        if(distance < 0) {
            System.out.println("Distance:"+ distance);
            return false;
        }
    }
    System.out.println("Distance:"+ distance);
    return false;
}


public double runSimulations(int num)
{ 
    int count  =0;
    double calculate;
    for(int i =0; i<num; i++){
        if(simulate()) count++;
    }
    System.out.println(count);
    calculate = (double) count/num;
    return calculate;
}
}
