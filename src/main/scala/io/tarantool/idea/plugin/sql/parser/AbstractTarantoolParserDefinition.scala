package io.tarantool.idea.plugin.sql.parser

import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.tree.IFileElementType
import com.intellij.sql.dialects.base._
import com.intellij.sql.dialects.sql92.Sql92ParserDefinition
import com.intellij.sql.psi.stubs.SqlFileElementType
import io.tarantool.idea.plugin.sql.TarantoolDialect

import scala.language.postfixOps

abstract class AbstractTarantoolParserDefinition extends SqlParserDefinitionBase {
  import AbstractTarantoolParserDefinition._

  private[this] val sql92ParserDefinition = new Sql92ParserDefinition()

  override def createElementFactory: SqlElementFactory   = sql92ParserDefinition getElementFactory
  override def createLexer(project: Project): Lexer      = sql92ParserDefinition createLexer project
  override def createParser(project: Project): PsiParser = sql92ParserDefinition createParser project
  override def getFileNodeType: IFileElementType         = fileElementType

}

object AbstractTarantoolParserDefinition {
  private val fileElementType =
    new SqlFileElementType("TARANTOOL_SQL_FILE", TarantoolDialect.INSTANCE)
}
