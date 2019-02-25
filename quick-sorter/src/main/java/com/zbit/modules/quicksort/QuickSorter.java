package com.zbit.modules.quicksort;

import com.zbit.modules.sorter.spi.SorterService;
import java.util.Collections;
import java.util.List;

public class QuickSorter implements SorterService {

  @Override
  public <T extends Comparable> void sort(List<T> listOfObjects) {
    Collections.sort(listOfObjects);
  }
}
