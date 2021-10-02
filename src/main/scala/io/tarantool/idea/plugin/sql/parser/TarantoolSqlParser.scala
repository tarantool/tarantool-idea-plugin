package io.tarantool.idea.plugin.sql.parser

import com.intellij.lang.PsiBuilder
import com.intellij.psi.tree.{IElementType, TokenSet}
import com.intellij.sql.dialects.base.SqlParser
import io.tarantool.idea.plugin.sql.TarantoolDialect

class TarantoolSqlParser extends SqlParser(TarantoolDialect.INSTANCE) {
  override def parseExtraRoots(iElementType: IElementType, psiBuilder: PsiBuilder, i: Int): Boolean = ???

  override def getExtendsTokenSets: Array[TokenSet] = ???

  override def parseQueryExpression(psiBuilder: PsiBuilder, i: Int): Boolean = ???

  override def parseSqlStatement(psiBuilder: PsiBuilder, i: Int): Boolean = ???

  override def parseDataType(psiBuilder: PsiBuilder, i: Int, b: Boolean): Boolean = ???

  override def parseValueExpression(psiBuilder: PsiBuilder, i: Int, b: Boolean, b1: Boolean): Boolean = ???

  override def parseEvaluableExpression(psiBuilder: PsiBuilder, i: Int): Boolean = ???

  override def parseForeignKeyRefList(psiBuilder: PsiBuilder, i: Int): Boolean = ???
}
