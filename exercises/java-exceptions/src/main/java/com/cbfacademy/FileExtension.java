package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    // Method to check if the filename has a .java extension
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty.");
        }
        return filename.endsWith(".java");
    }

    // Method to map filenames to their corresponding values
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> result = new HashMap<>();

        for (String filename : filenames) {
            try {
                if (filename == null) {
                    result.put(null, -1);
                } else {
                    boolean isJavaFile = check(filename);
                    result.put(filename, isJavaFile ? 1 : 0);
                }
            } catch (FilenameException e) {
                result.put(filename, -1);
            }
        }
        
        return result;
    }


}