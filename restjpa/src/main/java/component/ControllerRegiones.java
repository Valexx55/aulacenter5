package component;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import entity.Regions;


@RestController //realmente, esto equivale a Controller + ResponseBody
public class ControllerRegiones {
	
	//TODO INYECTAR EL BEAN DE SERVICIO Y DEFINIR LOS MÉTODOS GET, POST, PUT, DELETE

}
