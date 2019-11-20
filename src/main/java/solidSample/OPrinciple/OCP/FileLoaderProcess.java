package solidSample.OPrinciple.OCP;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/****
 *   Created by Feng Chen on 10/22/2019
 *
 *   O ----- Open-Closed Principle
 *   open for extention, close for modification
 *
 *   advantage:
 *   1. there is no need to modify the old code when there is new requirement, just extend the old interface
 *   2. easy to test
 *   3. no change to the old testcase.
 *
 */
public class FileLoaderProcess {

    //private FileLoaderForOCP fileLoader;
    private static final Map<String, FileLoaderForOCP> fileLoaders;
    static {
        fileLoaders = new HashMap<>();
        fileLoaders.put("txt",new TxtLoader());
        fileLoaders.put("xml",new XmlLoader());
        fileLoaders.put("Html",new HtmlLoader());
    }
    public void parseFile(String file){
        FileLoaderForOCP fileLoader = fileLoaders.get(getFileType(file));
        fileLoader.loadFile(file);
//        if(getFileType(file))
    }

    public String getFileType(String file){
        if(file.endsWith("txt"))
            return "txt";
        else if(file.endsWith("xml"))
            return "xml";
        else if(file.endsWith("html"))
            return "html";
        return "";
//        String[] fileTypes = new String[]{"txt","xml","html","json"};
//        return fileTypes[new Random().nextInt(3)];
    }

    public static void main(String[] arg){

        FileLoaderProcess process = new FileLoaderProcess();
        //process.setFileLoaders(new HashMap<>(){});
        process.parseFile("ddd.css");
    }
}
