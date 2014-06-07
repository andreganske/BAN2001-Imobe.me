package com.imobme.server.test;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.imobme.server.model.Endereco;
import com.imobme.server.model.Pessoa;
import com.imobme.server.service.EnderecoRegistration;
import com.imobme.server.service.PessoaRegistration;

@RunWith(Arquillian.class)
public class RegistrationTest {

    @Deployment
    public static Archive<?> createTestArchive() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addClasses(Pessoa.class, PessoaRegistration.class, Endereco.class, EnderecoRegistration.class)
                .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml").addAsWebInfResource("test-ds.xml");
    }

    @Inject
    Logger log;

    @Inject
    PessoaRegistration pessoaRegistration;

    @Inject
    EnderecoRegistration enderecoRegistration;

    @Test
    public void testEnderecoRegister() throws Exception {
        Endereco endereco = newEndereco();

        // chama metodo de salvar
        enderecoRegistration.create(endereco);

        assertNotNull(endereco.getId());

        log.info("Endereco persistido com sucesso, id:" + endereco.getId());
    }

    @Test
    public void testPessoaRegister() throws Exception {
        Pessoa pessoa = newPessoa();

        // chama metodo de salvar
        pessoaRegistration.create(pessoa);

        assertNotNull(pessoa.getId());

        log.info(pessoa.getName() + " persistido com sucesso, id:" + pessoa.getId());
    }

    private Pessoa newPessoa() {
        Pessoa pessoa = new Pessoa();

        pessoa.setName("Joao da Silva");
        pessoa.setCpf("12345678987");
        pessoa.setRg("123456");
        pessoa.setNascimento(new Date());
        pessoa.setTelefone1("04778945612");
        pessoa.setTelefone2("04732156487");
        pessoa.setEmail("joao.silva@teste.com");
        pessoa.setEndereco(newEndereco());

        return pessoa;
    }

    private Endereco newEndereco() {
        Endereco endereco = new Endereco();

        endereco.setLogradouro("Avenida congestinada");
        endereco.setNumero(1234);
        endereco.setComplemento("Bloco 21, Ape 341");
        endereco.setBairro("Jardim do Bom Retiro");
        endereco.setCEP(891111111);
        endereco.setCidade("Sao Paulo de Joinville");
        endereco.setEstado(5);

        return endereco;
    }

}
