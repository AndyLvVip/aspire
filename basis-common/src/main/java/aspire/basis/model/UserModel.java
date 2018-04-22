package aspire.basis.model;

import aspire.framework.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonFilter;
import org.apache.commons.codec.digest.DigestUtils;
import org.jooq.Table;
import org.jooq.UpdatableRecord;

import static jooq.gen.Tables.USER;

@JsonFilter("AspireResponse")
public class UserModel extends BaseModel {

    private String username;

    private String password;

    private String phoneNo;

    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public <R extends UpdatableRecord> Table<R> table() {
        return (Table<R>) USER;
    }

    public UserModel create() {
        UserModel user = new UserModel();
        user.setUsername(getUsername());
        user.setPassword(DigestUtils.md5Hex(getUsername() + getPassword()));
        user.setEmail(getEmail());
        user.setPhoneNo(getPhoneNo());
        user.insert(getUsername());
        return user;
    }
}
