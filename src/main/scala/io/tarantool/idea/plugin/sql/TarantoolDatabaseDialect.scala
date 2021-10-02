package io.tarantool.idea.plugin.sql

import com.intellij.database.Dbms
import com.intellij.database.dialects.DatabaseDialect
import com.intellij.database.dialects.base.AbstractDatabaseDialect
import com.intellij.database.model._
import com.intellij.database.util._
import com.intellij.openapi.util.Pair

class TarantoolDatabaseDialect extends AbstractDatabaseDialect(TarantoolTypeHelper) {

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

  override def getDbms: Dbms = DbmsHolder.DBMS

  override def getDisplayName: String = Constants.tarantool

  override def supportsEmptyTables(): Boolean = false

  override def supportsViewDefinition(): Boolean = false

  override def supportsProcedureDefinition(): Boolean = false

  override def supportsCommonTableExpression(): Boolean = false

  override def similarTo(dialect: DatabaseDialect): Boolean = dialect.isInstanceOf[TarantoolDatabaseDialect]

  override def sqlViewDefinition(dasObject: DasObject): Pair[String, DbImplUtilCore.ConcatenationProps] = ???

  override def sqlProcedureDefinition(dasRoutine: DasRoutine): Pair[String, DbImplUtilCore.ConcatenationProps] = ???

  override def sqlDropSequence(ddlBuilder: DdlBuilder, dasObject: DasObject, b: Boolean): DdlBuilder = ???
}
