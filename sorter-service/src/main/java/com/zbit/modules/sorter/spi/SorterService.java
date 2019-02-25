package com.zbit.modules.sorter.spi;

import java.util.List;

public interface SorterService {

  <T extends Comparable> void sort(List<T> listOfObjects);
}