module com.zbit.modules.quick.sorter {
  requires com.zbit.modules.sorter.service;
  provides com.zbit.modules.sorter.spi.SorterService with com.zbit.modules.quicksort.QuickSorter;
}