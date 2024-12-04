package com.myorg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderVersion {

    public String readFile() {
        // Ajustar esse path, para quando for mudar de pasta o version.txt
        String path = "D:\\projetos_estudos\\aws_project_siecola\\version.txt";
        try {
            String content = Files.readString(Path.of(path)).trim();
            if (content.isEmpty()) {
                throw new RuntimeException("O arquivo está vazio: " + path);
            }
            return content;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo: " + path, e);
        }
    }

}
