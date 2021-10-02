package io.tarantool.idea.plugin.sql.parser

import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.tree.IFileElementType
import com.intellij.sql.dialects.base._
import com.intellij.sql.psi.stubs.SqlFileElementType
import io.tarantool.idea.plugin.sql._

import scala.language.postfixOps

abstract class AbstractTarantoolParserDefinition extends SqlParserDefinitionBase {
  import AbstractTarantoolParserDefinition._

  override def createElementFactory: SqlElementFactory   = new TarantoolElementFactory
  override def createLexer(project: Project): Lexer      = new TarantoolLexer
  override def createParser(project: Project): PsiParser = new TarantoolSqlParser
  override def getFileNodeType: IFileElementType         = fileElementType
}

object AbstractTarantoolParserDefinition {
  private val fileElementType =
    new SqlFileElementType("TARANTOOL_SQL_FILE", TarantoolDialect.INSTANCE)
}
