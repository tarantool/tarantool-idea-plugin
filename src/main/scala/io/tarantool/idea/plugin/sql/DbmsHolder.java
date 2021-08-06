/*
 * Copyright 2021, Tarantool AUTHORS, please see AUTHORS file.
 *
 *  Redistribution and use in source and binary forms, with or
 *  without modification, are permitted provided that the following
 *  conditions are met:
 *
 *  1. Redistributions of source code must retain the above
 *     copyright notice, this list of conditions and the
 *     following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY <COPYRIGHT HOLDER> ``AS IS'' AND
 *  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 *  <COPYRIGHT HOLDER> OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 *  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 *  BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 *  THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 *  SUCH DAMAGE.
 */

package io.tarantool.idea.plugin.sql;

import com.intellij.database.Dbms;
import com.intellij.sql.formatter.settings.SqlCodeStyles;
import com.intellij.util.ConcurrencyUtil;
import icons.TarantoolIcons;
import io.tarantool.idea.plugin.sql.codestyle.TarantoolSqlCodeStyleSettings;

import java.lang.reflect.Field;
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
