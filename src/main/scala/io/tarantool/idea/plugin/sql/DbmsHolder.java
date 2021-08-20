package io.tarantool.idea.plugin.sql;

import com.intellij.database.Dbms;
import com.intellij.util.ConcurrencyUtil;
import icons.TarantoolIcons;

import java.util.concurrent.ConcurrentMap;

@SuppressWarnings("unchecked")
public final class DbmsHolder {

    public static final Dbms DBMS;

    static {
        try {
            DBMS = Dbms.create(Constants.tarantool(), TarantoolIcons.Tarantool13);
            final var ourValuesField = Dbms.class.getDeclaredField("ourValues");
            ourValuesField.setAccessible(true);
            final var ourValues = (ConcurrentMap<String, Dbms>) ourValuesField.get(null);
            ConcurrencyUtil.cacheOrGet(ourValues, Constants.dbmsTarantool(), DBMS);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    private DbmsHolder() {
        throw new AssertionError();
    }
}
