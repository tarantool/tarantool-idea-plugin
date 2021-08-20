package io.tarantool.idea.plugin.sql

import com.intellij.database.Dbms
import com.intellij.database.dialects.base.BaseDmlHelper

class TarantoolDmlGenerator(dbms: Dbms) extends BaseDmlHelper(dbms)
