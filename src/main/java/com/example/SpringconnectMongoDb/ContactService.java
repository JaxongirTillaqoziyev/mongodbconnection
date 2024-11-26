import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> findAll() {
        return repository.findAll(); // Barcha kontaktlarni qaytaradi
    }

    public Contact save(Contact contact) {
        return repository.save(contact); // Kontaktni saqlaydi yoki yangilaydi
    }

    public void deleteById(String id) {
        repository.deleteById(id); // Kontaktni o'chiradi
    }

    public Optional<Contact> findById(String id) {
        return repository.findById(id); // ID bo'yicha kontaktni topadi
    }
}
