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

import com.intellij.sql.psi.SqlTokenType
import TarantoolElementFactory._

trait TarantoolReservedKeywords {
  val SQL_ALL: SqlTokenType               = token("ALL")
  val SQL_ALTER: SqlTokenType             = token("ALTER")
  val SQL_ANALYZE: SqlTokenType           = token("ANALYZE")
  val SQL_AND: SqlTokenType               = token("AND")
  val SQL_ANY: SqlTokenType               = token("ANY")
  val SQL_AS: SqlTokenType                = token("AS")
  val SQL_ASC: SqlTokenType               = token("ASC")
  val SQL_ASENSITIVE: SqlTokenType        = token("ASENSITIVE")
  val SQL_AUTOINCREMENT: SqlTokenType     = token("AUTOINCREMENT")
  val SQL_BEGIN: SqlTokenType             = token("BEGIN")
  val SQL_BETWEEN: SqlTokenType           = token("BETWEEN")
  val SQL_BINARY: SqlTokenType            = token("BINARY")
  val SQL_BLOB: SqlTokenType              = token("BLOB")
  val SQL_BOOL: SqlTokenType              = token("BOOL")
  val SQL_BOOLEAN: SqlTokenType           = token("BOOLEAN")
  val SQL_BOTH: SqlTokenType              = token("BOTH")
  val SQL_BY: SqlTokenType                = token("BY")
  val SQL_CALL: SqlTokenType              = token("CALL")
  val SQL_CASE: SqlTokenType              = token("CASE")
  val SQL_CAST: SqlTokenType              = token("CAST")
  val SQL_CHAR: SqlTokenType              = token("CHAR")
  val SQL_CHARACTER: SqlTokenType         = token("CHARACTER")
  val SQL_CHECK: SqlTokenType             = token("CHECK")
  val SQL_COLLATE: SqlTokenType           = token("COLLATE")
  val SQL_COLUMN: SqlTokenType            = token("COLUMN")
  val SQL_COMMIT: SqlTokenType            = token("COMMIT")
  val SQL_CONDITION: SqlTokenType         = token("CONDITION")
  val SQL_CONNECT: SqlTokenType           = token("CONNECT")
  val SQL_CONSTRAINT: SqlTokenType        = token("CONSTRAINT")
  val SQL_CREATE: SqlTokenType            = token("CREATE")
  val SQL_CROSS: SqlTokenType             = token("CROSS")
  val SQL_CURRENT: SqlTokenType           = token("CURRENT")
  val SQL_CURRENT_DATE: SqlTokenType      = token("CURRENT_DATE")
  val SQL_CURRENT_TIME: SqlTokenType      = token("CURRENT_TIME")
  val SQL_CURRENT_TIMESTAMP: SqlTokenType = token("CURRENT_TIMESTAMP")
  val SQL_CURRENT_USER: SqlTokenType      = token("CURRENT_USER")
  val SQL_CURSOR: SqlTokenType            = token("CURSOR")
  val SQL_DATE: SqlTokenType              = token("DATE")
  val SQL_DATETIME: SqlTokenType          = token("DATETIME")
  val SQL_DEC: SqlTokenType               = token("DEC")
  val SQL_DECIMAL: SqlTokenType           = token("DECIMAL")
  val SQL_DECLARE: SqlTokenType           = token("DECLARE")
  val SQL_DEFAULT: SqlTokenType           = token("DEFAULT")
  val SQL_DEFERRABLE: SqlTokenType        = token("DEFERRABLE")
  val SQL_DELETE: SqlTokenType            = token("DELETE")
  val SQL_DENSE_RANK: SqlTokenType        = token("DENSE_RANK")
  val SQL_DESC: SqlTokenType              = token("DESC")
  val SQL_DESCRIBE: SqlTokenType          = token("DESCRIBE")
  val SQL_DETERMINISTIC: SqlTokenType     = token("DETERMINISTIC")
  val SQL_DISTINCT: SqlTokenType          = token("DISTINCT")
  val SQL_DOUBLE: SqlTokenType            = token("DOUBLE")
  val SQL_DROP: SqlTokenType              = token("DROP")
  val SQL_EACH: SqlTokenType              = token("EACH")
  val SQL_ELSE: SqlTokenType              = token("ELSE")
  val SQL_ELSEIF: SqlTokenType            = token("ELSEIF")
  val SQL_END: SqlTokenType               = token("END")
  val SQL_ESCAPE: SqlTokenType            = token("ESCAPE")
  val SQL_EXCEPT: SqlTokenType            = token("EXCEPT")
  val SQL_EXISTS: SqlTokenType            = token("EXISTS")
  val SQL_EXPLAIN: SqlTokenType           = token("EXPLAIN")
  val SQL_FALSE: SqlTokenType             = token("FALSE")
  val SQL_FETCH: SqlTokenType             = token("FETCH")
  val SQL_FLOAT: SqlTokenType             = token("FLOAT")
  val SQL_FOR: SqlTokenType               = token("FOR")
  val SQL_FOREIGN: SqlTokenType           = token("FOREIGN")
  val SQL_FROM: SqlTokenType              = token("FROM")
  val SQL_FULL: SqlTokenType              = token("FULL")
  val SQL_FUNCTION: SqlTokenType          = token("FUNCTION")
  val SQL_GET: SqlTokenType               = token("GET")
  val SQL_GRANT: SqlTokenType             = token("GRANT")
  val SQL_GROUP: SqlTokenType             = token("GROUP")
  val SQL_HAVING: SqlTokenType            = token("HAVING")
  val SQL_IF: SqlTokenType                = token("IF")
  val SQL_IMMEDIATE: SqlTokenType         = token("IMMEDIATE")
  val SQL_IN: SqlTokenType                = token("IN")
  val SQL_INDEX: SqlTokenType             = token("INDEX")
  val SQL_INNER: SqlTokenType             = token("INNER")
  val SQL_INOUT: SqlTokenType             = token("INOUT")
  val SQL_INSENSITIVE: SqlTokenType       = token("INSENSITIVE")
  val SQL_INSERT: SqlTokenType            = token("INSERT")
  val SQL_INT: SqlTokenType               = token("INT")
  val SQL_INTEGER: SqlTokenType           = token("INTEGER")
  val SQL_INTERSECT: SqlTokenType         = token("INTERSECT")
  val SQL_INTO: SqlTokenType              = token("INTO")
  val SQL_IS: SqlTokenType                = token("IS")
  val SQL_ITERATE: SqlTokenType           = token("ITERATE")
  val SQL_JOIN: SqlTokenType              = token("JOIN")
  val SQL_LEADING: SqlTokenType           = token("LEADING")
  val SQL_LEAVE: SqlTokenType             = token("LEAVE")
  val SQL_LEFT: SqlTokenType              = token("LEFT")
  val SQL_LIKE: SqlTokenType              = token("LIKE")
  val SQL_LIMIT: SqlTokenType             = token("LIMIT")
  val SQL_LOCALTIME: SqlTokenType         = token("LOCALTIME")
  val SQL_LOCALTIMESTAMP: SqlTokenType    = token("LOCALTIMESTAMP")
  val SQL_LOOP: SqlTokenType              = token("LOOP")
  val SQL_MATCH: SqlTokenType             = token("MATCH")
  val SQL_NATURAL: SqlTokenType           = token("NATURAL")
  val SQL_NOT: SqlTokenType               = token("NOT")
  val SQL_NULL: SqlTokenType              = token("NULL")
  val SQL_NUM: SqlTokenType               = token("NUM")
  val SQL_NUMBER: SqlTokenType            = token("NUMBER")
  val SQL_NUMERIC: SqlTokenType           = token("NUMERIC")
  val SQL_OF: SqlTokenType                = token("OF")
  val SQL_ON: SqlTokenType                = token("ON")
  val SQL_OR: SqlTokenType                = token("OR")
  val SQL_ORDER: SqlTokenType             = token("ORDER")
  val SQL_OUT: SqlTokenType               = token("OUT")
  val SQL_OUTER: SqlTokenType             = token("OUTER")
  val SQL_OVER: SqlTokenType              = token("OVER")
  val SQL_PARTIAL: SqlTokenType           = token("PARTIAL")
  val SQL_PARTITION: SqlTokenType         = token("PARTITION")
  val SQL_PRAGMA: SqlTokenType            = token("PRAGMA")
  val SQL_PRECISION: SqlTokenType         = token("PRECISION")
  val SQL_PRIMARY: SqlTokenType           = token("PRIMARY")
  val SQL_PROCEDURE: SqlTokenType         = token("PROCEDURE")
  val SQL_RANGE: SqlTokenType             = token("RANGE")
  val SQL_RANK: SqlTokenType              = token("RANK")
  val SQL_READS: SqlTokenType             = token("READS")
  val SQL_REAL: SqlTokenType              = token("REAL")
  val SQL_RECURSIVE: SqlTokenType         = token("RECURSIVE")
  val SQL_REFERENCES: SqlTokenType        = token("REFERENCES")
  val SQL_REGEXP: SqlTokenType            = token("REGEXP")
  val SQL_RELEASE: SqlTokenType           = token("RELEASE")
  val SQL_RENAME: SqlTokenType            = token("RENAME")
  val SQL_REPEAT: SqlTokenType            = token("REPEAT")
  val SQL_REPLACE: SqlTokenType           = token("REPLACE")
  val SQL_RESIGNAL: SqlTokenType          = token("RESIGNAL")
  val SQL_RETURN: SqlTokenType            = token("RETURN")
  val SQL_REVOKE: SqlTokenType            = token("REVOKE")
  val SQL_RIGHT: SqlTokenType             = token("RIGHT")
  val SQL_ROLLBACK: SqlTokenType          = token("ROLLBACK")
  val SQL_ROW: SqlTokenType               = token("ROW")
  val SQL_ROWS: SqlTokenType              = token("ROWS")
  val SQL_ROW_NUMBER: SqlTokenType        = token("ROW_NUMBER")
  val SQL_SAVEPOINT: SqlTokenType         = token("SAVEPOINT")
  val SQL_SCALAR: SqlTokenType            = token("SCALAR")
  val SQL_SELECT: SqlTokenType            = token("SELECT")
  val SQL_SENSITIVE: SqlTokenType         = token("SENSITIVE")
  val SQL_SESSION: SqlTokenType           = token("SESSION")
  val SQL_SET: SqlTokenType               = token("SET")
  val SQL_SIGNAL: SqlTokenType            = token("SIGNAL")
  val SQL_SIMPLE: SqlTokenType            = token("SIMPLE")
  val SQL_SMALLINT: SqlTokenType          = token("SMALLINT")
  val SQL_SPECIFIC: SqlTokenType          = token("SPECIFIC")
  val SQL_SQL: SqlTokenType               = token("SQL")
  val SQL_START: SqlTokenType             = token("START")
  val SQL_STRING: SqlTokenType            = token("STRING")
  val SQL_SYSTEM: SqlTokenType            = token("SYSTEM")
  val SQL_TABLE: SqlTokenType             = token("TABLE")
  val SQL_TEXT: SqlTokenType              = token("TEXT")
  val SQL_THEN: SqlTokenType              = token("THEN")
  val SQL_TO: SqlTokenType                = token("TO")
  val SQL_TRAILING: SqlTokenType          = token("TRAILING")
  val SQL_TRANSACTION: SqlTokenType       = token("TRANSACTION")
  val SQL_TRIGGER: SqlTokenType           = token("TRIGGER")
  val SQL_TRIM: SqlTokenType              = token("TRIM")
  val SQL_TRUE: SqlTokenType              = token("TRUE")
  val SQL_TRUNCATE: SqlTokenType          = token("TRUNCATE")
  val SQL_UNION: SqlTokenType             = token("UNION")
  val SQL_UNIQUE: SqlTokenType            = token("UNIQUE")
  val SQL_UNKNOWN: SqlTokenType           = token("UNKNOWN")
  val SQL_UNSIGNED: SqlTokenType          = token("UNSIGNED")
  val SQL_UPDATE: SqlTokenType            = token("UPDATE")
  val SQL_USER: SqlTokenType              = token("USER")
  val SQL_USING: SqlTokenType             = token("USING")
  val SQL_VALUES: SqlTokenType            = token("VALUES")
  val SQL_VARBINARY: SqlTokenType         = token("VARBINARY")
  val SQL_VARCHAR: SqlTokenType           = token("VARCHAR")
  val SQL_VIEW: SqlTokenType              = token("VIEW")
  val SQL_WHEN: SqlTokenType              = token("WHEN")
  val SQL_WHENEVER: SqlTokenType          = token("WHENEVER")
  val SQL_WHERE: SqlTokenType             = token("WHERE")
  val SQL_WHILE: SqlTokenType             = token("WHILE")
  val SQL_WITH: SqlTokenType              = token("WITH")
}