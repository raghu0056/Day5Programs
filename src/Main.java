public class Main {
    public static void main(String[] args)
    {
        int loopCount = 0;
        double result;
        double heads = 0;
        if (Math.random() < 0.5){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
        while(loopCount <= 100)
        {
            result = Math.random();
            if(result <= 0.5)
                heads++;
            loopCount ++;

        }
        double percentHeads = heads/100*100;
        double percentTails = (100-heads)/100*100;
        System.out.println("Percentage of heads is: " +percentHeads);
        System.out.println("Percentage of tails is: " +percentTails);
    }
}