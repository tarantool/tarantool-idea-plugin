package io.tarantool.idea.plugin.sql

import com.intellij.sql.dialects.SqlTypeSystemBase

abstract class AbstractTarantoolTypeSystem extends SqlTypeSystemBase(TarantoolDialect.INSTANCE)
