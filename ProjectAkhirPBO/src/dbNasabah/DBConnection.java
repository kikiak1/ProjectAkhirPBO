package dbNasabah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DB = "formnasabahdb";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;

    public static Connection getConnection(String driver) throws SQLException {
        Connection conn = null;
        switch (driver) {
            case "MYSQL": {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(MYCONN, USER, PASSWORD);
                    createTable(conn, driver);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Librari Kosong");
                    Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }
        return conn;
    }

    //ErrorCode
    public static void createTable(Connection conn, String driver) throws SQLException {
        String sqlCreate = "";
        switch (driver) {
            case "MYSQL": {
                sqlCreate = "CREATE TABLE IF NOT EXISTS `nasabah` ("
                        + "  `nasabah_id` int(10) NOT NULL,"
                        + "  `nama` varchar(100) DEFAULT NULL,"
                        + "  `alamat` varchar(100) DEFAULT NULL,"
                        + "  PRIMARY KEY (`nasabah_id`)"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `individu` ("
                        + "  `nasabah_id` int(10) NOT NULL,"
                        + "  `nik` varchar(20) DEFAULT NULL,"
                        + "  `npwp` varchar(20) DEFAULT NULL,"
                        + "  PRIMARY KEY (`nasabah_id`),"
                        + "  FOREIGN KEY (`nasabah_id`) REFERENCES `nasabah` (`nasabah_id`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `perusahaan` ("
                        + "  `nasabah_id` int(10) NOT NULL,"
                        + "  `nib` varchar(20) DEFAULT NULL,"
                        + "  PRIMARY KEY (`nasabah_id`),"
                        + "  FOREIGN KEY (`nasabah_id`) REFERENCES `nasabah` (`nasabah_id`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;"
                        + "CREATE TABLE IF NOT EXISTS `rekening` ("
                        + "  `no_rekening` int(10) NOT NULL,"
                        + "  `saldo` double(16,2) DEFAULT NULL,"
                        + "  `nasabah_id` int(10) DEFAULT NULL,"
                        + "  PRIMARY KEY (`no_rekening`),"
                        + "  KEY `nasabah_id` (`nasabah_id`),"
                        + "  FOREIGN KEY (`nasabah_id`) REFERENCES `nasabah` (`nasabah_id`) ON UPDATE CASCADE"
                        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
                break;
            }
        }
        String sqls[] = sqlCreate.split(";");
        for (String sql : sqls) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
        }
    }
}
