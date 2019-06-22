/*
 * Project Name: Net_Run.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/15/2019 | Time: 1:46 AM
 */
package nn;

import nn.net_Data.ConfigJSON;
import nn.net_Data.MakeJSON;
import nn.net_Data.TrainSet;
import nn.net_Handling.NetGeneric;
import nn.net_NeuralNetworks.FeedForward;
import java.util.Arrays;

public class Net_Run
{
    public static void main(String[] args) throws Exception
    {
        FeedForward net = new FeedForward(4,16,16,2);

        TrainSet set = new TrainSet(4, 2);
        set.addData(new double[] {0.1,0.2,0.3,0.4}, new double[] {0.9,0.1});
        set.addData(new double[] {0.9,0.8,0.7,0.6}, new double[] {0.1,0.9});
        set.addData(new double[] {0.3,0.8,0.1,0.4}, new double[] {0.3,0.7});
        set.addData(new double[] {0.9,0.8,0.1,0.2}, new double[] {0.7,0.3});

        //the more batches the better the training but its also slower.
        net.train(set, 100_000, 4, .2);

        for (int i = 0; i < 4; i++)
            System.out.println( Arrays.toString( net.think(set.getInput(i)) ) );

        NetGeneric f = new FeedForward();
        new MakeJSON(f);

    }//end main()


}//end Main class
