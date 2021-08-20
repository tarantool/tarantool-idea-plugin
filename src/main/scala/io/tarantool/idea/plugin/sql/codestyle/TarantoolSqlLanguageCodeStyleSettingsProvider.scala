package io.tarantool.idea.plugin.sql.codestyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.sql.formatter.settings.SqlLanguageCodeStyleSettingsProviderBase
import io.tarantool.idea.plugin.sql.TarantoolDialect

class TarantoolSqlLanguageCodeStyleSettingsProvider
    extends SqlLanguageCodeStyleSettingsProviderBase(TarantoolDialect.INSTANCE, classOf[TarantoolSqlCodeStyleSettings]) {

  override def createCustomSettings(settingsContainer: CodeStyleSettings) =
    new TarantoolSqlCodeStyleSettings(settingsContainer)
}
