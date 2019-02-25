module com.zbit.module.b {
    exports com.zbit.strings.util;
    requires java.base;

    /* This is an automatic module, derived by Java. */
    /* The referenced JAR file has to have a named that will be derived to 'commons.lang3'. */
    requires /* transitive */ commons.lang3;

    /* Opening a package for usage at runtime. */
    opens com.zbit.reflective;
}