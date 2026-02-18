package data;

import dal.DatabaseConnection;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class DatabaseSingletonTest {

    @Test
    public void testSingletonInstance() {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        assertSame(db1, db2);
    }

    @Test
    public void testConnectionNotNull() {

        DatabaseConnection db = DatabaseConnection.getInstance();
        Connection connection = db.getConnection();

        assertNotNull(connection);
    }
}
