package io.tarantool.idea.plugin.sql;

import com.intellij.psi.tree.IElementType;
import com.intellij.sql.dialects.base.SqlElementFactory;
import com.intellij.sql.psi.SqlTokenType;
import com.intellij.sql.util.SqlTokenRegistry;

public class TarantoolElementFactory extends SqlElementFactory {

    static {
        SqlTokenRegistry.ensureInterfacesAreInitializedInOrder(TarantoolElementFactory.class);
    }

    public static SqlTokenType token(final String name) {
        return SqlTokenRegistry.getType(name);
    }

    public static IElementType composite(final String name) {
        return SqlElementFactory.getCompositeType(name, "TARANTOOL_");
    }

}
