package io.tarantool.idea.plugin.sql.codestyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.sql.formatter.settings._
import io.tarantool.idea.plugin.sql.Constants.tarantool

class TarantoolSqlCodeStyleSettings(container: CodeStyleSettings) extends SqlCodeStyleSettings(tarantool, container) {
  import SqlCodeStyleConst._

  ALIAS_CASE = TO_LOWER
  KEYWORD_CASE = TO_UPPER
  TYPE_CASE = TO_UPPER
  IDENTIFIER_CASE = TO_LOWER
  QUOTE_IDENTIFIER = QUOTE

}
