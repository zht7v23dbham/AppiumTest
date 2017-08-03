/*
 * author：zuohiatao
 */
package module;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class Config                                                   
{                                                                 
	static final String CONFIG_FILE = "android_config.properties";
	private Map<String, String> configMap = new HashMap<String, String>();
	private static Config testResManager;

	public static Config getInstance()
	{
		if (testResManager == null)
		{
			testResManager = new Config();
		}
		return testResManager;
	}

	public Config()
	{
		configMap = loadFile(Config.CONFIG_FILE);
	}

	protected Map<String, String> loadFile(String fileName)
	{
		Map<String, String> map = null;
		if ((fileName != null) && (!fileName.trim().equals("")))
		{
			InputStream is = Config.class.getClassLoader().getResourceAsStream(fileName);
			if (is != null)
			{
				map = new HashMap<String, String>();
				Properties prop = new Properties();
				try
				{
					prop.load(is);
					for (Entry<Object, Object> entry : prop.entrySet())
					{
						String key = (String) entry.getKey();
						String value = (String) entry.getValue();
						map.put(key, value);
					}
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		return map;
	}

	public String getCfg(String key)
	{
		return configMap.get(key);
	}

}
