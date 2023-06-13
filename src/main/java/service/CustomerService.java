package service;

import com.java052023.dto.CustomerDto;
import com.java052023.repositories.ConstumerRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Getter
@Setter
@Service
public class CustomerService {

     private final ConstumerRepository constumerRepository;
    public CustomerService(ConstumerRepository constumerRepository) {
        this.constumerRepository = constumerRepository;
    }
    public List<CustomerDto>getAllCustomer(){
        return constumerRepository.localizar1();
    }

}
