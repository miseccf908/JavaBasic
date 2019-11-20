package test;

/****
 *   Created by Feng Chen on 10/2/2019
 */

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteDoc {
    public void testWrite() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("2018-08-08");
        list.add("2017-07-07");

        String templatePath = "D:\\template.doc";
        InputStream is = new FileInputStream(templatePath);
        OutputStream os = null;
        HWPFDocument doc = new HWPFDocument(is);
        Range range = doc.getRange();
        for(int i=0;i<list.size();i++){
//            Users user = list.get(i);
//            //把range范围内的${reportDate}替换为当前的日期
//            range.replaceText("${name}", user.getName());
//            range.replaceText("${sex}", user.getSex());
//            range.replaceText("${age}", String.valueOf(user.getAge()));
//            range.replaceText("${date}", user.getBirthday().toString());
//            os = new FileOutputStream(new File("D:\\"+user.getName()+".doc"));
//            //把doc输出到输出流中
//            doc.write(os);
        }
        os.close();
        is.close();
    }
}
