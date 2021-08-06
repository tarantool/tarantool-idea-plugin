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
import com.intellij.database.dialects.DatabaseDialect
import com.intellij.database.dialects.base.AbstractDatabaseDialect
import com.intellij.database.model._
import com.intellij.database.util._
import com.intellij.openapi.util.Pair

class TarantoolDatabaseDialect(private val _dbms: Dbms) extends AbstractDatabaseDialect(TarantoolTypeHelper) {

  override def qualifiedIdentifier(
    ddlBuilder: DdlBuilder,
    s: String,
    dasObject: DasObject,
    dasObject1: DasObject
  ): DdlBuilder = {
    val schema  = DasUtil.getSchemaObject(dasObject1)
    val dasName = DasUtil.getName(schema)
    ddlBuilder.qualifiedRef(dasObject, s, schema, dasName, null, null, null, null)
  }

  override def getDbms: Dbms = _dbms

  override def getDisplayName: String = "Tarantool SQL"

  override def supportsEmptyTables(): Boolean = false

  override def supportsViewDefinition(): Boolean = false

  override def supportsProcedureDefinition(): Boolean = false

  override def supportsCommonTableExpression(): Boolean = false

  override def similarTo(dialect: DatabaseDialect): Boolean = dialect.isInstanceOf[TarantoolDatabaseDialect]

  override def sqlViewDefinition(dasObject: DasObject): Pair[String, DbImplUtilCore.ConcatenationProps] = ???

  override def sqlProcedureDefinition(dasRoutine: DasRoutine): Pair[String, DbImplUtilCore.ConcatenationProps] = ???

  override def sqlDropSequence(ddlBuilder: DdlBuilder, dasObject: DasObject, b: Boolean): DdlBuilder = ???
}
