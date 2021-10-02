package io.tarantool.idea.plugin.sql.parser

import com.intellij.sql.dialects.base.SqlLexer
import io.tarantool.idea.plugin.sql.AbstractTarantoolDialect

class TarantoolLexer extends SqlLexer(AbstractTarantoolDialect.ourClasses, new _TarantoolGenLexer())