package org.jdbcdslog;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * RDBMS specifics for the Oracle DB.
 *
 * @author ShunLi
 */
public class OracleRdbmsSpecifics implements RdbmsSpecifics {
    public OracleRdbmsSpecifics() {
        super();
    }

    public String formatParameterObject(Object object) {
        if (object == null) {
            return "null";
        } else if (object instanceof String) {
            //handle replaceAll's special characters: \ \$
            String value = ((String) object).replaceAll("\\\\", "\\\\\\\\").replaceAll("\\$", "\\\\\\$");
            // handle Oracle sql's special characters,like ' &
            value = value.replaceAll("'", "''")
                         .replaceAll("&","'||chr(38)||'");

            return "'" + value + "'";
        } else if (object instanceof Timestamp) {
            return "to_timestamp('" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(object) + "', 'yyyy-MM-dd hh24:mi:ss.ff3')";
        } else if (object instanceof Date) {
            return "to_date('" + new SimpleDateFormat("yyyy-MM-dd").format(object) + "', 'yyyy-MM-dd')";
        } else if (object instanceof Boolean) {
            return ((Boolean) object).booleanValue() ? "Y" : "N";
        } else {
            return object.toString();
        }
    }
}