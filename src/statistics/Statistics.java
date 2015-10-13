package statistics;

import model.structs.LinkedLst;
import model.structs.Node;

/**
 *
 * @author Lexynux
 */
public class Statistics {

    LinkedLst<Float> valuesList;
    
    public Statistics(LinkedLst values) {
        this.valuesList = values;
    }
    
    public float calculateMean() {
        float res = 0;
        int conta = 0;
        
        for (Node aux = valuesList.getHead(); aux != null; aux = aux.getNextElement(), conta++) {
            // Print the value on the node
            //System.out.println("{" + aux.getObject().toString() + "}");
            res += Float.parseFloat(aux.getObject().toString());
        }
        
        res = res / conta;
        
        return res;
    }
    
    public double calculateStdDeviation() {
        double res = 0, average = calculateMean();
        int conta = 0;
        
        for (Node aux = valuesList.getHead(); aux != null; aux = aux.getNextElement(), conta++) {
            // Print the value on the node
            //System.out.println("{" + aux.getObject().toString() + "}");
            res = res + Math.pow((Float.parseFloat(aux.getObject().toString()) - average),2);
        }
        
        res = res / (conta - 1);
        res = Math.sqrt(res);
        
        return res;
    }
}
