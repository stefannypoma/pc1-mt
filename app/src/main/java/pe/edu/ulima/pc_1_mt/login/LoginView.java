package pe.edu.ulima.pc_1_mt.login;

import java.util.List;

import bean.Alumno;
import pe.edu.ulima.pc_1_mt.login.LoginPresenter;

/**
 * Created by Stefanny on 15/05/2016.
 */
public interface LoginView {

    public void setPresenter(LoginPresenter presenter);
    public void mostrarListadoAlumnos(List<Alumno> alumnos);

}
