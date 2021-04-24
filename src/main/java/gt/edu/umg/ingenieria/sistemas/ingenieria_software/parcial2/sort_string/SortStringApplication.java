package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string.services.ISortString;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.sort_string.services.SortString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SortStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortStringApplication.class, args);
    }

}
