package br.com.home_labs.sort;

import java.util.ArrayList;

// context
public class SortListStrategy {
    
    private ISortListStrategy _strategy;
    
    public SortListStrategy setStrategy(ISortListStrategy sortListStrategy) {
        _strategy = sortListStrategy;
        return this;
    }
    
    public ArrayList<Number> sortNumber(ArrayList<Number> list) {
        return _strategy.sort(list);
    }
        
}
