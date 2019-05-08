/*
 * Project Name: Connections.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 5/7/2019 | Time: 3:51 PM
 */
package nn.nn_synthesis;

public class Connections
{
  // fields
  private Double synapse;
  private int connectionIndex;

  Connections(Double val, int cindex)
  {
    this.synapse = val;
    this.connectionIndex = cindex;
  }
  Connections(Double val)
  {
    this.synapse = val;
  }
  Connections(int cindex)
  {
    this.connectionIndex = cindex;
  }
  Connections() {
  }

  //accessors and mutator's
  public Double getSynapse()
  {
    return synapse;
  }
  public void setSynapse(Double synapse)
  {
    this.synapse = synapse;
  }

  public int getConnectionIndex()
  {
    return connectionIndex;
  }
  public void setConnectionIndex(int connectionIndex)
  {
    this.connectionIndex = connectionIndex;
  }

  /**
   * This method is a combinator of both mutator's to set the
   */
  public void setConnection(Double synapse, int connectionIndex)
  {
    setSynapse(synapse);
    setConnectionIndex(connectionIndex);
  }//end setConnection


  /**
   * This helper method appends values as weights, bias's,
   * inputs or outputs to a vector.
   */
  public void appendSynapse(Double s)
  {

  }


}//end Main class
