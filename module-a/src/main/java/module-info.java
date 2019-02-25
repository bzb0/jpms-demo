module com.zbit.module.a {
  requires java.base;
  requires com.zbit.module.b;
  requires com.zbit.modules.sorter.service;
  requires com.zbit.modules.quick.sorter;

  /* Using the service provider. */
  uses com.zbit.modules.sorter.spi.SorterService;

  /* Using the commons-math3 package. */
  requires commons.math3;
}