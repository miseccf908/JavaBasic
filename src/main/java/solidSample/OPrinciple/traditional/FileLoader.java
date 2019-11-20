package solidSample.OPrinciple.traditional;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/****
 *   Created by Feng Chen on 10/22/2019
 */
public class FileLoader {


    public void loadFile(File file){
        if("txt".equals(getFileType(file))){
            // parse txt file
        }else if("xml".equals(getFileType(file))){
            // parse xml file
        }else if("html".equals(getFileType(file))){
            // parse html file
        }else if("json".equals(getFileType(file))){
            // parse json file
        }


    }

    public String getFileType(File file){
        String[] fileTypes = new String[]{"txt","xml","html","json"};
        return fileTypes[new Random().nextInt(4)];
    }
}
