package remote;

import java.util.List;

import bean.Equipo;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Stefanny on 16/05/2016.
 */
public interface EquiposService {

    @GET("/equipos")
    Call<List<Equipo>> obtenerEquipos();
}
