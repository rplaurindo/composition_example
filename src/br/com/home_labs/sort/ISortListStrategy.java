// a package declaration must be before all lines
package br.com.home_labs.sort;

import java.util.ArrayList;

// abstract Strategy
public interface ISortListStrategy {
    // overloading of methods with same name (on runtime), only is possible if the arguments are differents
    ArrayList<Number> sort(ArrayList<Number> list);
}
