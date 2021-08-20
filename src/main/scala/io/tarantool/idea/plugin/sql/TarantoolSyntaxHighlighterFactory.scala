package io.tarantool.idea.plugin.sql

import com.intellij.sql.dialects.base.SqlSyntaxHighlighterFactory.Base

class TarantoolSyntaxHighlighterFactory extends Base(TarantoolDialect.INSTANCE)