package com.hanyun.hack.generator.test.dao;

import com.hanyun.hack.generator.test.domain.UserInfo;

import org.springframework.stereotype.Repository;

/**
 * <pre>
 * ━━━━━━神兽出没━━━━━━
 * �??�?��┓�?�??┏┓
 * �??┏┛┻━━━┛┻┓\n * �??┃�?�??�??�??┃\n * �??┃�?�??━�?�??┃\n * �??┃�?┳┛�?��┳�?┃\n * �??┃�?�??�??�??┃\n * �??┃�?�??┻�?�??┃\n * �??┃�?�??�??�??┃\n * �??┗━┓�?�??┏━┛\n * �??�??┃�?�??┃神兽保�? 永无BUG!
 * �??�??┃�?�??┃Code is far away from bug with the animal protecting
 * �??�??┃�?�??┗━━━┓\n * �??�??┃�?�??�??�??┣┓
 * �??�??┃�?�??�??�??┏┛
 * �??�??┗┓┓┏━┳┓┏┛\n * �??�??�?��┫┫�?��┫┫
 * �??�??�?��┻┛�?��┻┛
 * ━━━━━━感觉萌萌哒━━━━━━\n * </pre>
 */
@SuppressWarnings("UnnecessaryInterfaceModifier")
@Repository
public interface UserInfoDao {

    public int deleteByPrimaryKey(Long id);

    public int insert(UserInfo record);

    public int insertSelective(UserInfo record);

    public UserInfo selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(UserInfo record);

    public int updateByPrimaryKey(UserInfo record);
}