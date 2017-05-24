package com.lshaci.dubbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.pool.DruidDataSource;

public class DataSourceTest extends SpringTest {

	@Autowired
	private DataSource dataSource;
	
//	@Autowired
//	private DataSourceConfiguration dataSourceConfiguration;
	
	@Test
	public void testName() throws Exception {
		DruidDataSource d = (DruidDataSource) dataSource;
		Connection connection = dataSource.getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from test");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			rs.getObject(1);
			Object object = rs.getObject(2);
			System.out.println(object);
			
		}
		System.out.println(d.getTimeBetweenEvictionRunsMillis());
//		System.out.println("-------------->" + dataSourceConfiguration.getMaxWait());
	}
}
