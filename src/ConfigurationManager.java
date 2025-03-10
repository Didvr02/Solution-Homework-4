import java.util.HashMap;
import java.util.Map;

// Класс ConfigurationManager реализует паттерн Singleton.
public class ConfigurationManager {
    // Единственный экземпляр класса
    private static ConfigurationManager instance;
    // Хранение конфигураций в виде ключ-значение
    private final Map<String, String> configSettings;

    // Приватный конструктор для предотвращения создания экземпляров извне
    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadDefaultConfigurations(); // Загрузка конфигураций по умолчанию
    }

    // Метод для получения экземпляра Singleton (ленивая инициализация)
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Загрузка конфигураций по умолчанию
    private void loadDefaultConfigurations() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Key not found");
    }

    public void printAllConfigurations() {
        System.out.println("Configuration Settings:");
        configSettings.forEach((key, value) -> System.out.println(key + " → " + value));
    }
}