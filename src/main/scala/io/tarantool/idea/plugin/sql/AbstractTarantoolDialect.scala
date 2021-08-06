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
