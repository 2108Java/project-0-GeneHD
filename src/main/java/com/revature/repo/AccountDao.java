package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Account;

import com.revature.utilities.ConnectionDispatch;

public class AccountDao implements BankDAO {

	ConnectionDispatch dispatch = new ConnectionDispatch();
	
	@Override
	public boolean insertAccount(Account newAccount) {
		
		boolean approved = false;
		boolean goodOps = false;
		
		if(approved) {
			
		}

		return goodOps;
	}

	@Override
	public Account selectAccount(int id) {
		
		Account account = new Account();
		
		String sql = "SELECT * FROM accounts_table WHERE fkey_owner_id = ?";
		
		PreparedStatement ps;
		
		try {
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				
				account.setOwner("account_owner_name");
								
								
			}
			
			conn.close();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		return account;
	}

	@Override
	public List<Account> selectAccounts(int id) {
		List<Account> accounts = new ArrayList<>();
		
		String sql = "SELECT * FROM accounts_table WHERE fkey_owner_id = ?";
		
		PreparedStatement ps;
		
		
		try {
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				accounts.add(
						new Account( 
								(rs.getInt("account_id")),
								(rs.getString("account_owner_name")),
								(rs.getString("account_type")),
								(rs.getDouble("balance"))
								));
								
				
			}
			
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return accounts;
	}

	@Override
	public List<Account> selectAllAccounts() {
		List<Account> accounts = new ArrayList<>();
		PreparedStatement ps; 
		String sql = "SELECT * FROM accounts_table";
		try {
				
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);	
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				accounts.add(
						new Account(
								(rs.getInt("account_id")),
								(rs.getString("account_owner_name")),
								(rs.getString("account_type")),
								(rs.getDouble("balance"))
						
						));
				conn.close();
			}
		}catch (SQLException e) {
			
		}
		
		return accounts;
	}

	@Override
	public Account updateAccount(String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(String owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertAccount(String owner, String accountType, double NewBalance) {
		
		boolean goodOps = false;
		PreparedStatement ps;
		String sql = "INSERT INTO accounts_table(account_owner_name, account_type, balance) VALUES (?, ? ,?) ";
		
		try {
		Connection conn = dispatch.getConnection();
		
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, owner);
		ps.setString(2, accountType);
		ps.setDouble(3, NewBalance);
		
		ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goodOps = true;
		return goodOps;
		
	}

	@Override
	public boolean approveAccount(String owner) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double acquireBalance(int id) {
		
		PreparedStatement ps;
		String sql = "SELECT balance FROM accounts_table WHERE fkey_owner_id = ?";
		
		try {
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			rs.getDouble("balance");
				
		}catch (SQLException e){
			e.printStackTrace();
		}
		return 0;
	}

	public boolean updateAccount(int id, double balance) {
		boolean goodOps = false;
		
		PreparedStatement ps;
		String sql = "UPDATE accounts_table SET balance = ? WHERE account_id = ? ";
		
		try {
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);
			
			ps.setDouble(1, balance);
			ps.setInt(2, id);
			
			ps.execute(); 
			
			
			
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return goodOps;
	}

	@Override
	public List<Account> selectAccountByUsername(String owner) {
		List<Account> accounts = new ArrayList<>();
		PreparedStatement ps; 
		String sql = "SELECT * FROM accounts_table WHERE ";
		try {
				
			Connection conn = dispatch.getConnection();
			
			ps = conn.prepareStatement(sql);	
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				accounts.add(
						new Account(
								(rs.getInt("account_id")),
								(rs.getString("account_owner_name")),
								(rs.getString("account_type")),
								(rs.getDouble("balance"))
						
						));
			}
		}catch (SQLException e) {
			
		}
		
		
		return accounts;
		
	}

}
