package br.com.home_labs.sort;

import java.util.ArrayList;

// an way to sort
// concrete strategy
public class Selection implements ISortListStrategy {

    public ArrayList<Number> sort(ArrayList<Number> list) {
        ArrayList<Number> cpList = new ArrayList<Number>(list);
        
        // fully qualified name
        java.lang.Number smallestItem;
        int smallestIndex;
        
        for (int i = 0; i < cpList.size() - 1; i++) {
            smallestItem = cpList.get(i);
            
            smallestIndex = i;
            
            for (int j = i + 1; j < cpList.size(); j++) {
                // BigDecimal Object is used only for make accounts and maintain a defined precision
                if (cpList.get(j).doubleValue() < smallestItem.doubleValue()) {
                    smallestItem = cpList.get(j);
                    smallestIndex = j;
                }
            }
            
            cpList.set(smallestIndex, cpList.get(i));
            cpList.set(i, smallestItem);
        }
        
        return cpList;
    }

}
