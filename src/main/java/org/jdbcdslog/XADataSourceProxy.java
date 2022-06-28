package org.jdbcdslog;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;
import javax.sql.XADataSource;

public class XADataSourceProxy extends DataSourceProxyBase implements XADataSource, DataSource {

    private static final long serialVersionUID = -2923593005281631348L;

    public XADataSourceProxy() throws JDBCDSLogException {
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
