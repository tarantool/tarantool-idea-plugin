package io.tarantool.idea.plugin.sql

import com.intellij.database.Dbms
import com.intellij.database.util.Version
import com.intellij.psi.tree.IElementType
import com.intellij.sql.dialects._
import com.intellij.sql.dialects.base._
import com.intellij.sql.dialects.functions.SqlFunctionsUtil
import com.intellij.sql.psi.SqlCommonKeywords._
import com.intellij.sql.psi.SqlCommonTokens._
import com.intellij.sql.psi._
import com.intellij.sql.util.SqlTokenRegistry._
import io.tarantool.idea.plugin.sql.Constants._

import java.util
import scala.language.postfixOps

abstract class AbstractTarantoolDialect extends SqlLanguageDialectEx(tarantool) {
  import AbstractTarantoolDialect._

  override def getTypeSystem: SqlTypeSystemBase =
    TarantoolTypeSystem.INSTANCE

  override def getSupportedFunctions: SqlLanguageDialectEx.BuiltinFunctions =
    ourFunctionMap

  override def getDbms: Dbms =
    DbmsHolder.DBMS

  override def isReservedKeyword(iElementType: IElementType): Boolean =
    iElementType.isInstanceOf[SqlKeywordTokenType] && ourReservedTokens.fun(iElementType.toString) != null;

  override def isOperatorSupported(iElementType: IElementType): Boolean =
    iElementType != null && ourSupportedOperators.contains(iElementType)

  override def getKeywords: util.Set[String] =
    ourKeywords

  override def getReservedKeywords: util.Set[String] =
    ourReservedKeywords

  override def getSystemVariables: util.Set[String] =
    util.Collections.emptySet

  override def supportsJoinUsing =
    true

  override def supportsNaturalJoin =
    true

  override def getMaxIdentifierLength(identifier: SqlIdentifier, version: Version): Int =
    128
}

object AbstractTarantoolDialect {

  val ourClasses     = new TokenClasses(classOf[TarantoolToken])
  val ourFunctionMap = SqlFunctionsUtil.loadFunctionDefinition(TarantoolDialect.INSTANCE)

  SqlLexer.initTokens(ourFunctionMap, ourClasses)

  val ourReservedTokens   = getTokenProvider(ourClasses.reserved)
  val ourKeywords         = getTokens(ourClasses.all)
  val ourReservedKeywords = getTokens(ourClasses.reserved)

  val ourSupportedOperators: Set[IElementType] = Set(
    SQL_OP_PLUS,
    SQL_OP_MINUS,
    SQL_OP_MUL,
    SQL_OP_DIV,
    SQL_OP_NEQ,
    SQL_OP_LE,
    SQL_OP_LT,
    SQL_OP_GE,
    SQL_OP_EQ,
    SQL_OP_GT,
    SQL_OP_CONCAT,
    SQL_AND,
    SQL_NOT,
    SQL_OR,
    SQL_IS,
    SQL_LIKE,
    SQL_COLLATE,
    SQL_IN
  )
}
