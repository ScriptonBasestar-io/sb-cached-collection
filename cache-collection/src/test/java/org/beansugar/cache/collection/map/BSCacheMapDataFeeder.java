package org.beansugar.cache.collection.map;

import lombok.extern.slf4j.Slf4j;
import org.beansugar.cache.core.exception.BSCacheLoadFailException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author archmagece
 * @CreatedAt 2016-12-07 18
 */
@Slf4j
public class BSCacheMapDataFeeder {
	private static final Map<Long,String> sampleData = new HashMap<>();
	static {
		for (int i = 0; i < 30; i++) {
			log.trace("add item {}", i);
			sampleData.put((long) i, "item"+i);
		}
	}

	public String loadOne(Long key) throws BSCacheLoadFailException {
		log.trace("loadOne thread sleep 500");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sampleData.get(key);
	}

	public Map<Long, String> loadAll() throws BSCacheLoadFailException {
		log.trace("loadAll thread sleep 1000");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sampleData;
	}
}
