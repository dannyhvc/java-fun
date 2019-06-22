/*
 * Project Name: makeJson.java
 * Purpose:
 * Coder: Dan, Aiden, ...
 * Date: 5/14/2019 | Time: 9:40 PM
 */
package nn.net_Data;

import nn.net_Handling.NetGeneric;
import org.json.simple.*;
import java.io.*;

public class MakeJSON implements NetGeneric
{

    private NetGeneric cfg;


    @SuppressWarnings("unchecked")
    public MakeJSON(NetGeneric c)
    {
        this.cfg = c;

        //First Employee
        JSONObject j = new JSONObject();
        j.put("firstName", "");
        j.put("lastName", "");
        j.put("website", "");

        JSONObject u = new JSONObject();
        u.put("employee", j);


        //Add employees to list
        JSONArray list = new JSONArray();
        list.add(u);






        //Write JSON file
        try (FileWriter file = new FileWriter("nn.json"))
        {
            file.write(list.toJSONString());
            file.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public NetGeneric getCfg()
    {
        return cfg;
    }
    public void setCfg(NetGeneric cfg)
    {
        this.cfg = cfg;
    }


    @Override
    public void genoType()
    {
        System.out.println("nnnnn");
    }

}//end Main class
