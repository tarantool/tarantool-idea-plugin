/*
 * Copyright 2021, Tarantool AUTHORS, please see AUTHORS file.
 *
 *  Redistribution and use in source and binary forms, with or
 *  without modification, are permitted provided that the following
 *  conditions are met:
 *
 *  1. Redistributions of source code must retain the above
 *     copyright notice, this list of conditions and the
 *     following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY <COPYRIGHT HOLDER> ``AS IS'' AND
 *  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 *  <COPYRIGHT HOLDER> OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 *  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 *  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 *  BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 *  THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 *  SUCH DAMAGE.
 */

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
