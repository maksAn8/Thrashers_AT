package utils;

import java.io.InputStream;
import java.util.Properties;

public class Property {
    private Properties property;
    private InputStream inputStream;

    public Property() {
        property = new Properties();
        inputStream = Property.class.getClassLoader().getResourceAsStream("application.properties");
        try {
            property.load(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getChromeDriver() {
        return property.getProperty("driver.chrome");
    }

    public String getMainPageUrl() {
        return property.getProperty("app.mainPageUrl");
    }

    public String getAuthorizationPageUrl() {
        return property.getProperty("app.authorizationPageUrl");
    }

    public String getRegistrationPageUrl() {
        return property.getProperty("app.registrationPageUrl");
    }

    public String getAuthorizationRequestUrl() {
        return property.getProperty("api.authorization");
    }

    public String getRegistrationRequestUrl() {
        return property.getProperty("api.registration");
    }

    public String getRoomsListRequestUrl() {
        return property.getProperty("api.getRoomsList");
    }

    public String getCreateRoomRequestUrl() {
        return property.getProperty("api.createRoom");
    }

    public String getJoinRoomRequestUrl() {
        return property.getProperty("api.joinRoom");
    }
}
