package frameworkdemo.com.jlm.frameworkdemo.network;

import android.app.Activity;

import frameworkdemo.com.jlm.frameworkdemo.UserBo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * BaseWeb
 * Created by jlm on 2016/10/26.
 */

public class BaseWeb {

    public static void requestLogin(final Activity activity) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://test.cqsxbkj.cn/app/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiStore apiStore = retrofit.create(ApiStore.class);
        Call<UserBo> call = apiStore.getUser("15618348328", "888888");

        call.enqueue(new Callback<UserBo>() {
            @Override
            public void onResponse(Call<UserBo> call, Response<UserBo> response) {
//                Toast.makeText(activity, response.code() + "", Toast.LENGTH_SHORT).show();
//                Log.e("c_log", "normalPost:" + response.code() + "");
                UserBo userBo = response.body();
                if (userBo != null) {
//                    Log.e("c_log", "normalPost:" + userBo.toString() + "");
                }

            }

            @Override
            public void onFailure(Call<UserBo> call, Throwable t) {
//                Log.e("e_log", t.toString());
            }
        });

    }
}
