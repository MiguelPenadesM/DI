package com.example.ejercicioventanalogin.Formulario;

public final class UsuarioHolder {

    private Usuario usuario;

    private static final UsuarioHolder INSTANCE = new UsuarioHolder();

    public static UsuarioHolder getInstance(){
        return INSTANCE;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
