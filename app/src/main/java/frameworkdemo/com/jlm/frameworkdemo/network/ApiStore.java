package frameworkdemo.com.jlm.frameworkdemo.network;

import frameworkdemo.com.jlm.frameworkdemo.bean.UserBean;
import frameworkdemo.com.jlm.frameworkdemo.UserBo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * ApiStore
 * Created by jlm on 2016/10/26.
 */

public interface ApiStore {

    @POST("app/user/login.json")
    Call<UserBo> getUser(@Body UserBean user);


    @POST("app/user/login.json")
    @FormUrlEncoded
    Call<UserBo> getUser(@Field("account") String account, @Field("password") String password);


}
