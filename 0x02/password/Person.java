public class Person {

    public boolean checkUser(String username) {
        // Deve ter no mínimo 8 caracteres
        if (username.length() < 8)
            return false;

        // Não deve conter caractere especial (apenas letras e números)
        return username.matches("^[a-zA-Z0-9]+$");
    }

    public boolean checkPassword(String password) {
        // Deve ter no mínimo 8 caracteres
        if (password.length() < 8)
            return false;

        // Pelo menos 1 letra maiúscula
        if (!password.matches(".*[A-Z].*"))
            return false;

        // Pelo menos 1 número
        if (!password.matches(".*[0-9].*"))
            return false;

        // Pelo menos 1 caractere especial
        if (!password.matches(".*[^a-zA-Z0-9].*"))
            return false;

        return true;
    }
}
