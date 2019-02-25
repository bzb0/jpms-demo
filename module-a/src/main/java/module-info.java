module com.zbit.module.a {
  requires java.base;
  requires com.zbit.module.b;
  requires com.zbit.modules.sorter.service;
  requires com.zbit.modules.quick.sorter;
  uses com.zbit.modules.sorter.spi.SorterService;
}