package pe.edu.ulima.pc_1_mt.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bean.Alumno;
import pe.edu.ulima.pc_1_mt.listadoEquipos.ListadoEquiposActivity;
import pe.edu.ulima.pc_1_mt.R;
import remote.AlumnosService;
import retrofit2.Call;
import retrofit2.http.Body;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginPresenter {

    Button butInscribir;
    EditText eteUsuario;
    EditText etePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        butInscribir = (Button) findViewById(R.id.butInscribir);



        butInscribir.setOnClickListener(this);
    }

    public void onClick(View v) {

            Intent intent = new Intent(this,ListadoEquiposActivity.class);
            startActivity(intent);

    }


    @Override
    public void obtenerLogin(Alumno alumno) {

        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        butInscribir = (Button) findViewById(R.id.butInscribir);

        String usuario = eteUsuario.getText().toString();
        String password = etePassword.getText().toString();

        if (usuario.equals(alumno.getCodigo())&& password.equals("123")){
            onClick(butInscribir);
        }else {
            Toast.makeText(this, "Login incorrecto", Toast.LENGTH_SHORT).show();
        }

    }
}
