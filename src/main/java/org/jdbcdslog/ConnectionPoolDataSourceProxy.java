package org.jdbcdslog;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;

public class ConnectionPoolDataSourceProxy extends DataSourceProxyBase implements DataSource, ConnectionPoolDataSource {

    private static final long serialVersionUID = 5094791657099299920L;

    public ConnectionPoolDataSourceProxy() throws JDBCDSLogException {
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
