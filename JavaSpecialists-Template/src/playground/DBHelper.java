package playground;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper extends CloseHelper<
        Integer, Statement,String, SQLException> {
    private final Connection con;

    public DBHelper(Connection con) {
        this.con = con;
    }

    @Override
    protected Statement setUp(String[] args) throws SQLException {
        return con.createStatement();
    }

    @Override
    protected Integer doExecute(Statement st, String[] args) throws SQLException {
        return st.executeUpdate(args[0]);
    }

    @Override
    protected void tearDown(Statement st, String[] args) throws SQLException {
        st.close();
    }
}
