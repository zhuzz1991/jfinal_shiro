package common.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTRole<M extends BaseTRole<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setRoleName(java.lang.String roleName) {
		set("role_name", roleName);
	}

	public java.lang.String getRoleName() {
		return get("role_name");
	}

	public void setRoleNum(java.lang.String roleNum) {
		set("role_num", roleNum);
	}

	public java.lang.String getRoleNum() {
		return get("role_num");
	}

}
