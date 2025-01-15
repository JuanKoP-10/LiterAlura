package com.aluracursos.literatura.config.iconfig;

public interface IConvierteDatos {

    <T> T convertirDatosJsonAJava(String json, Class<T> clase);
    //metodo generico que toma el json y convierte en datos Java ya que no se sabe que retornara
}
