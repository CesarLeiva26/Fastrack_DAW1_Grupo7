package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Rol;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DetalleUsuarioService implements UserDetailsService {

    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.findUserByUserName(username);
        return autenticacionUsuario(
                usuario, obtenerListaRolesUsuario(usuario.getRoles())
        );
    }

    private List<GrantedAuthority> obtenerListaRolesUsuario(Set<Rol> listRoles) {
        return listRoles.stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getNomrol()))
                .collect(Collectors.toList());
    }


    private UserDetails autenticacionUsuario(
            Usuario usuario, List<GrantedAuthority> authorityList){
        return new User(usuario.getNomusuario(),
                usuario.getPassword(),
                usuario.getActivo(),
                true,
                true,
                true, authorityList);
    }

}
