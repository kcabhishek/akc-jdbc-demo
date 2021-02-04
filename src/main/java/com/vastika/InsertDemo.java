package com.vastika;

import com.vastika.util.DbUtil;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL =  "insert into user_tbl(user_name, password)values('Ram','aa')";

    public static void main(String[] args) {

        try(
                Statement st = DbUtil.getConnection().createStatement();

        ) {
            //execute the query
            st.executeUpdate(SQL);
            System.out.println("Data Inserted");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
