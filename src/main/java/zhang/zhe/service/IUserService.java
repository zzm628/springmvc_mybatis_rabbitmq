package zhang.zhe.service;


import zhang.zhe.model.UserInfo;
import zhang.zhe.util.ReturnEntity;

public interface IUserService {
	public UserInfo getUserById(int userId);
	public ReturnEntity getUserJSONById(int userId);
}
