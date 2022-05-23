
package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.dto.KeyStore;
import com.ty.keystore.util.ConnectionObject;

public class KeyStoreDao {

	public int saveKeyStore(KeyStore keyStore)
	{
		Connection connection =ConnectionObject.getConnection();
		String query = "Insert into key_store values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, keyStore.getKeyid());
			preparedStatement.setString(2, keyStore.getComment());
			preparedStatement.setString(3, keyStore.getDescription());
			preparedStatement.setString(4, keyStore.getKey());
			preparedStatement.setString(5, keyStore.getValue());
			preparedStatement.setInt(6, keyStore.getId());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
