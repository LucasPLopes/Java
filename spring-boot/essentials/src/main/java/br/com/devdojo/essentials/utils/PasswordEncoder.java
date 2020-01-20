package br.com.devdojo.essentials.utils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class PasswordEncoder{

    public static String encode(String password){
        BCryptPasswordEncoder bcps = new BCryptPasswordEncoder();
        return bcps.encode(password);
    }
}