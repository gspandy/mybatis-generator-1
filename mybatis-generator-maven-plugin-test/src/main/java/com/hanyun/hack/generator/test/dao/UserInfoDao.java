package com.hanyun.hack.generator.test.dao;

import com.hanyun.hack.generator.test.domain.UserInfo;

import org.springframework.stereotype.Repository;

/**
 * <pre>
 * â”â”â”â”â”â”ç¥å…½å‡ºæ²¡â”â”â”â”â”â”
 * ã€??ã€?”â”“ã?ã€??â”â”“
 * ã€??â”â”›â”»â”â”â”â”›â”»â”“\n * ã€??â”ƒã?ã€??ã€??ã€??â”ƒ\n * ã€??â”ƒã?ã€??â”ã?ã€??â”ƒ\n * ã€??â”ƒã?â”³â”›ã€?”—â”³ã?â”ƒ\n * ã€??â”ƒã?ã€??ã€??ã€??â”ƒ\n * ã€??â”ƒã?ã€??â”»ã?ã€??â”ƒ\n * ã€??â”ƒã?ã€??ã€??ã€??â”ƒ\n * ã€??â”—â”â”“ã?ã€??â”â”â”›\n * ã€??ã€??â”ƒã?ã€??â”ƒç¥å…½ä¿ä½? æ°¸æ— BUG!
 * ã€??ã€??â”ƒã?ã€??â”ƒCode is far away from bug with the animal protecting
 * ã€??ã€??â”ƒã?ã€??â”—â”â”â”â”“\n * ã€??ã€??â”ƒã?ã€??ã€??ã€??â”£â”“
 * ã€??ã€??â”ƒã?ã€??ã€??ã€??â”â”›
 * ã€??ã€??â”—â”“â”“â”â”â”³â”“â”â”›\n * ã€??ã€??ã€?”ƒâ”«â”«ã€?”ƒâ”«â”«
 * ã€??ã€??ã€?”—â”»â”›ã€?”—â”»â”›
 * â”â”â”â”â”â”æ„Ÿè§‰èŒèŒå“’â”â”â”â”â”â”\n * </pre>
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