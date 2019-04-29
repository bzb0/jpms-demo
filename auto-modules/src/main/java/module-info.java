module com.zbit.module.auto {
  requires commons.math3;
  /* The inclusion of the following line will fail, since there will be a split-package problem */
  // requires evil.math;
}