package pack_10_ioc.pack_50_exprLanguage.el060regxWithAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Operands {
	@Value("cbdesh2000@yahoo.com") private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Operands [email=" + email + "]";
	}
}
