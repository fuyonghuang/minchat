package com.eric.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eric.sys.dao.SysUserDao;
import com.eric.sys.model.SysUser;
import com.eric.sys.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	@Resource
	private SysUserDao userDao;
	
	public SysUser getUserById(Long userid) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userid);
	}
	public SysUser getByUserAccount(String account) {
		// TODO Auto-generated method stub
		return this.userDao.selectBySysUserAccount(account);
	}
}