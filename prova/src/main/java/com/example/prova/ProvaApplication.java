package com.example.prova;

import com.example.prova.view.MainWindow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

@SpringBootApplication
public class ProvaApplication extends JFrame {

    public static void main(String[] args) {
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ProvaApplication.class)
                    .headless(false)
                    .run(args);



            EventQueue.invokeLater(() ->
            {
                MainWindow appFrame = ctx.getBean(MainWindow.class);
                appFrame.setVisible(true);
            });
        }

}
