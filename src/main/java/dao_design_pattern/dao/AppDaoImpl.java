package dao_design_pattern.dao;

import redis.clients.jedis.JedisPool;

public class AppDaoImpl implements AppDao {
	private final JedisPool jedisPool;
	
	AppDaoImpl(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}
	
	public void testingDao() {
		// Write code here
	}
}