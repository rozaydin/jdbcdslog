package org.jdbcdslog;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

public class ConnectionPoolXADataSourceProxy extends DataSourceProxyBase implements DataSource, XADataSource, ConnectionPoolDataSource {

    private static final long serialVersionUID = 5829721261280763559L;

    public ConnectionPoolXADataSourceProxy() throws JDBCDSLogException {
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
