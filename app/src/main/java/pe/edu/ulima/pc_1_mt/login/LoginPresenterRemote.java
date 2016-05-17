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

    LoginView mView;

    public LoginPresenterRemote (LoginView view){
        mView = view;
    }

    @Override
    public void obtenerAlumnos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://demo7318484.mockable.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AlumnosService service = retrofit.create(AlumnosService.class);
        service.obtenerAlumnos().enqueue(new Callback<List<Alumno>>() {
            @Override
            public void onResponse(Call<List<Alumno>> call, Response<List<Alumno>> response) {
                //Codigo luego de la respuesta de servicio (exitosa)
                List<Alumno> alumnos = response.body();
                mView.mostrarListadoAlumnos(alumnos);
            }

            @Override
            public void onFailure(Call<List<Alumno>> call, Throwable t) {
                //Codigo luego de un error
                Log.e("Ulimers", t.getMessage());
            }
        });
    }


}
