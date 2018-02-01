package com.fw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fw.dao.MobileMapper;
import com.fw.pojo.Mobile;
@Service
public class MobileServiceImpl implements MobileService {
	@Autowired
	MobileMapper mobileMapper;
	@Override
	public Mobile findBytel(String tel) {
		// TODO Auto-generated method stub
		return mobileMapper.findBytel(tel.substring(0, 7));
	}
	@Override
	public Mobile findBytel2(String tel) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.setAreacode(134);
		mobile.setId(11);
	
		return mobile;
	}

}
