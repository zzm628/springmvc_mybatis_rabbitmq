package zhang.zhe.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import zhang.zhe.dao.UserInfoMapper;
import zhang.zhe.model.UserInfo;
import zhang.zhe.service.IUserService;
import zhang.zhe.util.ReturnEntity;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserInfoMapper userInfoMapper;
	@Override
	public UserInfo getUserById(int userId) {
		return this.userInfoMapper.selectByPrimaryKey(userId);
	}

	@Override
	public ReturnEntity getUserJSONById(int userId) {
		ReturnEntity returnEntity = new ReturnEntity();
		returnEntity.setResult(1);
		returnEntity.setData(this.userInfoMapper.selectByPrimaryKey(userId));
		//returnEntity.setMsg("成功");
		return returnEntity;
	}
}
