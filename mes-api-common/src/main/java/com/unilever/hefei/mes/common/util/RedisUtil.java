package com.unilever.hefei.mes.common.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName RedisUtil
 * @Author zeta123
 * Date 2019/8/7 14:25
 * @Version 1.0
 **/
@Component
@SuppressWarnings("all")
public class RedisUtil {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    static class RedisKey{
        static final String VALID_LINE_LIST = "factory:${factoryCode}:totalLine";//所有已上线产线
        static final String LINE_EQUIPMENT_INFO="lineCode:${lineCode}:totalMachine";//产线下所有设备
        static final String LINE_FILLING_MACHINE_INFO="lineCode:${lineCode}:fillingMachine";//产线下灌装机编号
    }

    //----------------------工厂下所有Line------------------
    public String getValidLineKey(String factoryCode){
        return RedisKey.VALID_LINE_LIST.replace("${factoryCode}",factoryCode);
    }

    public String getLineEqpKey(String lineCode){
        return RedisKey.LINE_EQUIPMENT_INFO.replace("${lineCode}",lineCode);
    }

//    public void setValidLine(String factoryCode,Object infoValue){
//        String key =getValidLineKey(factoryCode);
//        this.setByKey(key,infoValue);
//    }

    //获取工厂下所有产线
    public List<String> getValidLine(String factoryCode){
        String key =getValidLineKey(factoryCode);
        List<String> range = (List<String>) (Object) redisTemplate.opsForList().range(key, 0, -1);
        return range;
    }
    //添加产线到缓存
    public void addValidLine(String factoryCode,List lineCode){
        String key =getValidLineKey(factoryCode);
        redisTemplate.opsForList().rightPushAll(key,lineCode);
    }
    //删除工厂产线

    public void delValidLine(String factoryCode,String lineCode){
        String key=getValidLineKey(factoryCode);
//        redisTemplate.opsForList().leftPop()
    }

    //-------------产线下所有设备---------------------
    public Set getAllEqp(String lineCode){
        String key =getLineEqpKey(lineCode);
        Set<Object> objects = redisTemplate.opsForSet().members(key);
        return objects;
    }
    //产线设备新增一个或多个
    public void addEqp(String lineCode,String...eqps){
        String key =getLineEqpKey(lineCode);
        redisTemplate.opsForSet().add(key,eqps);
    }
    //产线删除
    public void delEqp(String lineCode,String eqp){
        String key =getLineEqpKey(lineCode);
        redisTemplate.opsForSet().intersect(key,eqp);
    }


    public void getSer() {
        System.out.println("------ValueSer----------" + redisTemplate.getValueSerializer());
        System.out.println("------------------StringSer-------------------" + redisTemplate.getStringSerializer());
    }

    /**
     * 是否存在键为key的某条数据
     *
     * @param key 键值名称
     * @return true表示存在，false表示不存在
     */
    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 普通缓存获取
     *
     * @param key
     * @return
     */
    public Object get(String key) {
        if (key == null || !redisTemplate.hasKey(key)) {
            return null;
        }
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 设置永久有效的缓存
     *
     * @param key     键值名称
     * @param value   键值
     * @param seconds
     */
    public void set(String key, Object value, TimeUnit seconds) {
        redisTemplate.opsForValue().set(key, value);
    }

    //-------------------------common----------------------

    public <T> T getByKey(String key, Class<T> valueClazz) {
        return (T) redisTemplate.opsForValue().get(key);
    }

    public void setByKey(String key, Object value) {
        this.redisTemplate.opsForValue().set(key, value);
    }

    public Long incrementByKey(String key, long delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }

    public Double incrementByKey(String key, double delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }

    public void deleteByKey(String key) {
        redisTemplate.delete(key);
    }

    public void renameKey(String oldKey, String newKey) {
        redisTemplate.rename(oldKey, newKey);
    }

    /**
     * 设置带时间的缓存
     *
     * @param key    键值名称
     * @param value  键值
     * @param offset 失效时间 要大于0 如果time小于等于0 将设置无限期
     */
    public void set(String key, Object value, long offset) {
        redisTemplate.opsForValue().set(key, value, offset);
    }

    /**
     * 删除键为key的数据
     *
     * @param key 键值名称
     */
    public void remove(String key) {
        if (key != null && redisTemplate.hasKey(key)) {
            redisTemplate.delete(key);
        }
    }


    /***
     * 指定缓存失效时间
     * @Date 2019/8/7 15:57
     * @Param [key, time] 
     * @return boolean
     **/
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @return
     * @Description
     * @Author zeta123
     * @Date 2019/8/7 16:15
     * @Param
     **/
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * @return void
     * @Description 删除缓存
     * @Param [key]
     **/
    public void del(String... key) {
        if (key != null && key.length > 0) {
            if (key.length == 1) {
                redisTemplate.delete(key[0]);
            } else {
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }

        }
    }

    /***
     * @Description 递增
     * @Param [key, delta]
     * @return long
     **/
    public long incr(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /***
     * @Description 递减
     * @Param [key, delta]
     * @return long
     **/
    public long decr(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    /***
     * @Description
     * @Param [key, item]
     * @return java.lang.Object
     **/
    public Object hget(String key, String item) {
        return redisTemplate.opsForHash().get(key, item);
    }

    /***
     * @Description
     * @Param [key]
     * @return java.util.Map<java.lang.Object, java.lang.Object>
     **/
    public Map<Object, Object> hmget(String key) {
        return redisTemplate.opsForHash().entries(key);
    }


    /***
     * @Description
     * @Param [key, map]
     * @return boolean
     **/
    public boolean hmset(String key, Map<String, Object> map) {
        try {
            redisTemplate.opsForHash().putAll(key, map);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /***
     * @Description
     * @Param [key, map, time]
     * @return boolean
     **/

    public boolean hmset(String key, Map<String, Object> map, long time) {
        try {
            redisTemplate.opsForHash().putAll(key, map);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /***
     * @Description
     * @Param [key, item, value] 
     * @return boolean
     **/
    public boolean hset(String key, String item, Object value) {
        try {
            redisTemplate.opsForHash().put(key, item, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean hset(String key, String item, Object value, long time) {
        try {
            redisTemplate.opsForHash().put(key, item, value);
            if (time > 0) {
                expire(key, time);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void hdel(String key, Object... item) {
        redisTemplate.opsForHash().delete(key, item);
    }

    public boolean hHasKey(String key, String item) {
        return redisTemplate.opsForHash().hasKey(key, item);
    }

    public double hincr(String key, String item, double by) {
        return redisTemplate.opsForHash().increment(key, item, by);
    }

    public double hdecr(String key, String item, double by) {
        return redisTemplate.opsForHash().increment(key, item, -by);
    }

    public Set<Object> sGet(String key) {
        try {
            return redisTemplate.opsForSet().members(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean sHasKey(String key, Object value) {
        try {
            return redisTemplate.opsForSet().isMember(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public long sSet(String key, Object... values) {
        try {
            return redisTemplate.opsForSet().add(key, values);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public long sSetAndTime(String key, long time, Object... values) {
        try {
            Long count = redisTemplate.opsForSet().add(key, values);
            if (time > 0)
                expire(key, time);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public long sGetSetSize(String key) {
        try {
            return redisTemplate.opsForSet().size(key);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public long setRemove(String key, Object... values) {
        try {
            Long count = redisTemplate.opsForSet().remove(key, values);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Object> lGet(String key, long start, long end) {
        try {
            return redisTemplate.opsForList().range(key, start, end);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public long lGetListSize(String key) {
        try {
            return redisTemplate.opsForList().size(key);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Object lGetIndex(String key, long index) {
        try {
            return redisTemplate.opsForList().index(key, index);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean lSet(String key, Object value) {
        try {
            redisTemplate.opsForList().rightPush(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean lSet(String key, Object value, long time) {
        try {
            redisTemplate.opsForList().rightPush(key, value);
            if (time > 0)
                expire(key, time);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean lSet(String key, List<Object> value) {
        try {
            redisTemplate.opsForList().rightPushAll(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean lSet(String key, List<Object> value, long time) {
        try {
            redisTemplate.opsForList().rightPushAll(key, value);
            if (time > 0)
                expire(key, time);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean lUpdateIndex(String key, long index, Object value) {
        try {
            redisTemplate.opsForList().set(key, index, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public long lRemove(String key, long count, Object value) {
        try {
            Long remove = redisTemplate.opsForList().remove(key, count, value);
            return remove;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


}
