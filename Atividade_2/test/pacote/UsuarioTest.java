package pacote;

import atividade_2.SenhaValidador;
import atividade_2.Usuario;
import atividade_2.UsuarioDAO;
import atividade_2.UsuarioValidador;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author CINTIA
 */
public class UsuarioTest {

    public UsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void ct01() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        UsuarioValidador usuario = new UsuarioValidador(userMock);

        ArrayList<Usuario> users = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setNome("Ane");
        u1.setSenha("tats2");
        u1.setSenhaConfirmada("tast2");
        users.add(u1);

        try {
            usuario.ehUsuarioValido(u1);
            fail();

        } catch (Exception e) {
            assertEquals(e.getMessage(), "nome do usuario precisa de pelo menos 5 caracteres");
        }
    }

    @Test
    public void ct02() {

        UsuarioDAO userMock = mock(UsuarioDAO.class);
        UsuarioValidador usuario = new UsuarioValidador(userMock);

        ArrayList<Usuario> users = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setNome("Pedro");
        u1.setSenha("tats2");
        u1.setSenhaConfirmada("tast2");
        users.add(u1);

        try {
            usuario.ehUsuarioValido(u1);
            fail();

        } catch (Exception e) {
            assertEquals(e.getMessage(), "senhas diferentes");
        }

    }

    @Test
    public void ct03() {

        UsuarioDAO userMock = mock(UsuarioDAO.class);
        SenhaValidador senhaMock = mock(SenhaValidador.class);

        UsuarioValidador usuario = new UsuarioValidador(userMock);
        usuario.setSenhaValidador(senhaMock);

        ArrayList<Usuario> users = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setNome("Pedro");
        u1.setSenha("tats2");
        u1.setSenhaConfirmada("tats2");
        users.add(u1);
        when(senhaMock.verificar(u1.getSenha())).thenReturn(true);

        try {
            usuario.ehUsuarioValido(u1);
            fail();

        } catch (Exception e) {
            assertEquals(e.getMessage(), "senha invalida");
        }
    }

    @Test
    public void ct04() {

        UsuarioDAO userMock = mock(UsuarioDAO.class);
        SenhaValidador senhaMock = mock(SenhaValidador.class);

        UsuarioValidador usuario = new UsuarioValidador(userMock);
        usuario.setSenhaValidador(senhaMock);

        ArrayList<Usuario> users = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setNome("Pedro");
        u1.setSenha("tats2");
        u1.setSenhaConfirmada("tats2");
        users.add(u1);

        when(senhaMock.verificar(u1.getSenha())).thenReturn(false);
        when(userMock.getByName(anyString())).thenReturn(u1);

        try {
            usuario.ehUsuarioValido(u1);
            fail();

        } catch (Exception e) {
            assertEquals(e.getMessage(), "usuario ja existe");
        }
    }
}
