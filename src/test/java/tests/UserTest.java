package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private User user1;
    private User user2;
    private List<User> users;
    private User userNotAdd;
    private User userNotAdd1;

    @BeforeEach
    public void setUp() throws Exception {
        user = new User("Евгений", 35, Sex.MALE);
        user1 = new User("Марина", 34, Sex.FEMALE);
        user2 = new User("Алина", 7, Sex.FEMALE);
        users = List.of(user, user1, user2);
        userNotAdd = new User("", 0, null);
        userNotAdd1 = new User(null, 0, null);
    }

    @Test
    void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        assertNotNull(expected);
    }

    @Test
    void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, users);
    }
    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        assertEquals(expected, users.stream().filter(x -> x.getSex().equals(Sex.MALE)).collect(Collectors.toList()));
    }
    @Test
    public void getAllUsers_FEMALE() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, users.stream().filter(x -> x.getSex().equals(Sex.FEMALE)).collect(Collectors.toList()));
    }
    @Test
    public void newUser_EMPTY_NAME() {
        for (User user : User.getAllUsers()){
            if (user.getName() != null && user.getName().isEmpty()) {
                fail("Попытка создания пользователя с пустым именем");
            }
        }
    }

    @Test
    public void newUser_AGE_ZERO() {
        for (User user : User.getAllUsers()) {
            if (user.getAge() <= 0) {
                fail("Попытка создания пользователя c не допустимым возрастом");
            }
        }
    }

    @Test
    public void newUser_SEX_NO_NULL() {
        for (User user : User.getAllUsers()) {
            if (user.getSex() == null) {
                fail("Попытка создания пользователя с указанием пола = null");
            }
        }
    }

    @Test
    void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        assertEquals(expected, actual);
    }

    @Test
    void testGetHowManyUsers() {
    }

    @Test
    void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 35 + 34 + 7;

        assertEquals(expected, actual);
    }

    @Test
    void testGetAllAgeUsers() {
    }

    @Test
    void getAverageAgeOfAllUsers() {
    }

    @Test
    void testGetAverageAgeOfAllUsers() {
    }
}