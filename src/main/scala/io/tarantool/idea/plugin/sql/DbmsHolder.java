package io.tarantool.idea.plugin.sql;

import com.intellij.database.Dbms;
import icons.TarantoolIcons;
import static io.tarantool.idea.plugin.sql.Constants.*;

public final class DbmsHolder {
    public static final Dbms DBMS = Dbms.create(dbmsTarantool(), tarantool(), TarantoolIcons.Tarantool13);
}
