package io.tarantool.idea.plugin.sql;

import com.intellij.database.Dbms;
import icons.TarantoolIcons;

import javax.swing.*;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;

import static io.tarantool.idea.plugin.sql.Constants.dbmsTarantool;
import static io.tarantool.idea.plugin.sql.Constants.tarantool;

public final class DbmsHolder {

    public static final Dbms DBMS;

    static {
        //TODO: Remove this backward compatibility trick after Intellij 2021.3 Release
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        try {
            Dbms dbms;
            try {
                final var types = MethodType.methodType(Dbms.class, String.class, String.class, Icon.class);
                final var mh = lookup.findStatic(Dbms.class, "create", types);
                dbms = (Dbms) mh.invokeExact(dbmsTarantool(), tarantool(), TarantoolIcons.Tarantool13);
            } catch (final NoSuchMethodException e) {
                final Supplier<Icon> createIcon = () -> TarantoolIcons.Tarantool13;
                final var types = MethodType.methodType(Dbms.class, String.class, String.class, Supplier.class);
                final var mh = lookup.findStatic(Dbms.class, "create", types);
                dbms = (Dbms) mh.invokeExact(dbmsTarantool(), tarantool(), createIcon);
            }
            DBMS = dbms;
        } catch (final Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private DbmsHolder() {
        throw new AssertionError("Suppress default constructor for noninstantiability");
    }
}
