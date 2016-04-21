package com.herprogramacion.scrum.modelo;

import android.support.v7.app.AppCompatActivity;

import com.herprogramacion.scrum.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Maria Guadalupe Hernandez Tovar
 * Modelo de datos estático para alimentar la aplicación
 */

/**
 * Created by Mauricio Bautista on 17/02/2016.
 */
public class Cursos extends AppCompatActivity{
    //declaracion de las variables que llenaran nuestra vista
    private String curso;
    private String eslogan;
    private int idDrawable;

    //el cursor se encarga de posicionar cada elemento es su lugar
    public Cursos(String curso, String eslogan, int idDrawable) {
        this.curso = curso;
        this.eslogan = eslogan;
        this.idDrawable = idDrawable;
    }
    //Lista de cursos, imagenes que se muestran el inicio de la aplicacion
    public static  final List<Cursos> CURSOS = new ArrayList<Cursos>();



    /**
     * Nombre y descripcion de otros cursos en inicio de la aplicacion se podran descargar
     */
    static{
        CURSOS.add(new Cursos("educacionIT","Curso de Scrum: Metodologías Ágiles", R.drawable.scrum_doc));
        CURSOS.add(new Cursos("ITInstitute","Scrum Master Certified", R.drawable.scrum_agil));
        CURSOS.add(new Cursos("SCRUM MEXICO","ÚNICOS CURSOS DE CERTIFICACIÓN AVALADOS POR SCRUM ALLIANCE", R.drawable.scrum1));



    }

    //Getters y Setters
    public String getCurso() {
        return curso;
    }

    public String getEslogan() {
        return eslogan;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}


