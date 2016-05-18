package pe.edu.ulima.pc_1_mt.login;

import android.util.Log;

import java.util.List;

import bean.Alumno;
import remote.AlumnosService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Stefanny on 15/05/2016.
 */
public class LoginPresenterRemote implements LoginPresenter {

    @Override
    public void obtenerLogin(Alumno alumno) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://1-dot-pichangers-1307.appspot.com/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AlumnosService service = retrofit.create(AlumnosService.class);
        service.login(alumno).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message a = new Message("ok");

            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {

            }
        });

    }
}
