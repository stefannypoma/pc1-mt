package remote;

import java.util.List;

import bean.Alumno;
import pe.edu.ulima.pc_1_mt.login.Message;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Stefanny on 15/05/2016.
 */
public interface AlumnosService {

    @POST("/alumnos/login")
    Call<Message> login(@Body Alumno alumno);

}
