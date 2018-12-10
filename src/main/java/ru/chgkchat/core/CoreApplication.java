package ru.chgkchat.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chgkchat.core.domain.Chat;
import ru.chgkchat.core.domain.Role;
import ru.chgkchat.core.domain.User;
import ru.chgkchat.core.repository.ChatRepository;
import ru.chgkchat.core.repository.RoleRepository;
import ru.chgkchat.core.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ChatRepository chatRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        /*Chat chat1 = new Chat("ChatNumber1", new Date());
        Set<User> users1 = new HashSet<User>() {{
            add(new User("Anvar Ibragimov", "123", new Date()));
            add(new User("Ilia Beleichev", "234", new Date()));
        }};
        chat1.setUsers(users1);

        Chat chat2 = new Chat("ChatNumber2", new Date());
        Set<User> users2 = new HashSet<User>() {{
            add(new User("Dmitri Denisov", "456", new Date()));
            add(new User("Ilia Sinitsyn", "678", new Date()));
        }};
        chat2.setUsers(users2);

        chatRepository.save(chat1);
        chatRepository.save(chat2);*/

        Role admin = new Role("Admin", new HashSet<User>() {{
            add(new User("Ilia Sinitsyn", "678", new Date()));
            add(new User("Ilia Beleichev", "234", new Date()));
        }});
        Role user = new Role("User", new HashSet<User>() {{
            add(new User("Dmitri Denisov", "456", new Date()));
            add(new User("Anvar Ibragimov", "123", new Date()));
        }});

        roleRepository.save(admin);
        roleRepository.save(user);


    }
}
