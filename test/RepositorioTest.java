import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import prototypepattern.Repositorio;

public class RepositorioTest {

    @Test
    public void deveSerIgualParcialmente(){
        try {
        Repositorio repo = new Repositorio("Repo1",
                "User1",
                "21062021",
                new String[]{"repo", "sample"});
        Repositorio repoClone = repo.clone();
        repoClone.setNomeUsuario("User2");
        String stringDeTeste = repo.getNomeUsuario()+
                " "+
                repoClone.getNomeUsuario()+
                " "+
                repo.getNomeRepositorio()+
                " "+
                repoClone.getNomeRepositorio();

        assertEquals("User1 User2 Repo1 Repo1", stringDeTeste);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
