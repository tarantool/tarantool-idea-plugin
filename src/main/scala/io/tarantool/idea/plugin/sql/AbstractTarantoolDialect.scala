package io.tarantool.idea.plugin.sql

import com.intellij.database.Dbms
import com.intellij.psi.tree.IElementType
import com.intellij.sql.dialects._
import com.intellij.sql.dialects.sql92.Sql92Dialect.{INSTANCE => sql92}
import io.tarantool.idea.plugin.sql.Constants._

import java.util
import scala.language.postfixOps

abstract class AbstractTarantoolDialect extends SqlLanguageDialectEx(tarantool) {
  override def getTypeSystem: SqlTypeSystemBase                             = TarantoolTypeSystem.INSTANCE
  override def getSupportedFunctions: SqlLanguageDialectEx.BuiltinFunctions = sql92 getSupportedFunctions
  override def getDbms: Dbms                                                = DbmsHolder DBMS
  override def isReservedKeyword(iElementType: IElementType): Boolean       = sql92 isReservedKeyword iElementType
  override def isOperatorSupported(iElementType: IElementType): Boolean     = sql92 isOperatorSupported iElementType
  override def getKeywords: util.Set[String]                                = sql92 getKeywords
  override def getReservedKeywords: util.Set[String]                        = sql92 getReservedKeywords
  override def getSystemVariables: util.Set[String]                         = sql92 getSystemVariables
}
