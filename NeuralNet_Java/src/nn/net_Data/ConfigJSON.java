/*
 * Project Name: configJSON.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/24/2019 | Time: 8:40 PM
 */
package nn.net_Data;

import javafx.util.Pair;
import nn.net_Handling.NetGeneric;
import java.util.HashMap;

public class ConfigJSON
{
    private NetGeneric NetN;
    private Pair<Integer, NetGeneric> weightSet;

    public ConfigJSON(NetGeneric nn)
    {
        this.NetN = nn;
    }
    public ConfigJSON(Pair<Integer, NetGeneric> ws)
    {
        this.weightSet = ws;
    }

    public NetGeneric getNetN()
    {
        return NetN;
    }
    public void setNetN(NetGeneric netN)
    {
        NetN = netN;
    }

    public Pair<Integer, NetGeneric> getWeightSet()
    {
        return weightSet;
    }
    public void setWeightSet(Pair<Integer, NetGeneric> weightSet)
    {
        this.weightSet = weightSet;
    }


}//end Main class
