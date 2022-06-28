package org.jdbcdslog;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourceProxy extends DataSourceProxyBase implements DataSource {

    private static final long serialVersionUID = -6888072076120346186L;

    public DataSourceProxy() throws JDBCDSLogException {
        super();
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {        
        return null;
    }

    public boolean isWrapperFor(Class iface) throws SQLException {
        return false;
    }

    public Object unwrap(Class iface) throws SQLException {
        return null;
    }

}
