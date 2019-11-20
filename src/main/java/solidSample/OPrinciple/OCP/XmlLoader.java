package solidSample.OPrinciple.OCP;

import java.io.File;

/****
 *   Created by Feng Chen on 10/22/2019
 */
public class XmlLoader implements FileLoaderForOCP {
    @Override
    public void loadFile(String file) {
        System.out.print("parse xml file");
    }
}
