import java.util.Random;

public class PasswordGenerator {
    public static final String LOWERCASE_CHARACTERS = "abcdefghijkmnopqrstuvwyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "123456789";
    public static final String SPECIAL_SYMBOLS = "!@#$%&*(){}[]-_+=;:,.<>/?|";

    private final Random random;

    public PasswordGenerator(){random = new Random();}

    public String generatePassword( int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers,
                                    boolean includeSpecialSymbols) {
        StringBuilder passwordBuilder = new StringBuilder();

        // aqui ele guarda os valores/caracteres válidos
        String validCharacters = "";
        if(includeUppercase) validCharacters += UPPERCASE_CHARACTERS;
        if(includeLowercase) validCharacters += LOWERCASE_CHARACTERS;
        if(includeNumbers) validCharacters += NUMBERS;
        if(includeSpecialSymbols) validCharacters += SPECIAL_SYMBOLS;

        // criando a senha
        for(int i = 0; i < length; i++) {
            // gera um index aleatório
            int randomINdex = random.nextInt(validCharacters.length());

            // pega o caractere baseado no index aleatório
            char randomChar = validCharacters.charAt(randomINdex);

            // adiciona o char dentro do construtor de senha
            passwordBuilder.append(randomChar);
        }

        return  passwordBuilder.toString();
    }
}
