package br.com.dextra.endpoint;


import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/loan")
public class Loan {

    @Id
    private IdRef<Loan> id;

    @Index
    private IdRef<Book> idLivro;
    @Index
    private IdRef<User> idUser; 

    public IdRef<Loan> getId() {
        return id;
    }

    public void setId(IdRef<Loan> id) {
        this.id = id;
    }

	public IdRef<Book> getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(IdRef<Book> idLivro) {
		this.idLivro = idLivro;
	}

	public IdRef<User> getIdUser() {
		return idUser;
	}

	public void setIdUser(IdRef<User> idUser) {
		this.idUser = idUser;
	}

    
}