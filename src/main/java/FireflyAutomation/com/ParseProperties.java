package FireflyAutomation.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParseProperties {

	private Properties pro = new Properties();

	public ParseProperties(String propertiespath) {
		this.loadProperties(propertiespath);
	}

	public void loadProperties(String propertiespath) {
		// 加载properties文件
		try {
			InputStream in = new FileInputStream(propertiespath);
			pro.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 获取properties文件中的特定value值
	public String getTestData(String keyname) {
		return pro.getProperty(keyname).trim();
	}

}
