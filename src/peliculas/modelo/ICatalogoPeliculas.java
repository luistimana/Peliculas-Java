/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.modelo;

/**
 *
 * @author Luis Timana
 */
public interface ICatalogoPeliculas {
    
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
         
}
